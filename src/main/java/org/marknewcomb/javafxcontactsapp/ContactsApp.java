package org.marknewcomb.javafxcontactsapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.marknewcomb.javafxcontactsapp.model.Contacts;

import java.io.IOException;

public class ContactsApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ContactsApp.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("JavaFX Contacts App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Contacts.addTestContacts();
        System.out.println(Contacts.getContactList());
        launch();
    }

}