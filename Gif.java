package GifGame;

import java.awt.Image;

public class Gif {

	private Image image;
	private String url;

	public Gif(Image image, String url){
		this.image = image;
		this.url = url;
	}
	
	public Image getImage(){
		return this.image;
	}
	
	public String getUrl(){
		return this.url;
	}
	
}