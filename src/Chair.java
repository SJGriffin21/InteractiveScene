import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Rectangle;
import wheels.users.RoundedRectangle;

public class Chair implements Moveable{
	//Create a chair

	//private RoundedRectangle back, rest1, rest2;
	private DraggableRectangle back, rest1, rest2;
	private Rectangle leg1, leg2, seat;
	int previousMouseX = 0;
	int previousMouseY = 0;
	
	public Chair(int x, int y, Color color) {
		Color brown = new Color(111, 78, 55);
		
		leg1 = new Rectangle();
		leg1.setSize(10, 30);
		leg1.setLocation(205, 230);		 //creates the parts of the chair
		leg1.setFillColor(brown);
		leg1.setFrameColor(Color.BLACK);
		
		leg2 = new Rectangle();
		leg2.setSize(10, 30);
		leg2.setLocation(265, 230);
		leg2.setFillColor(brown);
		leg2.setFrameColor(Color.BLACK);
		
		back = new DraggableRectangle(this);
		back.setFrameColor(Color.BLACK);
		back.setSize(80, 110);
		back.setLocation(200, 95);
		
		seat = new Rectangle();
		seat.setLocation(200, 200);
		seat.setSize(80, 30);
		seat.setFrameColor(Color.BLACK);
		
		rest1 = new DraggableRectangle(this);
		rest1.setFrameColor(Color.BLACK);
		rest1.setSize(15, 30);
		rest1.setLocation(195, 175);
		
		rest2 = new DraggableRectangle(this);
		rest2.setFrameColor(Color.BLACK);
		rest2.setSize(15, 30);
		rest2.setLocation(270, 175);
		
		setLocation(x, y);		//set the location and color
		setColor(color);
	}
	
	public void setLocation(int x, int y) {
		seat.setLocation(x, y);
		leg1.setLocation(x + 5, y + 30);
		leg2.setLocation(x + 65, y + 30);
		back.setLocation(x, y - 105);					//set the chair location relative to each other
		rest1.setLocation(x - 5, y - 25);
		rest2.setLocation(x + 70, y - 25);
	}
	public void setColor(Color color) {
		seat.setFillColor(color);
		back.setFillColor(color);				//sets the color of the chair
		rest1.setFillColor(color);
		rest2.setFillColor(color);
	}
	// gets the location based of the piece that uses x and y themselves
	public int getX() {
		return seat.getXLocation();
	}
	
	public int getY() {
		return seat.getYLocation();
	}
	//gets the color of one piece because the main ones are all the same
	public void getColor() {
		seat.getFillColor();
	}

	@Override
	public void move(int dx, int dy) {
		this.setLocation(this.getX() + dx,this.getY() + dy);

	}
	
}
