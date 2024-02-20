package com.luisdeveloper.minipopyectoalmacen;

import Aplicacion.AlmacenModelo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.*;

import java.net.URL;
import java.util.ResourceBundle;

public class AlmacenController {


    public void setAlmacenAplicacion(AlmacenApplication almacenApplication) {

        this.aplicacion=almacenApplication;

        ClienteTableView.getItems().clear();
        ClienteTableView.setItems(getListaClientesNaturalesData());

    }


    @FXML
    void initialize() { //toman datos que se precaragan en el XML

        this.emailTableColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.fechaNacimientoTableColumn.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));

        ClienteTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            clienteNaturalSeleccionado= newSelection;
            mostrarClienteNaturalSeleccionado(clienteNaturalSeleccionado);
        });
    }

    private void mostrarClienteNaturalSeleccionado(ClienteNatural clienteNaturalSeleccionado) {

        NombreTextField.setText(clienteNaturalSeleccionado.getNombre());

        ApellidosTextField.setText(clienteNaturalSeleccionado.getApellido());

        IdentificacionTextField.setText(clienteNaturalSeleccionado.getCedula());

        DireccionTextField.setText(clienteNaturalSeleccionado.getDireccion());

        TelefonoTextField.setText(clienteNaturalSeleccionado.getTelefono());

        emailTextfield.setText(clienteNaturalSeleccionado.getEmail());

        FechaNacimientoTextField.setText(clienteNaturalSeleccionado.getFechaNacimiento());


    }

   // private AlmacenModelo almacenModelo=new AlmacenModelo();

    private AlmacenApplication aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    //------------------------------------PESTANA CLIENTE/tabla de resistro clientes----------------------------------

    @FXML
    private TableView<ClienteNatural> ClienteTableView;

    @FXML
    private TableColumn<ClienteNatural, String> NombreTableColumn;

    @FXML
    private TableColumn<ClienteNatural, String> ApellidoTableColumn;

    @FXML
    private TableColumn<ClienteNatural, String> IdentificacionTableColumn;

    @FXML
    private TableColumn<ClienteNatural, String> fechaNacimientoTableColumn;

    @FXML
    private TableColumn<ClienteNatural, String> emailTableColumn;

    @FXML
    private Button AgregarClienteButton;

    @FXML
    private Button EliminarClienteButton;

    @FXML
    private Button ActualizarClienteButton;

    @FXML
    private Button LimpiarClienteButton;
    @FXML
    private Button BucarClienteButton;
    @FXML
    private ChoiceBox<?> TipoClienteChoiceBox;

    //------------------------------------Sets de textfields para manipular los atributos del Cliente-------------------

    @FXML
    private TextField NombreTextField;

    @FXML
    private TextField ApellidosTextField;

    @FXML
    private TextField IdentificacionTextField;

    @FXML
    private TextField FechaNacimientoTextField;

    @FXML
    private TextField TelefonoTextField;
    @FXML
    private TextField DireccionTextField;

    @FXML
    private TextField NITTextField;

    @FXML
    private TextField emailTextfield;
    //------------------------------------PESTANA PRODUCTOS/tabla de resistro productos---------------------------------

    @FXML
    private Button AcualizarProductoButton;
    @FXML
    private Button AgregarProductoButton;
    @FXML
    private Button BuscarProductoButton;
    @FXML
    private TableColumn<?, ?> CnatidadExistenciasTableColumn;

    @FXML
    private TableColumn<?, ?> CodigoTableColumn;


    @FXML
    private TableColumn<?, ?> DescripcionTableColumn;

    @FXML
    private Button EliminarProductoButton;

    @FXML
    private Button LimpiarProductoButton;

    @FXML
    private TableColumn<?, ?> NombreProductoTableColumn;

    @FXML
    private TableView<ProductoPerecedero> TableViewProducto;

    @FXML
    private TableColumn<?, ?> ValorUnitarioTableColumn;


    //------------------------------------Sets de textfields para manipular los atributos del producto------------------

    @FXML
    private TextField CnatidadExistenciasTexField;
    @FXML
    private TextField CodigoAprobacionTexField;
    @FXML
    private TextField CodigoTexField;
    @FXML
    private TextField DescriptionTexField;
    @FXML
    private TextField FechaVencimientoTexField;

    @FXML
    private TextField NombreProductoTexField;

    @FXML
    private TextField PaisOrigenTexField;

    @FXML
    private TextField PesoEnvaseTexField;

    @FXML
    private TextField TemperaturaRefrigeracionTexField;

    @FXML
    private TextField ValorUnitarioTexField;

    //------------------------------------Labels--------------------------------------------------------------------------
    @FXML
    private Label CodigoAprobacionLabel;
    @FXML
    private Label CodigoLabel;
    @FXML
    private Label DescripcionLabel;

    @FXML
    private Label CantidadExistenciasLabel;

    @FXML
    private Label ApellidosLabel;
    @FXML
    private Label DireccionLabel;
    @FXML
    private Label EmailLabel;

    @FXML
    private Label FechaNacimientoLabel;

    @FXML
    private Label FechaVencimientoLabel;

    @FXML
    private Label IdentificacionLabel;

    @FXML
    private Label NITLabel;

    @FXML
    private Label NombreLabel;

    @FXML
    private Label NombreProductoLabel;
    @FXML
    private Label PaisOrigenLabel;

    @FXML
    private Label PesoEnvaseLabel;
    @FXML
    private Label TelefonoLabel;

    @FXML
    private Label TemperaturaRefrigeracionLabel;

    @FXML
    private Label TipoClienteLabel;

    @FXML
    private Label TipoProductoLabel;

    @FXML
    private Label ValorUnitarioLabel;
    @FXML
    private Tab ClienteTab;


    //-----------------------------------------TABLAS------------------------------------------------------------------
   private ObservableList<ClienteNatural> getListaClientesNaturalesData(){

       listaClienteNaturalData.addAll(aplicacion.obtenerClienteNaturales());

       return listaClienteNaturalData;
   }

    //-----------------------------------------Eventos para botones----------------------------------------------------


    @FXML
    void actualizarProductoAccion(ActionEvent event) {

    }

    @FXML
    void agregarClienteAccion(ActionEvent event) {

    }

    @FXML
    void agregarProductoAccion(ActionEvent event) {

    }

    @FXML
    void atualizarClienteAccion(ActionEvent event) {

    }

    @FXML
    void buscarClienteAccion(ActionEvent event) {

    }

    @FXML
    void buscarProductoAccion(ActionEvent event) {

    }

    @FXML
    void eliminarClienteAccion(ActionEvent event) {

    }

    @FXML
    void eliminarProductoAccion(ActionEvent event) {

    }

    @FXML
    void limpiarClienteAccion(ActionEvent event) {

    }

    @FXML
    void limpiarProductoAccion(ActionEvent event) {

    }

   //------------------------------------------implementacion de objetos del modelo en el controlador--------------------

    ObservableList<ClienteNatural> listaClienteNaturalData=FXCollections.observableArrayList();
    ObservableList<ClienteJuridico> ClienteJuridicoData=FXCollections.observableArrayList();
    ObservableList<ProductoPerecedero> ProductoPerecederoData=FXCollections.observableArrayList();
    ObservableList<ProductoRefrigerado> ProductoRefrigeradoData=FXCollections.observableArrayList();
    ObservableList<ProductoEnvasado> ProductoEnvasadoData=FXCollections.observableArrayList();

    ClienteNatural clienteNaturalSeleccionado = new ClienteNatural();
    ClienteJuridico  clienteJuridicoSeleccionado=new ClienteJuridico();
    ProductoPerecedero productoPerecederoSeleccionado=new ProductoPerecedero();
    ProductoRefrigerado productoRefrigeradoSeleccionado=new ProductoRefrigerado();
    ProductoEnvasado productoEnvasadoSeleccionado=new ProductoEnvasado();
}