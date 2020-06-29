package sample.controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ComponentController implements Initializable {


    @FXML
    private ImageView componente1, componente2, componente3, componente4, componente5, componente6;
    @FXML
    private ImageView target;

    private List<ImageView> componentes = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        componentes.add(componente1);
        componentes.add(componente2);
        componentes.add(componente3);
        componentes.add(componente4);
        componentes.add(componente5);
        componentes.add(componente6);

        //Set events on all ImageViews.
        for(int i=0;i<componentes.size();i++){
            ImageView source = componentes.get(i);
            int aux = i;
            source.setOnDragDetected(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    Dragboard db = source.startDragAndDrop(TransferMode.ANY);
                    ClipboardContent content = new ClipboardContent();
                    content.putImage(source.getImage());
                    content.putString(String.valueOf(aux+1));
                    db.setContent(content);
                    event.consume();
                }
            });
            source.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent e) {
                    source.setCursor(Cursor.HAND);
                }
            });
        }


        //Set events on target
        target.setOnDragOver(new EventHandler <DragEvent>() {
            public void handle(DragEvent event) {
                /* data is dragged over the target */
                /* accept it only if it is  not dragged from the same node*/
                if (event.getGestureSource() != target) {
                    /* allow for both copying and moving, whatever user chooses */
                    event.acceptTransferModes(TransferMode.ANY);
                }
                event.consume();
            }
        });
        target.setOnDragDropped(new EventHandler <DragEvent>() {
            public void handle(DragEvent event) {
                /* data dropped */
                Dragboard db = event.getDragboard();

                switch (db.getString()){
                    case "1":
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("../ui/mostrarComponente.fxml"));
                            Parent domain = loader.load();
                            Scene newScene = new Scene(domain);
                            ShowComponentController controller = loader.getController();
                            controller.initData(1);
                            Stage window = new Stage();
                            window.setX(652);
                            window.setY(200);
                            window.setScene(newScene);
                            window.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "2":
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("../ui/mostrarComponente.fxml"));
                            Parent domain = loader.load();
                            Scene newScene = new Scene(domain);
                            ShowComponentController controller = loader.getController();
                            controller.initData(2);
                            Stage window = new Stage();
                            window.setX(652);
                            window.setY(200);
                            window.setScene(newScene);
                            window.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "3":
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("../ui/mostrarComponente.fxml"));
                            Parent domain = loader.load();
                            Scene newScene = new Scene(domain);
                            ShowComponentController controller = loader.getController();
                            controller.initData(3);
                            Stage window = new Stage();
                            window.setX(652);
                            window.setY(200);
                            window.setScene(newScene);
                            window.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "4":
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("../ui/mostrarComponente.fxml"));
                            Parent domain = loader.load();
                            Scene newScene = new Scene(domain);
                            ShowComponentController controller = loader.getController();
                            controller.initData(4);
                            Stage window = new Stage();
                            window.setX(652);
                            window.setY(200);
                            window.setScene(newScene);
                            window.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "5":
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("../ui/mostrarComponente.fxml"));
                                Parent domain = loader.load();
                                Scene newScene = new Scene(domain);
                                ShowComponentController controller = loader.getController();
                                controller.initData(5);
                                Stage window = new Stage();
                                window.setX(652);
                                window.setY(200);
                                window.setScene(newScene);
                                window.show();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                    case "6":
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("../ui/mostrarComponente.fxml"));
                            Parent domain = loader.load();
                            Scene newScene = new Scene(domain);
                            ShowComponentController controller = loader.getController();
                            controller.initData(6);
                            Stage window = new Stage();
                            window.setX(652);
                            window.setY(200);
                            window.setScene(newScene);
                            window.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                }

                event.setDropCompleted(true);
                event.consume();
            }
        });

    }
}
