package Aplicacion;

import modelo.*;

import java.util.ArrayList;

public class AlmacenModelo {
    private ArrayList<ClienteNatural> listaClienteNatural;

    private ArrayList<ClienteJuridico> listaClienteJuridico;

    private ArrayList<ProductoPerecedero> listaProductoPerecedero;

    private ArrayList<ProductoEnvasado> listaProductoEnvasado;

    private ArrayList<ProductoRefrigerado> listaProductoRefrigerado;


    ClienteNatural clienteNatural1 = new ClienteNatural("Dayana", "Buitrago", "123456789", "Barrio 2#3", "987654321","Dayabuitra@gamil.com", "02/02/2000");
    ClienteJuridico clienteJuridico1 = new ClienteJuridico("Sebastian","Perez","9012839123","Barrio nogal","129312912","123788123");
    ProductoPerecedero productoPerecedero1 = new ProductoPerecedero("Atun","1237182378","2","20.000",2,"03/04/2024");
    ProductoEnvasado productoEnvasado1 = new ProductoEnvasado ("Shampoo","243603687","3","10000",3,"02/01/2003",52,TipoPais.COLOMBIA);
    ProductoRefrigerado productoRefrigerado1 = new ProductoRefrigerado ("Pescado", "897885", "1", "12000", 5,  "1110000",-21);


    public AlmacenModelo(ArrayList<ClienteNatural> listaClienteNatural, ArrayList<ClienteJuridico> listaClienteJuridico, ArrayList<ProductoPerecedero> listaProductoPerecedero, ArrayList<ProductoEnvasado> listaProductoEnvasado, ArrayList<ProductoRefrigerado> listaProductoRefrigerado) {
        super();
        this.listaClienteNatural = listaClienteNatural;

        this.listaClienteJuridico = listaClienteJuridico;
        this.listaProductoPerecedero = listaProductoPerecedero;
        this.listaProductoEnvasado = listaProductoEnvasado;
        this.listaProductoRefrigerado = listaProductoRefrigerado;
        listaClienteNatural = new ArrayList<ClienteNatural>();
        listaClienteJuridico = new ArrayList<ClienteJuridico>();
        listaProductoPerecedero = new ArrayList<ProductoPerecedero>();
    }

    public AlmacenModelo() {
        super();
        listaClienteNatural = new ArrayList<ClienteNatural>();
        listaClienteJuridico = new ArrayList<ClienteJuridico>();
        listaProductoPerecedero = new ArrayList<ProductoPerecedero>();
        InicializarDatos();
    }

    public ArrayList<ClienteNatural> getListaClienteNatural() {
        return listaClienteNatural;
    }
    public ArrayList<ClienteJuridico> getListaClienteJuridico() {
        return listaClienteJuridico;
    }
    public ArrayList<ProductoPerecedero> getListaProductoPerecedero() {
        return listaProductoPerecedero;
    }

    public void setClienteJuridico(ArrayList<ClienteJuridico> listaClienteJuridico) {
        this.listaClienteJuridico = listaClienteJuridico;
    }

    public void setListaClienteNatural(ArrayList<ClienteNatural> listaClienteNatural) {
        this.listaClienteNatural = listaClienteNatural;
    }


    public void setProductoPerecedero(ArrayList<ProductoPerecedero> listaProductoPerecedero){
        this.listaProductoPerecedero = listaProductoPerecedero;
    }

    private void InicializarDatos(){
        listaClienteNatural.add(clienteNatural1);
        listaProductoPerecedero.add(productoPerecedero1);
        listaClienteJuridico.add(clienteJuridico1);
    }

//-------------CRUD CLIENTENATURAL--------------------------------------------------

    public void agregarCliente(ClienteNatural nuevoClienteNatural) {
        String mensaje = "";
        ClienteNatural cliente = verificarCliente(nuevoClienteNatural);
        listaClienteNatural.add(clienteNatural1);
        mensaje = "cliente creado";
    }

    private ClienteNatural verificarCliente(ClienteNatural nuevoCliente) {
        ClienteNatural clienteHallado = null;
        for (ClienteNatural clienteAux : listaClienteNatural) {
            if (clienteAux.getCedula().equals(nuevoCliente.getCedula())) {
                clienteHallado = clienteAux;
                System.out.println("Cliente existente");
            }
            break;
        }
        return clienteHallado;
    }

    private ClienteNatural buscarCliente(ClienteNatural nuevoCliente)  {
        ClienteNatural clienteHallado = null;
        for (ClienteNatural clienteAux : listaClienteNatural) {
            if (clienteAux.getCedula().equals(nuevoCliente.getCedula())) {
                clienteHallado = clienteAux;
                break;
            }
        }
        if (clienteHallado == null) {
            System.out.println("el cliente no existe");
        }
        return clienteHallado;
    }

