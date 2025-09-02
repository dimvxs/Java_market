package market;
import java.util.ArrayList;

public class User {
	
	
	public String name; //username
	private int id; //user id
	private ArrayList<Card> cards = new ArrayList<>(); //user's cards
	
	
	public User()
	
	{
		
		
	this("null", 0, new ArrayList<>());
		
	}
	
	
	public User(String name)
	
	{
		
		this(name, 0, new ArrayList<>());
		
	}
	
	
	public User(String n, int id, ArrayList<Card> c)
	
	{
		this.name = n;
		this.id = id;
		this.cards = c;
	}
	
public User(String n, int id, Card card)
	
	{
		this.name = n;
		this.id = id;
		this.cards.add(card);
	}
	
	
	public void setName(String n)
	
	{
		
		this.name = n;
		
	}
	
	
	public int getId()
	
	{
		
		return this.id;
		
	}
	
	public void setId(int id)
	
	{
		
		this.id = id;
		
	}
	
	public void setCard(Card card)
	
	{
		
		this.cards.add(card);
		
		
	}
	
	public ArrayList<Card> getCards()
	
	{
		return cards;
	}

}
