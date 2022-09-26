package Modelo;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import gui.Ventana_Libro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import logico.Conexion;
import logico.Libro;

public class ModeloLibro {
    
    public boolean RegistrarLibro(Libro lib){
        
        PreparedStatement ps;
        Connection con = Conexion.getConnection();
        
        String sql = "INSERT INTO libro (CODIGO_LIB, TITULO, DESCRIPCION, ISBN, DEWEY, FECHA_PUBLICACION,"
                + "NUM_PAGS, ID_AUTOR, ID_IDIOMA, ID_CATEGORIA, ID_EDITORIAL, ESTADO) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, lib.getCodigo());
            ps.setString(2, lib.getTitulo());
            ps.setString(3, lib.getDescripcion());
            ps.setString(4, lib.getIsbn());
            ps.setInt(5, lib.getDewey());
            ps.setDate(6, (Date) lib.getFecha_Publicacion());
            ps.setInt(7, lib.getNumero_pags());
            ps.setInt(8, lib.getId_autor());
            ps.setInt(9, lib.getId_idioma());
            ps.setInt(10, lib.getId_categoria());
            ps.setInt(11, lib.getId_editorial());
            ps.setBoolean(12, lib.isEstado());
            ps.execute();
            return true;
        } catch (SQLException sqle) {
            System.err.println(sqle);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.err.println(sqle);
            }
        }
    }
     
    
    public boolean ModificarLibro(Libro lib){
        
        PreparedStatement ps;
        Connection con = Conexion.getConnection();
        
        String sql = "UPDATE libro SET CODIGO=?, TITULO=?, DESCRIPCION=?, ISBN=?, DEWEY=?,"
                + " FECHA_PUBLICACION=?, NUM_PAGS=?, ID_AUTOR=?, ID_IDIOMA=?, ID_CATEGORIA=?, "
                + "ID_EDITORIAL=? WHERE ID=?";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, lib.getCodigo());
            ps.setString(2, lib.getTitulo());
            ps.setString(3, lib.getDescripcion());
            ps.setString(4, lib.getIsbn());
            ps.setInt(5, lib.getDewey());
            ps.setDate(6, (Date) lib.getFecha_Publicacion());
            ps.setInt(7, lib.getNumero_pags());
            ps.setInt(8, lib.getId_autor());
            ps.setInt(9, lib.getId_idioma());
            ps.setInt(10, lib.getId_categoria());
            ps.setInt(11, lib.getId_editorial());
            ps.setInt(12, lib.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException sqle) {
            System.err.println(sqle);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.err.println(sqle);
            }
        }
    }
    
    static DefaultTableModel modelo;
    public static void getTabla(){
        Connection con = Conexion.getConnection();
        PreparedStatement st;
        ResultSet rs;
        String sql = "SELECT * FROM libro";
        modelo = new DefaultTableModel();
        Ventana_Libro.tablalibros.setModel(modelo);
        
        try{
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int columns = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("CODIGO");
            modelo.addColumn("TÍTULO");
            modelo.addColumn("DESCRIPCIÓN");
            modelo.addColumn("ISBN");
            modelo.addColumn("DEWEY");
            modelo.addColumn("FECHA PUBLICACIÓN");
            modelo.addColumn("Nº PÁGINAS");
            modelo.addColumn("AUTOR");
            modelo.addColumn("IDIOMA");
            modelo.addColumn("CATEGORÍA");
            modelo.addColumn("EDITORIAL");
            
            while(rs.next()){
                Object[] filas = new Object[columns];
                for(int i = 0; i < columns; i++){
                    filas[i] = rs.getObject(i+1);
                }   
                modelo.addRow(filas);
            }    
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }

    public static void getTablaDinamica(String bus){
        Connection con = Conexion.getConnection();
        PreparedStatement st;
        ResultSet rs;
//        String sql = "SELECT CODIGO, TITULO, DESCRIPCION, ISBN, DEWEY, "
//                + "FECHA_PUBLICACION, NUM_PAGS, ID_AUTOR, "
//                + "ID_IDIOMA, ID_CATEGORIA, ID_EDITORIAL"
//                + " FROM libro WHERE TITULO OR DESCRIPCION LIKE '%"+bus+"%'";
        String sql = "SELECT * FROM LIBRO WHERE TITULO OR DESCRIPCION LIKE '%"+bus+"%'";
        modelo = new DefaultTableModel();
        Ventana_Libro.tablalibros.setModel(modelo);
        
        try{
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int columns = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("CÓDIGO");
            modelo.addColumn("TÍTULO");
            modelo.addColumn("DESCRIPCIÓN");
            modelo.addColumn("ISBN");
            modelo.addColumn("DEWEY");
            modelo.addColumn("FECHA PUBLICACIÓN");
            modelo.addColumn("Nº PÁGINAS");
            modelo.addColumn("AUTOR");
            modelo.addColumn("IDIOMA");
            modelo.addColumn("CATEGORÍA");
            modelo.addColumn("EDITORIAL");
            
            while(rs.next()){
                Object[] filas = new Object[columns];
                for(int i = 0; i < columns; i++){
                    filas[i] = rs.getObject(i+1);
                }   
                modelo.addRow(filas);
            }    
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    } 
    


    public static void Limpiar_Tabla(){
        for (int i = 0; i < Ventana_Libro.tablalibros.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    } 
    
    
}
