package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	
	
	
	//constructor(s):
	public Ball(int x, int y, int diameter){
		this.x = x;
		this.y = y;
		this.diameter = 2 * radius;
	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(x, y, radius, radius);
	}
}
