package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] numB;
        int [] numBin = new int[6];

        Numero numero = new Numero();
        System.out.println("Ingrese el numero binario: ");
        String num = scanner.nextLine();

        numB = num.toCharArray();
        for(int i = 0; i < numB.length; i++){
            numBin[i] = Character.getNumericValue(numB[i]);
        }
        numero.setNumB(numBin);
        System.out.println("\nEl numero binario "+num+" en decimal es: "+numero.calcularNumD());
    }
}
