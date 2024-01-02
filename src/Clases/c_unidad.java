/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import conexion.ConexMysql;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 * @author Ivan Aguirre
 */
public class c_unidad {
   
    int Id_Unidad;
    int matricula ;
    String marca;
    String tipo;

    public int getId_Unidad() {
        return Id_Unidad;
    }

    public void setId_Unidad(int Id_Unidad) {
        this.Id_Unidad = Id_Unidad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
   
    public void InsertarUnidad(JTextField parammatricula, JComboBox paramMarca, JComboBox paramTipo){
        /*Aquí se incorporan los datos*/
       
        setMatricula(Integer.parseInt(parammatricula.getText()));
        setMarca((String) paramMarca.getSelectedItem());
        setTipo((String) paramTipo.getSelectedItem());
        
        
        ConexMysql con=new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        String consulta = "insert into unidad (matricula,nombre,tipo) values (?,?,?);";
        
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            
            /*Aquí se obtienen los datos*/
           
            cs.setInt(1, getMatricula());
            cs.setString(2, getMarca());
            cs.setString(3, getTipo());
           
            
            cs.execute();//
            
            
         
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se guardó correctamente el auxilio vial, error:"+e.toString());

        }
    }
    
    public void MostrarUnidades(JTable paramTablaAuxilioVial){
        
        ConexMysql con=new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase c_conexion, la cual da acceso a la base de datos en workbench.
        
        DefaultTableModel modelo = new DefaultTableModel();
        //Esto es solo decorativo, ordena la tabla de la interfaz al darle clic
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaAuxilioVial.setRowSorter(OrdenarTabla);
        
        String sql = "";
        //Debajo se empieza a crear el modelo de lo que se va a mostrar en la tabla de la interfaz
        modelo.addColumn("Id Undad");
        modelo.addColumn("Unidad");
        modelo.addColumn("Marca");
        modelo.addColumn("Tipo");
        
        paramTablaAuxilioVial.setModel(modelo);
        sql = "select * from unidad;"; //Aquí se aplica un select hacia la base de datos para mostrar los datos de la tabla seleccionada
        
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
                
                
                modelo.addRow(datos); //incorpora las filas de la base de datos a la tabla de la interfaz
                
            }
            
            paramTablaAuxilioVial.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ e.toString());
        }
    }
    
    public void SeleccionarUnidad (JTable paramTablaUnidad,JTextField paramUnidad, JTextField paramMatricula, JComboBox paramMarca, JComboBox paramTipo){
        
        try {
            
            int fila = paramTablaUnidad.getSelectedRow(); //Cada que se seleccione la tabla va arrastrar el row dependiendo cual se seleccione
            
            if (fila >=0){
                
                //Nota: Lo siguiente le indica a la maquina que al seleccionar el row se tomen los datos de las columnas y los coloque en los jtextfield
                paramUnidad.setText(paramTablaUnidad.getValueAt(fila, 0).toString());
                paramMatricula.setText(paramTablaUnidad.getValueAt(fila, 1).toString());
                paramMarca.setSelectedItem(paramTablaUnidad.getValueAt(fila, 2).toString());
                paramTipo.setSelectedItem(paramTablaUnidad.getValueAt(fila, 3).toString());
                
            }
            else {
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de seleccion, error: "+e.toString());
        }
    }
    
    public void ModificarUnidad(JTextField paramMatricula, JComboBox paramMarca, JComboBox paramTipo,JTextField paramId_Unidad){
        
        
        setMatricula(Integer.parseInt(paramMatricula.getText()));
        setMarca((String) paramMarca.getSelectedItem());
        setTipo((String) paramTipo.getSelectedItem());
        setId_Unidad(Integer.parseInt(paramId_Unidad.getText()));
        
        
        
        ConexMysql con=new ConexMysql();
        Connection cn = con.establecerConexion(); //Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 

     
        //realiza la consulta con ese query
        try {
            
             //enlaza la conexion con la consulta de arriba
            
            String sql = "update unidad set matricula = ?, nombre = ?, tipo = ? where id_unidad = ?;";
            CallableStatement cs = con.establecerConexion().prepareCall(sql);
            
            cs.setInt(1,getMatricula());
            cs.setString(2,getMarca());
            cs.setString(3,getTipo());
            cs.setInt(4,getId_Unidad());
            
            cs.execute();
            System.out.print(cs);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No pudo modificarse, error: "+e.toString());
            
            
        }
        
    }
    
    public void EliminarUnidad(JTextField paramId_Unidad){
            setId_Unidad(Integer.parseInt(paramId_Unidad.getText()));
            
            ConexMysql con=new ConexMysql();
            Connection cn = con.establecerConexion();//Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 
            
            String consulta = "delete from unidad where id_unidad = ?;";
            
            try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            cs.setInt(1,getId_Unidad()); //esta parte, toma todo el row y lo prepara para eliminar
            cs.execute();//Aquí ya se elimina todo el row
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: "+e.toString());
            
        }
            
        
        
    }
    

    
    
    
    
    
    
}
