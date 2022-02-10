package com.java.eventHandling;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Image extends JFrame{
	public Image(){
		setTitle("Image Display");
		setBounds(0,0,500,500);
		setLayout(null);
		
		Border border = BorderFactory.createLineBorder(Color.black);
		JLabel lbl_image = new JLabel();
		lbl_image.setBounds(10,10,300,300);
		lbl_image.setBorder(border);
		
		ImageIcon image = new ImageIcon("D:\\japan\\Images\\Camera\\123.jpg");
		
		Image b = image.getImage();
		
		lbl_image.setIcon(image);
		
		add(lbl_image);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new Image();
	}
}
