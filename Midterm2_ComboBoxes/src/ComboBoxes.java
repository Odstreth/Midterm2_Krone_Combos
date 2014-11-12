import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;


public class ComboBoxes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxes window = new ComboBoxes();
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
	public ComboBoxes() {
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
		
		HashMap<Integer, String> months = new HashMap<Integer, String>();
		months.put(1, "January");
		months.put(2, "February");
		months.put(3, "March");
		months.put(4, "April");
		months.put(5, "May");
		months.put(6, "June");
		months.put(7, "July");
		months.put(8, "August");
		months.put(9, "September");
		months.put(10, "October");
		months.put(11, "November");
		months.put(12, "December");
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		ArrayList<Integer> years = new ArrayList<Integer>();
		for (int i = -5; i < 0; i++){
			years.add(year + i);
		}
		years.add(year);
		for (int i = 1; i < 5; i++){
			years.add(year + i);
		}
		
		ArrayList<String> comboMonths = new ArrayList<String>();
		for (int i = 1; i < 13; i++){
			comboMonths.add(months.get(i));
		}
		
		JLabel lblNewLabel = new JLabel("Month");
		lblNewLabel.setBounds(103, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox(comboMonths.toArray());
		comboBox.setBounds(264, 50, 101, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(264, 105, 101, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(years.toArray());
		comboBox_2.setBounds(264, 157, 101, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Day");
		lblNewLabel_1.setBounds(103, 108, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		lblNewLabel_2.setBounds(103, 160, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
