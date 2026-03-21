package gui;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;


public class GuessingGame extends JFrame {
	public GuessingGame() {
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(rdbtnYes, BorderLayout.NORTH);
		
		JTextArea txtrWhatIsGoing = new JTextArea();
		txtrWhatIsGoing.setTabSize(2);
		txtrWhatIsGoing.setText("The HiLo guessing game!");
		getContentPane().add(txtrWhatIsGoing, BorderLayout.CENTER);
		
		JProgressBar progressBar = new JProgressBar();
		getContentPane().add(progressBar, BorderLayout.SOUTH);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("No");
		getContentPane().add(rdbtnNewRadioButton, BorderLayout.EAST);
	}

	public static void main(String[] args) {

		GuessingGame theGame = new GuessingGame();
		
		theGame.setSize(new Dimension(550,300));
		theGame.setVisible(true);
		
	}

}