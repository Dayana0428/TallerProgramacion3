package modelo;

import java.util.Objects;

public class  ClienteJuridico extends Cliente {
    private String nit;


    public ClienteJuridico(String nombre, String apellido, String cedula, String direccion, String telefono, String nit) {
        super(nombre, apellido, cedula, direccion, telefono);
        this.nit = nit;
    }

    public ClienteJuridico() {
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClienteJuridico that = (ClienteJuridico) o;
        return Objects.equals(nit, that.nit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nit);
    }
}
