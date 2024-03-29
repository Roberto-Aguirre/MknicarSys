/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;
import Clases.c_tecnicos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author jes_p
 */
public class Tecnicos extends javax.swing.JFrame {

    
    /**
     * Creates new form Tecnicos
     */
    public Tecnicos() {
        initComponents();
        
        setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Img/mk.jpg")).getImage());
        
        c_tecnicos ct = new c_tecnicos();
        ct.MostrarTecnicos(tb_tecnicos);
        nombre.setEnabled(false);
        apellidos.setEnabled(false);
        sexo.setEnabled(false);
        edad.setEnabled(false);
        fecha_ing.setEnabled(false);
        telefono.setEnabled(false);
        domicilio.setEnabled(false);
        especialidad.setEnabled(false);

        
        
        
    
        Bguardar.setEnabled(false);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        edad = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        Bguardar = new javax.swing.JButton();
        Bedit = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        especialidad = new javax.swing.JTextField();
        fecha_ing = new javax.swing.JFormattedTextField();
        telefono = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        id_tecnico = new javax.swing.JTextField();
        Bnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tecnicos = new javax.swing.JTable();
        Bregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tecnicos");

        header.setBackground(new java.awt.Color(102, 102, 102));

        icono.setBackground(new java.awt.Color(102, 102, 102));
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo_mknicarP.png"))); // NOI18N
        icono.setText("jLabel1");

        label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("Tecnicos");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 104, 140)), "Datos del tecnico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Sexo");

        nombre.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        sexo.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Edad");

        edad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));
        edad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha ingreso");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Domicilio");

        domicilio.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        domicilio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));
        domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioActionPerformed(evt);
            }
        });

        Bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save (1).png"))); // NOI18N
        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        Bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit-info.png"))); // NOI18N
        Bedit.setText("Actualizar");
        Bedit.setToolTipText("");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });

        Bdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete (1).png"))); // NOI18N
        Bdelete.setText("Eliminar");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Apellidos");

        apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Especialidad");

        especialidad.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        especialidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));
        especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadActionPerformed(evt);
            }
        });

        fecha_ing.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 15), 1, true));
        try {
            fecha_ing.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fecha_ing.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Id Tecnico");

        id_tecnico.setEnabled(false);

        Bnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save (1).png"))); // NOI18N
        Bnuevo.setText("Nuevo");
        Bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addGap(6, 6, 6)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombre)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(fecha_ing, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(domicilio))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(Bnuevo)
                                    .addGap(42, 42, 42)
                                    .addComponent(Bguardar)
                                    .addGap(57, 57, 57)
                                    .addComponent(Bedit)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(id_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(fecha_ing, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bedit)
                            .addComponent(Bdelete)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Bnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        tb_tecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Empleado", "Nombre", "Apellidos", "Sexo", "Edad", "Domicilio", "Telefono", "Especialidad", "Fecha ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_tecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tecnicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_tecnicos);

        Bregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/previous.png"))); // NOI18N
        Bregresar.setText("Regresar");
        Bregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(Bregresar))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Bregresar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domicilioActionPerformed

    private void BregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregresarActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu mn = new Menu();
        mn.setVisible(true);
  
    }//GEN-LAST:event_BregresarActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed

        String ombre = nombre.getText();
        String pellidos = apellidos.getText();
        String eda = edad.getText();
        String echa_ing=fecha_ing.getText();
        String telefon= telefono.getText();
        String dmicilio= domicilio.getText();
        String specialidad= especialidad.getText();
