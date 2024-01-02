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
public class c_inventario {
    
    int sku;
    int existencias;
    String modelo_pieza;
    String Descripcion;

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getModelo_pieza() {
        return modelo_pieza;
    }

    public void setModelo_pieza(String modelo_pieza) {
        this.modelo_pieza = modelo_pieza;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public void InsertarInventario ( JTextField paramExistencias, JTextField paramModelo_pieza, JTextField paramDescripcion){
        
        /*Aquí se incorporan los datos*/
         //setSku(Integer.parseInt(paramSku.getText()));
         setExistencias(Integer.parseInt(paramExistencias.getText()));
         setModelo_pieza(paramModelo_pieza.getText());
         setDescripcion(paramDescripcion.getText());
        
        
       
        
        
        
         ConexMysql con=new ConexMysql();
     Connection cn = con.establecerConexion(); //Esto le da conexion con la clase conexion, la cual da acceso a la base de datos.
        
        String consulta = "insert into inventario (existencias,modelo_pieza,descripcion) values (?,?,?);";
        
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            
            /*Aquí se obtienen los datos*/
            //cs.setInt(1, getSku());
            cs.setInt(1, getExistencias());
            cs.setString(2, getModelo_pieza());
            cs.setString(3, getDescripcion());
            
            
            
            cs.execute();//Con esto se ejecuta la consulta "INSERT"
            
            
            JOptionPane.showMessageDialog(null,"Se insertó correctamente la pieza");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se insertó correctamente la pieza, error:"+e.toString());

        }
    }
    
    public void MostrarInventario(JTable paramTablaInventario){
        
         ConexMysql con=new ConexMysql();
    Connection cn = con.establecerConexion(); //Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 
        
        DefaultTableModel modelo = new DefaultTableModel();
        //Esto es solo decorativo, ordena la tabla de la interfaz al darle clic
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaInventario.setRowSorter(OrdenarTabla);
        
        String sql = "";
        //Debajo se empieza a crear el modelo de lo que se va a mostrar en la tabla de la interfaz
        modelo.addColumn("Sku");
        modelo.addColumn("Existencias");
        modelo.addColumn("Modelo");
        modelo.addColumn("Descripcion");
        
        
        paramTablaInventario.setModel(modelo);
        sql = "select * from inventario;"; //Aquí se aplica un select hacia la base de datos para mostrar los datos de la tabla seleccionada
        
        String [] datos = new String [4];
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
            
            paramTablaInventario.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ e.toString());
        }
    }
    
    public void SeleccionarInventario (JTable paramTablaInventario,JTextField paramSku, JTextField paramExistencias, JTextField paramModelo_pieza, JTextField paramDescripcion){
        
        try {
            
            int fila = paramTablaInventario.getSelectedRow(); //Cada que se seleccione la tabla va arrastrar el row dependiendo cual se seleccione
            
            if (fila >=0){
                
                //Nota: Lo siguiente le indica a la maquina que al seleccionar el row se tomen los datos de las columnas y los coloque en los jtextfield
                paramSku.setText(paramTablaInventario.getValueAt(fila, 0).toString());
                paramExistencias.setText(paramTablaInventario.getValueAt(fila, 1).toString());
                paramModelo_pieza.setText(paramTablaInventario.getValueAt(fila, 2).toString());
                paramDescripcion.setText(paramTablaInventario.getValueAt(fila, 3).toString());
                
            }
            else {
                
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de seleccion, error: "+e.toString());
        }
    }    
    
    public void ModificarInventario(JTextField paramExistencias, JTextField paramModelo_pieza, JTextField paramDescripcion,JTextField paramSku){
        
        setSku(Integer.parseInt(paramSku.getText()));
        setExistencias(Integer.parseInt(paramExistencias.getText()));
        setModelo_pieza(paramModelo_pieza.getText());
        setDescripcion(paramDescripcion.getText());
        
        
         ConexMysql con=new ConexMysql();
    Connection cn = con.establecerConexion();//Esto le da conexion con la clase conexion, la cual da acceso a la base de datos

        String consulta = "update inventario set existencias = ?, modelo_pieza = ?, descripcion = ? where sku = ? ;";
        //realiza la consulta en la base de datos
        try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            
            
            
            cs.setInt(1,getExistencias());
            cs.setString(2,getModelo_pieza());
            cs.setString(3,getDescripcion());
            cs.setInt(4,getSku());
            
            
            
            
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "modificacion exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No pudo modificarse, error: "+e.toString());
            
            
        }
        
    }
    //Metodo modificar, utiliza un id para cambiar todos los registros dentro de una fila (identificada por el id)
        
    public void EliminarInventario(JTextField paramSku){
            setSku(Integer.parseInt(paramSku.getText()));
            
             ConexMysql con=new ConexMysql();
    Connection cn = con.establecerConexion();//Esto le da conexion con la clase conexion, la cual da acceso a la base de datos 
            
            String consulta = "delete from inventario where sku = ?;";
            
            try {
            
            CallableStatement cs = con.establecerConexion().prepareCall(consulta); //enlaza la conexion con la consulta de arriba
            cs.setInt(1,getSku()); //esta parte, toma todo el row y lo prepara para eliminar
            cs.execute();//Aquí ya se ejecuta la consulta y se elimina todo el row
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: "+e.toString());
            
        }
            
        
        
    }
    
    
}
