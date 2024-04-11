package com.cafe.service;

import java.awt.BorderLayout;

import com.cafe.dao.CafeDataBase;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

//import com.cares.dao.DataBase;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp_Page extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobileNo;
	private JTextField txtEmailId;
	private JPasswordField pwdPassword;
	private JPasswordField pwdConfirmPassword;
	public boolean b ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_Page frame = new SignUp_Page();
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
	public SignUp_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList al = new ArrayList();
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel.setBounds(85, 46, 602, 402);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 32, 91, 14);
		panel.add(lblNewLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(0, 0, 255));
		txtFirstName.setFont(new Font("Arial", Font.PLAIN, 11));
		txtFirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFirstName.setForeground(new Color(0, 0, 255));
				txtFirstName.setFont(new Font("Arial", Font.PLAIN, 11));
				//lblNewLabel.setVisible(true);
				txtFirstName.setText(null);
			}
			//@Override
//			public void focusLost(FocusEvent e) {
//				lblNewLabel.setVisible(false);
//				txtFirstName.setText("First Name");
//				if(!txtFirstName.equals("First Name")) {
//				b = Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(txtFirstName.getText()).matches();
//				}
//			}
		});
		txtFirstName.setBounds(10, 48, 171, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(395, 32, 91, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(true);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial", Font.PLAIN, 11));
		txtLastName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtLastName.setForeground(new Color(0, 0, 255));
				txtLastName.setFont(new Font("Arial", Font.PLAIN, 11));
				//lblNewLabel_1.setVisible(true);
				txtLastName.setText(null);
			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				lblNewLabel_1.setVisible(false);
//				txtLastName.setText("Last Name");
//			}
		});
		txtLastName.setForeground(new Color(0, 0, 255));
		txtLastName.setBounds(395, 47, 171, 20);
		panel.add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 91, 91, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(true);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setFont(new Font("Arial", Font.PLAIN, 11));
		txtMobileNo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtMobileNo.setForeground(new Color(0, 0, 255));
				txtMobileNo.setFont(new Font("Arial", Font.PLAIN, 11));
				//lblNewLabel_2.setVisible(true);
				txtMobileNo.setText(null);
			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				lblNewLabel_2.setVisible(false);
//				txtMobileNo.setText("Mobile No");
//			}
		});
		txtMobileNo.setForeground(new Color(0, 0, 255));
		txtMobileNo.setBounds(10, 109, 171, 20);
		panel.add(txtMobileNo);
		txtMobileNo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(395, 91, 91, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(true);
		
		txtEmailId = new JTextField();
		txtEmailId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtEmailId.setForeground(new Color(0, 0, 255));
				txtEmailId.setFont(new Font("Arial", Font.PLAIN, 11));
				//lblNewLabel_3.setVisible(true);
				txtEmailId.setText(null);
			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				lblNewLabel_3.setVisible(false);
//				txtEmailId.setText("Email ID");
//			}
		});
		txtEmailId.setFont(new Font("Arial", Font.PLAIN, 11));
		txtEmailId.setForeground(new Color(0, 0, 255));
		txtEmailId.setBounds(395, 109, 171, 20);
		panel.add(txtEmailId);
		txtEmailId.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 155, 91, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(true);
		
		pwdPassword = new JPasswordField();
		//lblNewLabel_4.setVisible(false);
		//pwdPassword.setEchoChar((char)0);
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdPassword.setForeground(new Color(0, 0, 255));
				pwdPassword.setFont(new Font("Arial", Font.PLAIN, 11));
				pwdPassword.setEchoChar('.');
				//lblNewLabel_4.setVisible(true);
				pwdPassword.setText(null);
			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				lblNewLabel_4.setVisible(false);
//				pwdPassword.setEchoChar((char)0);
//			}
		});
		pwdPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		pwdPassword.setForeground(new Color(0, 0, 255));
		pwdPassword.setBounds(10, 169, 171, 20);
		panel.add(pwdPassword);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm Password");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(395, 155, 108, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(true);
		
		pwdConfirmPassword = new JPasswordField();
		pwdConfirmPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdConfirmPassword.setForeground(new Color(0, 0, 255));
				pwdConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 11));
				pwdConfirmPassword.setEchoChar('*');
				//lblNewLabel_5.setVisible(true);
				pwdConfirmPassword.setText(null);
			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				lblNewLabel_5.setVisible(false);
//			pwdConfirmPassword.setEchoChar((char)0);
//			}
		});
		pwdConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		pwdConfirmPassword.setForeground(new Color(0, 0, 255));
		pwdConfirmPassword.setBounds(395, 169, 171, 20);
		panel.add(pwdConfirmPassword);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//boolean b;
				int a = 0;
				int c = 0;
				
				b = Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(txtFirstName.getText()).matches(); 
				if(b==false) {
					txtFirstName.setForeground(Color.RED);
					txtFirstName.setText("*Enter First Name");
					a=1;
				} else {al.add(txtFirstName.getText());}
				
				b =Pattern.compile("[a-zA-Z]{3,30}").matcher(txtLastName.getText()).matches();
				if(b==false) {
					txtLastName.setForeground(Color.RED);
					txtLastName.setText("*Enter Last Name");
					a=1;
				} else {al.add(txtLastName.getText());}
				
				b =Pattern.compile("^\\d{10}$").matcher(txtMobileNo.getText()).matches();
				if(b==false) {
					txtMobileNo.setForeground(Color.RED);
					txtMobileNo.setText("*Enter Valid Number");
					a=1;
				} else {al.add(txtMobileNo.getText());}
				
				b =Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").matcher(txtEmailId.getText()).matches();
				if(b==false) {
					txtEmailId.setForeground(Color.RED);
					txtEmailId.setText("*Enter Valid Email ID");
					a=1;
				} else {al.add(txtEmailId.getText());}
				
				b = Pattern.compile("").matcher(pwdPassword.getText()).matches(); 
				if(b==true) {
					pwdPassword.setEchoChar((char)0);
					pwdPassword.setForeground(Color.RED);
					pwdPassword.setText("*Enter Password");
					a=1;
				} else {al.add(pwdPassword.getText());}
				
				if(!pwdConfirmPassword.getText().equals(pwdPassword.getText())) {
					pwdConfirmPassword.setEchoChar((char)0);
					pwdConfirmPassword.setForeground(Color.RED);
					pwdConfirmPassword.setText("*Enter Correct Password");
					a=1;
				}
				
				if(a==0) {
					CafeDataBase db1 = new CafeDataBase();
					c = db1.regestercust(al);
					JOptionPane.showMessageDialog(null, c);
					}
					if(c==1) {
						JOptionPane.showMessageDialog(null, "Succesfully Submited");
						}
					else {JOptionPane.showMessageDialog(null, " Dosent Submited");
					a=0;}
					a=0;
					}
			
		});
		btnNewButton.setToolTipText("Submit");
		btnNewButton.setBounds(221, 304, 124, 32);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobileNo.setText(null);
				txtEmailId.setText(null);
				pwdPassword.setText(null);
				pwdConfirmPassword.setText(null);
			}
		});
		btnNewButton_1.setBounds(384, 309, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Home_Page h = new Home_Page();
				h.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(88, 12, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
