import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {

	//first number field
	private JTextField fNumber = new JTextField(5);
	//addition sign
	private JLabel additionSign = new JLabel(" + ");
	//send number field
	private JTextField sNumber = new JTextField(5);
	//equal sign
	private JButton calculateButton = new JButton(" = ");
	//output field
	private JTextField solution = new JTextField(7);
	
	
	
	
	public CalculatorView() {
		
		JPanel calculator = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 100);
		calculator.add(fNumber);
		calculator.add(additionSign);
		calculator.add(sNumber);
		calculator.add(calculateButton);
		calculator.add(solution);
		this.add(calculator);
	}
	
	//getters needed
	public int getFNumber() {
		return Integer.parseInt(fNumber.getText());
	}
	public int getSNumber() {
		return Integer.parseInt(sNumber.getText());
	}
	public int getSolution() {
		return Integer.parseInt(solution.getText());
	}
	
	//setters - only for the solution - use calc model
	public void setSolution(int newSolution) {
		solution.setText(Integer.toString(newSolution));
	}
	
	//create the listener
	void calculationListener(ActionListener listenerForCalculationButton) {
		calculateButton.addActionListener(listenerForCalculationButton);
	}
	void displayErrorMessage(String someMessage) {
		JOptionPane.showMessageDialog(this,  someMessage);
	}
	
}
