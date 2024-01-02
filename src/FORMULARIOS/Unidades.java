/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;
import Clases.c_unidad;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author 1000a
 */
public class Unidades extends javax.swing.JFrame {

    /**
     * Creates new form AuxilioVial
     */
    public Unidades() {
        initComponents();
        this.setLocationRelativeTo(null); //para que el formulario se quede en el centro
        this.setResizable(false);
        
        unidad.setEnabled(false); //para que no se pueda modificar el id
        
        
        c_unidad ca = new c_unidad();
        ca.MostrarUnidades(Tablaunidades);
        setIconImage(new ImageIcon(getClass().getResource("/Img/mk.jpg")).getImage());
     

       matricula.setEnabled(false);
       marca.setEnabled(false);
       tipo.setEnabled(false);
        
    
       Modificar.setEnabled(false);
       Eliminar.setEnabled(false); 
       Guardar.setEnabled(false);
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aux_vial = new javax.swing.JPanel();
        info_gen = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        unidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        marca = new javax.swing.JComboBox<>();
        btnnuevo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        xdddddddd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaunidades = new javax.swing.JTable();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unidades");

        aux_vial.setBackground(new java.awt.Color(255, 255, 255));

        info_gen.setBackground(new java.awt.Color(255, 255, 255));
        info_gen.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion general"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Matricula");

        matricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));

        unidad.setEditable(false);
        unidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));
        unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tipo");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plataforma de carga", "Grua", "Camion ligero", "Camion liviano", "Camion semiliviano", "Camion mediano", "Camion semipesado", "Camion pesados", "Camion extrapesados" }));

        marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercedes Benz / Freightliner", "Kenworth", "International", "Volvo", "Hino", "Isuzu", "Scania" }));

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save (1).png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit-info.png"))); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete (1).png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout info_genLayout = new javax.swing.GroupLayout(info_gen);
        info_gen.setLayout(info_genLayout);
        info_genLayout.setHorizontalGroup(
            info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_genLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(info_genLayout.createSequentialGroup()
                        .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(info_genLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(info_genLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_genLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        info_genLayout.setVerticalGroup(
            info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_genLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_genLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(info_genLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(btnnuevo)
                    .addComponent(Modificar)
                    .addComponent(Eliminar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        xdddddddd.setBackground(new java.awt.Color(255, 255, 255));
        xdddddddd.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de unidades"));

        Tablaunidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "Matricula", "Marca", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablaunidades.setColumnSelectionAllowed(true);
        Tablaunidades.getTableHeader().setReorderingAllowed(false);
        Tablaunidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaunidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablaunidades);
        Tablaunidades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout xddddddddLayout = new javax.swing.GroupLayout(xdddddddd);
        xdddddddd.setLayout(xddddddddLayout);
        xddddddddLayout.setHorizontalGroup(
            xddddddddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xddddddddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        xddddddddLayout.setVerticalGroup(
            xddddddddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xddddddddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout aux_vialLayout = new javax.swing.GroupLayout(aux_vial);
        aux_vial.setLayout(aux_vialLayout);
        aux_vialLayout.setHorizontalGroup(
            aux_vialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aux_vialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aux_vialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xdddddddd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_gen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aux_vialLayout.setVerticalGroup(
            aux_vialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aux_vialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xdddddddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo_mknicarP.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Unidades");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Bregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/previous.png"))); // NOI18N
        Bregresar.setText("Regresar");
        Bregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aux_vial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aux_vial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadActionPerformed

    private void TablaunidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaunidadesMouseClicked
     c_unidad ca = new c_unidad();
    
    
    Guardar.setEnabled(false);
    Modificar.setEnabled(true);
    Eliminar.setEnabled(true);
    
     
     ca.SeleccionarUnidad(Tablaunidades,unidad,matricula,marca,tipo);
    }//GEN-LAST:event_TablaunidadesMouseClicked

    private void BregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregresarActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu mn = new Menu();
        mn.setVisible(true);
    }//GEN-LAST:event_BregresarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

        //habilitar entradas
        matricula.setEnabled(true);
        marca.setEnabled(true);
        tipo.setEnabled(true);
        //Limpiar datos
        matricula.setText("");
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
        //boton habilitado
        Guardar.setEnabled(true);

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        c_unidad ca = new c_unidad();

        //definir variables
         String matricul = matricula.getText();
        Object marc = marca.getSelectedItem();
        Object tip = tipo.getSelectedItem();
        //buscar valores nulos para regresarlos

        if(!"".equals(matricul)&& !"".equals(marc) && !"".equals(tip)){
            ca.InsertarUnidad(matricula,marca,tipo);
            ca.MostrarUnidades(Tablaunidades);
        }
        else{

            JOptionPane.showMessageDialog(null,"Datos Incompletos, revisar sus datos","Datos incompletos",ERROR_MESSAGE);

        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        c_unidad ca = new c_unidad();

       
        String matricul = matricula.getText();
        String marc = (String) marca.getSelectedItem();
        String tip = (String) tipo.getSelectedItem();
        int id_unidad = Integer.parseInt(unidad.getText());

        
        if(!"".equals(matricul)&& !"".equals(marc) && !"".equals(tip)&&!"".equals(id_unidad)){
            ca.ModificarUnidad(matricula, marca, tipo, unidad);
            ca.MostrarUnidades(Tablaunidades);
        }
        else{
            JOptionPane.showMessageDialog(null,"Datos Incompletos, revisar sus datos","Datos incompletos",ERROR_MESSAGE);

        }

    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
         c_unidad ca = new c_unidad();
        int seleccion = JOptionPane.showConfirmDialog(this,"¿Desea eliminar este registro?","Pregunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (seleccion==JOptionPane.YES_OPTION)
        {ca.EliminarUnidad(unidad);
           ca.MostrarUnidades(Tablaunidades);}
        else if (seleccion==JOptionPane.NO_OPTION){ca.MostrarUnidades(Tablaunidades);}

    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Unidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bregresar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable Tablaunidades;
    private javax.swing.JPanel aux_vial;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JPanel header;
    private javax.swing.JPanel info_gen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> marca;
    public javax.swing.JTextField matricula;
    public javax.swing.JComboBox<String> tipo;
    public javax.swing.JTextField unidad;
    private javax.swing.JPanel xdddddddd;
    // End of variables declaration//GEN-END:variables
}