package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	Stack<String> words = new Stack<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	String word;
	char[] text;
	String labelText = "";
	int score = 0;
	Utilities uts = new Utilities();
	public static void main(String[] args) {
		new HangMan().run();
	}
	
	void run() {
		frame.add(panel);
		panel.add(label);
		panel.add(label2);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.pack();
		
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		for(int i = 0; i < uts.getTotalWordsInFile("dictionary.txt")-num; i++) {
			String newWord = uts.readRandomLineFromFile("dictionary.txt");
			words.push(newWord);
		}
		word = words.pop();
		score = word.length()*2;
		text = new char[word.length()];
		for(int i = 0; i < word.length(); i++) {
			text[i]='_';
		}
		
		for(int i = 0; i < text.length; i++) {
			labelText = labelText+" "+Character.toString(text[i]);
			label.setText(labelText);;
			
		}
		
		
		
		
		
		
		
	}
	
	void reset() {
		labelText="";
		int num=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		for(int i = 0; i < uts.getTotalWordsInFile("dictionary.txt")-num; i++) {
			String newWord = uts.readRandomLineFromFile("dictionary.txt");
			words.push(newWord);
		}
		word = words.pop();
		score = word.length()*2;
		label2.setText("Lives remaining: "+score);
		text = new char[word.length()];
		for(int i = 0; i < word.length(); i++) {
			text[i]='_';
		}
		
		for(int i = 0; i < text.length; i++) {
			labelText = labelText+" "+Character.toString(text[i]);
			label.setText(labelText);;
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		score--;
		// TODO Auto-generated method stub
		for(int i = 0; i < word.length();i++) {
			if(e.getKeyChar()==word.charAt(i)) {
				score++;
				
				labelText="";
				text[i] = e.getKeyChar();
				for(int j = 0; j < text.length; j++) {
					labelText = labelText+" "+Character.toString(text[j]);
					label.setText(labelText);;
					
				}
				label.setText(labelText);
			}
			
			label2.setText("Lives remaining: "+score);
		}
		if(score == 0) {
			JOptionPane.showMessageDialog(null, "Game Over! The word was:  "+word);
			reset();
		}
		int check = 0;
		for(int i = 0; i < labelText.length(); i++) {
			if(labelText.charAt(i)!='_') {
				check++;
			}
		}
		if(check == labelText.length()) {
			JOptionPane.showMessageDialog(null, "You won! The word was:  "+word);
			reset();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
