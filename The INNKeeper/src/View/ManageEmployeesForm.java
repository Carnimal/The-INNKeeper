package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.*;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Calendar;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpringLayout;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Cursor;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ImageIcon;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.jdatepicker.DateModel;
import org.jdatepicker.util.JDatePickerUtil;
import org.jdatepicker.graphics.JNextIcon;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class ManageEmployeesForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEMPLYEEID;
	private JTextField textFieldFNAME;
	private JTextField textFieldLNAME;
	private JTextField textFieldPHONE;
	private JTextField textFieldEMAIL;
	private JTextField textField_6;
	private JTable table;
	private JTextField textFieldPASSWORD;
	private SpringLayout springLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageEmployeesForm frame = new ManageEmployeesForm();
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
	public ManageEmployeesForm() {
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		   LocalDateTime now = LocalDateTime.now(); 
		Employee employee=new Employee();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1175, 884);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 51));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 255), null, Color.MAGENTA, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JLabel lblNewLabel = new JLabel("Employee ID :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(37, 117, 193, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFirstName.setBounds(37, 164, 193, 37);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLastName.setBounds(37, 211, 193, 37);
		contentPane.add(lblLastName);
		
		JLabel lblPhonenumber = new JLabel("Phone Number :");
		lblPhonenumber.setForeground(Color.WHITE);
		lblPhonenumber.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPhonenumber.setBounds(37, 258, 193, 37);
		contentPane.add(lblPhonenumber);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEmail.setBounds(37, 305, 193, 37);
		contentPane.add(lblEmail);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDepartment.setBounds(37, 399, 193, 37);
		contentPane.add(lblDepartment);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth :");
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDateOfBirth.setBounds(37, 440, 193, 37);
		contentPane.add(lblDateOfBirth);
		
		textFieldEMPLYEEID = new JTextField();
		textFieldEMPLYEEID.setBounds(169, 117, 252, 30);
		contentPane.add(textFieldEMPLYEEID);
		textFieldEMPLYEEID.setColumns(10);
		
		textFieldFNAME = new JTextField();
		textFieldFNAME.setColumns(10);
		textFieldFNAME.setBounds(169, 164, 252, 30);
		contentPane.add(textFieldFNAME);
		
		textFieldLNAME = new JTextField();
		textFieldLNAME.setColumns(10);
		textFieldLNAME.setBounds(169, 211, 252, 30);
		contentPane.add(textFieldLNAME);
		
		textFieldPHONE = new JTextField();
		textFieldPHONE.setColumns(10);
		textFieldPHONE.setBounds(169, 258, 252, 30);
		contentPane.add(textFieldPHONE);
		
		textFieldEMAIL = new JTextField();
		textFieldEMAIL.setColumns(10);
		textFieldEMAIL.setBounds(169, 305, 252, 30);
		contentPane.add(textFieldEMAIL);

		 
		JComboBox comboBoxDepartment = new JComboBox();
		comboBoxDepartment.setModel(new DefaultComboBoxModel(new String[] {"", "Maintenance ", "Cleaning ", "Parking "}));
		comboBoxDepartment.setBounds(169, 399, 252, 31);
		contentPane.add(comboBoxDepartment);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(169, 439, 252, 30);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = new java.util.Date();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFocusCycleRoot(true);
		scrollPane.setFont(new Font("Times New Roman", Font.BOLD, 18));
		scrollPane.setBounds(482, 117, 669, 319);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int rIndex = table.getSelectedRow();
				textFieldEMPLYEEID.setText(model.getValueAt(rIndex, 0).toString());
				textFieldFNAME.setText(model.getValueAt(rIndex, 1).toString());
				textFieldLNAME.setText(model.getValueAt(rIndex, 2).toString());
				textFieldPHONE.setText(model.getValueAt(rIndex, 3).toString());
				textFieldEMAIL.setText(model.getValueAt(rIndex, 4).toString());
				textFieldPASSWORD.setText(model.getValueAt(rIndex, 5).toString());
				comboBoxDepartment.setSelectedItem(model.getValueAt(rIndex, 6).toString());
				dateChooser.setDateFormatString(model.getValueAt(rIndex, 7).toString());
			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setAutoCreateRowSorter(true);
		table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		scrollPane.setViewportView(table);
		table.setToolTipText("");
		table.setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.setSelectionBackground(Color.GREEN);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Employee ID", "First Name", "Last Name", "Phone Number", "Email", "Password", "Department", "Birth Date"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(95);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 0), Color.GREEN, new Color(0, 255, 0), Color.GREEN));
		  employee.fillEmployeeJTable(table);

		dateChooser.setDate(date);
		contentPane.add(dateChooser);
		//////////////////////////////////////////////////////////////////////////////////////////	

		JButton btnAddNewEmployee = new JButton("Add New Employee");
		btnAddNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Id = textFieldEMPLYEEID.getText();
				String fname = textFieldFNAME.getText();
				String lname = textFieldLNAME.getText();
				String phonenumber = textFieldPHONE.getText();
				String email = textFieldEMAIL.getText();
				String Password = textFieldPASSWORD.getText();
				String Department = (String) comboBoxDepartment.getSelectedItem();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				java.util.Date todaysdate=dateChooser.getDate();
			    String selectedDate = dateFormat.format(todaysdate);

				
				
				 if(fname.trim().equals("")|| lname.trim().equals("") || phonenumber.trim().equals(""))
									JOptionPane.showMessageDialog(rootPane, "Required Fields -> First/Last Name + Phone Number", "Empty Fields",JOptionPane.WARNING_MESSAGE);
				 else
					 if (employee.addEmployee(Id, fname, lname, phonenumber, email, Password,Department,selectedDate))
					 {
					 JOptionPane.showMessageDialog(rootPane, " Employee Has Been Added Successfully", "Add Employee Succeded",JOptionPane.INFORMATION_MESSAGE);
					  table.setModel(new DefaultTableModel(null,new Object[] {"Employee ID", "First Name", "Last Name", "Phone Number", "Email", "Password", "Department", "Birth Date"}));
					  employee.fillEmployeeJTable(table);
					 }
				else
					JOptionPane.showMessageDialog(rootPane, " Employee Colud Not Be Added ", "Add Employee Error",JOptionPane.ERROR_MESSAGE);
				
			}
	
});

		btnAddNewEmployee.setSelectedIcon(new ImageIcon(ManageEmployeesForm.class.getResource("/images/Login_Background.png")));
		btnAddNewEmployee.setToolTipText("");
		btnAddNewEmployee.setBackground(Color.YELLOW);
		btnAddNewEmployee.setForeground(Color.BLACK);
		btnAddNewEmployee.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnAddNewEmployee.setBounds(37, 526, 205, 45);
		btnAddNewEmployee.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnAddNewEmployee);
		//////////////////////////////////////////////////////////////////////////////////////////	
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Id = textFieldEMPLYEEID.getText();
				String fname = textFieldFNAME.getText();
				String lname = textFieldLNAME.getText();
				String phonenumber = textFieldPHONE.getText();
				String email = textFieldEMAIL.getText();
				String Password = textFieldPASSWORD.getText();
				String Department = (String) comboBoxDepartment.getSelectedItem();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				java.util.Date todaysdate=dateChooser.getDate();
			    String selectedDate = dateFormat.format(todaysdate);

				
				
				 if(fname.trim().equals("")|| lname.trim().equals("") || phonenumber.trim().equals(""))
									JOptionPane.showMessageDialog(rootPane, "Required Fields * -> First/Last Name + Phone Number", "Empty Fields",JOptionPane.WARNING_MESSAGE);
				else {
				try {
						Id = textFieldEMPLYEEID.getText();
						if (employee.editEmployee(Id, fname, lname, phonenumber, email, Password,Department,selectedDate)) 
						{
					  table.setModel(new DefaultTableModel(null,new Object[] {"Employee ID", "First Name", "Last Name", "Phone Number", "Email", "Password", "Department", "Birth Date"}));
					  employee.fillEmployeeJTable(table);	
					  JOptionPane.showMessageDialog(rootPane, " Employee Data Has Been Edited Successfully", "Editing Employee Succeded",JOptionPane.INFORMATION_MESSAGE);

						}
						else 
					JOptionPane.showMessageDialog(rootPane, " Employee Colud Not Be Edited ", "Edit Employee Error",JOptionPane.ERROR_MESSAGE);
					}
				catch (NumberFormatException ex ) 
						{
						// TODO Auto-generated catch block
						 JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter Employee Id", " Employee Id Error",JOptionPane.ERROR_MESSAGE);
						}
					}
				}									
			});
	//////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		
		btnEdit.setSelectedIcon(new ImageIcon(ManageEmployeesForm.class.getResource("/images/Login_Background.png")));
		btnEdit.setToolTipText("");
		btnEdit.setBackground(Color.YELLOW);
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnEdit.setBounds(252, 526, 101, 45);
		btnEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnEdit);
		//////////////////////////////////////////////////////////////////////////////////////////	

		JButton btnRemove = new JButton("Remove");	
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Id  ;
				try {
					Id = textFieldEMPLYEEID.getText();
					if (employee.removeEmployee(Id))
					{
						
		  table.setModel(new DefaultTableModel(null,new Object[] {"Employee ID", "First Name", "Last Name", "Phone Number", "Email", "Password", "Department", "Birth Date"}));
		  employee.fillEmployeeJTable(table);	
		  JOptionPane.showMessageDialog(rootPane, " Employee Data Has Been Removed Successfully", "Deleting Employee Succeded",JOptionPane.INFORMATION_MESSAGE);

					}
	else
		JOptionPane.showMessageDialog(rootPane, " Employee Colud Not Be removed ", "Deleting Employee Error",JOptionPane.ERROR_MESSAGE);
	
				} catch (NumberFormatException ex) 
					{
					// TODO Auto-generated catch block
					 JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter Employee Id(number) you wish to Delete", " Employee Id Error",JOptionPane.ERROR_MESSAGE);
					}
			}
			
			});
		btnRemove.setSelectedIcon(new ImageIcon(ManageEmployeesForm.class.getResource("/images/Login_Background.png")));
		btnRemove.setToolTipText("");
		btnRemove.setBackground(Color.YELLOW);
		btnRemove.setForeground(Color.BLACK);
		btnRemove.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnRemove.setBounds(363, 526, 116, 45);
		btnRemove.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnRemove);
		
		//////////////////////////////////////////////////////////////////////////////////////////	

		JButton btnClearfields = new JButton("ClearFields");
		btnClearfields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldEMPLYEEID.setText("");
				 textFieldFNAME.setText("");
					textFieldLNAME.setText("");
					textFieldPHONE.setText("");
					textFieldEMAIL.setText("");
					textFieldPASSWORD.setText("");
					comboBoxDepartment.setSelectedIndex(0);
					dateChooser.setDateFormatString(now.toString());
			}
		});
		btnClearfields.setForeground(Color.WHITE);
		btnClearfields.setBackground(Color.RED);
		btnClearfields.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnClearfields.setBounds(37, 581, 442, 45);
		btnClearfields.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnClearfields);
		//////////////////////////////////////////////////////////////////////////////////////////	

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setBounds(37, 352, 193, 37);
		contentPane.add(lblPassword);
		
		textFieldPASSWORD = new JTextField();
		textFieldPASSWORD.setColumns(10);
		textFieldPASSWORD.setBounds(169, 352, 252, 30);
		contentPane.add(textFieldPASSWORD);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 153));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 255, 0), null, new Color(64, 64, 64), null));
		panel.setBounds(0, 0, 1652, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEmployeeManagment = new JLabel("Employee Managment ");
		lblEmployeeManagment.setForeground(new Color(255, 255, 255));
		lblEmployeeManagment.setBounds(495, 37, 400, 42);
		panel.add(lblEmployeeManagment);
		lblEmployeeManagment.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		
	

		
		JLabel HotelIcon = new JLabel(":)");
		HotelIcon.setBounds(37, 636, 147, 138);
		contentPane.add(HotelIcon);
		HotelIcon.setIcon(new ImageIcon("C:\\Users\\actio\\Downloads\\Final Project\\The INNKeeper\\Images\\City-Hotel-icon.png"));
		
		JLabel lblEmployeeicon = new JLabel("");
		lblEmployeeicon.setIcon(new ImageIcon("C:\\Users\\actio\\Downloads\\Final Project\\The INNKeeper\\Images\\employee.png"));
		lblEmployeeicon.setBounds(521, 526, 252, 177);
		contentPane.add(lblEmployeeicon);
		
		
		}
}
