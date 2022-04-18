import java.awt.Color;

import wheels.users.ConversationBubble;

public class ColorConversationBubble extends ConversationBubble{

	private Flower flower;
	public ColorConversationBubble(Flower flower) {
		super("");
		this.flower = flower;
	}
	
	public void setMessage() {
		//flower.getColor();
		this.setText("" + flower.getColor());
	}
}
