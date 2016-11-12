package GifGame;

import java.util.ArrayList;
import java.net.MalformedURLException;

public class Player {

	ArrayList<Gif> hand;
	boolean judge;

	public Player(){
		hand = new ArrayList<Gif>();
		judge = false;
	}
	
	public void addGif(Gif gif)
		throws MalformedURLException
	{
		hand.add(gif);
	}
}
