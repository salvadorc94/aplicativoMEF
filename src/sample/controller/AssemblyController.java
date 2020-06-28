package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AssemblyController implements Initializable {

    @FXML
    private WebView web;

    @FXML
    private void returnMenu(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("../ui/menu.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.setMaximized(false);
        web.getEngine().load(null);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        web.getEngine().load(
                "https://drive.google.com/file/d/12g1QLRSMsGbeb6zulicLADdDSzzCI_ND/preview"
        );
    }
}
