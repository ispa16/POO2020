package herencia;

/**
 * clase que hereda de la clase persona
 * contendra todos los atributos y metodos definidos en persona
 */

public class Estudiante extends Persona {
    //atributos propios de esta clase
    private String carrera;


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular(){
        System.out.println("Metodo para matricular");
    }

    public void aprender(){
        System.out.println("Metodo para aprender");
    }


}
