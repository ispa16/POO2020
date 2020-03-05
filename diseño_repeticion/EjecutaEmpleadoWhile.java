package diseño_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horas;
        int cuota;
        String nombre;
        String opcion;
        String cadena = "";
        int i = 1;
        System.out.println("Valor de cada hora trabajada: ");
        cuota = scan.nextInt();
        scan.nextLine();
        boolean nuevoEmpleado = true;

        while(nuevoEmpleado){
            System.out.println("Nombre del empleado: ");
            nombre = scan.nextLine();

            System.out.println("Horas trabajadas: ");
            horas = scan.nextInt();
            scan.nextLine();
            Empleado empleado = new Empleado(horas, cuota, nombre);
            empleado.calcularSueldo();

            cadena = String.format("%s\nEmpleado %d\nNombre: %s\nSueldo: %d\n", cadena, i, empleado.getNombre(),
                    empleado.getSueldo());

            System.out.println("\n¿Desea ingresar los datos de un nuevo empleado? si/no");
            opcion = scan.nextLine().toLowerCase();

            if(opcion.equals("no")) {
                nuevoEmpleado = false;
            }else{
                i = i + 1;
            }
        }
        System.out.println("__________________________________");
        System.out.println("\tREPORTE DE EMPLEADO");
        System.out.println(cadena);
        System.out.println("__________________________________");
    }
}
