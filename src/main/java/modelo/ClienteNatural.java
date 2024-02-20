package modelo;

import java.util.Objects;

public class ClienteNatural extends Cliente {
    private String email;
    private String fechaNacimiento;


    public ClienteNatural(String nombre, String apellido, String cedula, String direccion, String telefono, String email, String fechaNacimiento) {
        super(nombre, apellido, cedula, direccion, telefono);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClienteNatural() {
        super();

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClienteNatural that = (ClienteNatural) o;
        return Objects.equals(email, that.email) && Objects.equals(fechaNacimiento, that.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, fechaNacimiento);
    }
}
