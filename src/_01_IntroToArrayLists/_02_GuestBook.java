package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton b1 = new JButton("Add name");
	static JButton b2 = new JButton("View names");
	static ArrayList<String> list = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		_02_GuestBook book = new _02_GuestBook();
		book.addElements();
	}
	
	void addElements() {
		frame.add(panel);
		panel.add(b2);
		panel.add(b1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			String name = JOptionPane.showInputDialog("Enter a name: ");
			list.add(name);
		}
		if(e.getSource() == b2) {
			String guests = "";
			for(int i = 0; i < list.size(); i++) {
				guests = guests + "Guest #"+(i+1)+": "+list.get(i)+"\n";
			
			}
			JOptionPane.showMessageDialog(null, guests);
		}
	}
	

	
	
	
	
	
	
}
