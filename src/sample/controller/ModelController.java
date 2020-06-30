package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javafx.scene.input.MouseEvent;


import java.io.IOException;

public class ModelController{

    @FXML
    private ImageView questionImage;
    private Image question = new Image(getClass().getResource("/sample/resources/QuestionMark.png").toExternalForm());
    private Image modelo = new Image(getClass().getResource("/sample/resources/modelo.PNG").toExternalForm());

    @FXML
    private void returnMenu(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("/sample/ui/menu.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    @FXML
    private void onMouseEnter(MouseEvent event){
        questionImage.setImage(modelo);
        questionImage.setFitHeight(800);
        questionImage.setFitWidth(400);
    }
    @FXML
    private void onMouseExit(MouseEvent event){
        questionImage.setImage(question);
        questionImage.setFitHeight(124);
        questionImage.setFitWidth(137);
    }

}
