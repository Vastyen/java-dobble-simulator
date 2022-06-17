
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int opt;
        String startUser;
        Scanner sc = new Scanner(System.in);  // Creación del objeto scanner

        System.out.println("Registrar como: ");
        startUser = sc.nextLine();

        Player jugador = new Player(startUser, 0, false);
        ArrayList<Player> gamePlayers = new ArrayList();
        gamePlayers.add(jugador);
        ArrayList cardsSet = new ArrayList<>();
        ArrayList tempCardsSet = new ArrayList<>();
        ArrayList<String> gameArea = new ArrayList();
        DobbleGame game = new DobbleGame(gameArea, cardsSet, gamePlayers, 1, "No hay juegos activos.");

        while (true) {
            System.out.println("### Dobble ###");
            System.out.println("## Registrado como: " + startUser);
            System.out.println("1. Crear un juego");
            System.out.println("2. Registrar jugador");
            System.out.println("3. Jugar");
            System.out.println("4. Visualizar el estado del juego completo");
            System.out.println("5. Salir");
            System.out.println("Introduzca su opción");
            opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("####################################");
                System.out.println("Introduzca la cantidad de elementos de la baraja");
                int cantEle = sc.nextInt();
                System.out.println("Introduzca la cantidad de cartas a generar");
                int maxCards = sc.nextInt();
                int n = cantEle - 1;
                ArrayList<Integer> card = new ArrayList();
                Dobble mazo = new Dobble();
                for (int i = 1; i <= n + 1; i++) {
                    card.add(i);
                }
                mazo.addCard(card);
                for (int j = 1; j <= n; j++) {
                    card.clear();
                    card.add(1);
                    for (int k = 1; k <= n; k++) {
                        card.add(n * j + (k + 1));
                    }
                    mazo.addCard(card);
                }
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        card.clear();
                        card.add(i + 1);

                        for (int k = 1; k <= n; k++) {
                            card.add(n + 2 + n * (k - 1) + (((i - 1) * (k - 1) + j - 1) % n));
                        }
                        mazo.addCard(card);
                    }
                }
                System.out.println("Introduzca el modo de juego");
                String gameMode = sc.next();

                if (gameMode.equals("demoMode")){
                    Player cpu1 = new Player("CPU1", 0, false);
                    Player cpu2 = new Player("CPU2", 0, false);
                    ArrayList<Player> cpuModePlayers = new ArrayList<>();
                    cpuModePlayers.add(cpu1);
                    cpuModePlayers.add(cpu2);
                    game.setGamePlayers(cpuModePlayers);
                }

                tempCardsSet = mazo.getCardsDeck();
                for (int k = 1; k <= maxCards; k++) {
                    cardsSet.add(tempCardsSet.get(k));
                }
                game.setGameDeck(cardsSet);
                game.setGameMode(gameMode);
                System.out.println("Se ha iniciado el juego exitosamente");
                System.out.println("####################################");
            }

            if (opt == 2) {
                System.out.println("####################################");
                System.out.println("Introduzca el nombre del nuevo jugador");
                String newPlayer = sc.next();
                Player newPlayerGame = new Player(newPlayer, 0, false);
                game.getGamePlayers().add(newPlayerGame);
                game.setGameNumPlayers(game.getGameNumPlayers() + 1);
                System.out.println(game.getGamePlayers());
                System.out.println(game.getGameNumPlayers());
                System.out.println("Se ha añadido a "+newPlayer+"al juego exitosamente");
                System.out.println("####################################");
            }


            if (opt == 3) {

                ArrayList<Player> jugadores = game.getGamePlayers();
                int sizePlayers = jugadores.size();

                if (game.getGameMode().equals("stackMode")) {
                    for (int i = 0; i <sizePlayers; i++){
                        game.stackMode();
                        jugadores.get(i).setTurnStatus(true);
                        jugadores.get(i).setScore(jugadores.get(i).getScore() + 1);
                        System.out.println(jugadores.get(i).toString());
                        jugadores.get(i).setTurnStatus(false);
                        System.out.println(jugadores.get(i).toString());
                    }
                }

                    if (game.getGameMode().equals("emptyHandsStackMode")) {
                        for (int i = 0; i <sizePlayers; i++){
                            game.emptyHandsStackMode();
                            jugadores.get(i).setTurnStatus(true);
                            jugadores.get(i).setScore(jugadores.get(i).getScore() + 1);
                            System.out.println(jugadores.get(i).toString());
                            jugadores.get(i).setTurnStatus(false);
                            System.out.println(jugadores.get(i).toString());
                        }
                    }

                    if (game.getGameMode().equals("myMode")) {
                        for (int i = 0; i <sizePlayers; i++){
                            game.myMode();
                            jugadores.get(i).setTurnStatus(true);
                            jugadores.get(i).setScore(jugadores.get(i).getScore() + 1);
                            System.out.println(jugadores.get(i).toString());
                            jugadores.get(i).setTurnStatus(false);
                            System.out.println(jugadores.get(i).toString());
                        }
                    }

                    if (game.getGameMode().equals("demoMode") && game.getGameDeck().size()>0){
                        for (int i = 0; i<2; i++) {
                                game.demoMode();

                            System.out.println("Primer turno");

                                jugadores.get(i).setTurnStatus(true);
                                jugadores.get(i).setScore(jugadores.get(i).getScore() + 1);
                                System.out.println(jugadores.get(i).toString());
                                jugadores.get(i).setTurnStatus(false);
                                System.out.println(jugadores.get(i).toString());
                            }
                        }

            }

            if (opt == 4){
                System.out.println("####################################");
                System.out.println("Estado general del juego\n");
                System.out.println("####################################");
                System.out.println(game.toString());
                System.out.println("####################################");
            }

            if (opt == 5){
                System.out.println("####################################");
                System.out.println("Juego finalizado.");
                System.out.println("####################################");
                break;
            }
        }
    }
}