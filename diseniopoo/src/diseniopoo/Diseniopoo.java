/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniopoo;
import java.util.Scanner;
/**
 *
 * @author Jorge Tapia Flores
 */
public class Diseniopoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);  
      notas notas = new notas();
      
//ingreso de datos
      System.out.println("Ingrese el nombre de la asignatura");
      entrada.nextLine();
      System.out.println("Ingrese la nota del primer bimestre");
      double aux = entrada.nextDouble();
      notas.obtener_nota_bimestre1(aux);//obtener nota bimestre1
      System.out.println("Ingrese la nota del segundo bimestre");
      aux = entrada.nextDouble();//obtenere nota bimestre2
      
//ejecutar metodos
      notas.obtener_nota_bimestre2(aux);
      notas.calcular_nota_final();
      notas.obtener_estado();
      System.out.printf("%s",notas.mostrar_nota_bimestre1());
      
      
      
    }
    
}
