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
public class c_actividades {
    int id_actividad;
    int id_tecnico;
    int id_operador;
    int id_unidad;
    String estatus;
    String fecha_inicio;
    String fecha_fin;
    String descripcion;
    int sku;
    int uso_existencias;

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getUso_existencias() {
        return uso_existencias;
    }

    public void setUso_existencias(int uso_existencias) {
        this.uso_existencias = uso_existencias;
    }
    

    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public int getId_operador() {
        return id_operador;
    }

    public void setId_operador(int id_operador) {
        this.id_operador = id_operador;
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void InsertarActividad (JTextField paramId_actividad, JTextField paramFecha_inicio, JTextField paramFecha_fin, JTextField paramId_tecnico, JTextField paramId_unidad, JTextField paramId_operador, JComboBox paramEstatus, JTextField paramDescripcion, JTextField paramSku, JTextField paramUso_existencias){
        
        /*Aquí se incorporan los datos*/
        setFecha_inicio(paramFecha_inicio.getText());
        setFecha_fin(paramFecha_fin.getText());
        setEstatus((String) paramEstatus.getSelectedItem());
        
        setId_tecnico(Integer.parseInt(paramId_tecnico.getText()));
        setId_unidad(Integer.parseInt(paramId_unidad.getText())); 
        setId_operador(Integer.parseInt(paramId_operador.getText()));
        setDescripcion(paramDescripcion.getText());
        setSku(Integer.parseInt(paramSku.getText()));
        setUso_existencias(Integer.parseInt(paramUso_existencias.getText()));
        
        
        
        
        ConexMysql con=new ConexMysql();
    Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        String consulta = "insert into actividades (fecha_inicio,fecha_fin,id_tecnico,id_unidad,id_operador,estatus, descripcion, sku, uso_existencias) values (?,?,?,?,?,?,?,?,?);";
        
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            
            /*Aquí se obtienen los datos*/
            cs.setString(1, getFecha_inicio());
            cs.setString(2, getFecha_fin());
            cs.setInt(3, getId_tecnico());
            cs.setInt(4, getId_unidad());
            cs.setInt(5, getId_operador());
            cs.setString(6, getEstatus());
            cs.setString(7, getDescripcion());
            cs.setInt(8, getSku());
            cs.setInt(9, getUso_existencias());
            
            cs.execute();//
            
            
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se guardó correctamente el operador, error:"+e.toString());

        }
    }
    
    public void MostrarActividades(JTable paramTablaTotalActividades){
        
        ConexMysql con=new ConexMysql();
    Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        DefaultTableModel modelo = new DefaultTableModel();
        //Esto es solo decorativo, ordena la tabla de la interfaz al darle clic
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaTotalActividades.setRowSorter(OrdenarTabla);
        
        String sql = "";
        //Debajo se empieza a crear el modelo de lo que se va a mostrar en la tabla de la interfaz
        modelo.addColumn("Actividad");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        modelo.addColumn("Tecnico");
        modelo.addColumn("Unidad");
        modelo.addColumn("Operador");
        modelo.addColumn("Estatus");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Sku");
        modelo.addColumn("Uso de existencias");
        
        paramTablaTotalActividades.setModel(modelo);
        sql = "select * from actividades;"; //Aquí se aplica un select hacia la base de datos para mostrar los datos de la tabla seleccionada
        
        String [] datos = new String [10];
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
                
                modelo.addRow(datos); //incorpora las filas de la base de datos a la tabla de la interfaz
                
            }
            
