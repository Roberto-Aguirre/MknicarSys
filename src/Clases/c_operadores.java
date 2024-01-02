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
public class c_operadores {

   

    int id_operador;
    String nombre;
    String apellidos;
    String sexo;
    int edad;
    String fecha_inicio;
    String licencia_vigente;
    
    public int getId_operador() {
        return id_operador;
    }

    public void setId_operador(int id_operador) {
        this.id_operador = id_operador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getLicencia_vigente() {
        return licencia_vigente;
    }

    public void setLicencia_vigente(String licencia_vigente) {
        this.licencia_vigente = licencia_vigente;
    }
    
    
    public void InsertarOperador (JTextField paramNombre, JTextField paramApellidos, JComboBox paramSexo, JTextField paramEdad, JTextField paramFecha_inicio, JComboBox paramLicencia_vigente){
        
        /*Aquí se incorporan los datos*/
        setNombre(paramNombre.getText());
        setApellidos(paramApellidos.getText());
        setSexo((String) paramSexo.getSelectedItem());
        
        setEdad(Integer.parseInt(paramEdad.getText()));        
        setFecha_inicio(paramFecha_inicio.getText());
        
        setLicencia_vigente((String) paramLicencia_vigente.getSelectedItem());
        
        ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion();
        
        //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        String consulta = "insert into operadores (nombre,apellidos,sexo,edad,fecha_inicio,licencia_vigente) values (?,?,?,?,?,?);";
        
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            
            /*Aquí se obtienen los datos*/
            cs.setString(1, getNombre());
            cs.setString(2, getApellidos());
            cs.setString(3, getSexo());
            cs.setInt(4, getEdad());
            cs.setString(5, getFecha_inicio());
            cs.setString(6, getLicencia_vigente());
            
            cs.execute();//
            
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se insertó correctamente el operador, error:"+e.toString());

        }
    }
    
    public void MostrarOperadores(JTable paramTablaTotalOperadores){
        
        ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        DefaultTableModel modelo = new DefaultTableModel();
        //Esto es solo decorativo, ordena la tabla de la interfaz al darle clic
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaTotalOperadores.setRowSorter(OrdenarTabla);
        
        String sql = "";
        //Debajo se empieza a crear el modelo de lo que se va a mostrar en la tabla de la interfaz
        modelo.addColumn("Id Operador");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("Edad");
        modelo.addColumn("Fecha inicio");
        modelo.addColumn("Licencia vigente");
        
        paramTablaTotalOperadores.setModel(modelo);
        sql = "select * from operadores;"; //Aquí se aplica un select hacia workbench para mostrar los datos de la tabla operadores
        
        String [] datos = new String [7];
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
                
                modelo.addRow(datos); //incorpora las filas de workbench a la tabla de la interfaz basicamente una importacion
                
            }
            
            paramTablaTotalOperadores.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ e.toString());
        }
    }

    public void SeleccionarOperadores (JTable paramTablaTotalOperadores, JTextField paramId_operador, JTextField paramNombre, JTextField paramApellidos, JComboBox paramSexo, JTextField paramEdad, JTextField paramFecha_inicio, JComboBox paramLicencia_vigente){
        
        try {
            
            int fila = paramTablaTotalOperadores.getSelectedRow(); //Cada que se seleccione la tabla va arrastrar el row dependiendo cual se seleccione
            
            if (fila >=0){
                
                //Nota: Lo siguiente le indica a la maquina que al seleccionar el row se tomen los datos de las columnas y los coloque en los jtextfield
                paramId_operador.setText(paramTablaTotalOperadores.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTablaTotalOperadores.getValueAt(fila, 1).toString());
                paramApellidos.setText(paramTablaTotalOperadores.getValueAt(fila, 2).toString());
                paramSexo.setSelectedItem(paramTablaTotalOperadores.getValueAt(fila, 3).toString());
                paramEdad.setText(paramTablaTotalOperadores.getValueAt(fila, 4).toString());
                paramFecha_inicio.setText(paramTablaTotalOperadores.getValueAt(fila, 5).toString());
                paramLicencia_vigente.setSelectedItem(paramTablaTotalOperadores.getValueAt(fila, 0).toString());
                
                //para sexo y licencia el tipo de sets es diferente, en lugar de ser set.text, son set.seleceteditem porque son cajas de seleccion y no jtextfields.
            }
            else {
                
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de seleccion, error: "+e.toString());
        }
    }
    
    public void ModificarOperadores(JTextField paramId_operador, JTextField paramNombre, JTextField paramApellidos, JComboBox paramSexo, JTextField paramEdad, JTextField paramFecha_inicio, JComboBox paramLicencia_vigente){
        
        setId_operador(Integer.parseInt(paramId_operador.getText()));
        setNombre(paramNombre.getText());
        setApellidos(paramApellidos.getText());
        setSexo((String) paramSexo.getSelectedItem());
        setEdad(Integer.parseInt(paramEdad.getText()));
        setFecha_inicio(paramFecha_inicio.getText());
        setLicencia_vigente((String)paramLicencia_vigente.getSelectedItem());
        
        ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.

        String consulta = "update operadores set nombre = ?, apellidos = ?, sexo = ?, edad = ?, fecha_inicio = ?, licencia_vigente = ? where id_operador = ?;";
        //realiza la consulta en el query de workbench
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            
            
            cs.setString(1,getNombre());
            cs.setString(2,getApellidos());
            cs.setString(3,getSexo());
           cs.setInt(4,getEdad());
            cs.setString(5,getFecha_inicio());
            cs.setString(6,getLicencia_vigente());
            cs.setInt(7,getId_operador());
            
            
            cs.execute();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo modificarse, error: "+e.toString());
            
            
        }
        
    }
    //Metodo modificar, utiliza un id para cambiar todos los registros dentro de una fila (identificada por el id_operador)
    
    public void EliminarOperadores(JTextField paramId_operador){
            setId_operador(Integer.parseInt(paramId_operador.getText()));
            
           ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion();//Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
            
            String consulta = "delete from operadores where id_operador = ?;";
            
            try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            cs.setInt(1,getId_operador()); //esta parte, toma todo el row y lo prepara para eliminar
            cs.execute();//Aquí ya se elimina todo el row
            
            
            
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: "+e.toString());
            
        }
            
        
        
    }
    
}
