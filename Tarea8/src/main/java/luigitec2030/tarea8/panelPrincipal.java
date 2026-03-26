/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package luigitec2030.tarea8;
import javax.swing.JOptionPane;

/**
 *
 * @author Luigi Tec
 */
public class panelPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(panelPrincipal.class.getName());

    /**
     * Creates new form panelPrincipal
     */
    private String mensaje;
    private String cantidad;
    private double celsius;
    
    public panelPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public boolean validarEntradas(){
        try{
            if(cantidad.isEmpty()){
                JOptionPane.showMessageDialog(this, "Campo Vacio, Ingresa valores");
                return false;
            }
            
            cantidad = cantidad.trim();
            celsius = Double.parseDouble(cantidad);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaPrincipal = new javax.swing.JPanel();
        txtCelsius = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAFahrenheit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de Celsius");

        ventanaPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        txtCelsius.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCelsius.setToolTipText("");
        txtCelsius.addActionListener(this::txtCelsiusActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setText("1. Primero ingresa la cantidad de grados Celsius que quieras convertir");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CONVERTIR DE CELSIUS");

        btnAFahrenheit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAFahrenheit.setText("FAHRENHEIT");
        btnAFahrenheit.addActionListener(this::btnAFahrenheitActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("KELVIN");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setText("2. Presiona el botón de la medida que desees convertir tus grados Celsius");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("RESULTADO:");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Nota: En este recuadro se muestras tus grados Celsius ya convertidos");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nota: Ingresa solos los valores númericos");

        SALIR.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(this::SALIRActionPerformed);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Botón para cerrar el programa.");

        javax.swing.GroupLayout ventanaPrincipalLayout = new javax.swing.GroupLayout(ventanaPrincipal);
        ventanaPrincipal.setLayout(ventanaPrincipalLayout);
        ventanaPrincipalLayout.setHorizontalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5))
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnAFahrenheit)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2))
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(txtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventanaPrincipalLayout.setVerticalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAFahrenheit)
                    .addComponent(jButton2))
                .addGap(33, 33, 33)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SALIR)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelsiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelsiusActionPerformed

    private void btnAFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAFahrenheitActionPerformed
        // Lógica para convertir los grados Celsius a Fahrenheit
        cantidad = txtCelsius.getText();
        
        // Validando entradas
        if(validarEntradas()){
            double fahrenheit = ((celsius * (9.0/5.0)) + 32);
        
            mensaje = fahrenheit + " F";
            lblResultado.setText(mensaje);
        } else {
            JOptionPane.showMessageDialog(this, "Ingresa valor númericos");
        }
    }//GEN-LAST:event_btnAFahrenheitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // Lógica para convertir los grados Celsius a Fahrenheit
        cantidad = txtCelsius.getText();
        
        // Validando entradas
        if(validarEntradas()){
            double kelvin  = (celsius + 273.15);
        
            mensaje = kelvin + " K";
            lblResultado.setText(mensaje);
        } else {
            JOptionPane.showMessageDialog(this, "Ingresa valor númericos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SALIRActionPerformed

    // Esto permite ejecutar la pestaña sin necesidad de un Main.java
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new panelPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SALIR;
    private javax.swing.JButton btnAFahrenheit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtCelsius;
    private javax.swing.JPanel ventanaPrincipal;
    // End of variables declaration//GEN-END:variables
}
