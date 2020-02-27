package herencia;

public class Administrativo extends Persona{
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public void gestionar_procesos(){
        System.out.println("metodo para gestionar procesos");
    }

}
