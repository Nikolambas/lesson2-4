package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class Controller {
    @FXML
    TextField textField;
    @FXML
    TextArea textArea;
    @FXML
    Button button1;
    @FXML
    Button button2;


    public void getMinusNDS(ActionEvent actionEvent) {
        try {
            Double d =Double.parseDouble(textField.getText())/1.20;
            String str = d.toString();
            textArea.appendText(str+"\n");
        }catch (NumberFormatException e){
            textArea.appendText("Введенное значение не соответствует числу\n");
        }

    }

    public void getPlusNDS(ActionEvent actionEvent) {
        try {
            Double d =Double.parseDouble(textField.getText())*1.20;
            String str = d.toString();
            textArea.appendText(str+"\n");
        }catch (NumberFormatException e){
            textArea.appendText("Введенное значение не соответствует числу\n");
        }
    }
}
