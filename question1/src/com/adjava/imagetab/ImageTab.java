package com.adjava.imagetab;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTab extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnCat;
	JButton btnDog;
	JButton btnBird;
	Container container;
	JPanel imagePanel;
public ImageTab() {

	setTitle("Image Tab");
	setBounds(0,0,900,700);
	setLayout(null);
	
	container = getContentPane();
	
	btnCat = new JButton("Cat");
	btnCat.setBounds(5,5,100,40);
	btnCat.addActionListener(this);
	
	btnDog = new JButton("Dog");
	btnDog.setBounds(120,5,100,40);
	btnDog.addActionListener(this);
	
	btnBird = new JButton("Bird");
	btnBird.setBounds(230,5,100,40);
	btnBird.addActionListener(this);
	
	imagePanel = new JPanel();
	
	container.add(btnCat);
	container.add(btnDog);
	container.add(btnBird);
	container.add(imagePanel);
	
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	new ImageTab();
}
public void actionPerformed(ActionEvent e) {
	String result = e.getActionCommand();
	if(result.equals("Dog")){
		imagePanel.setBounds(5,90,635,335);
		imagePanel.setBackground(Color.black);
		String image1 = "C:\\Users\\Dell\\Desktop\\Ad_JAVA_class\\Images\\Dog\\download.jfif";
		
		for(int i=5; i <= 630 ; i = i+210){
			for(int j = 5 ; j <= 330 ; j = j+110){
				ImageDraw plotImage = new ImageDraw(i, j,200, 100, image1);
				imagePanel.add(plotImage);
			}
		}
		
	}
	else if(result.equals("Cat")){
		imagePanel.setBounds(5,90,635,335);
		imagePanel.setBackground(Color.black);
		String image2 = "C:\\Users\\Dell\\Desktop\\Ad_JAVA_class\\Images\\Cat\\cat.jfif";
		
		for(int i=5; i <= 630 ; i = i+210){
			for(int j = 5 ; j <= 330 ; j = j+110){
				ImageDraw plotImage = new ImageDraw(i, j,200, 100, image2);
				imagePanel.add(plotImage);
			}
		}
		update(null);
	}
	else{
		System.out.println("clicked");
		imagePanel.setBounds(5,90,635,335);
		imagePanel.setBackground(Color.black);
		String image3 = "C:\\Users\\Dell\\Desktop\\Ad_JAVA_class\\Images\\Bird\\Bird.jpg";
		
		for(int i=5; i <= 630 ; i = i+210){
			for(int j = 5 ; j <= 330 ; j = j+110){
				ImageDraw plotImage = new ImageDraw(i, j,200, 100, image3);
				imagePanel.add(plotImage);
			}
		}
	}
}
}
