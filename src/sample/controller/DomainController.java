package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;


import java.io.IOException;


public class DomainController {

    @FXML
    private void returnMenu(ActionEvent event) throws IOException {
        Parent domain = FXMLLoader.load(getClass().getResource("/sample/ui/menu.fxml"));
        Scene newScene = new Scene(domain);
        //Stage window = new Stage(); Nuevo
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    @FXML
    private void showDomain(ActionEvent event) throws IOException {
        //Agradecimiento especial a afsal villan de http://www.genuinecoder.com  por su poderoso código :D Wenas Ing por si lee esto xD.
        //Create box
        Box box = new Box(50, 50, 100);
        //Prepare transformable Group container
        SmartGroup group = new SmartGroup();
        group.getChildren().add(box);
        Camera camera = new PerspectiveCamera();
        Scene scene = new Scene(group, WIDTH, HEIGHT);
        scene.setFill(Color.BLACK);
        scene.setCamera(camera);

        //Move to center of the screen
        group.translateXProperty().set(WIDTH / 2);
        group.translateYProperty().set(HEIGHT / 2);
        group.translateZProperty().set(-800);
        Stage window = new Stage();

        //Add keyboard control.
        window.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent -> {
            switch (keyEvent.getCode()) {
                case Q:
                    group.rotateByZ(10);
                    break;
                case E:
                    group.rotateByZ(-10);
                    break;
                case K:
                    group.rotateByX(10);
                    break;
                case I:
                    group.rotateByX(-10);
                    break;
                case J:
                    group.rotateByY(10);
                    break;
                case L:
                    group.rotateByY(-10);
                    break;
            }
        });

        window.setScene(scene);
        window.setTitle("MEF 3D Mostrando dominio");
        window.show();

    }



    static class SmartGroup extends Group {

        Rotate r;
        Transform t = new Rotate();

        void rotateByZ(int ang) {
            r = new Rotate(ang, Rotate.Z_AXIS);
            t = t.createConcatenation(r);
            this.getTransforms().clear();
            this.getTransforms().addAll(t);
        }
        void rotateByX(int ang) {
            r = new Rotate(ang, Rotate.X_AXIS);
            t = t.createConcatenation(r);
            this.getTransforms().clear();
            this.getTransforms().addAll(t);
        }

        void rotateByY(int ang) {
            r = new Rotate(ang, Rotate.Y_AXIS);
            t = t.createConcatenation(r);
            this.getTransforms().clear();
            this.getTransforms().addAll(t);
        }
    }

}
