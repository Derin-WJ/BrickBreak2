//Derin Soysal
package com.BrickBreak;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int xVelocity;
	private int yVelocity;

	
	
	
	//constructor(s):
	public Ball(int x, int y, int radius)
{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	//methods:
	//  Pre-condition: x, y, radius, and g are non-null values
	//  Post-condition: The ball is drawn and the color of the ball will be blue
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(x, y, radius, radius);
	}
	//  Pre-condition: y is a non-null value
	//  Post-condition: The y position of the ball is returned
	public int getYpos(){
		return this.y;
	}
	//  Pre-condition: x is a non-null value
	//  Post-condition: The x position of the ball is returned
	public int getXpos(){
		return this.x;
	}
	//  Pre-condition: radius is a non-null value
	//  Post-condition: The diameter (2xradius) of the ball is returned
	public int getSize(){
		return 2*radius;
	}
	//  Pre-condition: v and xVelocity are non-null values
	//  Post-condition: The horizontal velocity of the ball is set
	public void setXVelocity(int v){
		xVelocity = v;
	}
	//  Pre-condition: v and yVelocity are non-null values
	//  Post-condition: The vertical velocity of the ball is set
	public void setYVelocity(int v){
		yVelocity = v;
	}
	//  Pre-condition: x is a non-null value
	//  Post-condition: The horizontal position of the ball is set
	public void setX(int x){
		this.x = x;
	}
	//  Pre-condition: y is a non-null value
	//  Post-condition: The vertical position of the ball is set
	public void setY(int y){
		this.y = y;
	}
	//  Pre-condition: yVelocity is a non-null value
	//  Post-condition: The vertical position of the ball is reversed and set backward
	public void reverseY(){
	yVelocity = yVelocity * -1;
	}
	//  Pre-condition: xVelocity is a non-null value
	//  Post-condition: The vertical position of the ball is reversed and set backward
	public void reverseX(){
	xVelocity = xVelocity * -1;
	}
	//  Pre-condition: x and y are non-null values
	//  Post-condition: The ball is set to move
	public void move(){
		this.x += xVelocity;
		this.y += yVelocity;
	}








}
