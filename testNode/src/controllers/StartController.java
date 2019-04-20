package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartController implements Initializable{
	@FXML Button start;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	public void handleStart(ActionEvent t) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/ALU_instruction.fxml"));
		Stage stage = (Stage) start.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
