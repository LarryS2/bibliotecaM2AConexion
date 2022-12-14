package logico;

import java.util.Date;

public class Autor extends Persona {

    private int id_autor;
    private int lengua_materna;
    private int pais_origen;

    public Autor() {
    }

    public Autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public Autor(String cedula_aut) {
        super(cedula_aut);
    }
    
    public Autor(int idioma, int pais){
        this.lengua_materna = idioma;
        this.pais_origen = pais;
    }

    public Autor(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public Autor(int id_aut, int lengua_materna, int pais_origen, String cedula, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, Date fecha_nac, boolean Estado) {
        super(cedula, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nac, Estado);
        this.id_autor = id_aut;
        this.lengua_materna = lengua_materna;
        this.pais_origen = pais_origen;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public int getLengua_materna() {
        return lengua_materna;
    }

    public void setLengua_materna(int lengua_materna) {
        this.lengua_materna = lengua_materna;
    }

    public int getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(int pais_origen) {
        this.pais_origen = pais_origen;
    }

    public boolean ValidarNombresYapellidos(String nom) {
        return nom.matches("^[A-Za-z]{2,}");
    }
}