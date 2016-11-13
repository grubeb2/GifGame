package GifGame;

import java.util.ArrayList;
import java.net.MalformedURLException;

public class Player {
	final int NUM_GIFS_HAND = 5;
	ArrayList<Gif> hand;
	boolean judge;

	public Player(){
		hand = new ArrayList<Gif>();
		judge = false;
	}
	
	public void addGif(Gif gif)
		throws MalformedURLException
	{
		for(int i = hand.size(); i < NUM_GIFS_HAND; i++)
		{
			hand.add(gif);
		}
	}
	
	public ArrayList<Gif> submit(ArrayList<Gif> thing){
		return thing;
	}
	
	public void discard(ArrayList<Gif> thing){
		for(Gif part: thing)
			hand.remove(part);
	}
	
	public void isJudge(){
		judge = true;
	}
	
	public ArrayList<Gif> judgeChoice(ArrayList<ArrayList<Gif>> choices, int n){
		//ArrayList<Gif> answer = new ArrayList<Gif>();
		return choices.get(n);
	}
}
