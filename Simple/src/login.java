import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 64));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setBounds(135, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(64, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(65, 93, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(64, 0, 0));
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNewLabel_2.setBounds(65, 135, 78, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBackground(new Color(192, 192, 192));
		tb1.setBounds(153, 90, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBackground(new Color(192, 192, 192));
		p1.setBounds(153, 132, 86, 20);
		frame.getContentPane().add(p1);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String password=p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton, "Hello..!! "+user+"\n "+ "password is "+password);
				if(user.equals("Sony") && password.equals("5676")) {
					JOptionPane.showMessageDialog(btnNewButton, "Valid user");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid user");
				}
			}
		});
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setForeground(new Color(0, 0, 160));
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnNewButton.setBounds(121, 186, 86, 20);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
