package market;
import java.util.ArrayList;

public class User {
	
	
	public String name; //username
	private int id; //user id
	private double money; //amount of money
	private ArrayList<Card> cards = new ArrayList<>(); //user's cards
	public Payment payment;

	
	
	public User()
	
	{
		
		
	this("null", 0, 0, new ArrayList<>(), Payment.createPayment("null", 0));
		
	}
	
	
	public User(String name)
	
	{
		
		this(name, 0, 0, new ArrayList<>(), Payment.createPayment(name, 0));
		
	}
	
	
	public User(String n, int id,  double m, ArrayList<Card> c, Payment payment)
	
	{
		this.name = n;
		this.id = id;
		this.money = m;
		this.cards = c;
		this.payment = payment;
	
	}
	
public User(String n, int id, Card card, double m, Payment payment)
	
	{
		this.name = n;
		this.id = id;
		this.money = m;
		this.cards.add(card);
		this.payment = payment;

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
