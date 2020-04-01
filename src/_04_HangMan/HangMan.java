package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HangMan implements KeyListener{
	public JFrame frame = new JFrame();
	public static Stack<String> words = new Stack<String>();
	public static JLabel label = new JLabel();
	public int lives = 500;
	
	public static ArrayList<Character> letters = new ArrayList<Character>();
	public static ArrayList<String> digits = new ArrayList<String>();
	
	public static void main(String [] args) {
		String ahh = JOptionPane.showInputDialog("Insert a number up to 266 and above 1");
		for(int i = 0; i < Integer.parseInt(ahh); i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			if(!words.contains(word)) {
				words.push(word);
			}
			else {
				i--;
			}
		}
		getWord();
		new HangMan().createUI();
	}
	
	public void createUI() {
		frame.addKeyListener(this);
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}

	@SuppressWarnings("static-access")
	@Override
	public void keyPressed(KeyEvent arg0) {
		boolean letterFound = false;
		for(int j = 0; j < letters.size(); j++) {
			if(arg0.getKeyChar() == letters.get(j)){
				digits.set(j, arg0.getKeyText(arg0.getKeyCode()));
				System.out.println(arg0.getKeyText(arg0.getKeyCode()));
				letterFound = true;

				label.setText(digits.toString());
			}
		}
		if(!letterFound) {
			lives--;
			System.out.println("Yowch");
		}
		if(letters.toString().equalsIgnoreCase(label.getText())) {
			System.out.println("You did it!");
			getWord();
			createUI();
		}
		if(lives == 0) {
			frame.removeAll();
			frame.setVisible(false);
			String again = JOptionPane.showInputDialog("You lost. Play again? Y or N");
			if(again.equalsIgnoreCase("Y")) {
				getWord();
				createUI();
			}
			else {
			 
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void getWord() {
		digits.clear();
		letters.clear();
		label.setText(null);
		for(int h = 0; h < words.lastElement().length(); h++) {
			digits.add("_ ");
			letters.add(words.lastElement().charAt(h));
		}
		label.setText(digits.toString());
		System.out.println(words.lastElement());
		words.pop();
		System.out.println(words.lastElement());
	}
}
