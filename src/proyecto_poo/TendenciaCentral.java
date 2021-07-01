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
public class TendenciaCentral extends Estadistica {
    
    String Repeticiones;
    String Media;
    
    public TendenciaCentral(double[]Cal, int num, double total){
        super (Cal, num, total);
    }
    
    public String Moda() {
       Ordenar();
        int Max_Rep = 0;
        double moda = 0;
        double moda2 = 0;
            String numCadena;
        
        for(int i=0; i<num; i++){
        int Rep = 0;
          for(int j=0; j<num; j++){
            if(Cal[i] == Cal[j])
               Rep++;
            }
              if(Rep > Max_Rep){
                moda = Cal[i];
                Max_Rep = Rep;
              }if(Rep == Max_Rep && Cal[i] != moda){
                moda2 = Cal[i];
             }
          }
            numCadena = String.valueOf(Max_Rep);
            this.Repeticiones = numCadena;
        if(moda2 != 0){        
            return moda+" y "+moda2;   
        } else{      
            return String.valueOf(moda); 
        }
    }
     public String Mediana() {
         double pos;
         Ordenar();
              if( num% 2 == 0){
                  pos = (Cal[(num-1)/2] + Cal[num/2])/2;
                  return String.valueOf(pos);
              }else{
                  pos = Cal[(num)/2];
                  return String.valueOf(pos);
              }
     }
}
