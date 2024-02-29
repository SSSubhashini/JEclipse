package Simple;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
public class registration {

	private JFrame frame;
	private JTextField tb2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
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
		
		JLabel tb = new JLabel("REGISTRATION");
		tb.setFont(new Font("Sylfaen", Font.BOLD, 15));
		tb.setForeground(new Color(0, 0, 0));
		tb.setBounds(164, 24, 114, 24);
		frame.getContentPane().add(tb);
		
		JLabel tb1 = new JLabel("Username");
		tb1.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		tb1.setBounds(123, 68, 81, 14);
		frame.getContentPane().add(tb1);
		
		tb2 = new JTextField();
		tb2.setBounds(214, 65, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel p1 = new JLabel("Password");
		p1.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		p1.setBounds(123, 93, 81, 14);
		frame.getContentPane().add(p1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(214, 90, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel cb1 = new JLabel("Branch");
		cb1.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		cb1.setBounds(123, 118, 46, 14);
		frame.getContentPane().add(cb1);
		
		JComboBox cb11 = new JComboBox();
		cb11.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		cb11.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "IT", "EEE", "AIML"}));
		cb11.setBounds(214, 114, 86, 22);
		frame.getContentPane().add(cb11);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(123, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		r1.setBounds(210, 143, 54, 20);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		r2.setBounds(270, 143, 81, 20);
		frame.getContentPane().add(r2);
		
		JLabel cb2 = new JLabel("City");
		cb2.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		cb2.setBounds(123, 168, 46, 14);
		frame.getContentPane().add(cb2);
		
		JComboBox cb12 = new JComboBox();
		cb12.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		cb12.setModel(new DefaultComboBoxModel(new String[] {"Hyderbad", "Guntur", "Vijayawada", "Vizag", "Karimnagar"}));
		cb12.setBounds(214, 170, 86, 22);
		frame.getContentPane().add(cb12);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb2.getText();
			    String branch=(String) cb11.getSelectedItem();
			    String city=(String) cb12.getSelectedItem();
				ButtonGroup rgb=new ButtonGroup();
				rgb.add(r1);
				rgb.add(r2);
				String gender="";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				JOptionPane.showMessageDialog(b1, "Name "+ user+"\n Branch "+branch+"\nCity "+city+"\n Gender "+gender);
			}
		});
		b1.setForeground(new Color(0, 0, 0));
		b1.setFont(new Font("Verdana", Font.BOLD, 11));
		b1.setBounds(154, 215, 89, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Desktop\\im.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
