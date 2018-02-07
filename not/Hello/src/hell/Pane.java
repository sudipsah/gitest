package hell;

import java.awt.Color;

import javax.swing.*;
public class Pane{
	public static void main(String []args) {
	JFrame frame = new JFrame("PANEL");
	frame.setSize(300,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel  = new JPanel();
	frame.add(panel);
	placeComponents(panel);
	frame.setVisible(true);
	
	}
	public static void placeComponents(JPanel panel) {
		panel.setLayout(null);
		panel.setBackground(Color.red);
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10,20,40,60);
		panel.add(userLabel);
		JTextField userText = new JTextField(20);
		userText.setBounds(100,	20, 150, 25);
		panel.add(userText);
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		JPasswordField password = new JPasswordField(20);
		password.setBounds(100, 50, 165, 25);
		panel.add(password);
		JButton login = new JButton("login");
		login.setBounds(10, 80, 80, 25);
		panel.add(login);
		
	}
}