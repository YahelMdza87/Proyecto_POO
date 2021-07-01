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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Resultados extends javax.swing.JFrame {
    JTextArea TxAr_error = new JTextArea("");
     

    DefaultTableModel modelo = new DefaultTableModel();
    double[] Cal = new double[Proyecto_POO.Numero()];
    String[][] Datos = new String[Proyecto_POO.Numero()][3];
    double total;
    int j=0;
    int i = 0;
    int Estudiantes = 0;
       
    public Resultados() throws IOException {
        this.setTitle("Datos");
        this.getContentPane().setBackground(new Color(0, 1, 28));
        this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("D:\\Yahel M\\Documents\\Proyecto_Final\\src\\proyecto_poo\\fondo.jpg")))));
        initComponents();
        this.Btn_Calcular.setVisible(false);
        this.Btn_Generar.setVisible(false);
        columnasTable();
    }
    
    private void columnasTable(){
        modelo.addColumn("Alumno");
        modelo.addColumn("Matricula");
        modelo.addColumn("Calificación");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lb_Datos = new javax.swing.JLabel();
        Lb_Alumno = new javax.swing.JLabel();
        Lb_Matricula = new javax.swing.JLabel();
        Lb_Calificación = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Datos = new javax.swing.JTable();
        Lb_Moda = new javax.swing.JLabel();
        Lb_No_Rep = new javax.swing.JLabel();
        Lb_Mediana = new javax.swing.JLabel();
        Lb_Rango = new javax.swing.JLabel();
        Lb_Desviación = new javax.swing.JLabel();
        Lb_Varianza = new javax.swing.JLabel();
        Lb_Mayor_Cal = new javax.swing.JLabel();
        Lb_Menor_Cal = new javax.swing.JLabel();
        Lb_Media = new javax.swing.JLabel();
        Lb_Medidas_TC = new javax.swing.JLabel();
        Lb_Medidas_Dis = new javax.swing.JLabel();
        Lb_Reporte_Datos = new javax.swing.JLabel();
        Lb_Resultados = new javax.swing.JLabel();
        Txt_Alumno = new javax.swing.JTextField();
        Txt_Matricula = new javax.swing.JTextField();
        Txt_Calificacion = new javax.swing.JTextField();
        Txt_Media = new javax.swing.JTextField();
        Txt_Mediana = new javax.swing.JTextField();
        Txt_Moda = new javax.swing.JTextField();
        Txt_No_Rep = new javax.swing.JTextField();
        Txt_Desviacion = new javax.swing.JTextField();
        Txt_Rango = new javax.swing.JTextField();
        Txt_Varianza = new javax.swing.JTextField();
        Txt_Mayor_Cal = new javax.swing.JTextField();
        Txt_Menor_Cal = new javax.swing.JTextField();
        Btn_Agregar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Txt_Total = new javax.swing.JTextField();
        Lb_Total = new javax.swing.JLabel();
        Lb_No_Est = new javax.swing.JLabel();
        Txt_No_Estudiantes = new javax.swing.JTextField();
        Btn_Calcular = new javax.swing.JButton();
        Btn_Generar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(156, 156, 156));
        setMaximumSize(new java.awt.Dimension(0, 0));

        Lb_Datos.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Lb_Datos.setForeground(new java.awt.Color(0, 204, 0));
        Lb_Datos.setText("Datos");

        Lb_Alumno.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        Lb_Alumno.setForeground(new java.awt.Color(153, 255, 153));
        Lb_Alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/alumno.png"))); // NOI18N
        Lb_Alumno.setText("Alumno:");
        Lb_Alumno.setAutoscrolls(true);

        Lb_Matricula.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        Lb_Matricula.setForeground(new java.awt.Color(153, 255, 153));
        Lb_Matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/credencial.png"))); // NOI18N
        Lb_Matricula.setText("Matricula:");
        Lb_Matricula.setAutoscrolls(true);

        Lb_Calificación.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        Lb_Calificación.setForeground(new java.awt.Color(153, 255, 153));
        Lb_Calificación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/calificacion.png"))); // NOI18N
        Lb_Calificación.setText("Calificación:");
        Lb_Calificación.setToolTipText("");
        Lb_Calificación.setAutoscrolls(true);
        Lb_Calificación.setDoubleBuffered(true);

        Tabla_Datos.setBackground(new java.awt.Color(51, 51, 51));
        Tabla_Datos.setForeground(new java.awt.Color(255, 255, 255));
        Tabla_Datos.setModel(modelo);
        Tabla_Datos.setFocusable(false);
        Tabla_Datos.setGridColor(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(Tabla_Datos);

        Lb_Moda.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Moda.setForeground(new java.awt.Color(255, 204, 102));
        Lb_Moda.setText("Moda:");

        Lb_No_Rep.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_No_Rep.setForeground(new java.awt.Color(255, 204, 102));
        Lb_No_Rep.setText("No. de Rep:");

        Lb_Mediana.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Mediana.setForeground(new java.awt.Color(255, 204, 102));
        Lb_Mediana.setText("Mediana:");

        Lb_Rango.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Rango.setForeground(new java.awt.Color(0, 204, 255));
        Lb_Rango.setText("Rango:");

        Lb_Desviación.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Desviación.setForeground(new java.awt.Color(0, 204, 255));
        Lb_Desviación.setText("Desviación Estándar:");

        Lb_Varianza.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Varianza.setForeground(new java.awt.Color(0, 204, 255));
        Lb_Varianza.setText("Varianza:");

        Lb_Mayor_Cal.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Mayor_Cal.setForeground(new java.awt.Color(255, 102, 255));
        Lb_Mayor_Cal.setText("Mayor calificación:");

        Lb_Menor_Cal.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Menor_Cal.setForeground(new java.awt.Color(255, 102, 255));
        Lb_Menor_Cal.setText("Menor calificación:");

        Lb_Media.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Media.setForeground(new java.awt.Color(255, 204, 102));
        Lb_Media.setText("Media:");

        Lb_Medidas_TC.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        Lb_Medidas_TC.setForeground(new java.awt.Color(255, 153, 0));
        Lb_Medidas_TC.setText("Medidas De Tendencia Central");

        Lb_Medidas_Dis.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        Lb_Medidas_Dis.setForeground(new java.awt.Color(0, 102, 204));
        Lb_Medidas_Dis.setText("Medidas De Dispersión");

        Lb_Reporte_Datos.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        Lb_Reporte_Datos.setForeground(new java.awt.Color(204, 0, 204));
        Lb_Reporte_Datos.setText("Reporte de Datos");

        Lb_Resultados.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Lb_Resultados.setForeground(new java.awt.Color(0, 204, 204));
        Lb_Resultados.setText("Resultados");

        Txt_Alumno.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Alumno.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Alumno.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Alumno.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 255, 153)));
        Txt_Alumno.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        Txt_Matricula.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Matricula.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Matricula.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Matricula.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 255, 153)));

        Txt_Calificacion.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Calificacion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Calificacion.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Calificacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 255, 153)));

        Txt_Media.setEditable(false);
        Txt_Media.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Media.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Media.setForeground(new java.awt.Color(255, 204, 102));
        Txt_Media.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Media.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 153, 0)));
        Txt_Media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_MediaActionPerformed(evt);
            }
        });

        Txt_Mediana.setEditable(false);
        Txt_Mediana.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Mediana.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Mediana.setForeground(new java.awt.Color(255, 204, 102));
        Txt_Mediana.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Mediana.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 153, 0)));

        Txt_Moda.setEditable(false);
        Txt_Moda.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Moda.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Moda.setForeground(new java.awt.Color(255, 204, 102));
        Txt_Moda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Moda.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 153, 0)));

        Txt_No_Rep.setEditable(false);
        Txt_No_Rep.setBackground(new java.awt.Color(255, 255, 255));
        Txt_No_Rep.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_No_Rep.setForeground(new java.awt.Color(255, 204, 102));
        Txt_No_Rep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_No_Rep.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 153, 0)));

        Txt_Desviacion.setEditable(false);
        Txt_Desviacion.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Desviacion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Desviacion.setForeground(new java.awt.Color(0, 204, 255));
        Txt_Desviacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Txt_Desviacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));

        Txt_Rango.setEditable(false);
        Txt_Rango.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Rango.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Rango.setForeground(new java.awt.Color(0, 204, 255));
        Txt_Rango.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Rango.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));

        Txt_Varianza.setEditable(false);
        Txt_Varianza.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Varianza.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Varianza.setForeground(new java.awt.Color(0, 204, 255));
        Txt_Varianza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Varianza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));

        Txt_Mayor_Cal.setEditable(false);
        Txt_Mayor_Cal.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Mayor_Cal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Mayor_Cal.setForeground(new java.awt.Color(255, 102, 255));
        Txt_Mayor_Cal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Mayor_Cal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204), 2));

        Txt_Menor_Cal.setEditable(false);
        Txt_Menor_Cal.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Menor_Cal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Menor_Cal.setForeground(new java.awt.Color(255, 102, 255));
        Txt_Menor_Cal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Menor_Cal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204), 2));

        Btn_Agregar.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Agregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btn_Agregar.setForeground(new java.awt.Color(153, 255, 153));
        Btn_Agregar.setText("Agregar");
        Btn_Agregar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 255, 153)));
        Btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarActionPerformed(evt);
            }
        });

        Btn_Salir.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setText("Salir");
        Btn_Salir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        Txt_Total.setEditable(false);
        Txt_Total.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Total.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_Total.setForeground(new java.awt.Color(255, 51, 51));
        Txt_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        Txt_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TotalActionPerformed(evt);
            }
        });

        Lb_Total.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_Total.setForeground(new java.awt.Color(255, 51, 51));
        Lb_Total.setText("Total:");

        Lb_No_Est.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Lb_No_Est.setForeground(new java.awt.Color(255, 51, 51));
        Lb_No_Est.setText("No. de Estudiantes:");

        Txt_No_Estudiantes.setEditable(false);
        Txt_No_Estudiantes.setBackground(new java.awt.Color(255, 255, 255));
        Txt_No_Estudiantes.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        Txt_No_Estudiantes.setForeground(new java.awt.Color(255, 51, 51));
        Txt_No_Estudiantes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_No_Estudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        Txt_No_Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_No_EstudiantesActionPerformed(evt);
            }
        });

        Btn_Calcular.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Calcular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btn_Calcular.setForeground(new java.awt.Color(0, 204, 204));
        Btn_Calcular.setText("Calcular");
        Btn_Calcular.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        Btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CalcularActionPerformed(evt);
            }
        });

        Btn_Generar.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Generar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btn_Generar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Generar.setText("Generar");
        Btn_Generar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        Btn_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(Lb_Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lb_Resultados)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(Btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lb_No_Est)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_No_Estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(Lb_Total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lb_Matricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lb_Calificación)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lb_Alumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txt_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lb_Media)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Media, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Lb_Medidas_TC))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lb_Mayor_Cal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Mayor_Cal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lb_Menor_Cal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Menor_Cal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(Lb_Medidas_Dis))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Lb_Moda)
                                    .addGap(26, 26, 26)
                                    .addComponent(Txt_Moda, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Lb_No_Rep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_No_Rep, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(22, 22, 22))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Lb_Desviación)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Desviacion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Lb_Varianza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lb_Reporte_Datos)
                                    .addComponent(Txt_Varianza, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lb_Mediana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Mediana, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lb_Rango)
                        .addGap(25, 25, 25)
                        .addComponent(Txt_Rango, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Lb_Resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_Medidas_TC)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Media)
                            .addComponent(Txt_Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Moda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_No_Rep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_No_Rep)
                            .addComponent(Lb_Moda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Mediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Lb_Datos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Alumno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Matricula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Mediana)
                            .addComponent(Lb_Calificación, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lb_Medidas_Dis)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Rango)
                            .addComponent(Txt_Rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Desviación)
                            .addComponent(Txt_Desviacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Varianza)
                            .addComponent(Txt_Varianza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(Lb_Reporte_Datos)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Mayor_Cal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Mayor_Cal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Menor_Cal)
                            .addComponent(Txt_Menor_Cal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Total)
                            .addComponent(Lb_No_Est)
                            .addComponent(Txt_No_Estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_MediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_MediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_MediaActionPerformed

    private void Btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarActionPerformed
         TxAr_error.setForeground(Color.white);
         TxAr_error.setBackground(Color.black);
         TxAr_error.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 12));
        if(j < Proyecto_POO.Numero()){
                    Object[] fila = new Object[3];  
                    fila[0] = Txt_Alumno.getText();
                    fila[1] = Txt_Matricula.getText();
                    fila[2] = Txt_Calificacion.getText();
                    try{                   
                        Cal[i] = Double.parseDouble(Txt_Calificacion.getText());
                        if(Cal[i] >= 0 && Cal[i] <=10 ){
                        modelo.addRow(fila);   
                        Datos[i][0] = Txt_Alumno.getText();
                        Datos[i][1] = Txt_Matricula.getText();
                        Datos[i][2] = Txt_Calificacion.getText();
                            
                        i= i+1;
                        total = (Double.parseDouble(Txt_Calificacion.getText()))+total;
                       
                        Txt_Total.setText( String.valueOf(total));

                        Txt_Alumno.setText("");
                        Txt_Matricula.setText("");
                        Txt_Calificacion.setText("");
                        j = j+1;
                        Estudiantes = Estudiantes + 1;
                        Txt_No_Estudiantes.setText( String.valueOf(Estudiantes)); 
                        
                            if(j == Proyecto_POO.Numero()){
                              this.Btn_Agregar.setVisible(false);
                              this.Btn_Calcular.setVisible(true);
                              Txt_Alumno.setEnabled(false);
                              Txt_Matricula.setEnabled(false);
                              Txt_Calificacion.setEnabled(false);
                            }
                        }else{
                            UIManager.put("OptionPane.background", new Color(0,0,0)); 
                            UIManager.put("Panel.background",new Color(0,0,0)); 
                            TxAr_error.setText("Ingresa valores entre 0 y 10");
                            JOptionPane.showMessageDialog(null,TxAr_error,"ERROR",JOptionPane.ERROR_MESSAGE);
                            Txt_Calificacion.setText("");
                        }
                          
                    }catch(NumberFormatException e){
                        if(e.getMessage()=="empty String"){
                            UIManager.put("OptionPane.background", new Color(0,0,0)); 
                            UIManager.put("Panel.background", new Color(0,0,0)); 
                            TxAr_error.setText("No ingresaste una calificacion ");
                            JOptionPane.showMessageDialog(null,TxAr_error,"ERROR",JOptionPane.ERROR_MESSAGE);
                        }else{    
                            UIManager.put("OptionPane.background", new Color(0,0,0)); 
                            UIManager.put("Panel.background", new Color(0,0,0)); 
                            TxAr_error.setText("Ingresaste una letra ");
                            JOptionPane.showMessageDialog(null,TxAr_error,"ERROR",JOptionPane.ERROR_MESSAGE);
                            Txt_Calificacion.setText("");
                        }
                    }           
                }
    }//GEN-LAST:event_Btn_AgregarActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        dispose();
            UIManager.put("OptionPane.background", new Color(22, 201, 160)); 
            UIManager.put("Panel.background",new Color(22, 201, 160)); 
            JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
            System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Txt_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TotalActionPerformed
        
    }//GEN-LAST:event_Txt_TotalActionPerformed

    private void Txt_No_EstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_No_EstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_No_EstudiantesActionPerformed

    private void Btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CalcularActionPerformed
        Estadistica Es = new Estadistica(Cal,Cal.length,total);
        TendenciaCentral TC = new TendenciaCentral(Cal,Cal.length,total);
        Dispersion Dis = new Dispersion(Cal,Cal.length,total);
        ReporteDatos RD = new ReporteDatos(Cal,Cal.length,total);
    
        this.Txt_Media.setText(String.valueOf(Es.Media()));
        this.Txt_Moda.setText(TC.Moda());
        this.Txt_No_Rep.setText(TC.Repeticiones);
        this.Txt_Mediana.setText(TC.Mediana());
        this.Txt_Desviacion.setText(String.valueOf(Dis.Desviacion()));
        this.Txt_Varianza.setText(Dis.Varianza());
        this.Txt_Rango.setText(Dis.Rango());
        this.Txt_Mayor_Cal.setText(RD.CalMa());
        this.Txt_Menor_Cal.setText(RD.Calme());
        
        this.Btn_Generar.setVisible(true);
    }//GEN-LAST:event_Btn_CalcularActionPerformed

    private void Btn_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GenerarActionPerformed
       Documento D = new Documento(Datos,Proyecto_POO.Numero(),String.valueOf(total),Txt_Media.getText(),Txt_Moda.getText(),Txt_No_Rep.getText(),
               Txt_Mediana.getText(),Txt_Desviacion.getText(),Txt_Varianza.getText(),Txt_Rango.getText(),Txt_Mayor_Cal.getText(),Txt_Menor_Cal.getText());
           D.Modificar();
    }//GEN-LAST:event_Btn_GenerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Resultados().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Resultados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JButton Btn_Calcular;
    private javax.swing.JButton Btn_Generar;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JLabel Lb_Alumno;
    private javax.swing.JLabel Lb_Calificación;
    private javax.swing.JLabel Lb_Datos;
    private javax.swing.JLabel Lb_Desviación;
    private javax.swing.JLabel Lb_Matricula;
    private javax.swing.JLabel Lb_Mayor_Cal;
    private javax.swing.JLabel Lb_Media;
    private javax.swing.JLabel Lb_Mediana;
    private javax.swing.JLabel Lb_Medidas_Dis;
    private javax.swing.JLabel Lb_Medidas_TC;
    private javax.swing.JLabel Lb_Menor_Cal;
    private javax.swing.JLabel Lb_Moda;
    private javax.swing.JLabel Lb_No_Est;
    private javax.swing.JLabel Lb_No_Rep;
    private javax.swing.JLabel Lb_Rango;
    private javax.swing.JLabel Lb_Reporte_Datos;
    private javax.swing.JLabel Lb_Resultados;
    private javax.swing.JLabel Lb_Total;
    private javax.swing.JLabel Lb_Varianza;
    private javax.swing.JTable Tabla_Datos;
    private javax.swing.JTextField Txt_Alumno;
    private javax.swing.JTextField Txt_Calificacion;
    private javax.swing.JTextField Txt_Desviacion;
    private javax.swing.JTextField Txt_Matricula;
    private javax.swing.JTextField Txt_Mayor_Cal;
    private javax.swing.JTextField Txt_Media;
    private javax.swing.JTextField Txt_Mediana;
    private javax.swing.JTextField Txt_Menor_Cal;
    private javax.swing.JTextField Txt_Moda;
    private javax.swing.JTextField Txt_No_Estudiantes;
    private javax.swing.JTextField Txt_No_Rep;
    private javax.swing.JTextField Txt_Rango;
    private javax.swing.JTextField Txt_Total;
    private javax.swing.JTextField Txt_Varianza;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
