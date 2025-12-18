package com.BrickBreak;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
private int y;
private int size;
private int xVelocity;
private int yVelocity;

	
	
	
	//constructor(s):
	public Ball(int x, int y, int size)
{
		this.x = x;
		this.y = y;
		this.size = size;
	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(x, y, size, size);
	}
	public int getYpos(){
		return this.y;
	}
	public int getXpos(){
		return this.x;
	}
	public int getSize(){
		return this.size;
	}
	public void setXVelocity(int v){
		xVelocity = v;
	}
	public void setYVelocity(int v){
		yVelocity = v;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}

	public void reverseY(){
	yVelocity = -yVelocity;
	}
	public void reverseX(){
	xVelocity = -xVelocity;
	}
	public void move(){
		this.x += xVelocity;
		this.x += yVelocity;
	}








}
