package com.cafe.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class rough extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rough frame = new rough();
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
//	class rough1{
//	public static String tp(String s) {
//		if(item1.getText().equals("")) {
//			item1.setText(s);
//		}
//		return "hh";
//	}
//	}
	public rough() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1005, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel item1 = new JLabel("New label");
		item1.setBounds(143, 241, 46, 14);
		contentPane.add(item1);
		
		JLabel item2 = new JLabel("New label");
		item2.setBounds(262, 281, 46, 14);
		contentPane.add(item2);
		
		JLabel item4 = new JLabel("New label");
		item4.setBounds(365, 228, 46, 14);
		contentPane.add(item4);
		
		JLabel item3 = new JLabel("New label");
		item3.setBounds(365, 281, 46, 14);
		contentPane.add(item3);
		
		JLabel item5 = new JLabel("New label");
		item5.setBounds(353, 326, 46, 14);
		contentPane.add(item5);
		
		JPanel panel = new JPanel();
		panel.setBounds(531, 36, 400, 435);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox cb2 = new JCheckBox("cb2");
		cb2.setBounds(181, 127, 97, 23);
		panel.add(cb2);
		
		
		
		JCheckBox cb1 = new JCheckBox("cb1");
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cb1.isSelected()==true) {
					
				}
			}
		});
		cb1.setBounds(41, 127, 97, 23);
		panel.add(cb1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(73, 212, 150, 65);
		panel.add(lblNewLabel);
		
//		if(cb1.isSelected()==true) {
//			cb2.setSelected(true);
//		}else {
//			cb2.setSelected(true);
//		}
		
		 class rough1{
			public  void tp(String s) {
				if(item1.getText().equals("")) {
					item1.setText(s);
				}
				else {
					item1.setText(s);
				}
				
			}
			
			}
		
		rough1 qw = new rough1();
		qw.tp("j");
		ArrayList <String> data = new ArrayList<String>();
		
		
		
		for(int i = 0; i<data.size();i++) {
		//lbA.setText(data.get(i)+"\n");
			System.out.println(data.get(i)+"\n");
		}
		
	}
}
