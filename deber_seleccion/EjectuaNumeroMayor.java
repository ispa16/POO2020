package deber_seleccion;

import java.util.Scanner;

public class EjectuaNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Numero 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Numero 3: ");
        int num3 = scanner.nextInt();

        System.out.println("Numero 4: ");
        int num4 = scanner.nextInt();

        NumeroMayor numeroMayor = new NumeroMayor(num1, num2, num3, num4);
        System.out.println("________________________________");
        System.out.println("\n El numero mayor es: "+numeroMayor.getNumMax());
        System.out.println("\n________________________________");
    }
}
