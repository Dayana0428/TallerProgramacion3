package com.luisdeveloper.minipopyectoalmacen;

import java.io.IOException;
import java.util.ArrayList;

import Aplicacion.AlmacenModelo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.ClienteNatural;


public class AlmacenApplication extends Application {
    private Stage primaryStage;

    private AlmacenModelo miAlmacenModelo = new AlmacenModelo();

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public AlmacenModelo getMiAlmacenModelo() {
        return miAlmacenModelo;
    }

    public void setMiAlmacenModelo(AlmacenModelo miAlmacenModelo) {
        this.miAlmacenModelo = miAlmacenModelo;
    }

    public void start(Stage primaryStage)throws IOException{
        this.primaryStage=primaryStage;
        mostrarVentana();


    }

    public void mostrarVentana() {
        try {
            primaryStage.close();
            primaryStage=new Stage();
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(AlmacenApplication.class.getResource("/com/luisdeveloper/minipopyectoalmacen/hello-view.fxml"));
            AnchorPane rootLayout=loader.load();
            AlmacenController controller=loader.getController();
            controller.setAlmacenAplicacion(this);
            Scene scene=new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        launch();

    }

    public ArrayList<ClienteNatural> obtenerClienteNaturales() {
        return  miAlmacenModelo.obtenerClienteNaturales();
    }
}