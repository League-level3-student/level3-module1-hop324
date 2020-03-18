package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	public ArrayList<String> list = new ArrayList<String>();
	
	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JButton button1 = new JButton();
	
	public JButton button2 = new JButton();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String [] args) {
		new _02_GuestBook().createUI();
	}
	
	public void createUI() {
		button1.setText("Add Name");
		button1.addActionListener(this);
		button2.setText("View Names");
		button2.addActionListener(this);
		panel.add(button1); panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			String newName = JOptionPane.showInputDialog("Input the name you'd like to add!");
			list.add(newName);
		}
		else if(e.getSource() == button2) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println("Guest #"+ (i+1) + " " + list.get(i));
			}
		}
		
	}
	
	
}
