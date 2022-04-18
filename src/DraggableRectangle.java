import java.awt.event.MouseEvent;

import wheels.users.*;


public class DraggableRectangle extends RoundedRectangle{

	private Moveable moveable;
	int previousMouseX = 0;
	int previousMouseY = 0;
	
	public DraggableRectangle(Moveable movable) {
		this.moveable = movable;
	}
	
	public void mousePressed(MouseEvent e) {
		previousMouseX = e.getX();
		previousMouseY = e.getY();
	}
	public void mouseDragged(MouseEvent e) {
		int diffX = e.getX() - previousMouseX;
		int diffY = e.getY() - previousMouseY;
		moveable.move(diffX, diffY);
		previousMouseX = e.getX();
		previousMouseY = e.getY();
	}
}
