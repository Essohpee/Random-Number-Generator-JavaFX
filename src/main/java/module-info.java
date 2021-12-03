module com.essohpee.randomnumbergenerator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.jfoenix;

    opens com.essohpee.randomnumbergenerator to javafx.fxml;
    exports com.essohpee.randomnumbergenerator;
}