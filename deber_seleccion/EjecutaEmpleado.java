package deber_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre del empleado: ");
        String nombre = scan.nextLine();

        System.out.println("Horas trabajadas: ");
        double horas = scan.nextDouble();

        System.out.println("Cuota horaria: ");
        double cuota = scan.nextDouble();

        Empleado empleado = new Empleado(nombre, horas, cuota);
        System.out.println("_____________________________________________________");
        System.out.println("\n\tREPORTE DEL SUELDO DIARIO DEL EMPLEADO\n\n"+empleado.obtenerEmpleado());
        System.out.println("_____________________________________________________");
    }
}
