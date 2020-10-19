package controller;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalculatorController {

    private double counter = 0;
    private double firstnumber = 0;
    private double secondnumber = 0;
    private double type = 0;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button div;

    @FXML
    private Button mult;

    @FXML
    private Button minus;

    @FXML
    private Button plus;

    @FXML
    private TextField display;

    @FXML
    void HandleOne(ActionEvent event) {

        display.setText(display.getText() + "1");

    }

    @FXML
    void HandleTwo(ActionEvent event) {

        display.setText(display.getText() + "2");

    }

    @FXML
    void HandleThree(ActionEvent event) {

        display.setText(display.getText() + "3");

    }

    @FXML
    void HandleFour(ActionEvent event) {

        display.setText(display.getText() + "4");

    }

    @FXML
    void HandleFive(ActionEvent event) {

        display.setText(display.getText() + "5");

    }

    @FXML
    void HandleSix(ActionEvent event) {

        display.setText(display.getText() + "6");

    }

    @FXML
    void HandleSeven(ActionEvent event) {

        display.setText(display.getText() + "7");

    }

    @FXML
    void HandleEight(ActionEvent event) {

        display.setText(display.getText() + "8");

    }

    @FXML
    void HandleNine(ActionEvent event) {

        display.setText(display.getText() + "9");

    }

    @FXML
    void HandleZero(ActionEvent event) {

        display.setText(display.getText() + "0");

    }

    @FXML
    void HandlePlus(ActionEvent event) {

        if (counter == 0 && !display.getText().equals("")) {

            firstnumber = Integer.parseInt(display.getText());
            display.setText(display.getText() + "+");
            type = 1;
            counter++;
        }
    }

    @FXML
    void HandleMinus(ActionEvent event) {

        if (counter == 0 && !display.getText().equals("")) {
            firstnumber = Integer.parseInt(display.getText());
            display.setText(display.getText() + "-");
            type = 2;
            counter++;
        }
    }

    @FXML
    void HandleMult(ActionEvent event) {

        if (counter == 0 && !display.getText().equals("")) {
            firstnumber = Integer.parseInt(display.getText());
            display.setText(display.getText() + "*");
            type = 3;
            counter++;
        }
    }

    @FXML
    void HandleDiv(ActionEvent event) {

        if (counter == 0 && !display.getText().equals("")) {
            firstnumber = Integer.parseInt(display.getText());
            display.setText(display.getText() + "/");
            type = 4;
            counter++;
        }
    }


    @FXML
    void HandleClear(ActionEvent event) {

        counter = 0;
        display.setText("");

    }

    @FXML
    void HandleEquals(ActionEvent event) {

        counter = 0;

        if (type == 1) {

            secondnumber = Integer.parseInt(display.getText().substring(display.getText().lastIndexOf("+") + 1));
            double result = firstnumber + secondnumber;
            display.setText("" + result);

        } else if (type == 2) {

            secondnumber = Integer.parseInt(display.getText().substring(display.getText().lastIndexOf("-") + 1));
            double result = firstnumber - secondnumber;
            display.setText("" + result);

        } else if (type == 3) {

            secondnumber = Integer.parseInt(display.getText().substring(display.getText().lastIndexOf("*") + 1));
            double result = firstnumber * secondnumber;
            display.setText("" + result);

        } else if (type == 4) {

            secondnumber = Integer.parseInt(display.getText().substring(display.getText().lastIndexOf("/") + 1));
            double result = firstnumber / secondnumber;
            display.setText("" + result);

        } else {

            display.setText("Falsche Eingabe!");

        }
    }

    public void HandleDisplay(ActionEvent event) {

    }
}
