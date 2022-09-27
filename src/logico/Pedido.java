package logico;

import java.sql.Date;

public class Pedido {
    private int id_pedido;
    private int id_est;
    private Date fecha_inicio_pedido;
    private Date fecha_fin_pedido;
    private boolean estado;

    public Pedido() {
    }
    
    
    public Pedido(int id_pedido, int id_est, Date fecha_inicio_pedido, Date fecha_fin_pedido) {
        this.id_pedido = id_pedido;
        this.id_est = id_est;
        this.fecha_inicio_pedido = fecha_inicio_pedido;
        this.fecha_fin_pedido = fecha_fin_pedido;
    }

    public Pedido(int id_est, Date fecha_inicio_pedido, Date fecha_fin_pedido) {
        this.id_est = id_est;
        this.fecha_inicio_pedido = fecha_inicio_pedido;
        this.fecha_fin_pedido = fecha_fin_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_est() {
        return id_est;
    }

    public void setId_est(int id_est) {
        this.id_est = id_est;
    }

    public Date getFecha_inicio_pedido() {
        return fecha_inicio_pedido;
    }

    public void setFecha_inicio_pedido(Date fecha_inicio_pedido) {
        this.fecha_inicio_pedido = fecha_inicio_pedido;
    }

    public Date getFecha_fin_pedido() {
        return fecha_fin_pedido;
    }

    public void setFecha_fin_pedido(Date fecha_fin_pedido) {
        this.fecha_fin_pedido = fecha_fin_pedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return id_pedido + " " + id_est + " " + fecha_inicio_pedido + " " + fecha_fin_pedido;
    }
}
