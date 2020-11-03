package View;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Employee {
	
	MY_CONNECTION myconnection = new MY_CONNECTION();

	public  boolean addEmployee(String Id,String Fname,String Lname,String PhoneNumber, String Email,String Password,String Department,String Bdate) {
	
	PreparedStatement st;
	ResultSet rs ;
	String addQuery = "INSERT INTO `Employees`(`ID`, `Fname`, `Lname`, `PhoneNum`, `Email`, `Password`, `Privileges`, `Birthdate`) VALUES (?,?,?,?,?,?,?,?)";
	
	try {
		st = myconnection.CreateConnection().prepareStatement(addQuery);

		st.setString(1, Id);
		st.setString(2, Fname);
		st.setString(3, Lname);
		st.setString(4, PhoneNumber);
		st.setString(5, Email);
		st.setString(6, Password);
		st.setString(7, Department);
		st.setString(8, Bdate);
		
		if(st.executeUpdate()>0)
		{
			return true;
		}else {
			return false;
		}
	} catch (SQLException ex) {
		// TODO Auto-generated catch block
		Logger.getLogger(Employee.class.getName()).log(Level.SEVERE,null,ex);
	return false;
	}
	
	}
	  public void fillEmployeeJTable(JTable table) {
		  PreparedStatement ps;
		  ResultSet rs ;
		  String selectQuery= "SELECT * FROM `Employees`";
		  try {
			ps = myconnection.CreateConnection().prepareStatement(selectQuery);
			rs= ps.executeQuery();
			DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
			
			
			Object [] row;
			while(rs.next())
			{
			 row = new Object[8];
			 row[0]= rs.getString(1);
			 row[1]= rs.getString(2);
			 row[2]= rs.getString(3);
			 row[3]= rs.getString(4);
			 row[4]= rs.getString(5);
			 row[5]= rs.getString(6);
			 row[6]= rs.getString(7);
			 row[7]= rs.getString(8);
			 tableModel.addRow(row);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	  
	public boolean editEmployee(String Id,String Fname,String Lname,String PhoneNumber, String Email,String Password,String Department,String Bdate) {
		PreparedStatement st;
		ResultSet rs ;
		String editQuery = "UPDATE `Employees` SET `Fname`=?,`Lname`=?,`PhoneNum`=?,`Email`=?,`Password`=?,`Privileges`=?,`BirthDate`=? WHERE `ID`=?";
		
		try {
			st = myconnection.CreateConnection().prepareStatement(editQuery);

			
			st.setString(1, Fname);
			st.setString(2, Lname);
			st.setString(3, PhoneNumber);
			st.setString(4, Email);
			st.setString(5, Password);
			st.setString(6, Department);
			st.setString(7, Bdate);
			st.setString(8, Id);
			return (st.executeUpdate()>0); 
			
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(Employee.class.getName()).log(Level.SEVERE,null,ex);
		return false;
		}
	}
	public boolean removeEmployee(String Id) {
		PreparedStatement st;
		ResultSet rs ;
		String deleteQuery = "DELETE From `Employees` Where `ID`=?";
		
		try {
			st = myconnection.CreateConnection().prepareStatement(deleteQuery);

			st.setString(1, Id);
		
			return (st.executeUpdate()>0); 
			
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(Employee.class.getName()).log(Level.SEVERE,null,ex);
		return false;
		}
	}
}
