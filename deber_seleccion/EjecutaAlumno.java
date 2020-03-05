package deber_seleccion;

import java.util.Scanner;

public class EjecutaAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del  alumno: ");
        String nombre = scanner.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Nota 4: ");
        double nota4 = scanner.nextDouble();

        Alumno alumno = new Alumno(nombre, nota1, nota2, nota3, nota4);

        System.out.println("________________________________\n\tREPORTE DEL ALUMNO\n");
        System.out.println(alumno.obtenerAlunmo());
        System.out.println("________________________________");

    }
}