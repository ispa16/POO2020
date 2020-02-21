package arreglosdeberpoo;

public class Cedula {
    private String ident;
    private int [] cedula = new int[10];
    private int validez = 0;
    private String reporte;

    /**
     * Metodo para obtener la cedula
     * @return cedula
     */
    public int[] getCedula() {
        return cedula;
    }

    /**
     * Metodo para actualizar la cedula
     * @param cedula cedula como un arreglo
     */
    public void setCedula(int[] cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener el numero de cedula
     * @return ident
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Metodo para actualizar el numero de cedula
     * @param ident cedula como una sola variable
     */
    public void setIdent(String ident) {
        this.ident = ident;
    }

    /**
     * Metodo para obtener el numero de comprovacion
     * @return validez
     */
    public int getValidez(){
        for(int i = 0; i < (cedula.length - 1); i++){
            if(i % 2 == 0){
                validez += cedula[i] * 2;
                if(cedula[i] * 2 >= 10){
                    validez = validez - 9;
                }
            }else{
                validez += cedula[i];
            }
        }
        validez = (validez - (validez % 10) + 10) - validez;
        return validez;
    }

    /**
     * Metodo para obtener la impresion final
     * @return reporte
     */
    public String getReporte(){
        if(getValidez() == cedula[9]){
            reporte = "\nCedula: "+ getIdent() +"\nNumero verificador: "+validez+"\nEl numero de " +
                    "cedula es correcto.";
        }else{
            reporte = "\nCedula: "+ getIdent() +"\nNumero verificador: "+validez+"\nEl numero de " +
                    "cedula no es correcto.";
        }
        return reporte;
    }
}
