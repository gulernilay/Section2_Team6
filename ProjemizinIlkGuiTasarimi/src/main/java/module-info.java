module com.example.projemizinilkguitasarimi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projemizinilkguitasarimi to javafx.fxml;
    exports com.example.projemizinilkguitasarimi;
}