import java.util.HashSet;

public class Player {

	public Player(){
		HashSet<String> hand = new HashSet<String>();
		boolean judge = false;
		start();
	}
	
	public void addGif(Gif gif){
		hand.add(gif);
	}
}
