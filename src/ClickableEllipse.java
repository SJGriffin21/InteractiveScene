import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

public class ClickableEllipse extends Ellipse {

	private Flower flower;
	public ClickableEllipse(Flower flower) {
		this.flower = flower;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		String c = "";
		if (getFillColor() == Color.CYAN){
			flower.setColor(Color.RED);
			c = "Red";
		}
		else if (getFillColor() == Color.RED){
			flower.setColor(Color.MAGENTA);
			c = "Magenta";
		}
		else {
			flower.setColor(Color.CYAN);
			c = "Cyan";
		}
		
		flower.setText(c);
		
	}
}
