package market;

import java.util.ArrayList;
import java.util.Iterator;

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
	
}
