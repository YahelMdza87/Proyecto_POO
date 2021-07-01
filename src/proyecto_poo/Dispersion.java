/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author 52614
 */
public class Dispersion extends Estadistica {
    
     public Dispersion(double[] Cal, int num,double total) {
        super (Cal, num, total);
    }
     
    public String Rango() {
        double r;
        Ordenar();
        r = Cal[num-1] - Cal[0];
        return String.valueOf(r);
    }
    public String Varianza() {
        double varianza = (float) pow(Desviacion(),2);
        return String.valueOf(varianza);
    }
    public double Desviacion() {
        double desviacion = 0;      
        for(int i = 0 ; i < num; i++){
         float calculo = (float) (pow((Cal[i] - Media()),2));
            desviacion = desviacion + calculo; 
        }
        desviacion = (float) sqrt(desviacion/num);
        return desviacion;       
    }
}
