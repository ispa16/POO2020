package herenciadeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcion, nom, numCue, cadena = "\tREPORTE DE CLIENTES DEUDORES\nNo. Cliente\t\tNombre\t\tNo. Cuenta\t\t" +
                "Interes ganado\n";
        double prestamo, totalInteres = 0, interes;
        int tipo, plazo, numCli = 0;
        boolean bandera = true;

        while (bandera){
            System.out.println("\tREPORTE DE CLIENTES DEUDORES\n\nElija la opcion pertinente:\n1. Prestamo personal" +
                    "\n2. Prestamo hipotecario\n3. Prestamo automotriz\n4. Salir");
            tipo = scanner.nextInt();
            scanner.nextLine();
            switch (tipo){
                case 1:
                    System.out.println("Ingrese su nombre:");
                    nom = scanner.nextLine();

                    System.out.println("Ingrese su numero de cuenta:");
                    numCue = scanner.nextLine();

                    System.out.println("Ingrese la cantidad del prestamo:");
                    prestamo = scanner.nextDouble();

                    System.out.println("Ingrese el interes anual de su banco:");
                    interes = scanner.nextDouble();

                    System.out.println("Ingrese el plazo anual:");
                    plazo = scanner.nextInt();
                    scanner.nextLine();

                    numCli = numCli + 1;

                    PrestamoPersonal prestamoPersonal = new PrestamoPersonal(numCli, nom, numCue, prestamo, interes,
                            plazo);

                    cadena = String.format("%s\t%d\t\t\t%s\t\t%s\t\t\t%.2f\n", cadena, prestamoPersonal.getNumCli(),
                            prestamoPersonal.getNom(), prestamoPersonal.getNumCue(),
                            prestamoPersonal.calcularPersonal());

                    totalInteres += prestamoPersonal.calcularPersonal();

                    System.out.println("¿Desea ingresar otro calculo? Si / No");
                    opcion = scanner.nextLine().toLowerCase();

                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese su nombre:");
                    nom = scanner.nextLine();

                    System.out.println("Ingrese su numero de cuenta: ");
                    numCue = scanner.nextLine();

                    System.out.println("Ingrese la cantidad del prestamo:");
                    prestamo = scanner.nextDouble();

                    System.out.println("Ingrese el interes anual de su banco:");
                    interes = scanner.nextDouble();

                    System.out.println("Ingrese el plazo anual: ");
                    plazo = scanner.nextInt();
                    scanner.nextLine();

                    numCli = numCli + 1;

                    PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(numCli, nom, numCue, prestamo,
                            interes, plazo);

                    cadena = String.format("%s\t%d\t\t\t%s\t\t%s\t\t\t%.2f\n", cadena, prestamoHipotecario.getNumCli(),
                            prestamoHipotecario.getNom(), prestamoHipotecario.getNumCue(),
                            prestamoHipotecario.calcularHipotecario());

                    totalInteres += prestamoHipotecario.calcularHipotecario();

                    System.out.println("¿Desea ingresar otro calculo? Si / No");
                    opcion = scanner.nextLine().toLowerCase();

                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese su nombre:");
                    nom = scanner.nextLine();

                    System.out.println("Ingrese su numero de cuenta: ");
                    numCue = scanner.nextLine();

                    System.out.println("Ingrese el precio del auto:");
                    prestamo = scanner.nextDouble();

                    System.out.println("Ingrese el plazo mensual: ");
                    plazo = scanner.nextInt();
                    scanner.nextLine();

                    numCli = numCli + 1;

                    interes = 0.1123;

                    PrestamoAuto prestamoAuto = new PrestamoAuto(numCli, nom, numCue, prestamo, interes, plazo);

                    cadena = String.format("%s\t%d\t\t\t%s\t\t%s\t\t\t%.2f\n", cadena, prestamoAuto.getNumCli(),
                            prestamoAuto.getNom(), prestamoAuto.getNumCue(),
                            prestamoAuto.calcularAuto());

                    totalInteres += prestamoAuto.calcularAuto();

                    System.out.println("¿Desea ingresar otro calculo? Si / No");
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
            }
        }
        System.out.print(cadena);
        System.out.println("TOTAL "+numCli+" deudores\t\t\t\t\t\t\t"+totalInteres);
    }
}
