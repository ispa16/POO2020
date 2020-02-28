package herenciaFiguras;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int opcion ;
        double base,altura,lado,radio;

        do{
            System.out.println(" Escriba el numero deacuerdo a la opcion que desea : \n1.Area Triangulo " +
                    "\n2.Area Rectangualo: \n3. Area Cuadrado: \n4. Area Circulo");
            opcion= entrada.nextInt();
            entrada.nextLine();
            System.out.println("ingrese nombre de la figura");
            nombre = entrada.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la base del triangulo");
                    base = entrada.nextInt();
                    System.out.println("Ingrese la altura del triangulo");
                    altura= entrada.nextInt();
                    Triangulo tri = new Triangulo(nombre,base,altura);
                    tri.calcularAreaT();
                    System.out.println(" "+tri.getNombreFig()+ "\nSu area  es:"  +tri.getAreaTria());
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectangulo");
                    base = entrada.nextInt();
                    System.out.println("Ingrese la altura del rectangulo");
                    altura= entrada.nextInt();
                    Rectangulo rec = new Rectangulo(nombre,base,altura);
                    rec.calcularAreaR();
                    System.out.println("%s"+rec.getNombreFig()+ "\n\tSu area  es:"  +rec.getR());
                    break;
                case 3:
                    System.out.println("Ingrese la distancia de un lado del cuadrado");
                    lado = entrada.nextInt();
                    Cuadrado cua = new Cuadrado(nombre,lado);
                    cua.calcularAreaCua();
                    System.out.println("%s"+cua.getNombreFig()+ "\n\tSu area  es:"  +cua.getAreaCua());
                    break;
                case 4:
                    System.out.println("Ingrese el radio del circulo");
                    radio = entrada.nextInt();
                    Circulo cir = new Circulo(nombre,radio);
                    cir.calcularAreaC();
                    System.out.println("%s"+cir.getNombreFig()+ "\n\tSu area  es:"  +cir.getA());
                    break;

            }

        }while (opcion!=5);
    }

}
