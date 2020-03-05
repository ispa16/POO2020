package diseño_seleccion;

public class Dia {
    private int num;
    private String nombre;

    /**
     * Metodo par el dia
     * @param num
     */
    public Dia(int num){
        this.setNum(num);
    }

    /**
     * Metodo para obtener el numero
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * Metodo para actualizar el numero
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
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
     * Metodo para calcular el nombre
     * @return dia
     */
    public String calcularNombre(){

        String dia;

        switch (getNum()){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miercoles";
                break;
            case 5:
                dia = "Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Opcion incorrecta";
                break;
        }
        return dia;
    }
}
