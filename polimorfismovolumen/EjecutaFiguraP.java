package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFiguraP {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String nombre;
        double radio, altura, lado;
        boolean bandera = true;
        int opcion;

        while(bandera) {
            System.out.println("\tCALCULO DEL VOLUMEN DE UNA FIGURA\n\nSeleccione la opcion pertienente\n1. Cubo\n" +
                    "2. Cilindro\n3. Cono\n4. Esfera\n5. Salir\n");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrse el lado: ");
                    lado = scanner.nextDouble();

                    CuboP cuboP = new CuboP(nombre, lado);
                    cuboP.calcularVolu();

                    System.out.println("----------------------------");
                    System.out.printf("\n\tEl volumen de la figura %s es %.2f\t\n", cuboP.getNomb(),
                            cuboP.getVolu());
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese la altura: ");
                    altura = scanner.nextDouble();

                    System.out.println("Ingrese el radio: ");
                    radio = scanner.nextDouble();

                    CilindroP cilindroP = new CilindroP(nombre, radio, altura);
                    cilindroP.calcularVolu();

                    System.out.println("-----------------------------");
                    System.out.printf("\n\tEl volumen de la figura %s es %.2f\t\n", cilindroP.getNomb(),
                            cilindroP.getVolu());
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrse la altura:");
                    altura = scanner.nextDouble();

                    System.out.println("Ingrese le radio: ");
                    radio = scanner.nextDouble();

                    ConoP conoP = new ConoP(nombre, radio, altura);
                    conoP.calcularVolu();

                    System.out.println("-----------------------------");
                    System.out.printf("\n\tEl volumen de la figura %s es %.2f\t\n", conoP.getNomb(),
                            conoP.getVolu());
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese el radio: ");
                    radio = scanner.nextDouble();

                    EsferaP esferaP = new EsferaP(nombre, radio);
                    esferaP.calcularVolu();

                    System.out.println("------------------------------");
                    System.out.printf("El volumen de la figura %s es %.2f\t\n", esferaP.getNomb(),
                            esferaP.getVolu());
                    System.out.println("------------------------------");
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}