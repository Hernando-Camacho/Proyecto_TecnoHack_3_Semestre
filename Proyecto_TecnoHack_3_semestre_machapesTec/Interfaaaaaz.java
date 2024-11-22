/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazTecnoHack;

import ds.desktop.notify.DesktopNotify;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Interfaaaaaz extends javax.swing.JFrame {

    private DefaultTableModel EventosAgg;
      private Vector<String> vecEvent;
    private Thread timerThread;
      
   public void setFecha(String fecha) {
        fe.setText(fecha);
    }
   
    public Interfaaaaaz(String fecha) {
        initComponents();
        this.setLocationRelativeTo(null);
        fe.setText(fecha);
        vecEvent = new Vector<>();
        vecEvent.addElement("Evento");
        vecEvent.addElement("Fecha");
        vecEvent.addElement("Materia");
        vecEvent.addElement("Hora de evento");
        vecEvent.addElement("Tiempo restante");
        EventosAgg = new DefaultTableModel(vecEvent, 0);
        jTable3.setModel(EventosAgg);
        
        
        vecEvent = new Vector<>();
        vecEvent.addElement("Evento");
        vecEvent.addElement("Fecha");
        vecEvent.addElement("Materia");
        vecEvent.addElement("Hora de evento");
        vecEvent.addElement("Tiempo restante");
        
        

        EventosAgg = new DefaultTableModel(vecEvent, 0);
        jTable3.setModel(EventosAgg);
        
    }
    
    private void startTimer() {
        timerThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    updateRemainingTime();
                } catch (InterruptedException e) {
                    break; 
                }
            }   
        });
        timerThread.start(); 
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        evento = new javax.swing.JTextField();
        fe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmx = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGENDA DE ACTIVIDADES");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 27));

        hora.setColumns(15);
        jPanel3.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 311, 243, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora del evento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton1.setText("Agregar evento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 355, -1, -1));

        evento.setColumns(15);
        jPanel3.add(evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 141, 243, -1));

        fe.setColumns(15);
        jPanel3.add(fe, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 198, 243, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Evento:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton3.setText("Elegir fecha");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 198, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Materia:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        cmx.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cmx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Probabilidad y estadistica", "Algebra lineal", "Sistemas operativos", "Costos empresariales", "Taller de investigacion l", "Ingles ll", "Estructura de datos", "Sistemas electronicos para informatica" }));
        cmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmxActionPerformed(evt);
            }
        });
        jPanel3.add(cmx, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazTecnoHack/imagenes/misterio-fpantalla (1).jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Agenda", jPanel3);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EVENTO AGREGADO");

        jTable3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton2.setText("Eliminar Fila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazTecnoHack/imagenes/misterio-fpantalla (1).jpg"))); // NOI18N

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jButton4.setText("Eliminar datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton2)
                        .addGap(117, 117, 117)
                        .addComponent(jButton4))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Editar", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int fila=jTable3.getSelectedRow();
        if(fila>=0){
            EventosAgg.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        HackPrincipal abrir = new HackPrincipal(this);
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String materia = (String) cmx.getSelectedItem();

    if (evento.getText().equals("") || fe.getText().equals("") || hora.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Campos vacio", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        
        if (!hora.getText().matches("([01]\\d|2[0-3]):([0-5]\\d)")) {
            JOptionPane.showMessageDialog(this, "Formato de hora inválido. Usa HH:mm (24 horas)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DesktopNotify.showDesktopMessage("NUEVO EVENTO: ", "Evento: " + evento.getText() + "\nFecha de entrega: " + fe.getText() + "\nMateria: " + materia + "\nHora de entrega: " + hora.getText(), DesktopNotify.INFORMATION, 10000L);
        RegistrarEvento();
        JOptionPane.showMessageDialog(null, "El evento se ha registrado con éxito");
        evento.setText("");
        fe.setText("");
        hora.setText("");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int fila= jTable3.getRowCount();
    for(int i=fila-1;i>=0;i--){
        EventosAgg.removeRow(i);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmxActionPerformed

    private void updateRemainingTime() {
    if (EventosAgg.getRowCount() > 0) {
        for (int i = 0; i < EventosAgg.getRowCount(); i++) {
            String fechaEvento = (String) EventosAgg.getValueAt(i, 1); 
            String horaEvento = (String) EventosAgg.getValueAt(i, 3); 
            String fechaHoraEvento = fechaEvento + " " + horaEvento;

            try {
                
                long tiempoEvento = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm").parse(fechaHoraEvento).getTime();
                long tiempoActual = System.currentTimeMillis();
                long tiempoRestante = tiempoEvento - tiempoActual;

                if (tiempoRestante > 0) {
                    long diasRestantes = tiempoRestante / (1000 * 60 * 60 * 24);
                    long horasRestantes = (tiempoRestante / (1000 * 60 * 60)) % 24;
                    long minutosRestantes = (tiempoRestante / (1000 * 60)) % 60;

                    String tiempoString = String.format("%d días, %02d horas, %02d minutos", diasRestantes, horasRestantes, minutosRestantes);
                    EventosAgg.setValueAt(tiempoString, i, 4); 
                } else {
                    EventosAgg.setValueAt("Evento Completado", i, 4);
                }
            } catch (Exception e) {
                e.printStackTrace(); 
            }
        }
    }
}
    private void checkNotifications(long diasRestantes, long horasRestantes, int fila) {
    
    if (diasRestantes == 1 && horasRestantes == 00) {
        DesktopNotify.showDesktopMessage("Recordatorio", "Falta 1 día para el evento: " + EventosAgg.getValueAt(fila, 0), DesktopNotify.INFORMATION, 10000L);
    }
   
    if (diasRestantes == 0 && horasRestantes == 01) {
        DesktopNotify.showDesktopMessage("Recordatorio", "Falta 1 hora para el evento: " + EventosAgg.getValueAt(fila, 0), DesktopNotify.INFORMATION, 10000L);
    }
    
    if (diasRestantes == 0 && horasRestantes > 01) {
        String mensaje = String.format("Faltan %d horas para el evento: %s", horasRestantes, EventosAgg.getValueAt(fila, 0));
        DesktopNotify.showDesktopMessage("Recordatorio", mensaje, DesktopNotify.INFORMATION, 10000L);
    }
}
    
    private void RegistrarEvento(){
     String Evento = evento.getText();
        String Fecha = fe.getText();
        String materiaSeleccionada = (String) cmx.getSelectedItem();
        String Hora = hora.getText();
        Vector<String> filaEvento = new Vector<>();
        filaEvento.add(Evento);
        filaEvento.add(Fecha);
        filaEvento.add(materiaSeleccionada);
        filaEvento.add(Hora);
        filaEvento.add(""); 
        EventosAgg.addRow(filaEvento);
        if (EventosAgg.getRowCount() == 1) {
            startTimer();
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Interfaaaaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaaaaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaaaaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaaaaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Interfaaaaaz in1 = new Interfaaaaaz(null);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaaaaaz(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmx;
    private javax.swing.JTextField evento;
    private javax.swing.JTextField fe;
    private javax.swing.JTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
