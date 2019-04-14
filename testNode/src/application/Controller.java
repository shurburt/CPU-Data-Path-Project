package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.shape.Line;

public class Controller implements Initializable {
	@FXML private Line line11;	@FXML private Line line12;
	@FXML private Line line21;	@FXML private Line line22;
	@FXML private Line line31;
	@FXML private Line line41;
	@FXML private Line line51;
	@FXML private Line line61;	@FXML private Line line62;	@FXML private Line line63;
	@FXML private Line line64;	@FXML private Line line65;
	@FXML private Line line71;	@FXML private Line line72;	@FXML private Line line73;
	@FXML private Line line81;	@FXML private Line line82;	@FXML private Line line83;
	@FXML private Line line84;
	@FXML private Line line91;
	@FXML private Line line101;	@FXML private Line line102;	@FXML private Line line103;
	@FXML private Line line104;	@FXML private Line line105;

	@FXML
	private ToggleButton tb1;
	@FXML
	private ToggleButton tb2;

	private ToggleButton checkButton = null;



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		line11.setVisible(false);line12.setVisible(false);line21.setVisible(false);line22.setVisible(false);
		line31.setVisible(false);line41.setVisible(false);line51.setVisible(false);line61.setVisible(false);
		line62.setVisible(false);line63.setVisible(false);line64.setVisible(false);line65.setVisible(false);
		line71.setVisible(false);line72.setVisible(false);line73.setVisible(false);line81.setVisible(false);
		line82.setVisible(false);line83.setVisible(false);line84.setVisible(false);line91.setVisible(false);
		line101.setVisible(false);line102.setVisible(false);line103.setVisible(false);line104.setVisible(false);
		line105.setVisible(false);
	}


	public void handleNode(ActionEvent event){
		ToggleButton btn = (ToggleButton) event.getSource();
		if(checkButton == null){
			checkButton = btn;
		}
		else if(checkButton.getId().equals(btn.getId())){
			checkButton = null;
		}
		else if(( checkButton.getId().equals("tb1") || checkButton.getId().equals("tb2") ) &&
				( btn.getId().equals("tb1")) || btn.getId().equals("tb2") ){
			line11.setVisible(true);line12.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb1") || checkButton.getId().equals("tb3") ) &&
				( btn.getId().equals("tb1")) || btn.getId().equals("tb3") ){
			line21.setVisible(true);line22.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb1") || checkButton.getId().equals("tb5") ) &&
				( btn.getId().equals("tb1")) || btn.getId().equals("tb5") ){
			line31.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb6") || checkButton.getId().equals("tb7") ) &&
				( btn.getId().equals("tb6")) || btn.getId().equals("tb7") ){
			line41.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb8") || checkButton.getId().equals("tb9") ) &&
				( btn.getId().equals("tb8")) || btn.getId().equals("tb9") ){
			line51.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb8") || checkButton.getId().equals("tb11") ) &&
				( btn.getId().equals("tb8")) || btn.getId().equals("tb11") ){
			line61.setVisible(true);line62.setVisible(true);line63.setVisible(true);
			line64.setVisible(true);line65.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb12") || checkButton.getId().equals("tb13") ) &&
				( btn.getId().equals("tb12")) || btn.getId().equals("tb13") ){
			line71.setVisible(true);line72.setVisible(true);line73.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb12") || checkButton.getId().equals("tb16") ) &&
				( btn.getId().equals("tb12")) || btn.getId().equals("tb16") ){
			line81.setVisible(true);
			line82.setVisible(true);line83.setVisible(true);line84.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb14") || checkButton.getId().equals("tb15") ) &&
				( btn.getId().equals("tb14")) || btn.getId().equals("tb15") ){
			line91.setVisible(true);
			reset(btn,checkButton);
		}
		else if(( checkButton.getId().equals("tb17") || checkButton.getId().equals("tb18") ) &&
				( btn.getId().equals("tb17")) || btn.getId().equals("tb18") ){
			line101.setVisible(true);line102.setVisible(true);line103.setVisible(true);
			line104.setVisible(true);line105.setVisible(true);
			reset(btn,checkButton);
		}
	}
	/*
	public void setCheckId(String s){checkButton=s;}
	public String getCheckId(){return checkId;}
	*/
	private void reset(ToggleButton btn,ToggleButton checkButton){
		btn.setSelected(false);
		checkButton.setSelected(false);
		checkButton =null;
		btn =null;
	}
}
