package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	
	float data=0f;
	int operation=-1;
	
	 @FXML
	    private Button one;

	    @FXML
	    private Button two;

	    @FXML
	    private Button four;

	    @FXML
	    private Button five;

	    @FXML
	    private Button three;

	    @FXML
	    private Button add;

	    @FXML
	    private Button ix;

	    @FXML
	    private Button sub;

	    @FXML
	    private Button eight;

	    @FXML
	    private Button zero;

	    @FXML
	    private Button seven;

	    @FXML
	    private Button equals;

	    @FXML
	    private Button nine;

	    @FXML
	    private Button clear;

	    @FXML
	    private Button mul;

	    @FXML
	    private Button div;

	    @FXML
	    private TextField display;

	    @FXML
	    void handleButtonAction(ActionEvent event) {
	    	if(event.getSource() == one) 
	    	{
	    		display.setText(display.getText() + "1");
	    	}else if(event.getSource() == two) 
	    	{
	    		display.setText(display.getText() + "2");
	    	}
	    	else if(event.getSource() == three) 
	    	{
	    		display.setText(display.getText() + "3");
	    	}else if(event.getSource() == four) 
	    	{
	    		display.setText(display.getText() + "4");
	    	}else if(event.getSource() == five) 
	    	{
	    		display.setText(display.getText() + "5");
	    	}else if(event.getSource() == ix) 
	    	{
	    		display.setText(display.getText() + "6");
	    	}else if(event.getSource() == seven) 
	    	{
	    		display.setText(display.getText() + "7");
	    	}else if(event.getSource() == eight) 
	    	{
	    		display.setText(display.getText() + "8");
	    	}else if(event.getSource() == nine) 
	    	{
	    		display.setText(display.getText() + "9");
	    	}else if(event.getSource() == zero) 
	    	{
	    		display.setText(display.getText() + "0");
	    	}
	    	else if(event.getSource() == clear) 
	    	{
	    		display.setText("");
	    	}
	    	else if(event.getSource() == add) 
	    	{
	    		data =Float.parseFloat(display.getText());
	    		operation=1;
	    		display.setText("");
	    		
	    	}
	    	else if(event.getSource() == sub) 
	    	{
	    		data =Float.parseFloat(display.getText());
	    		operation=2;
	    		display.setText("");
	    		
	    	}
	    	else if(event.getSource() == mul) 
	    	{
	    		data =Float.parseFloat(display.getText());
	    		operation=3;
	    		display.setText("");
	    		
	    	}
	    	else if(event.getSource() == div) 
	    	{
	    		data =Float.parseFloat(display.getText());
	    		operation=4;
	    		display.setText("");
	    		
	    	}
	    	else if(event.getSource() == equals) 
	    	{
	    		Float secondoperand = Float.parseFloat(display.getText());
	    		switch(operation)
	    		{
	    		case 1://add
	    			Float ans = data + secondoperand;
	    			display.setText(String.valueOf(ans));break;
	    		case 2://sub
	    			 ans = data - secondoperand;
	    			display.setText(String.valueOf(ans));break;
	    		case 3://mul
	    			 ans = data * secondoperand;
	    			display.setText(String.valueOf(ans));break;
	    		case 4://div
	    			ans= 0f;
	    			try {
	    			 ans = data / secondoperand;
	    			 display.setText(String.valueOf(ans));break;
	    			 }
	    			catch(Exception e)
	    			{
	    				display.setText("error");
	    			}
	    				
	    			
	    			
	    		}
	    		
	    	}

	    }


}
