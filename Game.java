package GifGame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Spinner;


public class MainWindow {

	protected Shell shell;
	private Text text;
	private Label lblNewLabel;
	private Text text_2;
	private Slider slider;
	private Button btnSelect;
	private Button btnEndTurn;
	private Button btnUndo;
	private Slider slider_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(760, 816);
		shell.setText("SWT Application");
		
		slider = new Slider(shell, SWT.NONE);
		slider.setMaximum(50);
		slider.setBounds(190, 664, 380, 15);
		
		btnSelect = new Button(shell, SWT.NONE);
		btnSelect.setSelection(true);
		btnSelect.setBounds(318, 703, 123, 58);
		btnSelect.setText("Select");
		
		lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setImage(null);
		lblNewLabel.setBounds(10, 213, 740, 427);
		lblNewLabel.setText("New Label");
		
		text = new Text(shell, SWT.BORDER);
		text.setEditable(false);
		text.setBounds(10, 47, 740, 118);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setEditable(false);
		text_2.setBounds(318, 0, 105, 41);
		
		btnEndTurn = new Button(shell, SWT.NONE);
		btnEndTurn.setSelection(true);
		btnEndTurn.setBounds(655, 756, 95, 28);
		btnEndTurn.setText("Done");
		
		btnUndo = new Button(shell, SWT.NONE);
		btnUndo.setSelection(true);
		btnUndo.setBounds(217, 719, 95, 28);
		btnUndo.setText("Undo");
		
		slider_1 = new Slider(shell, SWT.NONE);
		slider_1.setMaximum(60);
		slider_1.setSelection(40);
		slider_1.setBounds(230, 171, 300, 28);

	}
	public Image getLblNewLabelImage() {
		return lblNewLabel.getImage();
	}
	public void setLblNewLabelImage(Image image) {
		lblNewLabel.setImage(image);
	}
	public String getTextText() {
		return text.getText();
	}
	public void setTextText(String text_1) {
		text.setText(text_1);
	}
	public String getText_2Text() {
		return text_2.getText();
	}
	public void setText_2Text(String text_3) {
		text_2.setText(text_3);
	}
	public int getSliderMaximum() {
		return slider.getMaximum();
	}
	public void setSliderMaximum(int maximum) {
		slider.setMaximum(maximum);
	}
	public String getBtnSelectText() {
		return btnSelect.getText();
	}
	public void setBtnSelectText(String text_4) {
		btnSelect.setText(text_4);
	}
	public String getShellText() {
		return shell.getText();
	}
	public void setShellText(String text_5) {
		shell.setText(text_5);
	}
	public String getLblNewLabelText() {
		return lblNewLabel.getText();
	}
	public void setLblNewLabelText(String text_6) {
		lblNewLabel.setText(text_6);
	}
	public boolean getBtnEndTurnSelection() {
		return btnEndTurn.getSelection();
	}
	public void setBtnEndTurnSelection(boolean selection) {
		btnEndTurn.setSelection(selection);
	}
	public boolean getBtnSelectSelection() {
		return btnSelect.getSelection();
	}
	public void setBtnSelectSelection(boolean selection_1) {
		btnSelect.setSelection(selection_1);
	}
	public boolean getBtnUndoSelection() {
		return btnUndo.getSelection();
	}
	public void setBtnUndoSelection(boolean selection_2) {
		btnUndo.setSelection(selection_2);
	}
	public boolean getSlider_1Enabled() {
		return slider_1.isEnabled();
	}
	public void setSlider_1Enabled(boolean enabled) {
		slider_1.setEnabled(enabled);
	}
	public int getSlider_1Maximum() {
		return slider_1.getMaximum();
	}
	public void setSlider_1Maximum(int maximum_1) {
		slider_1.setMaximum(maximum_1);
	}
	
	public int getSlider_1PageIncrement() {
		return slider_1.getPageIncrement();
	}
	public void setSlider_1PageIncrement(int pageIncrement) {
		slider_1.setPageIncrement(pageIncrement);
	}
	public int getSlider_1Selection() {
		return slider_1.getSelection();
	}
	public void setSlider_1Selection(int selection_3) {
		slider_1.setSelection(selection_3);
	}
	public int getSliderSelection() {
		return slider.getSelection();
	}
	public void setSliderSelection(int selection_4) {
		slider.setSelection(selection_4);
	}
	public int getSliderPageIncrement() {
		return slider.getPageIncrement();
	}
	public void setSliderPageIncrement(int pageIncrement_1) {
		slider.setPageIncrement(pageIncrement_1);
	}
}
