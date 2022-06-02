import java.util.Scanner;
import java.util.List;

public class main {

    public static void main(String[] args) {

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