package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;

public class ManageRoomsForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageRoomsForm frame = new ManageRoomsForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManageRoomsForm() {
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setForeground(Color.BLACK);
		contentPane_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 255), null, Color.MAGENTA, null));
		contentPane_1.setBackground(new Color(51, 0, 51));
		getContentPane().add(contentPane_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Employee ID :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(37, 117, 193, 37);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFirstName.setBounds(37, 164, 193, 37);
		contentPane_1.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLastName.setBounds(37, 211, 193, 37);
		contentPane_1.add(lblLastName);
		
		JLabel lblPhonenumber = new JLabel("Phone Number :");
		lblPhonenumber.setForeground(Color.WHITE);
		lblPhonenumber.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPhonenumber.setBounds(37, 258, 193, 37);
		contentPane_1.add(lblPhonenumber);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEmail.setBounds(37, 305, 193, 37);
		contentPane_1.add(lblEmail);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDepartment.setBounds(37, 399, 193, 37);
		contentPane_1.add(lblDepartment);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth :");
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDateOfBirth.setBounds(37, 440, 193, 37);
		contentPane_1.add(lblDateOfBirth);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(169, 117, 252, 30);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 164, 252, 30);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 211, 252, 30);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 258, 252, 30);
		contentPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 305, 252, 30);
		contentPane_1.add(textField_4);
		
		JComboBox comboBoxDepartment = new JComboBox();
		comboBoxDepartment.setBounds(169, 399, 252, 31);
		contentPane_1.add(comboBoxDepartment);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.BOLD, 18));
		scrollPane.setFocusCycleRoot(true);
		scrollPane.setBounds(482, 117, 669, 319);
		contentPane_1.add(scrollPane);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(169, 439, 252, 30);
		contentPane_1.add(dateChooser);
		
		JButton btnAddNewEmployee = new JButton("Add New Employee");
		btnAddNewEmployee.setToolTipText("");
		btnAddNewEmployee.setForeground(Color.BLACK);
		btnAddNewEmployee.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnAddNewEmployee.setBackground(Color.YELLOW);
		btnAddNewEmployee.setBounds(37, 526, 205, 45);
		contentPane_1.add(btnAddNewEmployee);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setToolTipText("");
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnEdit.setBackground(Color.YELLOW);
		btnEdit.setBounds(252, 526, 101, 45);
		contentPane_1.add(btnEdit);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setToolTipText("");
		btnRemove.setForeground(Color.BLACK);
		btnRemove.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnRemove.setBackground(Color.YELLOW);
		btnRemove.setBounds(363, 526, 116, 45);
		contentPane_1.add(btnRemove);
		
		JButton btnClearfields = new JButton("ClearFields");
		btnClearfields.setForeground(Color.WHITE);
		btnClearfields.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnClearfields.setBackground(Color.RED);
		btnClearfields.setBounds(37, 581, 442, 45);
		contentPane_1.add(btnClearfields);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setBounds(37, 352, 193, 37);
		contentPane_1.add(lblPassword);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(169, 352, 252, 30);
		contentPane_1.add(textField_5);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 0), null, new Color(64, 64, 64), null));
		panel.setBackground(new Color(51, 51, 153));
		panel.setBounds(0, 0, 1652, 89);
		contentPane_1.add(panel);
		
		JLabel lblRoomManagment = new JLabel("Room Managment ");
		lblRoomManagment.setForeground(Color.WHITE);
		lblRoomManagment.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblRoomManagment.setBounds(495, 37, 400, 42);
		panel.add(lblRoomManagment);
		
	}

}
