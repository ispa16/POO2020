package arreglosdeberpoo;

public class Numero {
    private int[] numB = new int[6];
    private int numD;

    /**
     * Metodo para obtener el numero binario
     * @return numB
     */
    public int[] getNumB(){
        return numB;
    }

    /**
     * Metodo para actualizar el numero binario
     * @param numB numero binario
     */
    public void setNumB(int[] numB){
        this.numB = numB;
    }

    /**
     * Metodo para calcular el numero decimal
     * @return numD
     */
    public int calcularNumD(){
        for(int i = 0; i < numB.length; i++){
            numD += numB[i] * Math.pow(2, numB.length - (i+1));
        }
        return numD;
    }
}
