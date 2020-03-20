package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
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
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String text = "";
	Stack<Character> undos = new Stack<Character>();
	
	public static void main(String[] args) {
		new _02_TextUndoRedo().run();
		
	}
	
	void run() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			undos.push(text.charAt(text.length()-1));
			text = text.substring(0, text.length() - 1);
			label.setText(text);
			System.out.println("delete");
		}
		else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			text = text + undos.pop();
			label.setText(text);
		}
		else {
		text = text + e.getKeyChar();
		label.setText(text);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
