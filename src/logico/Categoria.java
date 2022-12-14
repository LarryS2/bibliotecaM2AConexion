package logico;

public class Categoria {
    
    private int id;
    private String codigo_cat;
    private String nombre_cat;
    private boolean Estado;

    public Categoria() {
    }

    public Categoria(String nombre_cat) {
        this.nombre_cat = nombre_cat;
    }

    public Categoria(int id, String nombre_cat) {
        this.id = id;
        this.nombre_cat = nombre_cat;
    }

    public Categoria(int id, String codigo_cat, String nombre_cat, boolean Estado) {
        this.id = id;
        this.codigo_cat = codigo_cat;
        this.nombre_cat = nombre_cat;
        this.Estado = Estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo_cat() {
        return codigo_cat;
    }

    public void setCodigo_cat(String codigo_cat) {
        this.codigo_cat = codigo_cat;
    }

    public String getNombre_cat() {
        return nombre_cat;
    }

    public void setNombre_cat(String nombre_cat) {
        this.nombre_cat = nombre_cat;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        //return  id + " " + nombre_cat;
        return nombre_cat;
    }
    
    public boolean Validar_Nombre_Cat(String nomcat)
    {
        return nomcat.matches("^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$");
    }
}
