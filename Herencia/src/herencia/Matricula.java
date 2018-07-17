
package herencia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Matricula extends javax.swing.JFrame {

    String [][] materias;
    DefaultTableModel tblModelMaterias;
    String [][] profesor;
    DefaultTableModel tblModelProfesor;
    
    String [][] estudiantes;
    DefaultTableModel tblModelEstudiantes;
    
    String [][] matriculas;
    DefaultTableModel tblModelMatriculas;
    
    List<Materia> listaMaterias = new ArrayList<>();
    DefaultComboBoxModel listaMateriasModel = 
            new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Estudiante> listaEstudiantes = new ArrayList<>();
    DefaultComboBoxModel listaEstudiantesModel = 
            new DefaultComboBoxModel(listaEstudiantes.toArray());
    List<Profesor> listaProfesores = new ArrayList<>();
    
    public Matricula() {
        initComponents();
        
        String titulosColumnasMaterias[] = new String [] {"Materia"};
        tblModelMaterias = new DefaultTableModel(materias, titulosColumnasMaterias);
        tblMaterias.setModel(tblModelMaterias);
        
        String titulosColumnasEstudiantes[] = new String [] {"Nombre", "Apellido"};
        tblModelEstudiantes = new DefaultTableModel(estudiantes, titulosColumnasEstudiantes);
        tblEstudiante.setModel(tblModelEstudiantes);
        
        String titulosColumnasMatriculas[] = new String [] {"Estudiante", "Materia"};
        tblModelMatriculas = new DefaultTableModel(matriculas, titulosColumnasMatriculas);
        tblMatriculas.setModel(tblModelMatriculas);
        
        String titulosColumnasProfesores[] = new String [] {"Nombre", "Apellido","Materia"};
        tblModelProfesor = new DefaultTableModel(profesor, titulosColumnasProfesores);
        tblProfesor.setModel(tblModelProfesor);
        
        cmbMateriasp.setModel(listaMateriasModel);
        cmbEstudiante.setModel(listaEstudiantesModel);
        cmbMateria.setModel(listaMateriasModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        btnRegistrarmateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblNombrep = new javax.swing.JLabel();
        txtNombrep = new javax.swing.JTextField();
        lblApellidop = new javax.swing.JLabel();
        txtApellidop = new javax.swing.JTextField();
        cmbMateriasp = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProfesor = new javax.swing.JTable();
        btnRegistrarp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblNombree = new javax.swing.JLabel();
        txtNombree = new javax.swing.JTextField();
        lblApellidoe = new javax.swing.JLabel();
        txtApellidoe = new javax.swing.JTextField();
        btnRegistrare = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblEstudiantem = new javax.swing.JLabel();
        lblMateriam = new javax.swing.JLabel();
        cmbEstudiante = new javax.swing.JComboBox<>();
        cmbMateria = new javax.swing.JComboBox<>();
        btnMatricular = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatriculas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMateria.setText("Materia:");

        btnRegistrarmateria.setText("Registrar");
        btnRegistrarmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmateriaActionPerformed(evt);
            }
        });

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarmateria)
                            .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMateria)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarmateria)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materia", jPanel1);

        lblNombrep.setText("Nombre:");

        lblApellidop.setText("Apellido:");

        cmbMateriasp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Materias:");

        tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblProfesor);

        btnRegistrarp.setText("Registrar");
        btnRegistrarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNombrep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellidop)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbMateriasp, 0, 99, Short.MAX_VALUE)
                                    .addComponent(txtApellidop))))
                        .addGap(37, 37, 37)
                        .addComponent(btnRegistrarp)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrep)
                    .addComponent(txtNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidop)
                    .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMateriasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnRegistrarp))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profesor", jPanel2);

        lblNombree.setText("Nombre:");

        lblApellidoe.setText("Apellido:");

        btnRegistrare.setText("Registrar");
        btnRegistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrareActionPerformed(evt);
            }
        });

        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblEstudiante);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblNombree)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNombree, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblApellidoe)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRegistrare)
                                .addComponent(txtApellidoe)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombree)
                    .addComponent(txtNombree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoe))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrare)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estudiante", jPanel3);

        lblEstudiantem.setText("Estudiante:");

        lblMateriam.setText("Materia:");

        cmbEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnMatricular.setText("Matricular");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });

        tblMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblMatriculas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstudiantem)
                            .addComponent(lblMateriam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMatricular)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbEstudiante, 0, 113, Short.MAX_VALUE)
                                .addComponent(cmbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudiantem)
                    .addComponent(cmbEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateriam)
                    .addComponent(cmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMatricular)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matricular", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmateriaActionPerformed
        Materia newMateria = new Materia(txtMateria.getText());
        
        boolean materiaExiste = false;
        
        if(txtMateria.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre de la materia");
        }else{
        for(Materia m : listaMaterias) {
            if(m.getNombre().equals(newMateria.getNombre())) {
                materiaExiste = true;
                break;
            }
        }
        
        if(!materiaExiste) {
            listaMaterias.add(newMateria);
            tblModelMaterias.addRow(new String[]{newMateria.getNombre()});
            listaMateriasModel.addElement(newMateria);   
        } else {
            JOptionPane.showMessageDialog(rootPane, "La materia ya existe");
        }
        }

        txtMateria.setText("");
    }//GEN-LAST:event_btnRegistrarmateriaActionPerformed

    private void btnRegistrarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarpActionPerformed
        String nombre = txtNombrep.getText();
        String apellido = txtApellidop.getText();
        Materia materia=(Materia) cmbMateriasp.getSelectedItem();
        Profesor profesor = new Profesor(nombre,apellido,materia.getNombre());
        tblModelProfesor.addRow(new String[]{profesor.getNombre(), profesor.getApellido(),profesor.getMateria()});
    }//GEN-LAST:event_btnRegistrarpActionPerformed

    private void btnRegistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrareActionPerformed
        String nombre = txtNombree.getText();
        String apellido = txtApellidoe.getText();
       
        Estudiante estudiante = new Estudiante(nombre, apellido);
        
        tblModelEstudiantes.addRow(new String[]{estudiante.getNombre(), estudiante.getApellido()});
        listaEstudiantesModel.addElement(estudiante);
    }//GEN-LAST:event_btnRegistrareActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        Estudiante estudiante = (Estudiante)cmbEstudiante.getSelectedItem();
        Materia materia = (Materia)cmbMateria.getSelectedItem();
        

        boolean materiaExiste = false;
        ArrayList<Materia> materiasyestudiante = estudiante.getMaterias();
        if(materiasyestudiante.size() > 0){
            for(Materia m : materiasyestudiante) {
                if(materia.equals(m)){
                    materiaExiste = true;
                    break;
                }
            }
        }
        
        if(!materiaExiste) {
            tblModelMatriculas.addRow(new String[]{estudiante.getNombre(),materia.getNombre()});
            materiasyestudiante.add(materia);
        } else {
            JOptionPane.showMessageDialog(rootPane, "El estudiante ya esta matriculado en la materia");
        }
    }//GEN-LAST:event_btnMatricularActionPerformed

    
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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton btnRegistrare;
    private javax.swing.JButton btnRegistrarmateria;
    private javax.swing.JButton btnRegistrarp;
    private javax.swing.JComboBox<String> cmbEstudiante;
    private javax.swing.JComboBox<String> cmbMateria;
    private javax.swing.JComboBox<String> cmbMateriasp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellidoe;
    private javax.swing.JLabel lblApellidop;
    private javax.swing.JLabel lblEstudiantem;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblMateriam;
    private javax.swing.JLabel lblNombree;
    private javax.swing.JLabel lblNombrep;
    private javax.swing.JTable tblEstudiante;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatriculas;
    private javax.swing.JTable tblProfesor;
    private javax.swing.JTextField txtApellidoe;
    private javax.swing.JTextField txtApellidop;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNombree;
    private javax.swing.JTextField txtNombrep;
    // End of variables declaration//GEN-END:variables
}
