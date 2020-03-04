package herenciaautomotriz;

public class Empleado {
    protected String rfc;
    protected String nombre;
    protected String departamento;
    protected String puesto;

    /**
     * Metodo para obtener el RFC
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Metodo para actualizar el RFC
     * @param rfc
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

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
     * @return
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Metodo para actualizar el departamento
     * @param departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
