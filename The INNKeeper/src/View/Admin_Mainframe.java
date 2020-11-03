package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;

public class Admin_Mainframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Mainframe frame = new Admin_Mainframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void changePanel(JPanel p) {
		this.invalidate();
		this.getContentPane().removeAll();
		this.getContentPane().add(p);
		this.pack();
		this.revalidate();
	}

	
	/**
	 * Create the frame.
	 */
	public Admin_Mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1069, 883);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnNewMenu = new JMenu("Manage >");
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmManageEmployees = new JMenuItem("Manage Employees");
		mntmManageEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageEmployeesForm employeesForm = new ManageEmployeesForm();
				employeesForm.setVisible(true);
				employeesForm.pack();
				employeesForm.setLocationRelativeTo(null);
				employeesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mntmManageEmployees.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnNewMenu.add(mntmManageEmployees);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmManageRooms = new JMenuItem("Manage Rooms");
		mntmManageRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageRoomsForm roomsForm = new ManageRoomsForm();
				roomsForm.setVisible(true);
				roomsForm.pack();
				roomsForm.setLocationRelativeTo(null);
				roomsForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mntmManageRooms.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnNewMenu.add(mntmManageRooms);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmManageOrders = new JMenuItem("Manage Orders");
		mntmManageOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageOrdersForm ordersForm = new ManageOrdersForm();
				ordersForm.setVisible(true);
				ordersForm.pack();
				ordersForm.setLocationRelativeTo(null);
				ordersForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mntmManageOrders.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnNewMenu.add(mntmManageOrders);
	}
	

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
}
