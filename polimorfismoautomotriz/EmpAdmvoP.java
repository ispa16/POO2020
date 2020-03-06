package polimorfismoautomotriz;

import java.util.Scanner;

public class EmpAdmvoP extends EmpleadoP {
    private double suel;

    /**
     * Metoco constructor para empleado administrativo
     * @param rfc
     * @param nom
     * @param dep
     * @param puest
     * @param suel
     */
    public EmpAdmvoP(String rfc, String nom, String dep, String puest, double suel){
        this.rfc = rfc;
        this.nom = nom;
        this.dep = dep;
        this.puest = puest;
        this.suel = suel;
    }

    /**
     * Metodo para obtener el sueldo
     * @return suel
     */
    public double getSuel() {
        return suel;
    }

    /**
     * Metodo abstracto para calcular la quincena
     */
    @Override
    public void calcularQuin(){
        quin = suel / 2;
    }
}
