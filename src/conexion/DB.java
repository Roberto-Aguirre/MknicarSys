package conexion;

public class DB {

    private String ip;
    private String puerto;
    private String baseDatos;
    private String usuario;
    private String contraseña;
    public String Driver = "com.mysql.jdbc.Driver";

    public DB(String ip, String puerto, String baseDatos, String usuario, String contraseña) {
        this.ip = ip;
        this.puerto = puerto;
        this.baseDatos = baseDatos;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String construirCadena() {
        return this.ip + ":" + this.puerto + "/" + this.baseDatos + "?autoReconnect=true&useSSL=false";
    }
}
