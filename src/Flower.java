import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.*;

public class Flower {
	//Create the flower for the vase

	private ConversationBubble bubble;
	private ClickableEllipse petal1,  petal2, petal3, petal4;
	private Ellipse center;
	private Line stem;
	
	public Flower(ConversationBubble bubble) {
		
		this.bubble = bubble;
		
		stem = new Line();
		stem.setColor(Color.GREEN.darker());
		stem.setThickness(5);			// create the flower
		
		petal1 = new ClickableEllipse(this);
		petal1.setSize(20, 10);
		petal1.setFrameColor(Color.BLACK);
		
		petal2 = new ClickableEllipse(this);
		petal2.setSize(20, 10);
		petal2.setFrameColor(Color.BLACK);
		
		petal3 = new ClickableEllipse(this);
		petal3.setSize(10, 20);
		petal3.setFrameColor(Color.BLACK);
		
		petal4 = new ClickableEllipse(this);
		petal4.setSize(10, 20);
		petal4.setFrameColor(Color.BLACK);
		
		center = new Ellipse();
		center.setColor(Color.YELLOW);
		center.setSize(10, 10);
		center.setFrameColor(Color.BLACK);
	}
	public void setColor(Color color) {
		petal1.setFillColor(color);
		petal2.setFillColor(color);
		petal3.setFillColor(color);   // sets the color of the petals to the same as the vase
		petal4.setFillColor(color);
	}
	
	public void setLocation(int x, int y) {
		stem.setP1(x + 15, y + 5);
		stem.setP2(x + 15 , y - 25);
		center.setLocation(x + 10, y - 30);    // sets the location of the flower based on the numbers set for the vase
		petal1.setLocation(x - 5, y - 30);
		petal2.setLocation(x + 15, y - 30);
		petal3.setLocation(x + 10, y - 45);
		petal4.setLocation(x + 10, y - 25);
		bubble.setLocation(x - 150, y - 125);
	}
	
	
	public Color getColor() {
		return petal1.getColor();
	}
	
	public void setText(String c) {
		bubble.setText(c);
	}
}
