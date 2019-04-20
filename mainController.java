package application;





import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class mainController 
{
	@FXML
	private Label result;
	private long number1=0;
	private String operator = "";
	private boolean start = true;
	modal model=new modal();
	@FXML
	public void processNum(ActionEvent event) 
	{
		if(start)
		{
			result.setText("");
			start = false;
			
		}
		String value =((Button)event.getSource()).getText();
		result.setText(result.getText()+ value);
			
		}
	@FXML
	public void processOperator(ActionEvent event)
	{
		String value =((Button)event.getSource()).getText();
		if(value.equals("ex"))
		{
			System.exit(0);
		}
		
		if (!value.equals("="))
		{
			if (!operator.isEmpty())
				return;
			operator = value;
			number1=Long.parseLong(result.getText());
			result.setText("");
		}
		else
		{
			if(operator.isEmpty())
				return;
			long number2=Long.parseLong(result.getText());
			float output=model.calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator = "";
			start= true;
			number1=0;
			number2=0;
			
		}
		
	}
}
