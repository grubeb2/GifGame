package GifGame;

import java.util.ArrayList;
import java.net.MalformedURLException;

public class Player {
	final int NUM_GIFS_HAND = 5;
	String name;
	int pid;
	int score = 0;
	boolean isJudge;

	ArrayList<Gif> hand;
	ArrayList<Gif> listToJudge;

	public Player(int id){
		id = pid;
		hand = new ArrayList<Gif>();
		isJudge = false;
	}
	
	public void addGif(Gif gif)
		throws MalformedURLException
	{
		for(int i = hand.size(); i < NUM_GIFS_HAND; i++)
		{
			hand.add(gif);
		}
	}
	

	//index is the index of this player in the playerlist passed when submit is called
	public ArrayList<Gif> submit(ArrayList<Gif> submission, int index){

		for(Gif gif: submission)
			hand.remove(gif);

		return submission;
	}
	
	public boolean isJudge(){
		return isJudge;
	}
	
	public void setJudge(boolean judge){
		isJudge = judge;
		if (!isJudge){
			listToJudge.clear();
		}
	}

	public void displayGif(Gif gif){

	}

	public void setName(String aName){
		name = aName;
	}

	public String getName(){
		return name;
	}

	public int incrementScore(){
		return score++;
	}

}
