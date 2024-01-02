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
import javax.swing.JFormattedTextField;

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
public class c_tecnicos {
    int id_tecnico;
    String nombre;
    String apellidos;
    String sexo;
    int edad;
    String telefono;
    String domicilio;
    String especialidad;
    String fecha_inicio;
    

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    
    public void InsertarTecnico (JTextField paramNombre, JTextField paramApellidos, JComboBox paramSexo, JTextField paramEdad, JTextField paramTelefono, JTextField paramDomicilio, JTextField paramEspecialidad, JTextField paramFecha_inicio){
        
        /*Aquí se incorporan los datos*/
        setNombre(paramNombre.getText());
        setApellidos(paramApellidos.getText());
        setSexo((String) paramSexo.getSelectedItem());
        
        setEdad(Integer.parseInt(paramEdad.getText()));
        setTelefono(paramTelefono.getText());
        setDomicilio(paramDomicilio.getText());
        setEspecialidad(paramEspecialidad.getText());
        setFecha_inicio(paramFecha_inicio.getText());
        
        
        
       ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos.
        
        String consulta = "insert into tecnicos (nombre,apellidos,sexo,edad,telefono,domicilio,especialidad,fecha_inicio) values (?,?,?,?,?,?,?,?);";
        
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            
            /*Aquí se obtienen los datos*/
            cs.setString(1, getNombre());
            cs.setString(2, getApellidos());
            cs.setString(3, getSexo());
            cs.setInt(4, getEdad());
            cs.setString(5, getTelefono());
            cs.setString(6, getDomicilio());
            cs.setString(7, getEspecialidad());
            cs.setString(8, getFecha_inicio());
            
            
            cs.execute();//Con esto se ejecuta la consulta "INSERT"
            
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se insertó correctamente el tecnico, error:"+e.toString());

        }
    }
    
    public void MostrarTecnicos(JTable paramTablaTotalTecnicos){
        
        ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 
        
        DefaultTableModel modelo = new DefaultTableModel();
        //Esto es solo decorativo, ordena la tabla de la interfaz al darle clic
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaTotalTecnicos.setRowSorter(OrdenarTabla);
        
        String sql = "";
        //Debajo se empieza a crear el modelo de lo que se va a mostrar en la tabla de la interfaz
        modelo.addColumn("Id tecnico");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("Edad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Fecha de inicio");
        
        paramTablaTotalTecnicos.setModel(modelo);
        sql = "select * from tecnicos;"; //Aquí se aplica un select hacia la base de datos para mostrar los datos de la tabla seleccionada
        
        String [] datos = new String [9];
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
                
                modelo.addRow(datos); //incorpora las filas de la base de datos a la tabla de la interfaz
                
            }
            
            paramTablaTotalTecnicos.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ e.toString());
        }
    }
    
    public void SeleccionarTecnicos (JTable paramTablaTotalTecnicos, JTextField paramId_tecnico, JTextField paramNombre, JTextField paramApellidos, JComboBox paramSexo, JTextField paramEdad, JTextField paramTelefono, JTextField paramDomicilio, JTextField paramEspecialidad, JTextField paramFecha_inicio){
        
        try {
            
            int fila = paramTablaTotalTecnicos.getSelectedRow(); //Cada que se seleccione la tabla va arrastrar el row dependiendo cual se seleccione
            
            if (fila >=0){
                
                //Nota: Lo siguiente le indica a la maquina que al seleccionar el row se tomen los datos de las columnas y los coloque en los jtextfield
                paramId_tecnico.setText(paramTablaTotalTecnicos.getValueAt(fila, 0).toString());
                paramNombre.setText(paramTablaTotalTecnicos.getValueAt(fila, 1).toString());
                paramApellidos.setText(paramTablaTotalTecnicos.getValueAt(fila, 2).toString());
                paramSexo.setSelectedItem(paramTablaTotalTecnicos.getValueAt(fila, 3).toString());
                paramEdad.setText(paramTablaTotalTecnicos.getValueAt(fila, 4).toString());
                paramTelefono.setText(paramTablaTotalTecnicos.getValueAt(fila, 5).toString());
                paramDomicilio.setText(paramTablaTotalTecnicos.getValueAt(fila, 6).toString());
                paramEspecialidad.setText(paramTablaTotalTecnicos.getValueAt(fila, 7).toString());
                paramFecha_inicio.setText(paramTablaTotalTecnicos.getValueAt(fila, 8).toString());
                
                //para sexo el tipo de sets es diferente, en lugar de ser set.text, son set.seleceteditem porque son cajas de seleccion y no jtextfields.
            }
            else {
                
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de seleccion, error: "+e.toString());
        }
    }    
    
    public void ModificarTecnicos(JTextField paramId_tecnico, JTextField paramNombre, JTextField paramApellidos, JComboBox paramSexo, JTextField paramEdad, JTextField paramTelefono, JTextField paramDomicilio, JTextField paramEspecialidad, JFormattedTextField paramFecha_inicio){
        
        setId_tecnico(Integer.parseInt(paramId_tecnico.getText()));
        setNombre(paramNombre.getText());
        setApellidos(paramApellidos.getText());
        setSexo((String) paramSexo.getSelectedItem());
        setEdad(Integer.parseInt(paramEdad.getText()));
        setTelefono(paramTelefono.getText());
        setDomicilio(paramDomicilio.getText());
        setEspecialidad(paramEspecialidad.getText());
        setFecha_inicio(paramFecha_inicio.getText());
        
       ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase conexion, la cual da acceso a la base de datos

        String consulta = "update tecnicos set nombre = ?, apellidos = ?, sexo = ?, edad = ?, telefono = ?, domicilio = ?, especialidad = ?, fecha_inicio = ? where id_tecnico = ?;";
        //realiza la consulta en la base de datos
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            
            
            cs.setString(1,getNombre());
            cs.setString(2,getApellidos());
            cs.setString(3,getSexo());
            cs.setInt(4,getEdad());
            cs.setString(5,getTelefono());
            cs.setString(6, getDomicilio());
            cs.setString(7, getEspecialidad());
            cs.setString(8, getFecha_inicio());
            cs.setInt(9,getId_tecnico());
            
            
            
            
            cs.execute();
            
          
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo modificarse, error: "+e.toString());
            
            
        }
        
    }
    //Metodo modificar, utiliza un id para cambiar todos los registros dentro de una fila (identificada por el id_operador)
        
    public void EliminarTecnicos(JTextField paramId_tecnico){
            setId_tecnico(Integer.parseInt(paramId_tecnico.getText()));
            
            ConexMysql con = new ConexMysql();
        Connection cn = con.establecerConexion();//Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 
            
            String consulta = "delete from tecnicos where id_tecnico = ?;";
            
            try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            cs.setInt(1,getId_tecnico()); //esta parte, toma todo el row y lo prepara para eliminar
            cs.execute();//Aquí ya se ejecuta la consulta y se elimina todo el row
            
         
            
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: "+e.toString());
            
        }
            
        
        
    }
    
    
}
