package GifGame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Scanner;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.nio.file.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

public class Game {

	final int NUM_GIFS_HAND = 5;
	final String gifFile = "urlfile.txt";
	final int TOTAL_NUMBER_GIFS = 200;

	ArrayList<Player> players = new ArrayList<Player>();
	Queue<String> deck = new LinkedList<String>(); //store the URLs of GIFs (white cards)
	Queue<String> prompts = new LinkedList<String>(); //store the prompts (black cards)

	public Game(int numberPlayers){

		loadGifUrls();

		for (int i=0; i<numberPlayers; i++){
			addPlayer();
		}
		dealInitialGifs();
	}


	//take in a GIF's URL and return the GIF itself as a Gif object
	public Gif acquireNewGif(String source)
		throws MalformedURLException, IOException
	{

		Image image = null;
		try {
			URL url = new URL(source);
		    image = ImageIO.read(url);
		} catch (IOException e) {
			System.out.println("ERROR, could not open GIF at " + source);
		}
		return new Gif(image);
		
	}

	public void dealInitialGifs(){
		
		for (Player player : players){

		    for (int i=0; i<NUM_GIFS_HAND; i++){
				try{
		    		player.addGif( acquireNewGif(deck.poll()));
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

	public void loadGifUrls(){

		File file = new File(gifFile);
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				String nextLine = input.nextLine();
				deck.add(nextLine);
			}
		}
		catch (FileNotFoundException e){
			System.out.println("ERROR, " + gifFile + " not found!");
		}

	}
	
	public void game(){
		boolean winner = false;
		int startJudge = 0;
		while(winner != true){
			round( startJudge, winner);
			startJudge++;
			if(startJudge == players.size())
				startJudge = 0;
		}
	}
	
	public void round(int judge, boolean endgame){
		for(Player play: players){
			
		}
	}

	public void addPlayer(){
		//create new player
		// players.add(player);

	}
}
