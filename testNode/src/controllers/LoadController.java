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
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LoadController implements Initializable {
	@FXML Line line11;@FXML Line line12;@FXML Line line21;@FXML Line line22;@FXML Line line31;@FXML Line line41;
	@FXML Line line51;@FXML Line line52;@FXML Line line61;@FXML Line line71;@FXML Line line81;@FXML Line line91;
	@FXML Line line92;@FXML Line line93;@FXML Line line94;@FXML Line line95;@FXML Line line101;@FXML Line line111;
	@FXML Line line112;@FXML Line line121;@FXML Line line122;@FXML Line line123;@FXML Line line124;@FXML Line line131;
	@FXML Line line141;@FXML Line line142;@FXML Line line143;@FXML Line line144;@FXML Line line145;@FXML Line line151;
	@FXML Line line152;@FXML Line line161;@FXML Line line171;@FXML Line line172;@FXML Line line173;@FXML Line line174;
	@FXML Line line175;
	int instCount = 12;
	@FXML Label feedback;
	@FXML Label InstCount;
	@FXML Button previous;
	@FXML Button next;
	Circle checkButton = null;
	Circle btn =null;
	Boolean canChange = false;
	Boolean changed =false;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		setInstCount();
	}

	public void mouseEntered(MouseEvent event){
		System.out.print("Mouse Enter");
		canChange = true;
	}
	public void mouseExit(MouseEvent event){
		System.out.print("Mouse exit");
		canChange =false;
	}
	public void mouseReleased(MouseEvent event){
		Circle cir = (Circle)event.getSource();
		if(canChange && !changed && cir.getFill().equals((Color.GREEN))){
			changed =true;
			cir.setFill(Color.RED);
		}
		if(canChange && !changed && cir.getFill().equals((Color.RED))){
			changed =true;
			cir.setFill(Color.GREEN);
		}
	}
	public void mouseClicked(MouseEvent event){
		btn = (Circle) event.getSource();

		if(checkButton != null){
			System.out.println("Check Button: " + checkButton.getId());
		}

		System.out.println("Pressed Button: " + btn.getId());

		if(checkButton == null){
			checkButton = btn;
			changed=false;
		}
		else if(checkButton.getId().equals(btn.getId())){
			checkButton = null;
			changed=false;
		}
		else if(checkButton !=null && !checkButton.getId().equals(btn.getId())){
			setLines();
		}
	}
	public void setLines(){
		if( (checkButton.getId().equals("tb1") && btn.getId().equals("tb2")) ||
				( btn.getId().equals("tb1")) && checkButton.getId().equals("tb2")) {

			line11.setVisible(true);line12.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else if(( checkButton.getId().equals("tb1") && btn.getId().equals("tb3") ) ||
				( btn.getId().equals("tb1")) && checkButton.getId().equals("tb3") ){

			line21.setVisible(true);line22.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		//Mux
		else if(( checkButton.getId().equals("tb1") && btn.getId().equals("tb4")  ) ||
				( btn.getId().equals("tb1")) && checkButton.getId().equals("tb4")){

			line31.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else if(( checkButton.getId().equals("tb1") && btn.getId().equals("tb6") ) ||
				( btn.getId().equals("tb1")) && checkButton.getId().equals("tb6") ){

			line51.setVisible(true);line52.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else if(( checkButton.getId().equals("tb7") && btn.getId().equals("tb8")) ||
				( btn.getId().equals("tb7")) && checkButton.getId().equals("tb8")  ){

			line61.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		//mux
		else if(( checkButton.getId().equals("tb11") && btn.getId().equals("tb26")  ) ||
				( btn.getId().equals("tb11")) && checkButton.getId().equals("tb26")){

			line81.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else if(( checkButton.getId().equals("tb9") && btn.getId().equals("tb12")  ) ||
				( btn.getId().equals("tb9")) && checkButton.getId().equals("tb12")){
			line91.setVisible(true);line92.setVisible(true);line93.setVisible(true);
			line94.setVisible(true);line95.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else if(( checkButton.getId().equals("tb13") && btn.getId().equals("tb14")  ) ||
				( btn.getId().equals("tb13")) && checkButton.getId().equals("tb14")){
			line101.setVisible(true);line111.setVisible(true);line112.setVisible(true);

			btn.setFill(Color.GREEN);changed=false;

			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		//mux
		else if(( checkButton.getId().equals("tb16") && btn.getId().equals("tb17")) ||
				( btn.getId().equals("tb16")) && checkButton.getId().equals("tb17")  ){

			line131.setVisible(true);

			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else if(( checkButton.getId().equals("tb18") && btn.getId().equals("tb19")) ||
				( btn.getId().equals("tb18")) && checkButton.getId().equals("tb19")  ){

			line141.setVisible(true);line142.setVisible(true);line143.setVisible(true);
			line144.setVisible(true);line145.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		//mux
		else if(( checkButton.getId().equals("tb11") && btn.getId().equals("tb26")) ||
				( btn.getId().equals("tb11")) && checkButton.getId().equals("tb26")  ){

			line81.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else if(( checkButton.getId().equals("tb24") && btn.getId().equals("tb25")) ||
				( btn.getId().equals("tb24")) && checkButton.getId().equals("tb25")  ){

			line171.setVisible(true);line172.setVisible(true);line173.setVisible(true);
			line174.setVisible(true);line175.setVisible(true);
			btn.setFill(Color.GREEN);
			checkButton.setFill(Color.GREEN);
			checkButton=null;btn=null;changed=false;
			changeFeedback(true);changeInstCount();
		}
		else{
			btn.setFill(Color.GREEN);checkButton.setFill(Color.GREEN);
			checkButton=null;changed=false;btn=null;
		}
	}
	private void changeFeedback(Boolean b){
		if(b){
			feedback.setText("Correct");
			feedback.setTextFill(Color.GREEN);
		}
		else{
			feedback.setText("In Correct");
			feedback.setTextFill(Color.RED);
		}
	}
	private void changeInstCount(){
		InstCount.setText(String.valueOf(instCount--) + "\nInstructions Left\n");
	}
	private void setInstCount(){
		InstCount.setText(String.valueOf(instCount) + "\nInstructions Left\n");
	}
	public void handleNext(ActionEvent t) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Store_instruction.fxml"));
		Stage stage = (Stage) next.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void handlePrev(ActionEvent t) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/ALU_instruction.fxml"));
		Stage stage = (Stage) next.getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
