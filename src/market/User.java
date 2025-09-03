package market;
import java.util.ArrayList;

public class User {
	
	
	public String name; //username
	private int id; //user id
	private double money; //amount of money
	private ArrayList<Card> cards = new ArrayList<>(); //user's cards

	
	
	public User()
	
	{
		
		
	this("null", 0, 0, new ArrayList<>());
		
	}
	
	
	public User(String name)
	
	{
		
		this(name, 0, 0, new ArrayList<>());
		
	}
	
	
	public User(String n, int id,  double m, ArrayList<Card> c)
	
	{
		this.name = n;
		this.id = id;
		this.money = m;
		this.cards = c;
	
	}
	
public User(String n, int id, Card card, double m)
	
	{
		this.name = n;
		this.id = id;
		this.money = m;
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
	
	
	public void setMoney(double money)
	
	{
		this.money = money;
	}
	
	
	public void addMoney(double money)
	
	{
		this.money += money;
	}
	
	
	public void withdraw(double money)
	
	{
		this.money -= money;
	}
	
	public double checkMoney() //returns amount on the account
	
	{
		return this.money;
	}
	
	
	

}
