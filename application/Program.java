package application;

import entities.Pensao;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensao[] vect = new Pensao[9];

        String opc = "s";

        while (opc.equals("s")) {
           
            for (int i = 0; i < 1; i++) {
                System.out.print("Nome: ");
                String name = sc.nextLine();
                System.out.print("Digite o Email: ");
                String email = sc.nextLine();
                System.out.print("Numero do quarto: ");
                int room = sc.nextInt();
                sc.nextLine();
                vect[room] = new Pensao(name, email, room);
            }
            System.out.println();
            System.out.print("Deseja registrar mais? 's'ou 'n'(sair) ''");
            opc = sc.nextLine();

        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("                   RESERVAS                    ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println("____________________________");
                System.out.println("Numero da reserva: " + i);
                System.out.println("----------------------------");
                System.out.println(vect[i]);
                System.out.println("____________________________");
                System.out.println();
            }
        }
    }
}
