//Derin Soysal
package com.BrickBreak;


import java.awt.Color;
import java.awt.Graphics;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;

	
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.velocity = 0;

	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x,y,width,height);
	}
	//  Pre-condition: x is a non-null value
	//  Post-condition: The x position of the paddle is returned
public int getX(){
	return x;
}
//  Pre-condition: y is a non-null value
	//  Post-condition: The y position of the paddle is returned
public int getY(){
	return y;
}
//  Pre-condition: width is a non-null value
	//  Post-condition: The width of the paddle is returned
public int getWidth(){
	return width;
}
//  Pre-condition: height is a non-null value
	//  Post-condition: The height of the paddle is returned
public int getHeight(){
	return height;
}
//  Pre-condition: velovity is a non-null value
	//  Post-condition: The velocity of the paddle is returned
public int getVelocity(){
	return velocity;
}
//  Pre-condition: x, y, width, and velocity are non-null values
	//  Post-condition: The paddle is set to move
public void move(){
	x+= velocity;
	if (x < 0) x = 0;
	if(x + width > 682) x = 682 - width;

	if (velocity > 0) velocity -= 1;
        else if (velocity < 0) velocity += 1;
}
//  Pre-condition: velocity and v are non-null values
	//  Post-condition: The paddle's velocity is added to its default velocity
public void addVelocity(int v){
	velocity += v;

	if (this.velocity > 20) this.velocity = 20;
    if (this.velocity < -20) this.velocity = -20;
}
//  Pre-condition: x is a non-null value
	//  Post-condition: The horizontal position of the paddle is set
public void setX(int x){
	this.x = x;
}
//Pre-condition: dv and velocity are non-null values
//  Post-condition: The velocity of the paddle is set
public void setVelocity(int dv){
	this.velocity = dv;
}

	
}