if(!"".equals(ombre)&&!"".equals(pellidos)&&!"".equals(eda)&&!"".equals(echa_ing)&&!"".equals(telefon)&&!"".equals(dmicilio)&&!"".equals(specialidad)){
     c_tecnicos ct = new c_tecnicos();
      ct.InsertarTecnico(nombre, apellidos, sexo, edad, telefono, domicilio, especialidad, fecha_ing);
      ct.MostrarTecnicos(tb_tecnicos);
      
      
      id_tecnico.setText("");
        nombre.setText("");
        apellidos.setText("");
        sexo.setSelectedItem("M");
        edad.setText("");
        fecha_ing.setText("");
        telefono.setText("");
        domicilio.setText("");
        especialidad.setText("");
      
      
         nombre.setEnabled(false);
        apellidos.setEnabled(false);
        sexo.setEnabled(false);
        edad.setEnabled(false);
        fecha_ing.setEnabled(false);
        telefono.setEnabled(false);
        domicilio.setEnabled(false);
        especialidad.setEnabled(false);

        Bguardar.setEnabled(false);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);
    }else{JOptionPane.showMessageDialog(null,"Datos Incompletos, revisar sus datos","Datos incompletos",ERROR_MESSAGE);
}
        
     
      
     
    }//GEN-LAST:event_BguardarActionPerformed

    private void especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed

        c_tecnicos ct=new c_tecnicos();
        
        String ombre = nombre.getText();
        String pellidos = apellidos.getText();
        String eda = edad.getText();
        String echa_ing=fecha_ing.getText();
        String telefon= telefono.getText();
        String dmicilio= domicilio.getText();
        String specialidad= especialidad.getText();

        int seleccion = JOptionPane.showConfirmDialog(this,"¿Desea modificar este registro?","Pregunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (seleccion==JOptionPane.YES_OPTION){
            
        
    if(!"".equals(ombre)&&!"".equals(pellidos)&&!"".equals(eda)&&!"".equals(echa_ing)&&!"".equals(telefon)&&!"".equals(dmicilio)&&!"".equals(specialidad)){
        ct.ModificarTecnicos(id_tecnico,nombre,apellidos,sexo ,edad,telefono,domicilio,especialidad,fecha_ing);
        ct.MostrarTecnicos(tb_tecnicos);
        
        id_tecnico.setText("");
        nombre.setText("");
        apellidos.setText("");
        sexo.setSelectedItem("M");
        edad.setText("");
        fecha_ing.setText("");
        telefono.setText("");
        domicilio.setText("");
        especialidad.setText("");
        
        nombre.setEnabled(false);
        apellidos.setEnabled(false);
        sexo.setEnabled(false);
        edad.setEnabled(false);
        fecha_ing.setEnabled(false);
        telefono.setEnabled(false);
        domicilio.setEnabled(false);
        especialidad.setEnabled(false);

        Bguardar.setEnabled(false);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);}
        else {JOptionPane.showMessageDialog(null,"Datos Incompletos, revisar sus datos","Datos incompletos",ERROR_MESSAGE);}}
        else if (seleccion==JOptionPane.NO_OPTION){
        
        }

        

    }//GEN-LAST:event_BeditActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed

        
        int seleccion = JOptionPane.showConfirmDialog(this,"¿Desea eliminar este registro?","Pregunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (seleccion==JOptionPane.YES_OPTION){
        c_tecnicos ct= new c_tecnicos();
        ct.EliminarTecnicos(id_tecnico);
        ct.MostrarTecnicos(tb_tecnicos);
        
        id_tecnico.setText("");
        nombre.setText("");
        apellidos.setText("");
        sexo.setSelectedItem("M");
        edad.setText("");
        fecha_ing.setText("");
        telefono.setText("");
        domicilio.setText("");
        especialidad.setText("");
        
        nombre.setEnabled(false);
        apellidos.setEnabled(false);
        sexo.setEnabled(false);
        edad.setEnabled(false);
        fecha_ing.setEnabled(false);
        telefono.setEnabled(false);
        domicilio.setEnabled(false);
        especialidad.setEnabled(false);

        Bguardar.setEnabled(false);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);}
        else if(seleccion==JOptionPane.NO_OPTION){
                    }
    }//GEN-LAST:event_BdeleteActionPerformed

    private void tb_tecnicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tecnicosMouseClicked
        Bguardar.setEnabled(false);
        Bedit.setEnabled(true);
        Bdelete.setEnabled(true);
        
        nombre.setEnabled(true);
        apellidos.setEnabled(true);
        sexo.setEnabled(true);
        edad.setEnabled(true);
        fecha_ing.setEnabled(true);
        telefono.setEnabled(true);
        domicilio.setEnabled(true);
        especialidad.setEnabled(true);
        
        c_tecnicos ct= new c_tecnicos();
        ct.SeleccionarTecnicos(tb_tecnicos,id_tecnico,nombre, apellidos, sexo, edad, telefono, domicilio, especialidad, fecha_ing);
    }//GEN-LAST:event_tb_tecnicosMouseClicked

    private void BnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevoActionPerformed
        id_tecnico.setText("");
        nombre.setText("");
        apellidos.setText("");
        sexo.setSelectedItem("M");
        edad.setText("");
        fecha_ing.setText("");
        telefono.setText("");
        domicilio.setText("");
        especialidad.setText("");




        nombre.setEnabled(true);
        apellidos.setEnabled(true);
        sexo.setEnabled(true);
        edad.setEnabled(true);
        fecha_ing.setEnabled(true);
        telefono.setEnabled(true);
        domicilio.setEnabled(true);
        especialidad.setEnabled(true);

        
        
        
    
        Bguardar.setEnabled(true);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);       
    }//GEN-LAST:event_BnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Bnuevo;
    private javax.swing.JButton Bregresar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField domicilio;
    private javax.swing.JFormattedTextField edad;
    private javax.swing.JTextField especialidad;
    private javax.swing.JFormattedTextField fecha_ing;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icono;
    private javax.swing.JTextField id_tecnico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JTable tb_tecnicos;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
