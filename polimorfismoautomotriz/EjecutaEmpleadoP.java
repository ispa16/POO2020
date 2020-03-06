package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleadoP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rfc;
        String nombre;
        String departamento;
        String puesto;
        double sueldoMensual;
        int num;
        double valorTrabajo = 0;
        double valorVenta = 0;
        double salario = 400;
        boolean bandera = true;
        int tipo;
        int totalEmp = 0;
        double totalQuin = 0;
        String opcion;
        String cadena = "RFC\t\t\tNOMBRE\t\tDEPTO.\t\tPUESTO\t\tSUELDO QUINCENA\n";

        while(bandera){
            System.out.println("Ingrese el tipo de empleado:\n1. Administrativo\n2. Mecanico\n3. Vendedor\n4. Salir");
            tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo){
                case 1:
                    System.out.println("Ingrese el RFC: ");
                    rfc = scanner.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el departamento: ");
                    departamento = scanner.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = scanner.nextLine();
                    System.out.println("Ingrese el sueldo mensual: ");
                    sueldoMensual = scanner.nextDouble();
                    scanner.nextLine();

                    EmpAdmvoP empAdmvoP = new EmpAdmvoP(rfc, nombre, departamento, puesto, sueldoMensual);
                    empAdmvoP.calcularQuin();

                    cadena = String.format("\n%s%s\t\t%s\t\t%s\t\t%s\t\t%.2f\n", cadena, empAdmvoP.getRfc(),
                            empAdmvoP.getNom(),
                            empAdmvoP.getDep(), empAdmvoP.getPuest(), empAdmvoP.getQuin());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empAdmvoP.getQuin();
                    System.out.println("¿Desea ingresar otro empleado? Si/No");
                    opcion = scanner.nextLine().toLowerCase();
                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el RFC: ");
                    rfc = scanner.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el departamento: ");
                    departamento = scanner.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = scanner.nextLine();
                    System.out.println("Ingrese el numero de trabajos realizados: ");
                    num = scanner.nextInt();
                    System.out.println("Ingrese el costo de cada trabajo: ");
                    for(int i = 0; i < num; i++){
                        System.out.println("Trabajo numero "+(i+1)+": ");
                        valorTrabajo = scanner.nextDouble();
                        valorTrabajo += valorTrabajo;
                    }
                    scanner.nextLine();
                    EmpMecanicoP empMecanicoP = new EmpMecanicoP(rfc, nombre, departamento, puesto, num, valorTrabajo);
                    empMecanicoP.calcularQuin();

                    cadena = String.format("\n%s%s\t\t%s\t\t%s\t\t%s\t\t%.2f\n", cadena, empMecanicoP.getRfc(),
                            empMecanicoP.getNom(), empMecanicoP.getDep(), empMecanicoP.getPuest(),
                            empMecanicoP.getQuin());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empMecanicoP.getQuin();
                    System.out.println("¿Desea ingresar otro empleado? Si/No");
                    opcion = scanner.nextLine().toLowerCase();
                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el RFC: ");
                    rfc = scanner.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el departamento: ");
                    departamento = scanner.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = scanner.nextLine();
                    System.out.println("Ingrese el numero de ventas realizados: ");
                    num = scanner.nextInt();
                    System.out.println("Ingrese el costo de cada venta: ");
                    for(int i = 0; i < num; i++){
                        System.out.println("Venta numero "+(i+1)+": ");
                        valorVenta = scanner.nextDouble();
                        valorVenta += valorVenta;
                    }
                    scanner.nextLine();
                    EmpVendedorP empVendedorP = new EmpVendedorP(rfc, nombre, departamento, puesto, salario, valorVenta);
                    empVendedorP.calcularQuin();

                    cadena = String.format("\n%s%s\t\t%s\t\t%s\t\t%s\t\t%.2f\n", cadena, empVendedorP.getRfc(),
                            empVendedorP.getNom(), empVendedorP.getDep(), empVendedorP.getPuest(),
                            empVendedorP.getQuin());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empVendedorP.getQuin();
                    System.out.println("¿Desea ingresar otro empleado? Si/No");
                    opcion = scanner.nextLine().toLowerCase();
                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        System.out.print(cadena);
        System.out.println("TOTAL "+totalEmp+" empleados\t\t\t\t\t\t\t\t"+totalQuin);
    }
}
