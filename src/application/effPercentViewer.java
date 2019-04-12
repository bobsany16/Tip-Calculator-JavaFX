package application;

import javax.swing.JTextField;

import javafx.scene.control.TextField;

/**
 * This class acts as a viewer for Effective Percentage Amount for the
 * Controller
 * 
 * @author Bobby Nguyen
 * @version April 12th 2019
 */
public class effPercentViewer implements ModelObserver {
	private TextField effPercentOutField;

	/**
	 * Initializes effPercentOutField
	 * 
	 * @param effPercentTextField JTextField for output of effective percentage
	 *                            amount
	 */
	public effPercentViewer(TextField effPercentTextField) {
		effPercentOutField = effPercentTextField;
	}

	/**
	 * Method to update the textfield once there are changes in the model
	 * 
	 * @param TipModel h a tipmodel
	 */
	@Override
	public void update(TipModel h) {
		double c = h.getEffectiveTipPercentage();
		effPercentOutField.setText(h.formatNumber(c, 2) + "%");

	}

}
