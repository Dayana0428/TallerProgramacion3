package modelo;

import java.util.Objects;

public class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String descripcion, String codigo, String categoria, String valorUnitario, double cantidad, String fechaVencimiento) {
        super(descripcion, codigo, categoria, valorUnitario, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }

    public ProductoPerecedero(){

    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductoPerecedero that = (ProductoPerecedero) o;
        return Objects.equals(fechaVencimiento, that.fechaVencimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaVencimiento);
    }

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }
}
