/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.round;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Proyecto_POO  {

   
    static double num;
   

    public static void main(String[] args) throws IOException {
        GetNumero();
        if(num > 0){
          Resultados R = new Resultados();
          R.setVisible(true);
        }
    }
    public static double GetNumero() {
      JTextArea TxAr_error = new JTextArea("");
      TxAr_error.setForeground(Color.white);
      TxAr_error.setBackground(Color.black);
      TxAr_error.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 12));
        UIManager.put("OptionPane.background", new Color(216, 178, 228)); 
        UIManager.put("Panel.background", new Color(216, 178, 228)); 
        try{
        num = Integer.parseInt(JOptionPane.showInputDialog(null, new JLabel("Ingresa el No. de estudiantes que quieres agregar"),"Número de estudiantes",JOptionPane.INFORMATION_MESSAGE)); 
        if(num < 0){
             UIManager.put("OptionPane.background", new Color(0, 0, 0)); 
            UIManager.put("Panel.background", new Color(0, 0, 0));
            throw new Exceptionmenorcero("Ingreso un número menor a cero"); 
        }   
        return num;
        
        }catch(NumberFormatException e ){
            if(String.valueOf(e.getMessage())=="null"){
               System.exit(0);
            } else if(e.getMessage().equals("For input string: "+"\"\"")){
               UIManager.put("OptionPane.background", new Color(0, 0, 0)); 
               UIManager.put("Panel.background", new Color(0, 0, 0)); 
               TxAr_error.setText("NO INGRESASTE DATOS");
               JOptionPane.showMessageDialog(null,TxAr_error,"ERROR",JOptionPane.ERROR_MESSAGE);
               GetNumero();
            }else{
               UIManager.put("OptionPane.background", new Color(0, 0, 0)); 
               UIManager.put("Panel.background", new Color(0, 0, 0));
               TxAr_error.setText("INGRESASTE UNA LETRA");
               JOptionPane.showMessageDialog(null,TxAr_error,"ERROR",JOptionPane.ERROR_MESSAGE);
               GetNumero();
            }
        }catch(Exceptionmenorcero e){
            JOptionPane.showMessageDialog(null,"Ingresaste un valor menor a cero ","ERROR",2);
            GetNumero();
        }
         return num;     
    }
    
     public static int Numero(){
         return (int) round(num);
     }
     
    
}