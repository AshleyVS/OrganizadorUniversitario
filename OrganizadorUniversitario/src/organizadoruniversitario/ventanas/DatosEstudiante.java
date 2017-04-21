
package organizadoruniversitario.ventanas;

import javax.swing.JOptionPane;
import organizadoruniversitario.principal.Datos;
import organizadoruniversitario.principal.Matricula;

/**
 *
 * @author Alejandra Álvarez
 */
public class DatosEstudiante extends javax.swing.JDialog {
    
    private Datos datos;
    private Matricula matricula;

    /**
     * 
     * @param parent
     * @param modal este valor nos impide el seleccionar algun botón del Frame 
     * hasta que no se llenen los datos de la ventana abierta.
     * @param datos
     * @param matricula 
     */
    public DatosEstudiante(java.awt.Frame parent, boolean modal, Datos datos, Matricula matricula) {
        super(parent, modal);
        
        // Se recibe la matricula y los datos desde la ventana principal para 
        // poder leer desde los datos las carreras y guardar los datos en
        // la matricula.
        this.matricula = matricula;
        this.datos = datos;
        initComponents();
        
        // Se cargan las opciones de carrera desde los datos
        this.cargarOpcionesDeCarreras();
    } // DATOS ESTUDIANTE ENDS 
    
    private void cargarOpcionesDeCarreras(){
        int carreras = this.datos.getCarreras().length;
        for(int i = 0; i < carreras; i++){
            this.careraDropdown.addItem(this.datos.getCarreras()[i].getNombre());
        } // FOR ENDS 
    } // CARGAR OPCIONES DE CARRERA ENDS 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        careraDropdown = new javax.swing.JComboBox<>();
        continuarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Interfaz/ulacit_logo.png"))); // NOI18N

        labelNombre.setText("Nombre: ");

        labelCedula.setText("Cédula: ");

        jLabel4.setText("Ingeniería: ");

        continuarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Interfaz/right-arrow.png"))); // NOI18N
        continuarBtn.setText("Continuar");
        continuarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(continuarBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCedula)
                                .addComponent(labelNombre)
                                .addComponent(jLabel4))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(careraDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(careraDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(continuarBtn)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtnActionPerformed
        if((String)this.careraDropdown.getSelectedItem() != null){
            // Se guarda la carrera que se seleccionó en la matrícula
            this.matricula.setCarrera((String)this.careraDropdown.getSelectedItem());
            
            if(this.nombreTxt.getText() != null && !"".equals(this.nombreTxt.getText())){
                this.matricula.setNombre(this.nombreTxt.getText());
                
                if(this.cedulaTxt.getText() != null && !"".equals(this.cedulaTxt.getText())){
                    this.matricula.setCedula(this.cedulaTxt.getText());
                    this.setVisible(false);
                } // IF ENDS 
                else{
                    JOptionPane.showMessageDialog(rootPane, "Debe proporcionar una cedula válida");
                } // ELSE ENDS
            } // IF ENDS
            else{
                JOptionPane.showMessageDialog(rootPane, "Debe proporcionar un nombre válido");
            } // ELSE ENDS
        } // IF ENDS 
        else{
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una carrera válida");
        } // ELSE ENDS 
        
        // RootPane: nos indica que no podemos seleccionar ningún otro lado de la ventana
        // hasta que no se atienda el error que se presenta en el cuadro de texto.
    }//GEN-LAST:event_continuarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> careraDropdown;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JButton continuarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTextField nombreTxt;
    // End of variables declaration//GEN-END:variables
}
