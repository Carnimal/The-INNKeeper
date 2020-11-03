package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.jframebg.MYFrame;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;



public class AdminLogin {

	private JFrame frame;
	private JTextField UsertextField;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 972, 822);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Background_Panel =  new JPanel() {  
			   public void paintComponent(Graphics g) {  
				     Image img = Toolkit.getDefaultToolkit().getImage(  
				     MYFrame.class.getResource("/images/Login_Background.png"));  
				     g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
				     }  
				   };  
		Background_Panel.setBackground(Color.YELLOW);
		
		frame.getContentPane().add(Background_Panel, "name_164940205228400");
		Background_Panel.setLayout(null);
		
		JPanel LogIn_panel = new JPanel();
		LogIn_panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.CYAN, null, null, null));
		LogIn_panel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
		LogIn_panel.setBounds(266, 207, 479, 467);
		Background_Panel.add(LogIn_panel);
		LogIn_panel.setLayout(null);
		
		UsertextField = new JTextField();
		UsertextField.setBounds(201, 126, 210, 20);
		LogIn_panel.add(UsertextField);
		UsertextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :-");
		lblPassword.setForeground(Color.CYAN);
		lblPassword.setBounds(44, 172, 147, 38);
		LogIn_panel.add(lblPassword);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		JLabel lblUsername = new JLabel("UserName :-");
		lblUsername.setForeground(Color.CYAN);
		lblUsername.setBounds(30, 108, 161, 38);
		LogIn_panel.add(lblUsername);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		JLabel lblLoginInnkeeperId = new JLabel("Log-in INNKeeper ID");
		lblLoginInnkeeperId.setForeground(Color.WHITE);
		lblLoginInnkeeperId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		lblLoginInnkeeperId.setBounds(10, 23, 286, 38);
		LogIn_panel.add(lblLoginInnkeeperId);
		
		JButton btnLogIn = new JButton("Log-In ");
		btnLogIn.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement ps;
				ResultSet rs;
				
				String username =UsertextField.getText();
				String password = String.valueOf(pwdPassword.getPassword());
				if(username.trim().equals(""))
				{
					JOptionPane.showMessageDialog(frame,"Enter Your Username To Login", "Empty Username",2);
				}
				else if (password.trim().equals(""))
				{
					JOptionPane.showMessageDialog(frame,"Enter Your Password To Login", "Empty Password",2);
				}
				else {
					MY_CONNECTION myconnection = new MY_CONNECTION();
					String selectQuery = "SELECT * FROM `users` WHERE `Email`=? and Password =?";
					try {
						ps =  myconnection.CreateConnection().prepareStatement(selectQuery);
						ps.setString(1,username );
						ps.setString(2, password);
						rs =ps.executeQuery();
						if(rs.next())
						{
							
							//if this user exits open this main form and close the login form
							Admin_Mainframe mainform = new Admin_Mainframe();
							mainform.setVisible(true);	
							mainform.setExtendedState(JFrame.MAXIMIZED_BOTH);
							mainform.setUndecorated(true);
							mainform.pack();
							mainform.setLocationRelativeTo(null);
							frame.dispose();
						}
						else {
							// if user Enter incorrect info 
							JOptionPane.showMessageDialog(frame,"Wrong Username OR Password ", "Login Error",2);
						}
					
					} catch (SQLException ex) {
						Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE,null, ex);
					}
				  }
				}
			}
		);
		btnLogIn.setBounds(62, 276, 317, 67);
		LogIn_panel.add(btnLogIn);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(201, 187, 210, 20);
		LogIn_panel.add(pwdPassword);
	}
	
	
	public void RenderFloors() {
		
	}
}
