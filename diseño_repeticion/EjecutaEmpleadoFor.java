package diseño_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horas;
        int cuota;
        String nombre;
        int opcion;
        String cadena = "";
        System.out.println("Valor de cada hora trabajada: ");
        cuota = scan.nextInt();
        scan.nextLine();
        System.out.println("Cuantos empleados desea ingresar");
        opcion = scan.nextInt();
        scan.nextLine();
        for(int i = 1; i <= opcion; i++){

            System.out.println("\nNombre del empleado numero "+i+": ");
            nombre = scan.nextLine();

            System.out.println("Horas trabajadas: ");
            horas = scan.nextInt();
            scan.nextLine();
            Empleado empleado = new Empleado(horas, cuota, nombre);
            empleado.calcularSueldo();

            cadena = String.format("%s\nEmpleado %d\nNombre: %s\nSueldo: %d\n", cadena, i, empleado.getNombre(),
                    empleado.getSueldo());
        }
        System.out.println("__________________________________");
        System.out.println("\tREPORTE DE EMPLEADO");
        System.out.println(cadena);
        System.out.println("__________________________________");
    }
}
