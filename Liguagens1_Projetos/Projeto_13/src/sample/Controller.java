package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    private Label labelSaida;
    @FXML
    private Button Acao;
    @FXML
    private TextField entrada;
    @FXML
    public void olaMundoCLI(){
        System.out.println("Ola mundo");
    }
}
