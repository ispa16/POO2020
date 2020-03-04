package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
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

                    EmpAdmvo empAdmvo = new EmpAdmvo(rfc, nombre, departamento, puesto, sueldoMensual);

                    cadena = String.format("\n%s%s\t\t%s\t\t%s\t\t%s\t\t%.2f\n", cadena, empAdmvo.getRfc(),
                            empAdmvo.getNombre(),
                            empAdmvo.getDepartamento(), empAdmvo.getPuesto(), empAdmvo.calcularQuincena());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empAdmvo.calcularQuincena();
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
                    EmpMecanico empMecanico = new EmpMecanico(rfc, nombre, departamento, puesto, num, valorTrabajo);

                    cadena = String.format("\n%s%s\t\t%s\t\t%s\t\t%s\t\t%.2f\n", cadena, empMecanico.getRfc(),
                            empMecanico.getNombre(), empMecanico.getDepartamento(), empMecanico.getPuesto(),
                            empMecanico.calcularQuincena());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empMecanico.calcularQuincena();
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
                    EmpVendedor empVendedor = new EmpVendedor(rfc, nombre, departamento, puesto, salario, valorVenta);

                    cadena = String.format("\n%s%s\t\t%s\t\t%s\t\t%s\t\t%.2f\n", cadena, empVendedor.getRfc(),
                            empVendedor.getNombre(), empVendedor.getDepartamento(), empVendedor.getPuesto(),
                            empVendedor.calcularQuincena());
                    totalEmp = totalEmp + 1;
                    totalQuin = totalQuin + empVendedor.calcularQuincena();
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
