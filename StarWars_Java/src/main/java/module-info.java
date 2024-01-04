module com.example.starwars {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.starwars to javafx.fxml;
    exports com.example.starwars;
}