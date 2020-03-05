package polimorfismofigura;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        while (bandera){
            System.out.println("\tCALCULO DEL AREA DE UNA FIGURA\nElija la opcion pertinente:\n1. Triangulo\n2. Recta" +
                    "ngulo\n3. Cuadrado\n4. Circulo\n5. Salir");
            int tipo = scanner.nextInt();
            scanner.nextLine();
            switch (tipo){
                case 1:
                    Triangulo3 triangulo3 = new Triangulo3();
                    System.out.println("Ingrese el nombre de la figura:");
                    triangulo3.setNomFigura(scanner.nextLine());

                    System.out.println("Ingrese la base de la figura:");
                    triangulo3.setBaseTria(scanner.nextDouble());

                    System.out.println("Ingrese la altura de la figura:");
                    triangulo3.setAlturaTria(scanner.nextDouble());
                    scanner.nextLine();
                    triangulo3.calcularArea();

                    System.out.println("El area de la figura "+triangulo3.getNomFigura()+" es "+triangulo3.getArea());

                    System.out.println("Desea ingresar otra figura Si / No");
                    String opcion = scanner.nextLine().toLowerCase();

                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 2:
                    Rectangulo3 rectangulo3 = new Rectangulo3();
                    System.out.println("Ingrese el nombre de la figura:");
                    rectangulo3.setNomFigura(scanner.nextLine());

                    System.out.println("Ingrese la base de la figura:");
                    rectangulo3.setBaseRecta(scanner.nextDouble());

                    System.out.println("Ingrese la altura de la figura:");
                    rectangulo3.setAlturaRecta(scanner.nextDouble());
                    scanner.nextLine();
                    rectangulo3.calcularArea();

                    System.out.println("El area de la figura "+rectangulo3.getNomFigura()+" es "+rectangulo3.getArea());

                    System.out.println("Desea ingresar otra figura Si / No");
                    opcion = scanner.nextLine().toLowerCase();

                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 3:
                    Cuadrado3 cuadrado3 = new Cuadrado3();
                    System.out.println("Ingrese el nombre de la figura:");
                    cuadrado3.setNomFigura(scanner.nextLine());

                    System.out.println("Ingrese el lado de la figura:");
                    cuadrado3.setLadoCuad(scanner.nextDouble());
                    scanner.nextLine();
                    cuadrado3.calcularArea();

                    System.out.println("El area de la figura "+cuadrado3.getNomFigura()+" es "+cuadrado3.getArea());

                    System.out.println("Desea ingresar otra figura Si / No");
                    opcion = scanner.nextLine().toLowerCase();

                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 4:
                    Circulo3 circulo3 = new Circulo3();
                    System.out.println("Ingrese el nombre de la figura:");
                    circulo3.setNomFigura(scanner.nextLine());

                    System.out.println("Ingrese el radio de la figura:");
                    circulo3.setRadioCirc(scanner.nextDouble());
                    scanner.nextLine();
                    circulo3.calcularArea();

                    System.out.println("El area de la figura "+circulo3.getNomFigura()+" es "+circulo3.getArea());

                    System.out.println("Desea ingresar otra figura Si / No");
                    opcion = scanner.nextLine().toLowerCase();

                    if(opcion.equals("no")){
                        bandera = false;
                    }
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
