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
		
		JRadioButton rdbtnYes = new JRadioButton("yes");
		rdbtnYes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(rdbtnYes, BorderLayout.NORTH);
		
		JTextArea txtrWhatIsGoing = new JTextArea();
		txtrWhatIsGoing.setText("What is going on??");
		getContentPane().add(txtrWhatIsGoing, BorderLayout.CENTER);
		
		JLabel lblDingDing = new JLabel("ding ding");
		lblDingDing.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblDingDing, BorderLayout.WEST);
		
		JProgressBar progressBar = new JProgressBar();
		getContentPane().add(progressBar, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {

		GuessingGame theGame = new GuessingGame();
		
		theGame.setSize(new Dimension(550,300));
		theGame.setVisible(true);
		
	}

}