/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

/**
 *
 * @author 52614
 */
public class ReporteDatos extends Estadistica {
       
    public ReporteDatos(double[] Cal, int num, double total) {
        super(Cal, num, total);
    }
    
    public String CalMa(){
        Ordenar();
        double calMa = Cal[num-1];
        return String.valueOf(calMa);
    }
     public String Calme(){
        Ordenar();
        double calme = Cal[0];
        return String.valueOf(calme);
    }
}
