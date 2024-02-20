package modelo;

import java.util.Objects;

public class ProductoRefrigerado extends Producto {

    String codigoAprobacion;
    double temperaturaRefrigeracion;

    public ProductoRefrigerado(String descripcion, String codigo, String categoria, String valorUnitario, double cantidad,String codigoAprobacion, double temperaturaRefrigeracion) {
        super(descripcion, codigo, categoria, valorUnitario, cantidad);
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
        this.codigoAprobacion=codigoAprobacion;
    }

    public ProductoRefrigerado(){

    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTemperaturaRefrigeracion() {
        return temperaturaRefrigeracion;
    }

    public void setTemperaturaRefrigeracion(double temperaturaRefrigeracion) {
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" +
                "codigoAprobacion='" + codigoAprobacion + '\'' +
                ", temperaturaRefrigeracion=" + temperaturaRefrigeracion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoRefrigerado that = (ProductoRefrigerado) o;
        return Double.compare(temperaturaRefrigeracion, that.temperaturaRefrigeracion) == 0 && Objects.equals(codigoAprobacion, that.codigoAprobacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAprobacion, temperaturaRefrigeracion);
    }
}
