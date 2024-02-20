module com.luisdeveloper.minipopyectoalmacen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.luisdeveloper.minipopyectoalmacen to javafx.fxml;
    exports com.luisdeveloper.minipopyectoalmacen;
}