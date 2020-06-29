package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class ShowComponentController {

    @FXML
    private WebView webView;

    public void initData(int selectedComponent){
        switch (selectedComponent){
            case 1:
                webView.getEngine().load("https://drive.google.com/file/d/1u1o77SEs7HfbWnAjXTCv9Ger9_0cWnR0/preview");
                break;
            case 2:
                webView.getEngine().load("https://drive.google.com/file/d/1SH_sq0R7TCWyGfw7xN8_Rn6HdFjhrlRx/preview");
                break;
            case 3:
                webView.getEngine().load("https://drive.google.com/file/d/1UyrvZf3BLh31Ezga4f2jL4zDs1yALkEM/preview");
                break;
            case 4:
                webView.getEngine().load("https://drive.google.com/file/d/19hK7VyHUty7ymjEjduy-a3VZTs5EDj4s/preview");
                break;
            case 5:
                webView.getEngine().load("https://drive.google.com/file/d/133BtYvsuz5XmeOz-HBSa3Ow_YWiBAds9/preview");
                break;
            case 6:
                webView.getEngine().load("https://drive.google.com/file/d/1f4-wguaN4O8NQs6odhRWAmjqXHSWe1RH/preview");
                break;
        }
    }

}
