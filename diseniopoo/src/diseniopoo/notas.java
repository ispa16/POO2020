/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniopoo;

/**
 *
 * @author Jorge Tapia Flores
 */
public class notas{
    private double nota_bimestre1 ;
    private double nota_bimestre2 ;
    private double nota_final ;
    private String estado; 

//obtener datos
public double obtener_nota_bimestre1(double a) {
    return this.nota_bimestre1= a;

}
public double obtener_nota_bimestre2(double a){
    return this.nota_bimestre2 = a;

}
public double calcular_nota_final(){
    double nota_final = (nota_bimestre1 + nota_bimestre2) ;
    return this.nota_final = nota_final;
}
public String obtener_estado(){
    String estado ;
    if (nota_final >=28){
        estado = "aprovado";
    }else{
        estado = "suspenso";
    }
    
    return this.estado = estado;
}
// mostrar datos
public String mostrar_nota_bimestre1() {
    String cadena;
    cadena = String.format("%s\n nota primer bimestre: %s\n"
             + "nota segundo bimestre: %s\n nota final: %s\n"
             + "estado: %s","libreta de calificaciones",nota_bimestre1
              ,nota_bimestre2,nota_final
              ,estado);
    return cadena;
}
public double mostrar_nota_bimestre2(){
    return nota_bimestre2;

}
public double mostrar_nota_final(){
     ;
    return nota_final ;
}
public String mostrar_estado(){
    
    return  estado;
}

}
