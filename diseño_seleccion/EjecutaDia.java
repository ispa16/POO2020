package diseño_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar un numero del 1 al 7 para determinar el dia de la semana: ");
        int num = scan.nextInt();

        Dia dia = new Dia(num);
        System.out.println("__________________");
        System.out.println("\n"+dia.calcularNombre());
        System.out.println("__________________");
    }
}
