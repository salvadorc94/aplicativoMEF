package sample.controller;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private ImageView table;

    @FXML
    private void returnMenu(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("/sample/ui/menu.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(6000));
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.setNode(table);
        fade.play();
    }
}
