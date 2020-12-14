package view;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HolaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lab1;

    @FXML
    private Label lab3;

    @FXML
    private Label lab2;

    @FXML
    private Label lab4;

    @FXML
    private Label lab5;

    @FXML
    private Label lab6;

    @FXML
    private Label lab7;

    @FXML
    private Label lab8;

    @FXML
    private Text hola;

    private int count = 0;

    @FXML
    void doL() {
        Color newCG = Color.web("0x01e824ff");
        Color green = Color.web("#01e824");
        Color red = Color.web("#bc1d0f");
        double width = this.lab1.getScene().getWindow().getWidth();
            hola.setText(String.valueOf(++this.count));
            if (this.lab1.getTextFill().equals(newCG)) {
                this.lab1.setTextFill(red);
                this.lab2.setTextFill(green);
                this.lab3.setTextFill(red);
                this.lab4.setTextFill(green);
                this.lab5.setTextFill(red);
                this.lab6.setTextFill(green);
                this.lab7.setTextFill(red);
                this.lab8.setTextFill(green);
            } else {
                this.lab1.setTextFill(green);
                this.lab2.setTextFill(red);
                this.lab3.setTextFill(green);
                this.lab4.setTextFill(red);
                this.lab5.setTextFill(green);
                this.lab6.setTextFill(red);
                this.lab7.setTextFill(green);
                this.lab8.setTextFill(red);
            }
            try {
                this.lab1.getScene().getWindow().setWidth(width + 0.01);
                TimeUnit.SECONDS.sleep(1);
                this.lab1.getScene().getWindow().setWidth(width);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    @FXML
    void initialize() {
        assert lab1 != null : "fx:id=\"lab1\" was not injected: check your FXML file 'Hola.fxml'.";
        assert lab3 != null : "fx:id=\"lab3\" was not injected: check your FXML file 'Hola.fxml'.";
        assert lab2 != null : "fx:id=\"lab2\" was not injected: check your FXML file 'Hola.fxml'.";
        assert lab4 != null : "fx:id=\"lab4\" was not injected: check your FXML file 'Hola.fxml'.";
        assert lab5 != null : "fx:id=\"lab5\" was not injected: check your FXML file 'Hola.fxml'.";
        assert lab6 != null : "fx:id=\"lab6\" was not injected: check your FXML file 'Hola.fxml'.";
        assert lab7 != null : "fx:id=\"lab7\" was not injected: check your FXML file 'Hola.fxml'.";
        assert lab8 != null : "fx:id=\"lab8\" was not injected: check your FXML file 'Hola.fxml'.";
    }
}