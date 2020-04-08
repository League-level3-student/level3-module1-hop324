package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JButton button1 = new JButton();
	public JButton button2 = new JButton();
	public JButton button3 = new JButton();
	public JButton button4 = new JButton();
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> boi = new HashMap<Integer, String>();
	public int highestID = 0;
	
	public static void main(String [] args) {
		new _02_LogSearch().createUI();
	}
	
	public void createUI() {
		panel.add(button1); panel.add(button2); panel.add(button3); panel.add(button4);
		frame.add(panel);
		button1.addActionListener(this);
		button1.setText("Add Entry");
		button2.addActionListener(this);
		button2.setText("Search by ID");
		button3.addActionListener(this);
		button3.setText("View List");
		button4.addActionListener(this);
		button4.setText("Remove Entry:");
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			String id = JOptionPane.showInputDialog("Please register an ID number");
			String name = JOptionPane.showInputDialog("Please register a name to accompany the given ID");
			if(highestID < Integer.parseInt(id)) {
				highestID = Integer.parseInt(id);
			}
			boi.put(Integer.parseInt(id), name);
		}
		if(e.getSource() == button2) {
			String idsearch = JOptionPane.showInputDialog("Please enter an ID to search for");
			System.out.println(boi.get(Integer.parseInt(idsearch)));
		}
		if(e.getSource() == button3) {
			for(int i = 0; i < highestID+1; i++) {
				if(boi.containsKey(i)) {
					System.out.println("ID: " + i + " Name: " + boi.get(i));
				}
			}
		}
		if(e.getSource() == button4) {
			String idsearch = JOptionPane.showInputDialog("Please enter an ID to remove");
			if(boi.containsKey(Integer.parseInt(idsearch))) {
				boi.remove(Integer.parseInt(idsearch));
				System.out.println("Successfully removed the given ID");
			}
			else {
				System.out.println("Sorry, this is not a valid ID");
			}
		}
		
	}
}
