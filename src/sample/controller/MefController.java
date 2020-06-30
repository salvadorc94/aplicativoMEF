package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MefController implements Initializable {

    @FXML
    private ImageView imagen;
    @FXML
    private JFXButton boton;
    @FXML
    private  JFXButton component;

    private List<Image> images = new ArrayList<>();
    private int counter = 0;
    private final int nimages = 9;

    @FXML
    private void returnMenu(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("/sample/ui/menu.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.setX(652);
        window.setY(200);
        window.show();
    }

    @FXML
    private void showComponents(ActionEvent event) throws  IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("/sample/ui/componentes.fxml"));
        Scene newScene = new Scene(domain);
        Stage window = new Stage();
        window.setScene(newScene);
        window.show();
    }

    @FXML
    private void nextImg(ActionEvent event) throws  IOException{
        if(counter < nimages-1){
            counter += 1;
            Scene scene = boton.getScene();
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(1000));
            fade.setFromValue(1);
            fade.setToValue(0);
            fade.setNode(imagen);
            fade.setOnFinished(t -> {
                imagen.translateXProperty().set(scene.getWidth());
                imagen.setOpacity(1);
                Timeline timeline = new Timeline();
                KeyValue kv = new KeyValue(imagen.translateXProperty(),0, Interpolator.EASE_IN);
                KeyFrame kf = new KeyFrame(Duration.seconds(1),kv);
                timeline.getKeyFrames().add(kf);
                timeline.play();
                imagen.setImage(images.get(counter));
            });
            fade.play();
        }
        if(counter == nimages-1){
            component.setVisible(true);
            component.setDisable(false);
        }

    }
    @FXML
    private void goBack(ActionEvent event) throws  IOException{
        if(counter > 0){
            counter-=1;
            Scene scene = boton.getScene();
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(1000));
            fade.setFromValue(1);
            fade.setToValue(0);
            fade.setNode(imagen);
            fade.setOnFinished(t -> {
                imagen.translateXProperty().set(-scene.getWidth());
                imagen.setOpacity(1);
                Timeline timeline = new Timeline();
                KeyValue kv = new KeyValue(imagen.translateXProperty(),0, Interpolator.EASE_IN);
                KeyFrame kf = new KeyFrame(Duration.seconds(1),kv);
                timeline.getKeyFrames().add(kf);
                timeline.play();
                imagen.setImage(images.get(counter));
            });
            fade.play();
        }
        if(counter == nimages-2){
            component.setVisible(false);
            component.setDisable(true);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Llenando la lista

        images.add(imagen.getImage());
        images.add(new Image("/sample/resources/mef/mef2.PNG"));
        images.add(new Image("/sample/resources/mef/mef3.PNG"));
        images.add(new Image("/sample/resources/mef/mef4.PNG"));
        images.add(new Image("/sample/resources/mef/mef5.PNG"));
        images.add(new Image("/sample/resources/mef/mef6.PNG"));
        images.add(new Image("/sample/resources/mef/mef7.PNG"));
        images.add(new Image("/sample/resources/mef/mef8.PNG"));
        images.add(new Image("/sample/resources/mef/mef9.PNG"));
        /*
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef1.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef2.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef3.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef4.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef5.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef6.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef7.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef8.png").toExternalForm()));
        images.add(new Image(getClass().getResource("/sample/resources/mef/mef9.png").toExternalForm()));
        */
        component.setVisible(false);
    }
}
