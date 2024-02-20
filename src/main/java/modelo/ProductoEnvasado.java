package modelo;

import java.util.Objects;

public class ProductoEnvasado extends Producto {
    private String fechaEnvasado;
    private double pesoEnvase;
    private TipoPais tipoPaisOrigen;

    public ProductoEnvasado(String descripcion, String codigo, String categoria, String valorUnitario, double cantidad, String fechaEnvasado, double pesoEnvase, TipoPais tipoPaisOrigen) {
        super(descripcion, codigo, categoria, valorUnitario, cantidad);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.tipoPaisOrigen = tipoPaisOrigen;
    }

    public ProductoEnvasado() {

    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public TipoPais getTipoPaisOrigen() {
        return tipoPaisOrigen;
    }

    public void setTipoPaisOrigen(TipoPais tipoPaisOrigen) {
        this.tipoPaisOrigen = tipoPaisOrigen;
    }

    @Override
    public String toString() {
        return "ProductoEnvasado{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", pesoEnvase=" + pesoEnvase +
                ", tipoPaisOrigen=" + tipoPaisOrigen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoEnvasado that = (ProductoEnvasado) o;
        return Double.compare(pesoEnvase, that.pesoEnvase) == 0 && Objects.equals(fechaEnvasado, that.fechaEnvasado) && tipoPaisOrigen == that.tipoPaisOrigen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaEnvasado, pesoEnvase, tipoPaisOrigen);
    }
}
