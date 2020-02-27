package herencia;
import java.util.Scanner;
import java.util.Date;
public class Ejecuta_personal {
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Creacion de objeto estudiante");
        System.out.println("ingrese el nombre");
        est.setNombre(entrada.nextLine());
        System.out.println("ingrese la identificacion");
        est.setIdentificacion(entrada.nextLine());
        System.out.println("ingrese el estado civil");
        est.setEstado_civil(entrada.nextLine());
        System.out.println("ingrese fecha de nacimiento");
        est.setFecha_nacimiento(entrada.nextLine());

        System.out.printf("-------------------\nDatos de objeto estudiante\nNombre:" +
                "%s\nIdentificacion: %s\nCarrera: %s\nestado civil: %s\n" +
                "fecha de nacimiento: %s",est.getNombre(),est.getIdentificacion(),est.getCarrera(),est.getEstado_civil()
                ,est.getFecha_nacimiento());
    }

}
