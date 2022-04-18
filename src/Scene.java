import java.awt.Color;

import wheels.users.*;

public class Scene extends Frame
{
	private ConversationBubble bubble;
	private Vase vase;
	private Table table;	//Initialize the variables for objects
	private Chair chair1, chair2;
	
	
	public Scene()
	{
		Color brown = new Color(111, 78, 55);
		// Add objects to the frame
		bubble = new ConversationBubble("");
		table = new Table(360, 270, brown);
		vase = new Vase(370, 230, Color.CYAN, bubble); 		//Create the objects in scene
		chair1 = new Chair(260, 320, Color.RED);
		chair2 = new Chair(485, 320, Color.BLUE);
		
		
		
	}
	
	public static void main(String[] args)
    {
		new Scene();		//Create the scene
	}
}
