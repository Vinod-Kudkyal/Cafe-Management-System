package com.cafe.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.cafe.service.Login_Page;
import com.cafe.service.Menu_Page;
import com.cafe.service.Table_Menu_Page;

import javax.swing.JOptionPane;

public class CafeDataBase {


	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	
	public String fname = null;
	public String lanme = null;
	public String phone = null;
	public String email = null;
	public String pass1 = null;
	
	public int regestercust (ArrayList a) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a1 = 0;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();
			 sql = "insert into regestercust values(? , ? , ? , ? , ?)";
			 stm = con.prepareStatement(sql);
			 
			 stm.setString(1, (String) a.get(0));
			 stm.setString(2, (String) a.get(1));
			 stm.setString(3, (String) a.get(2));
			 stm.setString(4, (String) a.get(3));
			 stm.setString(5, (String) a.get(4));
			 
			 a1 = stm.executeUpdate();
			
		} catch (Exception e1) {

		}
		return a1;
	}
	
	public int clogin (String pa , String uid) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		String user_id;
		String pas = null;
		String name = null;
		ResultSet rs = null;
		int b = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "select  password ,fname  from regestercust where email = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,uid);
			rs= stm.executeQuery();
			if (rs.next() == false) {
			       b=1;
			      } else {
			    	  
			        do {
			        	pas = rs.getString(1);
						name = rs.getString(2);
			        } while (rs.next());
			     }
			if (pas.equals(pa)) {
				Login_Page n = new Login_Page();
				//n.setVisible(false);
				JOptionPane.showMessageDialog(null, "Welcome  " + name);
				Table_Menu_Page tm = new Table_Menu_Page(email);
				//Menu_Page r = new Menu_Page(email);
				tm.setVisible(true);
				if(tm.isVisible()==true) {
					n.setVisible(false);
				}
			} else {
				// JOptionPane.showMessageDialog(null, "Enter valid User Id And Pass");
				b = 2;
			}

		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			
		}
		return b;
	}
}
