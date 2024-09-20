module org.marknewcomb.javafxcontactsapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.marknewcomb.javafxcontactsapp to javafx.fxml;
    exports org.marknewcomb.javafxcontactsapp;
    exports org.marknewcomb.javafxcontactsapp.controller;
    opens org.marknewcomb.javafxcontactsapp.controller to javafx.fxml;
}