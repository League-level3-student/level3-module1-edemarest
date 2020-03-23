package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Add");
	JButton b2 = new JButton("Search");
	JButton b3 = new JButton("Print All");
	JButton b4 = new JButton("Remove");
	public static void main(String[] args) {
		new _02_LogSearch().run();
		
	}
	void run(){
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number:" ));
			String name = JOptionPane.showInputDialog("Enter a name:" );
			map.put(ID,  name);
		}
		if(e.getSource()==b2) {
			int search = Integer.parseInt(JOptionPane.showInputDialog("Search for an ID number: "));
			if(map.containsKey(search)) {
				System.out.println("The user with this ID is:  "+map.get(search));
			}
			else {
				System.out.println("A user with that ID does not exist.");
			}	
		} 
		if(e.getSource()==b3) {
			for(int key: map.keySet()) {
				
				System.out.println("ID: "+key+"  Name: "+map.get(key));
			}
		}
		if(e.getSource()==b4) {
			int delete = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number:" ));
			if(map.containsKey(delete)) {
				map.remove(delete);
			}
			else {
				System.out.println("This ID does not exist.");
			}
		}
		
		
		
	}
	
  /* 
	 * Create a HashMap of Integers for the keys and Strings for the values.
	  
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
	
}
