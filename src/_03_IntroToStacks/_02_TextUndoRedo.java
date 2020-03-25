package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener{
	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JLabel label = new JLabel();
	public Stack<Character> deleted = new Stack<Character>();
	public ArrayList<Character> text = new ArrayList<Character>();
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	public static void main(String [] args) {
		new _02_TextUndoRedo().createUI();
	}
	
	public void createUI() {
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == 8 && text.size() > 0) {
			deleted.push(text.get(text.size()-1));
			System.out.println(text.get(text.size()-1));
			System.out.println(deleted.toString());
			ArrayList<Character> filler = new ArrayList<Character>();
			for(int i = 0; i < text.size()-2; i++) {
				filler.add(text.get(i));
			}
			text = filler;
			label.setText(text.toString());
		}
		else if(arg0.getKeyCode() == 27) {
			text.add(deleted.get(0));
			deleted.pop();
			label.setText(text.toString());
		}
		else if(arg0.getKeyCode() >= 65 && arg0.getKeyChar() <= 90){
			text.add(arg0.getKeyChar());
			label.setText(text.toString());
		}
		else if(arg0.getKeyChar() >= 48 && arg0.getKeyChar() <= 57) {
			text.add(arg0.getKeyChar());
			label.setText(text.toString());
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
	
	
}
