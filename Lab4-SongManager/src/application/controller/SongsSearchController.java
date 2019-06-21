package application.controller;

import java.util.ArrayList;

import application.model.Record;
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
    	ArrayList<Record> records=recordLabel.findRecordsBySong(songTextFeild.getText());
    	consoleText.setText(""+records);
    }

    @FXML
    void searchTextButton(ActionEvent event) {
    	ArrayList<Record> records=recordLabel.findRecordsBySong(songTextFeild.getText());
    	consoleText.setText(""+records);
    }
    
    @FXML
    void initialize() {

    }
}
