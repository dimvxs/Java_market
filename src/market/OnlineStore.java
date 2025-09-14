package market;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.Data;


@Data
public class OnlineStore {

	private ArrayList<User> users = new ArrayList<>();
	public static int productsCount;
	
	static
	
	{
		
		 productsCount = 0;
		 
	}
	
	public void addUser(User u)
	
	{
		
		users.add(u);
		
	}
	
	public void removeUser(int id)
	
	{
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext())
			
		{
			User user = iterator.next();
			
			if(user.getId() == id)
			{
				iterator.remove();
				break;
			
			}
			
		}
		
		
	}
	
	
	public static void addProduct()
	
	{
		
		productsCount++;
		
	}
	
	
   public static void removeProduct()
	
	{
		
		productsCount--;
		
	}
   
   
   public void purchaseAll(User user)
   {
	   
	  ArrayList<Card> cards = user.getCards();
	  
	  for(Card card: cards)
		  
	  {
		  
	        ArrayList<Product> products = card.getProducts();
	        
	        for(Product product : products)
	        	
	        {
	        	product.buy(product.name, user);
	        }
		  
	  }
   }
	   


}
