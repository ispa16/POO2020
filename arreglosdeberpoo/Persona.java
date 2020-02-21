package arreglosdeberpoo;

public class Persona {
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] univ = new String[5];

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String[] getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre nombre del estudiante
     */
    public void setNombre(String[] nombre) {
        this.nombre = nombre;

    }

    /**
     * Metodo para obtener la edad
     * @return edad
     */
    public int[] getEdad() {
        return edad;
    }

    /**
     * Metodo para actualizar la edad
     * @param edad edad del estudiante
     */
    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    /**
     * Metodo para obtener la universidad
     * @return univ
     */
    public String[] getUniv() {
        return univ;
    }

    /**
     * Metodo para actualizar la universidad
     * @param univ universidad del estudiante
     */
    public void setUniv(String[] univ) {
        this.univ = univ;
    }

    /**
     * Metodo para obtener el reporte final
     * @return reporte
     */
    public String getReporte(){
        String reporte = "";
        for(int i = 0; i < nombre.length; i++){
            reporte = String.format("%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: XXXXXXXXXX\n",
                    reporte, nombre[i], edad[i], univ[i]);
        }
        return reporte;
    }
}
