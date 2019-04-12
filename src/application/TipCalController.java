package application;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Main class to get data from text fields from UI to Model then display it out.
 * 
 * @author Bobby Nguyen
 * @version April 12th 2019
 *
 */
public class TipCalController {

	@FXML
	private Button calButton;

	@FXML
	private TextField billAmtTextField;

	@FXML
	private TextField percent2TipTextField;

	@FXML
	private TextField roundTextField;

	@FXML
	private TextField outPutTipTextField;

	@FXML
	private TextField effPercentTextField;

	private TipModel calModel;

	private List<ModelObserver> observers = new ArrayList<ModelObserver>();

	public TipCalController() {
	}

	public void initialize() {
		calModel = new TipModel();

		tipRoundedViewer tipOutView = new tipRoundedViewer(outPutTipTextField);
		effPercentViewer actualTipView = new effPercentViewer(effPercentTextField);

		calModel.addObserver(tipOutView);
		calModel.addObserver(actualTipView);

	}

	/**
	 * Method to retrieve total bill data from text field and send to model
	 */
	public void handleBillAmount() {
		calModel.setTotalBill(Double.parseDouble(billAmtTextField.getText()));

	}

	/**
	 * Method to retrieve percentage data from text field and send to model
	 */
	public void handlePercent() {
		calModel.setTipPercent(Double.parseDouble(percent2TipTextField.getText()));

	}

	/**
	 * Method to retrieve quatum data from text field and send to model
	 */
	public void handleRound() {
		calModel.setTipQuantum(Double.parseDouble(roundTextField.getText()));

	}

	/**
	 * When calculate button is clicked, it displays out to the text fields the tip
	 * amount
	 */
	public void calculate() {
		calModel.setTotalBill(Double.parseDouble(billAmtTextField.getText()));
		calModel.setTipPercent(Double.parseDouble(percent2TipTextField.getText()));
		calModel.setTipQuantum(Double.parseDouble(roundTextField.getText()));

	}

}
