package org.marknewcomb.javafxcontactsapp.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.marknewcomb.javafxcontactsapp.model.Contact;
import org.marknewcomb.javafxcontactsapp.model.Contacts;

public class MainController{

    @FXML
    private Button listsButton;
    @FXML
    private Button addContactButton;
    @FXML
    private TextField searchBar;
    @FXML
    private ListView<String> contactsListView;
    private ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    private Button defaultUserCardIcon;

    @FXML
    public void searchForContact(ActionEvent actionEvent) {
    }

    @FXML
    public void viewContactLists(ActionEvent actionEvent) {
    }

    @FXML
    public void displayDefaultUserCard(ActionEvent actionEvent) {
    }

    @FXML
    public void addContact(ActionEvent actionEvent) {
    }

    @FXML
    private void initialize(){
        for(Contact i: Contacts.getContactList()){
            observableList.add(i.getFirstName());
        }
        contactsListView.setItems(observableList);
    }
}