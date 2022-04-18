import java.awt.Color;

import wheels.users.*;

public class Vase implements Moveable
{
	//Create a Vase
	
	private Flower flower;
	private Ellipse opening;
	private DraggableRectangle base;
	private ConversationBubble bubble;
	
	public Vase(int x, int y, Color color, ConversationBubble bubble)
	{
		
		this.bubble = bubble;
		
		base = new DraggableRectangle(this);
		base.setSize(30, 70);// create the base of the vase
		base.setFillColor(Color.CYAN);
		base.setFrameColor(Color.BLACK);
		
		opening = new Ellipse();
		opening.setSize(40, 25);  //create the flared opening of the vase
		opening.setFillColor(Color.CYAN);
		opening.setFrameColor(Color.BLACK);
		
		flower = new Flower(bubble); 
	
		
		setLocation(x, y);		//Set the location and color
		setColor(color);
		
	}
	
	public void setLocation(int x, int y) {
		base.setLocation(x, y);
		opening.setLocation(x - 5, y - 10);		//Set the location relative to each other
		flower.setLocation(x, y);
	}
	
	public void setColor(Color color) {
		base.setFillColor(color);
		opening.setFillColor(color);		//Set the colors 
		flower.setColor(color);
	}
	// getX and getY each get the location of the piece that isn't relative to the others
	public int getX() {
		return base.getXLocation();
	}
	
	public int getY() {
		return base.getYLocation();
	}
	// getColor gets only the base because they are all the same
	public void getColor() {
		base.getFillColor();
	}
	
	@Override
	public void move(int dx, int dy) {
		this.setLocation(this.getX() + dx,this.getY() + dy);
	}
	
}
