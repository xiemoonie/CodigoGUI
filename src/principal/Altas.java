/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import datos.Cliente;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.util.regex.*;

import lista.ListaSimpleEncadenada;

/**
 *
 * @author Usuario
 */
public class Altas extends javax.swing.JFrame {

    /**
     * Creates new form Altas
     */
    private ListaSimpleEncadenada <Cliente> lista;
    
    
    
    public Altas() {
        initComponents();
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(jRadioButtonMasculino);
        grupo.add(jRadioButtonFemenino);
    }
    
    public void agregarPuntero(ListaSimpleEncadenada li){
        this.lista = li;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jComboBoxProvincia = new javax.swing.JComboBox<>();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Cliente");
        setMinimumSize(new java.awt.Dimension(660, 440));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Altas de Clientes"));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 210));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 210));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 210));

        jLabelNombre.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Provincia:");

        jLabel5.setText("Sexo:");

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(150, 25));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(150, 25));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(150, 25));

        jTextFieldApellido.setMaximumSize(new java.awt.Dimension(150, 25));
        jTextFieldApellido.setMinimumSize(new java.awt.Dimension(150, 25));
        jTextFieldApellido.setPreferredSize(new java.awt.Dimension(150, 25));

        jTextFieldDNI.setMaximumSize(new java.awt.Dimension(150, 25));
        jTextFieldDNI.setMinimumSize(new java.awt.Dimension(150, 25));
        jTextFieldDNI.setPreferredSize(new java.awt.Dimension(150, 25));

        jComboBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santiago del Estero", "Cordoba", "Tucuman", "Santa Fe" }));
        jComboBoxProvincia.setMaximumSize(new java.awt.Dimension(150, 25));
        jComboBoxProvincia.setMinimumSize(new java.awt.Dimension(150, 25));
        jComboBoxProvincia.setPreferredSize(new java.awt.Dimension(150, 25));

        jRadioButtonMasculino.setText("Masculino");

        jRadioButtonFemenino.setText("Femenino");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_cliente.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(200, 150));
        jLabel6.setMinimumSize(new java.awt.Dimension(200, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonMasculino)
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButtonFemenino))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFemenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setMaximumSize(new java.awt.Dimension(100, 40));
        jButtonGuardar.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(100, 40));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        String provincia = "";
        int valorprovincia = jComboBoxProvincia.getSelectedIndex();
        switch(valorprovincia){
            case 0:
                provincia = "Santiago del Estero";
                break;
            case 1:
                provincia = "Cordoba";
                break;
            case 2:
                provincia = "Tucuman";
                break;
            case 3:
                provincia = "Santa Fe";
                break;
        }
        
        char sexo = 'F';
        if(jRadioButtonFemenino.isSelected()){
            sexo = 'F';
        }
        else{
            sexo = 'M';
        }
        
        
     
        String regex = "\\d+";
        Pattern p = Pattern.compile(regex);
        Pattern nom = Pattern.compile(regex);
        Pattern ape = Pattern.compile(regex);
        try{
        Matcher m = p.matcher(jTextFieldDNI.getText());
        Matcher n = nom.matcher(jTextFieldNombre.getText());
        Matcher a = ape.matcher(jTextFieldApellido.getText());
        if(m.matches() == true && n.matches() == false &&  a.matches() == false && jTextFieldNombre.getText().isEmpty()!= true && jTextFieldApellido.getText().isEmpty()!= true){
            Cliente c = new Cliente(jTextFieldNombre.getText(), jTextFieldApellido.getText(),sexo, Long.parseLong(jTextFieldDNI.getText()),provincia);
            this.lista.insertarElemento(c);
            JOptionPane.showMessageDialog(null, "Cliente agregado correctamente");

            
        }else{
            
            JOptionPane.showMessageDialog(null, "Informacion Invalida");
            this.dispose();
        
        }}catch(Exception e){
        };
        
        
            
        
        
        
        this.dispose();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxProvincia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}