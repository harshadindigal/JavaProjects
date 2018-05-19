import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainButton extends JButton implements ActionListener {
	public ImageIcon X, O;
	public boolean isX;
	public JFrame parent;

	public MainButton(JFrame main) {
		X = new ImageIcon(this.getClass().getResource("X.png"));
		O = new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(this);
		this.parent = main;
	}

	public void actionPerformed(ActionEvent e) {
		this.parent.setVisible(false);
		TicTac9 name = new TicTac9();
		this.setEnabled(false);
	}

	public boolean isX() {
		return isX;
	}

	public void setX(boolean isX) {
		this.isX = isX;
	}

}