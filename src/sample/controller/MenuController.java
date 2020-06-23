package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MenuController {

    @FXML
    private void openDomain(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("../ui/dominio.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }
    @FXML
    private void openAssembly(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("../ui/ensamblaje.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }
    @FXML
    private void openMesh(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("../ui/malla.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }
    @FXML
    private void openMef(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("../ui/mef.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }
    @FXML
    private void openModel(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("../ui/modelo.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }
    @FXML
    private void openTable(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("../ui/tabla.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

}
