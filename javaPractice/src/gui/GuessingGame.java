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
	private JTextField textField;
	public GuessingGame() {
		getContentPane().setFont(new Font("Dialog", Font.BOLD, 15));
		getContentPane().setLayout(null);
		
		JLabel lblPatsHiloGame = new JLabel("Pat's HiLo game!");
		lblPatsHiloGame.setBounds(0, 0, 450, 18);
		lblPatsHiloGame.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPatsHiloGame.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblPatsHiloGame);
		
		textField = new JTextField();
		textField.setBounds(358, 115, 66, 33);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterANumber = new JLabel("Enter a number between 0 and 100:");
		lblEnterANumber.setBounds(82, 106, 286, 51);
		lblEnterANumber.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblEnterANumber);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(158, 187, 139, 25);
		getContentPane().add(btnSubmit);
		
		JLabel lblMakeAGuess = new JLabel("Make a guess and press submit!");
		lblMakeAGuess.setHorizontalAlignment(SwingConstants.CENTER);
		lblMakeAGuess.setBounds(101, 236, 247, 15);
		getContentPane().add(lblMakeAGuess);
	}

	public static void main(String[] args) {

		GuessingGame theGame = new GuessingGame();
		
		theGame.setSize(new Dimension(550,300));
		theGame.setVisible(true);
		
	}
}