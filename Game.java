
const NUM_GIFS_HAND = 5;
public class Game(){
	
	HashSet<Player> players = new HashSet<Player>();
	const String SOURCE;

	public Game(int numberPlayers){
		for (int i=0; i<numberPlayers; i++){
			addPlayer();
		}
		dealInitialGifts();
	}

	public Gif generateGif(){
		
	}

	public void dealInitialGifts(){
		Iterator player = players.iterator();
		
		while (player.hasNext()) {
			player = player.next();

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