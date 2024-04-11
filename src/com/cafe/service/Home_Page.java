package com.cafe.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Home_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page frame = new Home_Page();
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
	public Home_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login ");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login_Page lp = new Login_Page();
				lp.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_1.setForeground(new Color(0, 51, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Brush Script MT", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(605, 135, 165, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sing Up");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp_Page sp = new SignUp_Page();
				sp.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_2.setForeground(new Color(0, 51, 255));
		lblNewLabel_2.setFont(new Font("Brush Script MT", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(751, 223, 139, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\eclipse-workspace\\Cafe Managment System\\Images\\rock&rolls4.png"));
		lblNewLabel.setBounds(0, 0, 595, 483);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("G:\\eclipse-workspace\\Cafe Managment System\\Images\\homa_page_login_signup1.jpg"));
		lblNewLabel_3.setBounds(596, 0, 304, 483);
		contentPane.add(lblNewLabel_3);
		//setUndecorated(true);
	}
}
