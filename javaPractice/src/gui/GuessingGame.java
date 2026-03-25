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
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	
	public void checkGuess() {
		String guessTxt = txtGuess.getText();
		String message = "";
		
		try {
			int guess = Integer.parseInt(guessTxt);
			
			if (guess < theNumber)
				message = guess + " is too low. Please try again!";
			else if (guess > theNumber)
				message = guess + " is too high. Please try again!";
			else {
				message = guess + "is correct. Thank you! Let's play again!";
				newGame();
			}
		} catch (Exception e) {
			message = "Please enter an integer number between 0 and 100.";
		} finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
		
	}
	
	public void newGame() {
		theNumber = (int) (Math.random() * 100 + 1);
	}
	
	public GuessingGame() {
		getContentPane().setFont(new Font("Dialog", Font.BOLD, 15));
		getContentPane().setLayout(null);
		
		JLabel lblPatsHiloGame = new JLabel("Pat's HiLo game!");
		lblPatsHiloGame.setBounds(0, 0, 450, 18);
		lblPatsHiloGame.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPatsHiloGame.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblPatsHiloGame);
		
		txtGuess = new JTextField();
		txtGuess.setBounds(358, 115, 66, 33);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		txtGuess.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				checkGuess();
			}
		});
		
		JLabel lblEnterANumber = new JLabel("Enter a number between 0 and 100:");
		lblEnterANumber.setBounds(82, 106, 286, 51);
		lblEnterANumber.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblEnterANumber);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(155, 187, 139, 25);
		getContentPane().add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				checkGuess();
			}
		});
		
		lblOutput = new JLabel("Make a guess and press submit!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(82, 236, 286, 15);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {

		GuessingGame theGame = new GuessingGame();
		
		theGame.newGame();
		theGame.setSize(new Dimension(550,300));
		theGame.setVisible(true);		
		
	}
}