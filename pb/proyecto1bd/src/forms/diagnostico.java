/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clases.conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author WELLINGTON
 */
public class diagnostico extends javax.swing.JFrame {

    //conexion base de datos
    static Connection con= conexion.conexion();
    
    //variable
    static Statement stmt=null;
    
    public diagnostico() {
        initComponents();
        getContentPane().setBackground(new Color(43,61,83));
        
        limpiardiag();
        limpiardato();
        limpiarcita();
        
        blockdiag();
        blockdato();
        bing.setVisible(false);
        tnom.requestFocus();
        
        fechasis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tcerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tmot = new java.awt.TextField();
        label2 = new java.awt.Label();
        tmes = new javax.swing.JComboBox<>();
        tdia = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        taño = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        tnom = new java.awt.TextField();
        tok = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tsint = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdiag = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ttrat = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tobs = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tedad = new java.awt.TextField();
        tpeso = new java.awt.TextField();
        taltura = new java.awt.TextField();
        bing = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIAGNOSTICO");

        tcerrar.setBackground(new java.awt.Color(229, 88, 100));
        tcerrar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tcerrar.setForeground(new java.awt.Color(255, 255, 255));
        tcerrar.setText("Cerrar");
        tcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcerrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(106, 117, 144));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CITA"));

        tmot.setText("textField2");

        label2.setText("Motivo");

        tmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        tmes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmesActionPerformed(evt);
            }
        });

        tdia.setText("dia");
        tdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdiaActionPerformed(evt);
            }
        });
        tdia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tdiaKeyTyped(evt);
            }
        });

        jLabel5.setText("Fecha");

        taño.setText("año");
        taño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tañoKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre");

        tnom.setText("textField1");

        tok.setBackground(new java.awt.Color(0, 154, 154));
        tok.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tok.setForeground(new java.awt.Color(255, 255, 255));
        tok.setText("Registrar Cita");
        tok.setToolTipText("");
        tok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tnom, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tdia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taño, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tmot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(tok)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tdia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tmot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(106, 117, 144));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DIAGNOSTICO"));

        jLabel2.setText("Sintomas");

        jLabel3.setText("Diagnostico");

        jLabel4.setText("Tratamiento");

        jLabel6.setText("Observaciones");

        tsint.setColumns(20);
        tsint.setRows(5);
        jScrollPane1.setViewportView(tsint);

        tdiag.setColumns(20);
        tdiag.setRows(5);
        jScrollPane2.setViewportView(tdiag);

        ttrat.setColumns(20);
        ttrat.setRows(5);
        jScrollPane3.setViewportView(ttrat);

        tobs.setColumns(20);
        tobs.setRows(5);
        jScrollPane4.setViewportView(tobs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(106, 117, 144));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        jLabel7.setText("Edad");

        jLabel8.setText("Peso");

        jLabel9.setText("Altura");

        tedad.setText("textField1");
        tedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tedadKeyTyped(evt);
            }
        });

        tpeso.setText("textField2");
        tpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpesoKeyTyped(evt);
            }
        });

        taltura.setText("textField3");
        taltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                talturaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tedad, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(tpeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(tedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bing.setBackground(new java.awt.Color(0, 154, 154));
        bing.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        bing.setForeground(new java.awt.Color(255, 255, 255));
        bing.setText("Ingresar");
        bing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Stethoscope_90px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tcerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bing, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bing, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcerrarActionPerformed
        clases.regp.menupadmin();
        dispose();
    }//GEN-LAST:event_tcerrarActionPerformed

    private void tokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tokActionPerformed
        try {
            String nomb=tnom.getText(), mot=tmot.getText(), 
                   fcha=clases.convertirfecha.fechaconv(tdia.getText(), tmes.getSelectedItem().toString(), taño.getText());
            
            int idpac=0;
            
            stmt=con.createStatement();
            String ConsultaPac="SELECT * FROM paciente WHERE nombre='"+nomb+"'";
            
            idpac=0;
            
            ResultSet rs=stmt.executeQuery(ConsultaPac);
            
            while(rs.next()){
                idpac=rs.getInt("id");
            }
            
            if(((tnom.getText().equals(""))||(tmot.getText().equals("")))){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                //coloca el cursor en el campo en blanco
                if(tmot.getText().equals("")){tmot.requestFocus();}
                if(tnom.getText().equals("")){tnom.requestFocus();}
            }
            else{
                stmt=con.createStatement();
                String IngPac="insert into cita values('"+0+"','"+fcha+"','"+mot+"','"+idpac+"')";
                stmt.executeUpdate(IngPac);
                
                JOptionPane.showMessageDialog(null, "CITA AGENDADA");
                
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
        bing.setVisible(true);
        tok.setVisible(false);
        blockcita();
        
        dblockdato();
        dblockdiag();
        
    }//GEN-LAST:event_tokActionPerformed

    private void tañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tañoKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0'|| c>'9')) evt.consume();

        if(taño.getText().length()==4){
            evt.consume();
        }
    }//GEN-LAST:event_tañoKeyTyped

    private void tdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tdiaKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0'|| c>'3')) evt.consume();

        if(tdia.getText().length()==2){
            evt.consume();
        }
    }//GEN-LAST:event_tdiaKeyTyped

    private void tdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdiaActionPerformed

    private void bingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bingActionPerformed
        try {
            
            String nomb=tnom.getText(), mot="", edad="", peso="", altura="", sint="", diag="", trat="", obs="", fcha="";
            int idpac=0, idcit=0;
            
            fcha=clases.convertirfecha.fechaconv(tdia.getText(), tmes.getSelectedItem().toString(), taño.getText());
            
            stmt=con.createStatement();
            String ConsultaPac="SELECT * FROM paciente WHERE nombre='"+nomb+"'";
            idpac=0;
            ResultSet rs=stmt.executeQuery(ConsultaPac);
           
            while(rs.next()){
                idpac=rs.getInt("id");
            }
            
            String ConsultaCita="SELECT * FROM cita WHERE paciente_id='"+idpac+"'"+" AND "+"'"+fcha+"' = "+"fecha";
            idcit=0;
            ResultSet rs1=stmt.executeQuery(ConsultaCita);
            
            while(rs1.next()){
                idcit=rs1.getInt("id");
            }
            
            
            
            if(((tedad.getText().equals(""))||(tpeso.getText().equals(""))||
                (taltura.getText().equals(""))||(tsint.getText().equals(""))||
                (tdiag.getText().equals(""))||(ttrat.getText().equals(""))||
                (tobs.getText().equals("")))){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                //coloca el cursor en el campo en blanco
                if(tobs.getText().equals("")){tobs.requestFocus();}
                if(ttrat.getText().equals("")){ttrat.requestFocus();}
                if(tdiag.getText().equals("")){tdiag.requestFocus();}
                if(tsint.getText().equals("")){tsint.requestFocus();}
                if(taltura.getText().equals("")){taltura.requestFocus();}
                if(tpeso.getText().equals("")){tpeso.requestFocus();}
                if(tedad.getText().equals("")){tedad.requestFocus();}
            }
            else{
                
                obs=tobs.getText();
                trat=ttrat.getText();
                diag=tdiag.getText();
                sint=tsint.getText();
                altura=taltura.getText();
                peso=tpeso.getText();
                edad=tedad.getText();
                
                
                stmt=con.createStatement();
                String IngPac="insert into diagnostico values('"+0+"','"+sint+"','"+diag+"','"+trat+"','"+obs+"','"+edad+"','"+peso+"','"+altura+"','"+idcit+"')";
                stmt.executeUpdate(IngPac);
                
                JOptionPane.showMessageDialog(null, "DIAGNOSTICO INGRESADO");
                
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dblockcita();
        limpiarcita();
        
        limpiardiag();
        limpiardato();
        
        dblockdiag();      
        dblockdato();
        
        bing.setVisible(false);
        tok.setVisible(true);
        
        tnom.requestFocus();
    }//GEN-LAST:event_bingActionPerformed

    private void tmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmesActionPerformed

    private void tedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tedadKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0'|| c>'9')) evt.consume();
        
        if(tedad.getText().length()==3){
            evt.consume();
        }
    }//GEN-LAST:event_tedadKeyTyped

    private void tpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpesoKeyTyped
       char c = evt.getKeyChar();
       if ((c<'0'|| c>'9')&&(c<'.'|| c>'.')&&(c<'0'|| c>'9')) evt.consume();
    }//GEN-LAST:event_tpesoKeyTyped

    private void talturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_talturaKeyTyped
        char c = evt.getKeyChar();
       if ((c<'0'|| c>'9')&&(c<'.'|| c>'.')&&(c<'0'|| c>'9')) evt.consume();
    }//GEN-LAST:event_talturaKeyTyped

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
            java.util.logging.Logger.getLogger(diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new diagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Label label2;
    private java.awt.TextField taltura;
    private java.awt.TextField taño;
    private javax.swing.JButton tcerrar;
    private java.awt.TextField tdia;
    private javax.swing.JTextArea tdiag;
    private java.awt.TextField tedad;
    private javax.swing.JComboBox<String> tmes;
    private java.awt.TextField tmot;
    private java.awt.TextField tnom;
    private javax.swing.JTextArea tobs;
    private javax.swing.JButton tok;
    private java.awt.TextField tpeso;
    private javax.swing.JTextArea tsint;
    private javax.swing.JTextArea ttrat;
    // End of variables declaration//GEN-END:variables

    public void limpiarcita(){
        tnom.setText("");
        tmot.setText("");
        
        tnom.requestFocus();
    }
    
    public void limpiardiag(){
        tsint.setText("");
        tdiag.setText("");
        ttrat.setText("");
        tobs.setText("");
        
        tsint.requestFocus();
    }
    
    public void limpiardato(){
        tedad.setText("");
        tpeso.setText("");
        taltura.setText("");
        
        tedad.requestFocus();
    }
    
    
    
    
    public void blockcita(){
        tnom.setEditable(false);
        tmot.setEditable(false);
    }
    
    public void dblockcita(){
        tnom.setEditable(true);
        tmot.setEditable(true);
    }
    
    public void blockdiag(){
        tsint.setEditable(false);
        tdiag.setEditable(false);
        ttrat.setEditable(false);
        tobs.setEditable(false);
    }
    
    public void dblockdiag(){
        tsint.setEditable(true);
        tdiag.setEditable(true);
        ttrat.setEditable(true);
        tobs.setEditable(true);
    }
    
    public void blockdato(){
        tedad.setEditable(false);
        tpeso.setEditable(false);
        taltura.setEditable(false);
    }
    
    public void dblockdato(){
        tedad.setEditable(true);
        tpeso.setEditable(true);
        taltura.setEditable(true);
    }
    
    
    
    
    public void fechasis(){

        int m=0;
        java.util.Date fecha = new Date();
        
        m= fecha.getDate();
        tdia.setText(Integer.toString(m));
        
        m= fecha.getMonth();
        tmes.setSelectedIndex(m);
        
        m=fecha.getYear();
        taño.setText(Integer.toString(m-100+2000));
        
        tdia.setEditable(false);
        tmes.setEnabled(false);
        taño.setEditable(false);
        
        
    }
}

