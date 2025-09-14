package market;

import lombok.Data;

@Data
public abstract class DigitalProduct extends Product{
	
	public String category;
	public int id;
	
	
	public DigitalProduct()
	{
		category = new String("null");
		id = 0;
	}

	
	public DigitalProduct(String category, int id)
	{
		
		try {
			
			if(category != null)
			{
				this.category = new String(category);
			}
			
			if(id > 0)
			{
				this.id = id;
			}
			
		} 
		
		catch(Exception e)
		{
			System.out.println("error: " + e);
		}
	
	}
	
	public DigitalProduct(String name, String brand, double price, String category, int id)
	
	{
		
		super(name, brand, price);
		
		try {
			
			
			if(category != null)
			{
				this.category = new String(category);
			}
			
			if(id > 0)
			{
				this.id = id;
			}
			
			
			
		} 
		
		catch(Exception e)
		{
			System.out.println("error: " + e);
		}
	
	}
	
	
	public void setId(int id)
	
	{
		
	try {
		
		
		
		if(id > 0)
		{
			this.id = id;
		}
			
		
		
			
		} 
		
		catch(Exception e)
		{
			System.out.println("error: " + e);
		}
	}
	
	
	public void setCategory(String category)
	{
		
		if(category != null)
		{
			this.category = new String(category);
		}
		
		
	}

}
