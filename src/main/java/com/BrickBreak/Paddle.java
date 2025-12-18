package com.BrickBreak;


import java.awt.*;

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
public int getX(){
	return x;
}
public int getY(){
	return y;
}
public int getWidth(){
	return width;
}
public int getHeight(){
	return height;
}
public int getVelocity(){
	return velocity;
}
public void move(){
	x+= velocity;
	if (x < 0) x = 0;
	if(x + width > 682) x = 682 - width;

	if (velocity > 0) velocity -= 1;
        else if (velocity < 0) velocity += 1;
}
public void addVelocity(int v){
	velocity += v;

	if (this.velocity > 20) this.velocity = 20;
    if (this.velocity < -20) this.velocity = -20;
}
public void setX(int x){
	this.x = x;
}
public void setVelocity(int dv){
	this.velocity = dv;
}

	
}
