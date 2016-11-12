package GifGame;

import java.util.HashSet;
import java.util.Iterator;


public class Game {

	final int NUM_GIFS_HAND = 5;
	
	HashSet<Player> players = new HashSet<Player>();
	final String SOURCE = "www.reddit.com/r/gifs/new/";

	public Game(int numberPlayers){
		for (int i=0; i<numberPlayers; i++){
			addPlayer();
		}
		dealInitialGifts();
	}

	public Gif generateGif(){
		
		String url = "";
		Gif gif = null;
		return gif;
		
	}

	public void dealInitialGifts(){
		
		for (Player player : players){

		    for (int i=0; i<NUM_GIFS_HAND; i++){
		    	player.addGif(generateGif());
		    }

		}
	}

	public void addPlayer(){
		//create new player
		// players.add(player);

	}
}