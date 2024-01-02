/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import conexion.ConexMysql;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author 1000a
 */
public class c_auxilio_vial {
    int folio;
    String fecha_reg;
    int id_tecnico;
    int id_unidad;
    String incidente;
    String estatus;
    String grua;
    String calle;
    String colonia;
    String municipio;
    String estado;
    
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(String fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getGrua() {
        return grua;
    }

    public void setGrua(String grua) {
        this.grua = grua;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void InsertarAuxilio(JTextField paramFecha_reg,JTextField paramId_tecnico, JTextField paramId_unidad, JComboBox paramIncidente, JComboBox paramEstatus, JComboBox paramGrua, JTextField paramCalle, JTextField paramColonia, JComboBox paramMunicipio, JComboBox paramEstado ){
        /*Aquí se incorporan los datos*/
        setFecha_reg(paramFecha_reg.getText());
        setId_tecnico(Integer.parseInt(paramId_tecnico.getText()));
        setId_unidad(Integer.parseInt(paramId_unidad.getText()));
        setIncidente((String) paramIncidente.getSelectedItem());
        setEstatus((String) paramEstatus.getSelectedItem());
        setGrua((String) paramGrua.getSelectedItem());
        setCalle(paramCalle.getText());
        setColonia(paramColonia.getText());
        setMunicipio((String) paramMunicipio.getSelectedItem());
        setEstado((String) paramEstado.getSelectedItem());
        
        
        
        
        ConexMysql con=new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        String consulta = "insert into auxilio_vial (fecha_reg,id_tecnico,id_unidad,incidente,estatus,grua,calle,colonia,municipio,estado) values (?,?,?,?,?,?,?,?,?,?);";
        
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            
            /*Aquí se obtienen los datos*/
            cs.setString(1, getFecha_reg());
            cs.setInt(2, getId_tecnico());
            cs.setInt(3, getId_unidad());
            cs.setString(4, getIncidente());
            cs.setString(5, getEstatus());
            cs.setString(6, getGrua());
            cs.setString(7, getCalle());
            cs.setString(8, getColonia());
            cs.setString(9, getMunicipio());
            cs.setString(10, getEstado());
            
            cs.execute();//
            
            
         
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se guardó correctamente el auxilio vial, error:"+e.toString());

        }
    }
    
    public void MostrarAuxilio(JTable paramTablaAuxilioVial){
        
        ConexMysql con=new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        DefaultTableModel modelo = new DefaultTableModel();
        //Esto es solo decorativo, ordena la tabla de la interfaz al darle clic
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaAuxilioVial.setRowSorter(OrdenarTabla);
        
        String sql = "";
        //Debajo se empieza a crear el modelo de lo que se va a mostrar en la tabla de la interfaz
        modelo.addColumn("Folio");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tecnico");
        modelo.addColumn("Unidad");
        modelo.addColumn("Incidente");
        modelo.addColumn("Estatus");
        modelo.addColumn("Grua");
        modelo.addColumn("Calle");
        modelo.addColumn("Colonia");
        modelo.addColumn("Municipio");
        modelo.addColumn("Estado");
        
        paramTablaAuxilioVial.setModel(modelo);
        sql = "select * from auxilio_vial;"; //Aquí se aplica un select hacia la base de datos para mostrar los datos de la tabla seleccionada
        
        String [] datos = new String [11];
        Statement st;
        
        try {
            
            st = con.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                datos[6]= rs.getString(7);
                datos[7]= rs.getString(8);
                datos[8]= rs.getString(9);
                datos[9]= rs.getString(10);
                datos[10]= rs.getString(11);
                
                modelo.addRow(datos); //incorpora las filas de la base de datos a la tabla de la interfaz
                
            }
            
            paramTablaAuxilioVial.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ e.toString());
        }
    }
    
    public void SeleccionarAuxilio (JTable paramTablaAuxilioVial, JTextField paramFolio, JTextField paramFecha_reg,JTextField paramId_tecnico, JTextField paramId_unidad, JComboBox paramIncidente, JComboBox paramEstatus, JComboBox paramGrua, JTextField paramCalle, JTextField paramColonia, JComboBox paramMunicipio, JComboBox paramEstado ){
        
        try {
            
            int fila = paramTablaAuxilioVial.getSelectedRow(); //Cada que se seleccione la tabla va arrastrar el row dependiendo cual se seleccione
            
            if (fila >=0){
                
                //Nota: Lo siguiente le indica a la maquina que al seleccionar el row se tomen los datos de las columnas y los coloque en los jtextfield
                paramFolio.setText(paramTablaAuxilioVial.getValueAt(fila, 0).toString());
                paramFecha_reg.setText(paramTablaAuxilioVial.getValueAt(fila, 1).toString());
                paramId_tecnico.setText(paramTablaAuxilioVial.getValueAt(fila, 2).toString());
                paramId_unidad.setText(paramTablaAuxilioVial.getValueAt(fila, 3).toString());
                paramIncidente.setSelectedItem(paramTablaAuxilioVial.getValueAt(fila, 4).toString());
                paramEstatus.setSelectedItem(paramTablaAuxilioVial.getValueAt(fila, 5).toString());
                paramGrua.setSelectedItem(paramTablaAuxilioVial.getValueAt(fila, 6).toString());
                paramCalle.setText(paramTablaAuxilioVial.getValueAt(fila, 7).toString());
                paramColonia.setText(paramTablaAuxilioVial.getValueAt(fila, 8).toString());
                paramMunicipio.setSelectedItem(paramTablaAuxilioVial.getValueAt(fila, 9).toString());
                paramEstado.setSelectedItem(paramTablaAuxilioVial.getValueAt(fila, 10).toString());
            }
            else {
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de seleccion, error: "+e.toString());
        }
    }
    
    public void ModificarAuxilio(JTextField param1, JTextField param2, JTextField param3, JTextField param4, JComboBox param5, JComboBox param6, JComboBox param7, JTextField param8, JTextField param9, JComboBox param10, JComboBox param11){
        
        setFolio(Integer.parseInt(param1.getText()));
        setFecha_reg(param2.getText());
        setId_tecnico(Integer.parseInt(param3.getText()));
        setId_unidad(Integer.parseInt(param4.getText()));
        setIncidente((String) param5.getSelectedItem());
        setEstatus((String) param6.getSelectedItem());
        setGrua((String) param7.getSelectedItem());
        setCalle(param8.getText());
        setColonia(param9.getText());
        setMunicipio((String) param10.getSelectedItem());
        setEstado((String) param11.getSelectedItem());
        
        
        ConexMysql con=new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 

        String consulta = "update auxilio_vial set fecha_reg = ?, id_tecnico = ?, id_unidad = ?, incidente = ?, estatus = ?, grua = ?, calle = ?, colonia = ?, municipio = ?, estado = ? where folio = ?;";
        //realiza la consulta con ese query
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            
            
            cs.setString(1,getFecha_reg());
            cs.setInt(2,getId_tecnico());
            cs.setInt(3,getId_unidad());
            cs.setString(4,getIncidente());
            cs.setString(5,getEstatus());
            cs.setString(6,getGrua());
            cs.setString(7,getCalle());
            cs.setString(8,getColonia());
            cs.setString(9,getMunicipio());
            cs.setString(10,getEstado());
            cs.setInt(11,getFolio());
            
            cs.execute();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo modificarse, error: "+e.toString());
            
            
        }
        
    }
    
    public void EliminarAuxilio(JTextField param1){
            setFolio(Integer.parseInt(param1.getText()));
            
            ConexMysql con=new ConexMysql();
            Connection cn = con.establecerConexion();//Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 
            
            String consulta = "delete from auxilio_vial where folio = ?;";
            
            try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            cs.setInt(1,getFolio()); //esta parte, toma todo el row y lo prepara para eliminar
            cs.execute();//Aquí ya se elimina todo el row
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: "+e.toString());
            
        }
            
        
        
    }
    

    
    
}




