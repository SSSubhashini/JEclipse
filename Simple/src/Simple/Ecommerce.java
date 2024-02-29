package Simple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecommerce {

	private JFrame frame;
	int items=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecommerce window = new Ecommerce();
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
	public Ecommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  E-Commerce APP");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel.setBounds(116, 11, 162, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("CART:0");
		l1.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 13));
		l1.setBounds(348, 32, 57, 14);
		frame.getContentPane().add(l1);
		
		JLabel lblNewLabel_4 = new JLabel("Rs.300");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(78, 236, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs.650");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(247, 236, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				items=items+1;
				bill=bill+650;
				l1.setText("CART :"+items);
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Desktop\\b3.jpg"));
		b2.setBounds(199, 54, 122, 171);
		frame.getContentPane().add(b2);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+300;
				l1.setText("CART :"+items);
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Desktop\\b6.jpg"));
		b1.setBounds(38, 54, 111, 171);
		frame.getContentPane().add(b1);
		
		
		JButton b3 = new JButton("BUY");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				JOptionPane.showMessageDialog(b3, "No of items: "+items+"\nYour Amount is : "+bill);
				
				
			}
		});
		b3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		b3.setBounds(361, 227, 63, 23);
		frame.getContentPane().add(b3);
	}

}