    public void actualizarCliente(ClienteNatural clienteNatural) {
        String mensaje = "";

        ClienteNatural clienteHallado = (ClienteNatural) buscarCliente(clienteNatural);

        clienteHallado.setNombre(clienteNatural.getNombre());
        clienteHallado.setApellido(clienteNatural.getApellido());
        clienteHallado.setCedula(clienteNatural.getCedula());
        clienteHallado.setDireccion(clienteNatural.getDireccion());
        clienteHallado.setTelefono(clienteNatural.getTelefono());
        clienteHallado.setFechaNacimiento(clienteNatural.getFechaNacimiento());
        clienteHallado.setEmail(clienteNatural.getEmail());

        mensaje = "cliente actualizado";

    }

    public boolean eliminarCliente(ClienteNatural clienteEliminar){
        String mensaje = "";
        ClienteNatural clienteHallado = clienteEliminar;
        for (ClienteNatural clienteAux : listaClienteNatural) {
            if (clienteAux.getCedula().equals(clienteHallado.getCedula())) {
                listaClienteNatural.remove(clienteHallado);
                return true;
            }
        }

        return false;
    }



//---------CRUD ClIENTEJURIDICO------------------------------------------------------


    public void agregarCliente(ClienteJuridico nuevoCliente) {
        String mensaje = "";
        ClienteJuridico cliente = verificarCliente(nuevoCliente);
        listaClienteJuridico.add(clienteJuridico1);
        mensaje = "cliente creado";
    }

    private ClienteJuridico verificarCliente(ClienteJuridico nuevoCliente) {
        ClienteJuridico clienteHallado = null;
        for (ClienteJuridico clienteAux : listaClienteJuridico) {
            if (clienteAux.getCedula().equals(nuevoCliente.getCedula())) {
                clienteHallado = clienteAux;
                System.out.println("Cliente existente");
            }
            break;
        }
        return clienteHallado;
    }

    private ClienteJuridico buscarCliente(ClienteJuridico nuevoCliente)  {
        ClienteJuridico clienteHallado = null;
        for (ClienteJuridico clienteAux : listaClienteJuridico){
            if (clienteAux.getCedula().equals(nuevoCliente.getCedula())) {
                clienteHallado = clienteAux;
                break;
            }
        }
        if (clienteHallado == null) {
            System.out.println("el cliente no existe");
        }
        return clienteHallado;
    }

    public void actualizarCliente(ClienteJuridico clienteJuridico) {
        String mensaje = "";

        ClienteJuridico clienteHallado = (ClienteJuridico) buscarCliente(clienteJuridico);

        clienteHallado.setNombre(clienteJuridico.getNombre());
        clienteHallado.setApellido(clienteJuridico.getApellido());
        clienteHallado.setCedula(clienteJuridico.getCedula());
        clienteHallado.setDireccion(clienteJuridico.getDireccion());
        clienteHallado.setTelefono(clienteJuridico.getTelefono());
        clienteHallado.setNit(clienteJuridico.getNit());

        mensaje = "cliente actualizado";

    }

    public boolean eliminarCliente(ClienteJuridico clienteEliminar){
        String mensaje = "";
        ClienteJuridico clienteHallado = clienteEliminar;
        for (ClienteJuridico clienteAux : listaClienteJuridico) {
            if (clienteAux.getCedula().equals(clienteHallado.getCedula())) {
                listaClienteJuridico.remove(clienteHallado);
                return true;
            }
        }

        return false;
    }

    //-------------CRUD ProductoPerecedero--------------------------------------------------

    public void agregarProducto(ProductoPerecedero nuevoProducto) {
        String mensaje = "";
        ProductoPerecedero producto = verificarProducto(nuevoProducto);
        listaProductoPerecedero.add(productoPerecedero1);
        mensaje = "producto creado";
    }

    private ProductoPerecedero verificarProducto(ProductoPerecedero nuevoProducto) {
        ProductoPerecedero productoHallado = null;
        for (ProductoPerecedero productoAux : listaProductoPerecedero) {
            if (productoAux.getCodigo().equals(nuevoProducto.getCodigo())) {
                productoHallado = productoAux;
                System.out.println("producto existente");
            }
            break;
        }
        return productoHallado;
    }

    private ProductoPerecedero buscarProducto(ProductoPerecedero nuevoProducto)  {
        ProductoPerecedero productoHallado = null;
        for (ProductoPerecedero productoAux : listaProductoPerecedero) {
            if (productoAux.getCodigo().equals(nuevoProducto.getCodigo())) {
                productoHallado = productoAux;
                break;
            }
        }
        if (productoHallado == null) {
            System.out.println("el productp no existe");
        }
        return productoHallado;
    }

    public void actualizarProducto(ProductoPerecedero productoPerecedero) {
        String mensaje = "";

        ProductoPerecedero productoHallado = (ProductoPerecedero) buscarProducto(productoPerecedero);

        productoHallado.setDescripcion(productoPerecedero.getDescripcion());
        productoHallado.setCodigo(productoPerecedero.getCodigo());
        productoHallado.setCategoria(productoPerecedero.getCategoria());
        productoHallado.setValorUnitario(productoPerecedero.getValorUnitario());
        productoHallado.setCantidad(productoPerecedero.getCantidad());
        productoHallado.setFechaVencimiento(productoPerecedero.getFechaVencimiento());

        mensaje = "producto actualizado";

    }

