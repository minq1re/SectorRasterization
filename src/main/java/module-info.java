module com.vsu.loseva.sectorrasterization {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vsu.loseva.sectorrasterization to javafx.fxml;
    exports com.vsu.loseva.sectorrasterization;
}