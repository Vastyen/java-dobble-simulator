import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        int j = 0;
        int i = 0;
        int k = 0;
        int n = 7;


        ArrayList<Integer> cards = new ArrayList<Integer>(5);
        ArrayList<Integer> card = new ArrayList<Integer>(5);


//to start, we build the first card
        for (i = 1; i<= n+1; i++) {
            card.push(i);
        }
        cards.push(card);
//then we build the next n number of cards
        for (j=1; j<=n; j++) {
            card.push(1);

            for (k=1; k<=n; k++) {
                card.push(n * j + (k+1));
            }
            cards.push(card);
        }
//finally we build the next n² number of cards
        for (i= 1; i<=n; i++) {
            for (j=1; j<=n; j++) {
                card = [];
                card.push(i+1);

                for (k=1; k<= n; k++) {
                    card.push(n+2+n*(k-1)+(((i-1)*(k-1)+j-1)%n));
                }
                cards.push(card);
            }
        }






        int opt;
        String startUser;
        Scanner sc = new Scanner(System.in);  // Creación del objeto scanner

        System.out.println("Registrar como: ");
        startUser = sc.nextLine();
        do {
            System.out.println("### Dobble ###");
            System.out.println("## Registrado como: "+ startUser);
            System.out.println("1. Crear un juego");
            System.out.println("2. Registrar jugador");
            System.out.println("3. Jugar");
            System.out.println("4. Visualizar el estado del juego completo");
            System.out.println("Introduzca su opción");
            opt = sc.nextInt();
        } while (opt != 1 && opt != 2 && opt != 3 && opt != 4);
    }





}