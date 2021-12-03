package com.essohpee.randomnumbergenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RandomNumberGeneratorController implements Initializable {

    @FXML
    private  TextField MinTextField;
    @FXML
    private  TextField MaxTextField;
    @FXML
    private TextField ResultField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void GenerateAction(ActionEvent event) {
        if ("".equals(MaxTextField.getText().trim()) && "".equals(MinTextField.getText().trim())) {
            long random = ((long) (Math.random() * (1000 + 1)));
            ResultField.setText("" + random);
            return;
        } else if ("".equals(MaxTextField.getText().trim()) || "".equals(MinTextField.getText().trim())) {
            ResultField.setText("");
            return;
        }
        long min, max;
        try {
            max = Long.parseLong(MaxTextField.getText());
            min = Long.parseLong(MinTextField.getText());
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error in parsing");
            ResultField.setText("Enter correct value");
            return;
        }
        long random = ((long) (Math.random() * (max - min + 1)) + min);
        ResultField.setText(random + "");
    }
}