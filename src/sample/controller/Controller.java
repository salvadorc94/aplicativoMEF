package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    @FXML
    private void addScene(ActionEvent event) throws IOException {
        System.out.println("Worked");
        /*Parent view2 = FXMLLoader.load(getClass().getResource("second.fxml"));
        Scene scene2 = new Scene(view2);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();*/
    }

}
