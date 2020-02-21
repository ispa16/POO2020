package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] nombre = new String[5];
        int [] edad = new int[5];
        String [] univ = new String[5];
        Persona persona = new Persona();

        for (int i = 0; i < nombre.length; i++){
            System.out.println("Nombre del estudiate N"+(i+1));
            nombre[i] = scanner.nextLine();

            System.out.println("Edad del estudiante N"+(i+1));
            edad[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Universidad del estudiante N"+(i+1));
            univ[i] = scanner.nextLine();
        }
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setUniv(univ);

        System.out.println("__________________________");
        System.out.println("\tREPORTE DE ESTUDIANTES");
        System.out.println(persona.getReporte());
        System.out.println("________________________");


    }
}
