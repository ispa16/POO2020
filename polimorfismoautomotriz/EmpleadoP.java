package polimorfismoautomotriz;

public abstract class EmpleadoP {
    protected String rfc;
    protected String nom;
    protected String dep;
    protected String puest;
    protected double quin;
    /**
     * Metodo para obtener el rfc
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Metodo para actualizar el rfc
     * @param rfc
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String getNom() {
        return nom;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Metodo para obtener el departamento
     * @return dep
     */
    public String getDep() {
        return dep;
    }

    /**
     * Metodo para actualizar el departamento
     * @param dep
     */
    public void setDep(String dep) {
        this.dep = dep;
    }

    /**
     * Metodo para obtener el puesto
     * @return puesto
     */
    public String getPuest() {
        return puest;
    }

    /**
     * Metodo para actualizar el puesto
     * @param puest
     */
    public void setPuest(String puest) {
        this.puest = puest;
    }

    /**
     * Metodo para obtener la quincena
     * @return quin
     */
    public double getQuin() {
        return quin;
    }

    /**
     * Metodo abstracto para calcular la quincena
     */
    public abstract void calcularQuin();
}
