package Simple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metro window = new Metro();
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
	public Metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Metro Ticket Booking");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(119, 29, 194, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 128, 128));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(150, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(206, 63, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(new Color(255, 128, 128));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(150, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Alwal", "Kukatpally", "Manikonda", "Miyapur"}));
		cb1.setBounds(206, 103, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("Destinstion");
		lblNewLabel_3.setForeground(new Color(255, 128, 128));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(125, 148, 71, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Alwal", "Kukatpally", "Manikonda", "Miyapur"}));
		cb2.setBounds(206, 145, 86, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("No of Tickets");
		lblNewLabel_4.setForeground(new Color(255, 128, 128));
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(110, 181, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8"}));
		cb3.setBounds(206, 178, 86, 22);
		frame.getContentPane().add(cb3);
		
		JButton b1 = new JButton("Confirm & Pay");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
			    String source=(String) cb1.getSelectedItem();
			    String dest=(String) cb2.getSelectedItem();	
			    String tkcs=(String) cb3.getSelectedItem();
			    int nt=Integer.parseInt(tkcs);
			    int amount=90*nt;
			    int res=0;
			    if(source.equals(dest))
			    {
			    	JOptionPane.showMessageDialog(b1, "Please Check Stations!!");
			    }
			    else {
			    res=JOptionPane.showConfirmDialog(b1, "Hello!!   "+ name+"\nYour Source is "+source+
			    		"\nYour Destination is "+dest+"\nNo of Tickets "+tkcs+"\nAmount is "+amount);
			    }
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
		b1.setForeground(new Color(0, 64, 128));
		b1.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		b1.setBounds(160, 213, 132, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Desktop\\me3.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
