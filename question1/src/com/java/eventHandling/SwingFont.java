
package com.java.eventHandling;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//key event handling

public class SwingFont extends JFrame {
	public SwingFont(){
		setTitle("Swing Font");
		setBounds(0,0,500,500);
		setLayout(null);
		
		JTextField field1 = new JTextField(4);
		field1.setBounds(5,5,100,30);
		add(field1);
		field1.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
				char data = e.getKeyChar();
				if(data=='b'){
					Container container = getContentPane();
					container.setBackground(Color.blue);
				}
				else if(data=='r'){
					Color red = new Color(255,0,0);
					Container container = getContentPane();
					container.setBackground(red);
				}
				
			}
			
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel colored = new JLabel("Is this colored");
		colored.setBounds(10, 50, 400, 50);
		Font font = new Font(Font.MONOSPACED,Font.BOLD,16);
		colored.setFont(font);
		add(colored);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new SwingFont();
	}
}
