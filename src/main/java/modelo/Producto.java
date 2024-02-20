package modelo;

import javafx.scene.image.Image;

import java.util.Objects;

public abstract class Producto {
    private String descripcion;
    private String codigo;
    private String categoria;
    private String valorUnitario;
    private double cantidad;

    public Producto(String descripcion, String codigo, String categoria, String valorUnitario, double cantidad) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.categoria = categoria;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }



    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Producto() {
		
	}

	/**
     * Getters and setters
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valorUnitario='" + valorUnitario + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(cantidad, producto.cantidad) == 0 && Objects.equals(descripcion, producto.descripcion) && Objects.equals(codigo, producto.codigo) && Objects.equals(categoria, producto.categoria) && Objects.equals(valorUnitario, producto.valorUnitario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, codigo, categoria, valorUnitario, cantidad);
    }
}
