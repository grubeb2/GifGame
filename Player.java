package GifGame;

import java.util.ArrayList;
import java.net.MalformedURLException;

public class Player {
	final int NUM_GIFS_HAND = 5;
	ArrayList<Gif> hand;
	boolean judge;
	String Name;
	
	public Player(String s){
		hand = new ArrayList<Gif>();
		judge = false;
		Name = s;
	}
	
	public void addGif(Gif gif)
		throws MalformedURLException
	{
		for(int i = hand.size(); i < NUM_GIFS_HAND; i++)
		{
			hand.add(gif);
		}
	}
	
	public String getName(){
		return Name;
	}
	
	public ArrayList<Gif> submit(ArrayList<Gif> submission){
		return submission;
	}
	
	public void discard(ArrayList<Gif> gifList){
		for(Gif gif: gifList)
			hand.remove(gif);
	}
	
	public void isJudge(){
		judge = true;
	}
	
	public ArrayList<Gif> judgeChoice(ArrayList<ArrayList<Gif>> gifList, int choice){
		return gifList.get(choice);
	}
}
