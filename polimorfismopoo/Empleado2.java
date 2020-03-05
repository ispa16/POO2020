package polimorfismopoo;

public abstract class Empleado2 {
    protected String nombre;
    protected String depar;
    protected String puesto;
    protected double sueldoQuincena;

    /**
     * Metodo abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularSueldoQuincena();

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el departamento
     * @return depar
     */
    public String getDepar() {
        return depar;
    }

    /**
     * Metodo para actualizar el departamento
     * @param depar
     */
    public void setDepar(String depar) {
        this.depar = depar;
    }

    /**
     * Metodo para obtener el puesto
     * @return puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Metodo para actualizar el puesto
     * @param puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
