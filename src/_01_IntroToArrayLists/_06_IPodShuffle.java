package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JButton button = new JButton();
	public static ArrayList<Song> songs = new ArrayList<Song>();
	public int spiciest;
	public static void main(String[] args) {
		_06_IPodShuffle shuffle = new _06_IPodShuffle();
		Song demo = new Song("demo.mp3");
		Song thingy = new Song("/Users/thoma/Downloads/Wolves.mp3");
		songs.add(demo);
		songs.add(thingy);
		new _06_IPodShuffle().createUI();
	}
	
	public void createUI() {
		frame.add(panel);
		panel.add(button);
		button.setText("Surprise me");
		button.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		songs.get(spiciest).stop();
		Random randy = new Random();
		int spicy = randy.nextInt(2);
		spiciest = spicy;
		System.out.println(spicy);
		songs.get(spicy).play();
	}
}