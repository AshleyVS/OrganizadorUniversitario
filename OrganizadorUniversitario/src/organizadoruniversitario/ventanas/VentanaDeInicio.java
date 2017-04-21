
package organizadoruniversitario.ventanas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import organizadoruniversitario.principal.Datos;
import organizadoruniversitario.principal.Matricula;

/**
 *
 * @author Alejandra Álvarez
 */
public class VentanaDeInicio extends javax.swing.JFrame {
    
    /**
     * Los datos que se cargan desde los archivos CSV
     */
    private Datos datosCSV;
    
    /**
     * La matricula va guardando los datos que se le van pidiendo al usuario en
     * cada uno de los pasos.
     */
    private Matricula matricula;

    /**
     * Creo la ventana de inicio
     */
    public VentanaDeInicio() {
        initComponents();
        
        // Se crean los datos y la matricula para almacenar lo que está en el 
        // los archivos CSV y lo que se va pidiendo al usuario. 
        
        this.matricula = new Matricula();
        this.datosCSV = new Datos();
        
        // Primero hay que hacer que los botones de los pasos 2) Crear horario
        // y 3) Generar Comprobante, no estén habilitados hasta que el usuario
        // digite los datos personales del paso 1.
        this.botonCrearHorario.setEnabled(false);
        this.botonGenerarComprobante.setEnabled(false);
        
        // Cargar los archivos CSV
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonDatosEstudiante = new javax.swing.JButton();
        botonCrearHorario = new javax.swing.JButton();
        botonGenerarComprobante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Organizador Universitario");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido(a) al Organizador Universitario");

        jLabel2.setText("Con esta herramienta puede organizar su horario de clases y \nconocer el costo de la matrícula");

        botonDatosEstudiante.setText("(1) Datos de Estudiante");
        botonDatosEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosEstudianteActionPerformed(evt);
            }
        });

        botonCrearHorario.setText("(2) Crear Horario");
        botonCrearHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearHorarioActionPerformed(evt);
            }
        });

        botonGenerarComprobante.setText("(3) Generar Comprobante");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Interfaz/ulacit_logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonDatosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCrearHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonGenerarComprobante)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDatosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGenerarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitarDatosPersonales(){
        DatosEstudiante datosEstudiante = new DatosEstudiante(this, true, this.datosCSV, this.matricula);
        datosEstudiante.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        datosEstudiante.setVisible(true);
        datosEstudiante.dispose();
        
        // Si los datos fueron solicitados correctamente, se habilita la opción de crear horario
        if(matricula.getCarrera().compareTo("") != 0 && matricula.getCedula().compareTo("") != 0 && matricula.getNombre().compareTo("") !=0){
            this.botonCrearHorario.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Ahora puede crear su horario! Haga click en el paso (2)");
        } // IF ENDS 
    } // SOLICITAR DATOS ENDS 
    
    private void solicitarCuatrimestre(){
        SeleccionarCuatrimestre cuatrimestre = new SeleccionarCuatrimestre(this, true, this.datosCSV, this.matricula);
        cuatrimestre.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        cuatrimestre.setVisible(true);
        cuatrimestre.dispose();
    } // SOLICITAR CUATRIMESTRE ENDS 
 
    /**
     * Llama a la ventana que le pide al usuario los datos de estudiante y la 
     * carrera y se guarda en la matricula. 
     * @param evt 
     */
    private void botonDatosEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosEstudianteActionPerformed
       this.solicitarDatosPersonales();
    }//GEN-LAST:event_botonDatosEstudianteActionPerformed

    private void botonCrearHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearHorarioActionPerformed
        // Solicita seleccionar el cuatrimestre
        this.solicitarCuatrimestre();
    }//GEN-LAST:event_botonCrearHorarioActionPerformed

//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearHorario;
    private javax.swing.JButton botonDatosEstudiante;
    private javax.swing.JButton botonGenerarComprobante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
