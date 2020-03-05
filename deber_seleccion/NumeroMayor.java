package deber_seleccion;

public class NumeroMayor {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int numMax;

    /**
     * Metodo para la clase NumeroMayor
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     */
    public NumeroMayor(int num1, int num2, int num3, int num4){
        this.setNum1(num1);
        this.setNum2(num2);
        this.setNum3(num3);
        this.setNum4(num4);
    }

    /**
     * Metodo para obtener el numero 1
     * @return num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Metodo para actualizar el numero 1
     * @param num1
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Metodo para obtener el numero 2
     * @return num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Metodo para actualizar el numero 2
     * @param num2
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * Metodo para obtener el numero 3
     * @return num3
     */
    public int getNum3() {
        return num3;
    }

    /**
     * Metodo para actualizar el numero 3
     * @param num3
     */
    public void setNum3(int num3) {
        this.num3 = num3;
    }

    /**
     * Metodo para obtener el numero 4
     * @return num4
     */
    public int getNum4() {
        return num4;
    }

    /**
     * Metodo para actualizar el numero 4
     * @param num4
     */
    public void setNum4(int num4) {
        this.num4 = num4;
    }

    /**
     * Metodo para obtener el numero maximo
     * @return numMax
     */
    public int getNumMax() {
        if(num1 > num2 && num1 > num3 && num1 > num4){
            numMax = num1;
        }else{
            if (num2 > num1 && num2 > num3 && num2 > num4){
                numMax = num2;
            }else{
                if (num3 > num1 && num3 > num2 && num3 > num4){
                    numMax = num3;
                }else{
                    numMax = num4;
                }
            }
        }
        return numMax;
    }

    /**
     * Metodo para actualizar el numero maximo
     * @param numMax
     */
    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }


}
