package com.adjava.imagetab;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageDraw extends JLabel{

public ImageDraw(int x, int y, int w,int h, String imagePath){
	setBounds(x,y,w,h);
	ImageIcon imageIcon = new ImageIcon(imagePath);
	Image image = imageIcon.getImage();
	Image scaled_Image = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
	
	setIcon(new ImageIcon(scaled_Image));
}
}
