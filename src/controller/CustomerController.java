package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CustomerController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtname;

    @FXML
    void btnOnAction(ActionEvent event) {
        System.out.println("save btn working");
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        System.out.println("save btn working");

    }

}
