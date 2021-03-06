package com.q1.form;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;

public class RegistrationFormAll extends JFrame{
	public RegistrationFormAll(){
		setTitle("Texas Registration Form");
		setBounds(0,0,530,500);
		setLayout(null);
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		JPanel panel = new JPanel();
		panel.setBounds(5,5,500,100);
		panel.setLayout(null);
		panel.setBorder(blackline);
		
		JLabel fName = new JLabel("First Name");
		fName.setBounds(10,5,150,30);
		JTextField fNameField = new JTextField();
		fNameField.setBounds(10,40,150,30);
		JLabel mName = new JLabel("Middle Name");
		mName.setBounds(165,5,150,30);
		JTextField mNameField = new JTextField();
		mNameField.setBounds(165,40,150,30);
		JLabel lName = new JLabel("Last Name");
		lName.setBounds(320,5,150,30);
		JTextField lNameField = new JTextField();
		lNameField.setBounds(320,40,150,30);
		add(fName);
		add(fNameField);
		add(mName);
		add(mNameField);
		add(lName);
		add(lNameField);
		add(panel);
		
		JLabel address = new JLabel("Address:");
		address.setBounds(5,110,150,30);
		
		JTextArea address_field = new JTextArea(50,10);
		address_field.setLineWrap(true);
		address_field.setBounds(90, 110, 200, 100);
		
		add(address);
		add(address_field);
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(5,220,100,30);
		add(genderLabel);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(90,220,100,30);
		add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(200,220,100,30);
		add(female);
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		
		JLabel contact = new JLabel("Contact:");
		contact.setBounds(5,260,100,30);
		add(contact);
		
		JTextField contactField = new JTextField();
		contactField.setBounds(90,260,200,30);
		add(contactField);
		
		JLabel language = new JLabel("Language:");
		contact.setBounds(5,310,100,30);
		add(language);
		
		JCheckBox nepali = new JCheckBox("Nepali");
		nepali.setBounds(90,310,90,30);
		add(nepali);
		
		JCheckBox english = new JCheckBox("English");
		english.setBounds(200,310,90,30);
		add(english);
		
		JCheckBox hindi = new JCheckBox("Hindi");
		hindi.setBounds(300,310,90,30);
		add(hindi);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(190,350,100,30);
		add(submit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new RegistrationFormAll();
	}
}
