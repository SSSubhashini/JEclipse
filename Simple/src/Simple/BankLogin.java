package Simple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankLogin {

	private JFrame frame;
	private JTextField tb;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankLogin window = new BankLogin();
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
	public BankLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tb1 = new JLabel("  BANKING PORTAL");
		tb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		tb1.setBounds(114, 30, 159, 14);
		frame.getContentPane().add(tb1);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(73, 71, 81, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(73, 128, 81, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb = new JTextField();
		tb.setBounds(195, 68, 86, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(200, 125, 81, 20);
		frame.getContentPane().add(p1);
		Home h2=new Home();
		
		JButton b1 = new JButton("LOGIN");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb.getText();
				String password=p1.getText();
				if(user.equals("Sony") && password.equals("5676"))
				{
					h2.setVisible(true);
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(b1,"Invalid User!!");
				}
					}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		b1.setBounds(150, 184, 89, 23);
		frame.getContentPane().add(b1);
	}
}
