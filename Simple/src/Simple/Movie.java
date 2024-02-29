package Simple;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Movie {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Movie window = new Movie();
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
	public Movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE APP");
		lblNewLabel.setBackground(new Color(255, 255, 128));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(151, 26, 129, 27);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(120, 66, 46, 14);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(176, 64, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Select Movie");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(79, 98, 76, 14);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Tickets");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(59, 131, 107, 14);
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setToolTipText("select movie name");
		cb1.setBounds(176, 95, 86, 22);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Pushpa 2", "Salaar", "Guntur Karam", "RRR"}));
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBounds(176, 128, 72, 22);
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("Confirm & Pay");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
			    String select=(String) cb1.getSelectedItem();
			    String tkcs=(String) cb2.getSelectedItem();	
			    int nt=Integer.parseInt(tkcs);
			    int bill=150*nt;
			    int res=0;
			    res=JOptionPane.showConfirmDialog(b1, "Hello!!   "+ name+"\n Your Movie is "+select+"\nNo of tickets "+tkcs+"\n Your Bill is "+bill);
			    if(res==JOptionPane.YES_OPTION)
			    {
			    			JOptionPane.showMessageDialog(b1, "Booking Confirmed");
			    			tb1.setText("");
			    			cb1.setSelectedItem("");
			    }
			    else {
			    	JOptionPane.showMessageDialog(b1, "Booking Cancelled");
			    }
			}
		});
		b1.setBounds(125, 190, 116, 23);
		b1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 11));
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Desktop\\movie.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
