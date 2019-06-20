package application.controller;

import application.model.RecordLabel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SongsSearchController {
	@FXML
    private TextField songTextFeild;

    @FXML
    private TextArea consoleText;

    private RecordLabel recordLabel;
    
    public SongsSearchController(RecordLabel label) {
    	recordLabel=label;
    }
    
    @FXML
    void searchTextFeildListener(ActionEvent event) {

    }

    @FXML
    void searchTextButton(ActionEvent event) {

    }
    
    @FXML
    void initialize() {

    }
}
