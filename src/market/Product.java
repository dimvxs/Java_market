package market;

public class Product implements Purchasable{

	public String name;
	public String brand;
	public double price;
	
	public Product()
	
	{
		name = new String("null");
		brand = new String("null");
		price = 0.0;
	}
	
	public Product(String n)
	
	{
		
		this(n, "null", 0);
		
	}
	
	public Product(String n, String b)
	
	{
		
		this(n, b, 0);
		
	}
	
	public Product(String n, String b, double p)
	
	{
		
		try {
			
			if(n != null)
			{
				
				this.name = new String(n);
				
			}
			
			if(b != null)
			{
				
				this.brand = new String(b);
				
			}
			
			if(p > 0)
			{
				this.price = p;
			}
		}
		
		catch(Exception e)
		
		{
			
			System.out.println("error: " + e);
			
		}

	}
	
	
	public void showProduct()
	
	{
		System.out.println("Product name: " + name + "brand: " + brand + "price: " + price);
	}
	
	@Override
	protected void finalize() throws Throwable 
	
	{
		System.out.println("Обьект Product удален");
		super.finalize();
	}
	
	public void buy(String name, User user)
	
	{
		try 
		
		{
			if(name.equals(this.name) && user.checkMoney() >= this.price)
				
			{
				System.out.println("you bought" + this.name + " for: " + this.price + "$");
				
				user.withdraw(this.price);
			}
			
			
		} 
		
		catch(Exception e)
		{
			System.out.println("error: " + e);
		}

		
	}
	
	
	
	public void buy(User user)
	
	{
		try 
		
		{
			if(user.checkMoney() >= this.price)
				
			{
				System.out.println("you have bought" + this.name + " for: " + this.price + "$");
				
				user.withdraw(this.price);
			}
			
			
		} 
		
		catch(Exception e)
		{
			System.out.println("error: " + e);
		}

		
	}
	
	
	
	public void refund(String name, User user)
	
	{
		
		try
		
		{
			if(name.equals(this.name) && this.price > 100)
			{
				System.out.println("you have returned" + this.name + ", you will get back" + (this.price / 100 * 90) + "$" );
				double sumToReturn = this.price / 100 * 90;
				user.addMoney(sumToReturn);
			}
		}
		
		catch(Exception e)
		
		{
			System.out.println("error: " + e);
		}
		
	}
	
	
}
