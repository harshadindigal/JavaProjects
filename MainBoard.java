import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainBoard {

	private static JFrame quitter;
	private static JFrame wiper;
	private static JFrame mainGrid;
	
	private static JFrame tutor;//NEW
	
	public MainBoard(){
		this.quitter = new JFrame();
		this.wiper = new JFrame();
		this.mainGrid = new JFrame();
		
		this.tutor = new JFrame(); //NEW
	}
	
	public static void begin() {
		// creating instance of JFrame

		quitter.setSize(100, 100); // at least 500, 500
		quitter.setLayout(null);
		quitter.setVisible(true);

		quitter.getContentPane().setBackground(Color.blue.darker());

		// quit button
		JButton quit = new JButton("Quit");
		quit.setBounds(25, 15, 50, 50);
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitter.dispose(); // closes screen
				System.exit(0); // stops program
			}
		});
		quitter.add(quit);
	}
	
	public static void tutorial(){
		tutor.setSize(180,250);
		tutor.setLocation(10000, 350);
		//tutor.setLayout(null);
		tutor.setVisible(true);
		//tutor.getContentPane().setBackground(Color.blue.darker());
		tutor.getContentPane().setBackground(Color.blue.darker());
		JTextArea text = new JTextArea();
		//text.setSelectionColor(Color.orange);
		text.setText("Welcome to TicTac9! X plays first and players take turns. Go ahead and pick a tile to play a minigame in. Once the minigame is resolved, the winner of that minigame will claim the chosen tile on the main board. The player who claims three in a row on the main board wins! *a tie will result in a suprise... (X uses a and s, O uses k and l)");
		text.setBounds(0, 0, 200, 400);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		tutor.add(text);
		tutor.setVisible(true);
	}

		// wipe button
	public static void wipeButton(){
		wiper.setSize(100, 100);
		wiper.setLocation(10000, 0);
		wiper.setLayout(null);
		wiper.setVisible(true);
		
		wiper.getContentPane().setBackground(Color.blue.darker());
		
		JButton wipe = new JButton("Wipe");
		wipe.setBounds(25, 15, 50, 50);
		wiper.add(wipe);

	}
	
	public static JFrame getMainGrid() {
		return mainGrid;
	}

	public static void setMainGrid(JFrame mainGrid) {
		MainBoard.mainGrid = mainGrid;
	}

	public static void gridbuilder() {
		// Big Buttons

		mainGrid.setSize(800, 800);
		mainGrid.setLocationRelativeTo(null);
		mainGrid.setLayout(new GridLayout(3, 3));
		
		MainButton i = new MainButton(getMainGrid());
		MainButton ii = new MainButton(getMainGrid());
		MainButton iii = new MainButton(getMainGrid());
		MainButton iv = new MainButton(getMainGrid());
		MainButton v = new MainButton(getMainGrid());
		MainButton vi = new MainButton(getMainGrid());
		MainButton vii = new MainButton(getMainGrid());
		MainButton viii = new MainButton(getMainGrid());
		MainButton ix = new MainButton(getMainGrid());
		
		
		mainGrid.add(i);
		mainGrid.add(ii);
		mainGrid.add(iii);
		mainGrid.add(iv);
		mainGrid.add(v);
		mainGrid.add(vi);
		mainGrid.add(vii);
		mainGrid.add(viii);
		mainGrid.add(ix);
		
		mainGrid.setVisible(true);
	}
	
	public static void main(String[] args){
			// creating instance of JFrame
			MainBoard main = new MainBoard();
			begin();
			wipeButton();
			tutorial();
			gridbuilder();
	}
}