    public boolean eliminarProducto(ProductoPerecedero productoEliminar){
        String mensaje = "";
        ProductoPerecedero productoHallado = productoEliminar;
        for (ProductoPerecedero productoAux : listaProductoPerecedero) {
            if (productoAux.getCodigo().equals(productoHallado.getCodigo())) {
                listaProductoPerecedero.remove(productoHallado);
                return true;
            }
        }

        return false;
    }

    //-------------CRUD PRODUCTOENVASADO--------------------------------------------------

    public void agregarProducto(ProductoEnvasado nuevoProducto) {
        String mensaje = "";
        ProductoEnvasado producto = verificarProducto(nuevoProducto);
        listaProductoEnvasado.add(productoEnvasado1);
        mensaje = "producto agregado";
    }

    private ProductoEnvasado verificarProducto(ProductoEnvasado nuevoProducto) {
        ProductoEnvasado productoHallado = null;
        for (ProductoEnvasado productoAux : listaProductoEnvasado) {
            if (productoAux.getCodigo().equals(nuevoProducto.getCodigo())) {
                productoHallado = productoAux;
                System.out.println("producto existente");
            }
            break;
        }
        return productoHallado;
    }


    private ProductoEnvasado buscarProducto(ProductoEnvasado nuevoProducto)  {
        ProductoEnvasado productoHallado = null;
        for (ProductoEnvasado productoAux : listaProductoEnvasado) {
            if (productoAux.getCodigo().equals(nuevoProducto.getCodigo())) {
                productoHallado = productoAux;
                break;
            }
        }
        if (productoHallado == null) {
            System.out.println("el productp no existe");
        }
        return productoHallado;
    }

    public void actualizarProducto(ProductoEnvasado productoEnvasado) {
        String mensaje = "";

        Producto productoHallado = buscarProducto(productoEnvasado);

        productoHallado.setDescripcion(productoEnvasado.getDescripcion());
        productoHallado.setCodigo(productoEnvasado.getCodigo());
        productoHallado.setCategoria(productoEnvasado.getCategoria());
        productoHallado.setValorUnitario(productoEnvasado.getValorUnitario());

        mensaje = "producto actualizado";
    }

    public boolean eliminarProducto(ProductoEnvasado productoEliminar) {
        String mensaje = "";
        ProductoEnvasado productoHallado = productoEliminar;
        for (ProductoEnvasado productoAux : listaProductoEnvasado) {
            if (productoAux.getCodigo().equals(productoHallado.getCodigo())) {
                listaProductoEnvasado.remove(productoHallado);
                return true;
            }
        }

        return false;
    }


//----------------------------------CRUD PRODUCTOREFRIGERADO-----------------------------------------------------------

    public void agregarProducto(ProductoRefrigerado nuevoProducto) {
        String mensaje = "";
        ProductoRefrigerado producto = verificarProducto(nuevoProducto);
        listaProductoRefrigerado.add(productoRefrigerado1);
        mensaje = "producto agregado";
    }

    private ProductoRefrigerado verificarProducto(ProductoRefrigerado nuevoProducto) {
        ProductoRefrigerado productoHallado = null;
        for (ProductoRefrigerado productoAux : listaProductoRefrigerado) {
            if (productoAux.getCodigo().equals(nuevoProducto.getCodigo())) {
                productoHallado = productoAux;
                System.out.println("producto existente");
            }
            break;
        }
        return productoHallado;
    }


    private ProductoRefrigerado buscarProducto(ProductoRefrigerado nuevoProducto)  {
        ProductoRefrigerado productoHallado = null;
        for (ProductoRefrigerado productoAux : listaProductoRefrigerado) {
            if (productoAux.getCodigo().equals(nuevoProducto.getCodigo())) {
                productoHallado = productoAux;
                break;
            }
        }
        if (productoHallado == null) {
            System.out.println("el producto no existe");
        }
        return productoHallado;
    }

    public void actualizarProducto(ProductoRefrigerado productoRefrigerado) {
        String mensaje = "";

        Producto productoHallado = buscarProducto(productoRefrigerado);

        productoHallado.setDescripcion(productoRefrigerado.getDescripcion());
        productoHallado.setCodigo(productoRefrigerado.getCodigo());
        productoHallado.setCategoria(productoRefrigerado.getCategoria());
        productoHallado.setValorUnitario(productoRefrigerado.getValorUnitario());

        mensaje = "producto actualizado";

    }

    public boolean eliminarProducto(ProductoRefrigerado productoEliminar) {
        String mensaje = "";
        ProductoRefrigerado productoHallado = productoEliminar;
        for (ProductoRefrigerado productoAux : listaProductoRefrigerado) {
            if (productoAux.getCodigo().equals(productoHallado.getCodigo())) {
                listaProductoRefrigerado.remove(productoHallado);
                return true;
            }
        }

        return false;
    }


    public ArrayList<ClienteNatural> obtenerClienteNaturales() {
        return listaClienteNatural;

    }
}