package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Dame un número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número es par ");
            } else {
                System.out.println("El número es impar");
            }
        }
        entrada.close();
    }
}
