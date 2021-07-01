/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 52614
 */
public class Documento extends Documentacion {

     File myOb;
    String[][] Datos;
    int num;
    String total,media,moda,No_rep,mediana,desviacion,varianza,rango,mayor_Cal,menor_Cal;

    public Documento( String[][] Datos,int num,String total,String media, String moda,String No_rep,
        String mediana, String desviacion, String varianza, String rango, String mayor_Cal, String menor_Cal) {
        this.Datos = Datos;
        this.num = num;
        this.total = total;
        this.media = media;
        this.moda = moda;
        this.No_rep = No_rep;
        this.mediana = mediana;
        this.desviacion = desviacion;
        this.varianza = varianza;     
        this.rango = rango;
        this.mayor_Cal = mayor_Cal;
        this.menor_Cal = menor_Cal;
    }
    
    @Override
    public File Generar(){
         myOb = new File("Reporte.txt");
         return myOb;
    }
    @Override
    public void Modificar(){
       try {
            Generar();
          // String ruta = "Archivos_1.txt";
         
           
          //File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!myOb.exists()) {
                myOb.createNewFile();
            }
            FileWriter fw = new FileWriter(myOb);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < num;i++){
               bw.write("Nombre: " + Datos[i][0]+"\n"); 
               bw.write("Martrícula: " + Datos[i][1]+"\n"); 
               bw.write("Calificación: " + Datos[i][2]+"\n"); 
               bw.write("\n"); 
            }
             
            bw.write("***Datos***" +"\n"); 
            bw.write("No. de alumnos: " + num +"\n"+ "Total de calificaciones: " + total +"\n"); 
            bw.write("\n"+"***Resultados***" +"\n");
            bw.write("\n"+"**Medidas de tendencia central**" +"\n"+ "Media: " + media +"\n"+ "Moda: " + moda + " No de repeticiones: " + No_rep  +"\n"+ "Mediana: " + mediana+"\n");   
            bw.write("\n"+"**Medidas de dispersión**" +"\n"+ "Rango: " + rango +"\n"+ "Desviación Estandar: " + desviacion +"\n"+  "Varianza: " +varianza +"\n");  
            bw.write("\n"+"**Reporte de Datos**" +"\n"+ "Mayor calificación: " + mayor_Cal +"\n"+ "Menor calificación: " + menor_Cal);  
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
