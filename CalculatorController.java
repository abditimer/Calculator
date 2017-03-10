import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//test
public class CalculatorController {
	//needs to link the view to the model
	private CalculatorModel model;
	private CalculatorView view;
	
	public CalculatorController( CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
		this.view.calculationListener(new CalculateListener());
	}
	
	//make another class
	class CalculateListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int fNumber, sNumber = 0;
			
			try {
				fNumber = view.getFNumber();
				sNumber = view.getSNumber();
				
				model.addition(fNumber, sNumber);
				view.setSolution(model.getOutput());
			} catch (NumberFormatException ex) {
				view.displayErrorMessage("some shit went wrong yo");
			}
		}
	}
}
