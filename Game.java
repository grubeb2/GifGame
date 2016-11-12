package GifGame;

import java.util.HashSet;
import java.util.Iterator;
import java.nio.file.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

public class Game {

	final int NUM_GIFS_HAND = 5;
	final String SOURCE = "www.reddit.com/r/gifs/new/";
	final String gifDirectory = "GifDirectory";
	final int TOTAL_NUMBER_GIFS = 200;

	HashSet<Player> players = new HashSet<Player>();
	HashSet<Gif> deck = new HashSet<Gif>();

	public Game(int numberPlayers){

		for (int i=0; i<TOTAL_NUMBER_GIFS; i++){
				try{
		    		deck.add(acquireNewGif());	
		    	}
		    	catch (MalformedURLException e){
		    		System.out.println("ERROR, MalformedURLException!");
		    	}
		    	catch (IOException e){
		    		System.out.println("ERROR, IOException!");
		    	}
		}

		for (int i=0; i<numberPlayers; i++){
			addPlayer();
		}
		dealInitialGifts();
	}

	public Gif acquireNewGif()
		throws MalformedURLException, IOException
	{
		
		String sourceUrl = "";
		URL onlineUrl = new URL(sourceUrl);
		String fileName = onlineUrl.getFile();
		Path targetPath = new File(gifDirectory + fileName).toPath();
		Files.copy(onlineUrl.openStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);

		URL localUrl = this.getClass().getResource(gifDirectory+fileName);
		return new Gif(localUrl);
		
	}

	public void dealInitialGifts(){
		
		for (Player player : players){

		    for (int i=0; i<NUM_GIFS_HAND; i++){
				try{
		    		deck.add(acquireNewGif());	
		    	}
		    	catch (MalformedURLException e){
		    		System.out.println("ERROR, MalformedURLException!");
		    	}
		    	catch (IOException e){
		    		System.out.println("ERROR, IOException!");
		    	}
		    }

		}
	}

	public void addPlayer(){
		//create new player
		// players.add(player);

	}
}