            paramTablaTotalActividades.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ e.toString());
        }
    }
    
    public void SeleccionarActividades (JTable paramTablaTotalActividades, JTextField paramId_actividad, JTextField paramFecha_inicio, JTextField paramFecha_fin, JTextField paramId_tecnico, JTextField paramId_unidad, JTextField paramId_operador, JComboBox paramEstatus, JTextField paramDescripcion, JTextField paramSku, JTextField paramUso_existencias){
        
        try {
            
            int fila = paramTablaTotalActividades.getSelectedRow(); //Cada que se seleccione la tabla va arrastrar el row dependiendo cual se seleccione
            
            if (fila >=0){
                
                //Nota: Lo siguiente le indica a la maquina que al seleccionar el row se tomen los datos de las columnas y los coloque en los jtextfield
                paramId_actividad.setText(paramTablaTotalActividades.getValueAt(fila, 0).toString());
                paramFecha_inicio.setText(paramTablaTotalActividades.getValueAt(fila, 1).toString());
                paramFecha_fin.setText(paramTablaTotalActividades.getValueAt(fila, 2).toString());
                paramId_tecnico.setText(paramTablaTotalActividades.getValueAt(fila, 3).toString());
                paramId_unidad.setText(paramTablaTotalActividades.getValueAt(fila, 4).toString());
                paramId_operador.setText(paramTablaTotalActividades.getValueAt(fila, 5).toString());
                paramEstatus.setSelectedItem(paramTablaTotalActividades.getValueAt(fila, 6).toString());
                paramDescripcion.setText(paramTablaTotalActividades.getValueAt(fila, 7).toString());
                paramSku.setText(paramTablaTotalActividades.getValueAt(fila, 8).toString());
                paramUso_existencias.setText(paramTablaTotalActividades.getValueAt(fila, 9).toString());
            }
            else {
                
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de seleccion, error: "+e.toString());
        }
    }
    
    public void ModificarActividades(JTextField paramId_actividad, JTextField paramFecha_inicio, JTextField paramFecha_fin, JTextField paramId_tecnico, JTextField paramId_unidad, JTextField paramId_operador, JComboBox paramEstatus, JTextField paramDescripcion, JTextField paramSku, JTextField paramUso_existencias){
        
        setId_actividad(Integer.parseInt(paramId_actividad.getText()));
        setFecha_inicio(paramFecha_inicio.getText());
        setFecha_fin(paramFecha_fin.getText());
        setId_tecnico(Integer.parseInt(paramId_tecnico.getText()));
        setId_unidad(Integer.parseInt(paramId_unidad.getText()));
        setId_operador(Integer.parseInt(paramId_operador.getText()));
        setEstatus((String) paramEstatus.getSelectedItem());
        setDescripcion(paramDescripcion.getText());
        setSku(Integer.parseInt(paramSku.getText()));
        setUso_existencias(Integer.parseInt(paramUso_existencias.getText()));
        
        
        ConexMysql con=new ConexMysql();
    Connection cn = con.establecerConexion(); //Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 

        String consulta = "update actividades set fecha_inicio = ?, fecha_fin = ?, id_tecnico = ?, id_unidad = ?, id_operador = ?, estatus = ?, descripcion = ?, sku = ?, uso_existencias = ? where id_actividad = ?;";
        //realiza la consulta con ese query
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            
            
            cs.setString(1,getFecha_inicio());
            cs.setString(2,getFecha_fin());
            cs.setInt(3,getId_tecnico());
            cs.setInt(4,getId_unidad());
            cs.setInt(5,getId_operador());
             cs.setString(6,getEstatus());
            cs.setString(7,getDescripcion());
            cs.setInt(8,getSku());
            cs.setInt(9,getUso_existencias());
            cs.setInt(10,getId_actividad());
            
            cs.execute();
            
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo modificarse, error: "+e.toString());
            
            
        }
        
    }
    
    public void EliminarActividades(JTextField paramId_actividad){
            setId_actividad(Integer.parseInt(paramId_actividad.getText()));
            
            ConexMysql con=new ConexMysql();
    Connection cn = con.establecerConexion();//Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 
            
            String consulta = "delete from actividades where id_actividad = ?;";
            
            try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            cs.setInt(1,getId_actividad()); //esta parte, toma todo el row y lo prepara para eliminar
            cs.execute();//Aquí ya se elimina todo el row
            
           
            
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: "+e.toString());
            
        }
            
        
        
    }
    
}
