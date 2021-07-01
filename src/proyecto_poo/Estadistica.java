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
public class Estadistica extends Resultados implements Procedimientos {
     
    public int num;
    public double sum = 0;
   
    public Estadistica(double[] Cal, int num, double total){
      this.Cal = Cal;
      this.num = num;
      this.total = total;
    }
    @Override
    public void Ordenar(){
        int k = 0;  
        double aux;
      
        for(int j=0; j < num; ++j){
            for(int i=0; i < num-1; ++i){
                if(Cal[i] > Cal[i+1]){
                  aux = Cal[i];
                  Cal[i] = Cal[i+1];
                  Cal[i+1] = aux;
                }
            }
        }
       
    }
    @Override
    public double Media(){
        double media = (total/num);
        return media;
    }
}
