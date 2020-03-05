package deber_seleccion;

public class Alumno {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double prom;
    private String observacion;

    /**
     * Metodo para la clase Alumno
     * @param nombre Nombre del estudiante
     * @param nota1 Primera nota
     * @param nota2 Segunda nota
     * @param nota3 Tercera nota
     * @param nota4 Cuarta nota
     */
    public Alumno(String nombre, double nota1, double nota2, double nota3, double nota4){
        this.setNombre(nombre);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
        this.setNota4(nota4);
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
     * @param nombre Nombre del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la nota 1
     * @return nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Metodo para actualizar la nota 1
     * @param nota1 Primera nota
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * Metodo para obtener la nota 2
     * @return nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Metodo para actualizar la nota 2
     * @param nota2 Segunda nota
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * Metodo para obtener la nota 3
     * @return nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Metodo para actualizar la nota 3
     * @param nota3
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * Metodo para obtener la nota 4
     * @return nota4
     */
    public double getNota4() {
        return nota4;
    }

    /**
     * Metodo para actualizar la nota 4
     * @param nota4
     */
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    /**
     * Metodo para obtener el promedio
     * @return (nota1 + nota2 + nota3 + nota4) / 4
     */
    public double getProm() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    /**
     * Metodo para actualizar el promedio
     * @param prom
     */
    public void setProm(double prom) {
        this.prom = prom;
    }

    /**
     * Metodo para obtener la observacion
     * @return Aprobado, Reprobado
     */
    public String getObservacion() {
        if(getProm() >= 60){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }

    /**
     * Metodo para actualizar la observacion
     * @param observacion
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * Metodo para obtener el reporte del alumno
     * @return "Nombre: "+nombre+"\nPromedio: "+getProm()+"\t"+getObservacion()
     */
    public String obtenerAlunmo(){
        return "Nombre: "+nombre+"\nPromedio: "+getProm()+"\t"+getObservacion();
    }
}
