import java.awt.Color;

import wheels.users.*;

public class Table {
	//Create a Table
	
	private Ellipse tableTop;
	private Rectangle tableLeg1, tableLeg2, tableLeg3, tableLeg4;
	
	public Table(int x, int y, Color color) {
		Color brown = new Color(111, 78, 55);

		tableLeg1 = new Rectangle();
		tableLeg1.setSize(10, 70);				//create the table
		tableLeg1.setFillColor(brown);
		tableLeg1.setFrameColor(Color.BLACK);
		
		tableLeg2 = new Rectangle();
		tableLeg2.setSize(10, 80);
		tableLeg2.setFillColor(brown);
		tableLeg2.setFrameColor(Color.BLACK);
		
		tableLeg3 = new Rectangle();
		tableLeg3.setSize(10, 80);
		tableLeg3.setFillColor(brown);
		tableLeg3.setFrameColor(Color.BLACK);
		
		tableLeg4 = new Rectangle();
		tableLeg4.setSize(10, 80);
		tableLeg4.setFillColor(brown);
		tableLeg4.setFrameColor(Color.BLACK);
		
		tableTop = new Ellipse();
		tableTop.setSize(110, 50);
		tableTop.setFillColor(brown);
		tableTop.setFrameColor(Color.BLACK);
		
		setLocation(x, y);		//Set the location and color
		setColor(color);
		
	}
	
	public void setLocation(int x, int y) {
		tableTop.setLocation(x, y);
		tableLeg1.setLocation(x + 10, y + 20);
		tableLeg2.setLocation(x + 80, y + 5);		//set the table location relative to each other
		tableLeg3.setLocation(x + 85, y + 20);
		tableLeg4.setLocation(x + 15, y + 20);
	}
	
	public void setColor(Color color) {
		tableTop.setFillColor(color);
		tableLeg1.setFillColor(color); 			//Sets the fill color, keeping the frame the same
		tableLeg2.setFillColor(color);
		tableLeg3.setFillColor(color);
		tableLeg4.setFillColor(color);
	}
	// gets the location based of the piece that uses x and y themselves
	public void getX() {
		tableTop.getXLocation();
	}
	
	public void getY() {
		tableTop.getYLocation();
	}
	//gets the color of one piece because they are all the same
	public void getColor() {
		tableTop.getColor();
	}
	
}
