
package organizadoruniversitario.ventanas;

import organizadoruniversitario.principal.Curso;
import organizadoruniversitario.principal.Datos;
import organizadoruniversitario.principal.Matricula;

/**
 *
 * @author aleal
 */
public class SeleccionarMateria extends javax.swing.JDialog {

    private Datos datos;
    private Matricula matricula;
    private Curso[] cursos;
    
    /**
     * Creates new form SeleccionarMateria
     */
    public SeleccionarMateria(java.awt.Frame parent, boolean modal, Datos datos, Matricula matricula) {
        super(parent, modal);
        // Se recibe la matricula y los datos desde la ventana principal para 
        // poder leer desde los datos las carreras y guardar los datos en
        // la matricula.
        this.matricula = matricula;
        this.datos = datos;
        initComponents();
        this.CuatrimestreLabel.setText("Cuatrimestre: " + this.matricula.getCuatrimestre());
        this.cursos = this.datos.obtenerCursosDeCarreraEnCuatri(matricula.getCarrera(), matricula.getCuatrimestre());
        this.cargarCursos();
    } // SELECCIONAR CUATRIMESTRE ENDS 
    
    private void cargarCursos(){
        if(this.cursos != null && this.cursos.length > 0){
            for(int i =0; i< cursos.length; i++){
                this.jComboBoxMateria.addItem(cursos[i].getNombre());
            } // FOR ENDS
        } // IF ENDS
    } // CARGAR CURSOS ENDS 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CuatrimestreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        siguienteBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        CuatrimestreLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CuatrimestreLabel.setText("Cuatrimestre ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione de la materia de la que desea obtener información ");

        siguienteBoton.setBackground(new java.awt.Color(153, 153, 153));
        siguienteBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Interfaz/right-arrow.png"))); // NOI18N
        siguienteBoton.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siguienteBoton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(CuatrimestreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(CuatrimestreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(siguienteBoton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CuatrimestreLabel;
    private javax.swing.JComboBox<String> jComboBoxMateria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton siguienteBoton;
    // End of variables declaration//GEN-END:variables
}
