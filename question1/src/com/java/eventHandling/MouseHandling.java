package com.java.eventHandling;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javafx.scene.paint.Color;

import javax.swing.*;

public class MouseHandling extends JFrame{
	public MouseHandling(){
		setTitle("Mouse Handling");
		setBounds(0,0,400,400);
		setLayout(null);
		
		JLabel hover = new JLabel("Hover");
		hover.setBounds(5,5,100,30);
		hover.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Clicked");
				
			}

			public void mouseEntered(MouseEvent arg0) {
				System.out.println("Entered");
				
			}

			public void mouseExited(MouseEvent arg0) {
				System.out.println("Exited");
				
			}

			public void mousePressed(MouseEvent arg0) {
				System.out.println("Pressed");
				
			}

			public void mouseReleased(MouseEvent arg0) {
				System.out.println("Released");
				
			}
			
		});
		add(hover);
		setVisible(true);
	}
	public static void main(String[] args){
		new MouseHandling();
	}
}
