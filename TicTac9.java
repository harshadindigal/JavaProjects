import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTac9 extends JFrame {
	
	/**TO DO:
	 * 1) move from main screen to little screens, visa versa
	 * 2) end little screens, present win/tie on main screen
	 * 3) win/lose and tie states
	 * 4) end-game screen displaying winner
	 * 5) fill wipe button with meaning
	 * 6) extra credit
	 * 7) play test 
	 * */

	private static JFrame grid;
	public static boolean isX;
	private static ArrayList<Integer> xs = new ArrayList<Integer>();
	private static ArrayList<Integer> os = new ArrayList<Integer>();

	public TicTac9() {
		this.grid = new JFrame();
		grid.setSize(800, 800);
		grid.setLocationRelativeTo(null);
		gridbuilder();

		//this.add(this.grid);	
		grid.setVisible(true);
	}
	
	public static void addMove(int buttonId) {
		if( isX ){
			xs.add(buttonId);
			checkWin(xs);
		} else {
			os.add(buttonId);
			checkWin(os);
		}
	}
	
	public static void checkWin(ArrayList<Integer> moves) {
		boolean result = 
				(moves.contains(0) && moves.contains(1) && moves.contains(2)) ||
				(moves.contains(0) && moves.contains(4) && moves.contains(8)) ||
				(moves.contains(0) && moves.contains(3) && moves.contains(6)) ||
				(moves.contains(3) && moves.contains(4) && moves.contains(5)) ||
				(moves.contains(6) && moves.contains(4) && moves.contains(2)) ||
				(moves.contains(6) && moves.contains(7) && moves.contains(8)) ||
				(moves.contains(1) && moves.contains(4) && moves.contains(7)) ||
				(moves.contains(2) && moves.contains(5) && moves.contains(8));
		if(result) {
			gameOver();
		}
	}
	
	public static void gameOver(){
	
	}

	public static void gridbuilder() {
		// tiny
		grid.setLayout(new GridLayout(3, 3));
		
		XOButton i = new XOButton();
		XOButton ii = new XOButton();
		XOButton iii = new XOButton();
		XOButton iv = new XOButton();
		XOButton v = new XOButton();
		XOButton vi = new XOButton();
		XOButton vii = new XOButton();
		XOButton viii = new XOButton();
		XOButton ix = new XOButton();
		
		
		grid.add(i);
		grid.add(ii);
		grid.add(iii);
		grid.add(iv);
		grid.add(v);
		grid.add(vi);
		grid.add(vii);
		grid.add(viii);
		grid.add(ix);
	}

	/**
	 * draw big lines while(f.isShowing()){ Graphics gir = f.getGraphics();
	 * gir.drawLine(400, 400, 100, 100); }
	 **/

	// possible options
	/**
	 * XOButton class -> press, icon or text JRadioButton class ->dropdown option
	 * box button Use button groups for layering? JTextArea class -> plain text
	 * only JComboBox class -> dropdown box only one at a time JTable class ->
	 * used to display data as a table JColorChooser class -> used to select
	 * color (for players?) JProgressBar class -> creates progress bar JSlider
	 * class -> select option along a range
	 * **/
	/*
	 * displaying graphics in swing: public abstract void drawLine(int x1, int
	 * y1, int x2, int y2) public abstract boolean drawImage(Image img, int x,
	 * int y, ImageObserver observer) pubilc abstract void setColor(Color c) for
	 * players draw and then fill for shapes
	 */

}

