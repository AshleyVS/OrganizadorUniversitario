
package organizadoruniversitario.ventanas;

import javax.swing.JFrame;
import organizadoruniversitario.principal.Datos;
import organizadoruniversitario.principal.Matricula;

/**
 *
 * @author aleal
 */
public class SeleccionarCuatrimestre extends javax.swing.JDialog {
    
    private Datos datos;
    private Matricula matricula;
    
    public SeleccionarCuatrimestre(java.awt.Frame parent, boolean modal, Datos datos, Matricula matricula) {
        super(parent, modal);
        // Se recibe la matricula y los datos desde la ventana principal para 
        // poder leer desde los datos las carreras y guardar los datos en
        // la matricula.
        this.matricula = matricula;
        this.datos = datos;
        initComponents();
        this.carreraLabel.setText("Carrera: " + this.matricula.getCarrera());
    }
    
    private void guardarCuatrimestre(String cuatri){
        this.matricula.setCuatrimestre(cuatri.toUpperCase());
        JFrame parentFrame = (JFrame) this.getParent();
        SeleccionarMateria mat = new SeleccionarMateria(parentFrame, true, this.datos, this.matricula);
        mat.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carreraLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ICuatrimestreBtn = new javax.swing.JButton();
        IICuatrimestreBtn = new javax.swing.JButton();
        TCuatrimestreBtn = new javax.swing.JButton();
        IVCuatrimestreBtn = new javax.swing.JButton();
        VCuatrimestreBtn = new javax.swing.JButton();
        VICuatrimestreBtn = new javax.swing.JButton();
        VIICuatrimestreBtn = new javax.swing.JButton();
        VIIICuatrimestreBtn = new javax.swing.JButton();
        IXCuatrimestreBtn = new javax.swing.JButton();
        XCuatrimestreBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cursosSeleccionados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        carreraLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        carreraLabel.setText("Ingenieria");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el cuatrimestre del cuál desea obtener información ");

        ICuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        ICuatrimestreBtn.setText("I Cuatrimestre");
        ICuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICuatrimestreBtnActionPerformed(evt);
            }
        });

        IICuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        IICuatrimestreBtn.setText("II Cuatrimestre");
        IICuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IICuatrimestreBtnActionPerformed(evt);
            }
        });

        TCuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        TCuatrimestreBtn.setText("III Cuatrimestre");
        TCuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCuatrimestreBtnActionPerformed(evt);
            }
        });

        IVCuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        IVCuatrimestreBtn.setText("IV Cuatrimestre");
        IVCuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVCuatrimestreBtnActionPerformed(evt);
            }
        });

        VCuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        VCuatrimestreBtn.setText("V Cuatrimestre");
        VCuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCuatrimestreBtnActionPerformed(evt);
            }
        });

        VICuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        VICuatrimestreBtn.setText("VI Cuatrimestre");
        VICuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VICuatrimestreBtnActionPerformed(evt);
            }
        });

        VIICuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        VIICuatrimestreBtn.setText("VII Cuatrimestre");
        VIICuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIICuatrimestreBtnActionPerformed(evt);
            }
        });

        VIIICuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        VIIICuatrimestreBtn.setText("VIII Cuatrimestre");
        VIIICuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIIICuatrimestreBtnActionPerformed(evt);
            }
        });

        IXCuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        IXCuatrimestreBtn.setText("IX Cuatrimestre");
        IXCuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IXCuatrimestreBtnActionPerformed(evt);
            }
        });

        XCuatrimestreBtn.setBackground(new java.awt.Color(153, 153, 153));
        XCuatrimestreBtn.setText("X Cuatrimestre");
        XCuatrimestreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XCuatrimestreBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(cursosSeleccionados);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Cursos Seleccionados");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carreraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(ICuatrimestreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(IICuatrimestreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(VCuatrimestreBtn)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(IXCuatrimestreBtn)
                                                .addComponent(VICuatrimestreBtn))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TCuatrimestreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(IVCuatrimestreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(XCuatrimestreBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(VIICuatrimestreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addComponent(VIIICuatrimestreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carreraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IVCuatrimestreBtn)
                    .addComponent(TCuatrimestreBtn)
                    .addComponent(IICuatrimestreBtn)
                    .addComponent(ICuatrimestreBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VICuatrimestreBtn)
                    .addComponent(VIICuatrimestreBtn)
                    .addComponent(VIIICuatrimestreBtn)
                    .addComponent(VCuatrimestreBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IXCuatrimestreBtn)
                    .addComponent(XCuatrimestreBtn))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ICuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("I");
    }//GEN-LAST:event_ICuatrimestreBtnActionPerformed

    private void IICuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IICuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("II");
    }//GEN-LAST:event_IICuatrimestreBtnActionPerformed

    private void TCuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("III");
    }//GEN-LAST:event_TCuatrimestreBtnActionPerformed

    private void IVCuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVCuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("IV");
    }//GEN-LAST:event_IVCuatrimestreBtnActionPerformed

    private void VCuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("V");
    }//GEN-LAST:event_VCuatrimestreBtnActionPerformed

    private void VICuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VICuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("VI");
    }//GEN-LAST:event_VICuatrimestreBtnActionPerformed

    private void VIICuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIICuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("VII");
    }//GEN-LAST:event_VIICuatrimestreBtnActionPerformed

    private void VIIICuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIIICuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("VIII");
    }//GEN-LAST:event_VIIICuatrimestreBtnActionPerformed

    private void IXCuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IXCuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("IX");
    }//GEN-LAST:event_IXCuatrimestreBtnActionPerformed

    private void XCuatrimestreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XCuatrimestreBtnActionPerformed
        this.guardarCuatrimestre("X");
    }//GEN-LAST:event_XCuatrimestreBtnActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ICuatrimestreBtn;
    private javax.swing.JButton IICuatrimestreBtn;
    private javax.swing.JButton IVCuatrimestreBtn;
    private javax.swing.JButton IXCuatrimestreBtn;
    private javax.swing.JButton TCuatrimestreBtn;
    private javax.swing.JButton VCuatrimestreBtn;
    private javax.swing.JButton VICuatrimestreBtn;
    private javax.swing.JButton VIICuatrimestreBtn;
    private javax.swing.JButton VIIICuatrimestreBtn;
    private javax.swing.JButton XCuatrimestreBtn;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JList<String> cursosSeleccionados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
