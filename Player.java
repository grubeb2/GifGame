package GifGame;

import java.util.HashSet;

public class Player {

	HashSet<Gif> hand;
	boolean judge;

	public Player(){
		hand = new HashSet<Gif>();
		judge = false;
	}
	
	public void addGif(Gif gif){
		hand.add(gif);
	}
}
