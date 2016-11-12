package GifGame;

import java.util.HashSet;
import java.net.MalformedURLException;

public class Player {

	HashSet<Gif> hand;
	boolean judge;

	public Player(){
		hand = new HashSet<Gif>();
		judge = false;
	}
	
	public void addGif(Gif gif)
		throws MalformedURLException
	{
		hand.add(gif);
	}
}
