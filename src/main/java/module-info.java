module com.framin.teamtraininghub {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    //requires eu.hansolo.tilesfx;

    opens com.framin.teamtraininghub to javafx.fxml;
    exports com.framin.teamtraininghub;
}