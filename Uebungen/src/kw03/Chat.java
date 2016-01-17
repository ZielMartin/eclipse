package kw03;

import java.util.Observable;
import java.util.Observer;

public class Chat extends Observable{
	private String name;
	private String text = "";
	
	public Chat(String name, Observer o){
		this.name = name;
		addObserver(o);
	}
	
	public void send(String message){
		setChanged();
		notifyObservers(message);
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
