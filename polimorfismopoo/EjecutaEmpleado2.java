package polimorfismopoo;

import java.util.Scanner;

public class EjecutaEmpleado2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmpleadoPorHoras2 empleadoPorHoras2 = new EmpleadoPorHoras2();
        System.out.println("Calculo de sueldo por horas");
        System.out.println("Ingrese las horas trabajadas:");
        empleadoPorHoras2.setHoras(scanner.nextDouble());

        System.out.println("Ingrese la cuota por hora:");
        empleadoPorHoras2.setCuotas(scanner.nextDouble());

        empleadoPorHoras2.calcularSueldoQuincena();
        System.out.println("El sueldo quincenal es: "+empleadoPorHoras2.getSueldoQuincenal());

        EmpleadoAsalariado2 empleadoAsalariado2 = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo asalariado");

        System.out.println("Ingrese su sueldo mensual:");
        empleadoAsalariado2.setSueldoMensual(scanner.nextDouble());

        empleadoAsalariado2.calcularSueldoQuincena();
        System.out.println("El sueldo quincenal es: "+empleadoAsalariado2.getSueldoQuincenal());
    }
}
