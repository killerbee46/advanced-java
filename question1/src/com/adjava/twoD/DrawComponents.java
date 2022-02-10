package com.adjava.twoD;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class DrawComponents extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.white);
		Font font = new Font(Font.DIALOG,Font.BOLD,30);
		g.setFont(font);
		g.drawString("Beeaver Technologies",30,30);
		
		g.drawLine(35, 35, 350, 35);
		
		g.drawRect(40, 40, 400, 200);
		g.fillRect(240, 40, 200, 200);
		
		g.drawOval(100, 250, 100, 100);
		g.drawOval(300, 250, 50, 100);
		
		int[] x = {100,100,200};
		int[] y = {350,450,450};
		g.drawPolygon(x,y,3);
		
		
	}
}
