import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class XOButton extends JButton implements ActionListener {
	ImageIcon X, O;
	boolean isX;


	public XOButton() {
		X = new ImageIcon(this.getClass().getResource("X.png"));
		O = new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (TicTac9.isX) {
			setIcon(X);
		} else {
			setIcon(O);
		}
		TicTac9.isX = !TicTac9.isX;
		this.setEnabled(false);
	}

	public boolean isX() {
		return isX;
	}

	public void setX(boolean isX) {
		this.isX = isX;
	}

}