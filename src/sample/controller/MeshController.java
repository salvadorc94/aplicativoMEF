package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MeshController implements Initializable {

    @FXML
    private ImageView cuboView;
    @FXML
    private ImageView tetraView;
    @FXML
    private ImageView mesh;
    @FXML
    private Label label;

    private Image sadFace = new Image(getClass().getResource("/sample/resources/sadFace.png").toExternalForm());
    private Image malla = new Image(getClass().getResource("/sample/resources/mesh.PNG").toExternalForm());


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
        cuboView.setEffect(new DropShadow(20, Color.LIMEGREEN));
        tetraView.setEffect(new DropShadow(20, Color.LIMEGREEN));
    }

    @FXML
    private void hoverCube(MouseEvent event){
        cuboView.setEffect(new DropShadow(20, new Color(1.0f,0,0,1.0f)));
    }
    @FXML
    private void exitCube(MouseEvent event){
        cuboView.setEffect(new DropShadow(20, Color.LIMEGREEN));
    }
    @FXML
    private void hoverTetra(MouseEvent event){
        tetraView.setEffect(new DropShadow(20, Color.ROYALBLUE));
    }
    @FXML
    private void exitTetra(MouseEvent event){
        tetraView.setEffect(new DropShadow(20, Color.LIMEGREEN));
    }
    @FXML
    private void clicTetra(MouseEvent event){
        label.setText("BINGOOOO");
        label.setVisible(true);
        mesh.setImage(malla);
        mesh.setFitWidth(481);
        mesh.setFitHeight(404);
        mesh.setVisible(true);

    }
    @FXML
    private void clicCube(MouseEvent event){
        label.setText("Suerte la Próxima");
        label.setVisible(true);
        mesh.setImage(sadFace);
        mesh.setFitWidth(250);
        mesh.setFitHeight(250);
        mesh.setVisible(true);

    }


}
