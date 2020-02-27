package herencia;
//esta claase hereda de la clase persona
public class Docente extends Persona{

    private String area;
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void ensenar(){
        System.out.println("metodo para ensenar");
    }
    public void calificar(){
        System.out.println("metodo para calificar");
    }
}
