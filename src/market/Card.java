package market;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.Data;


@Data
public class Card {
	
	public String name;

	public ArrayList<Product> products = new ArrayList<>();
	
	public Card()
	
	{
		
		this("null", new ArrayList<>());
		
	}
	
	public Card(String n, Product product)
	{
		this.name = n;
		this.products.add(product);
	}
	
	public Card(String n, ArrayList<Product> prod)
	
	{
		this.name = n;
		this.products = prod;
	}
	
	public void addProduct(Product product)
	
	{
		products.add(product);
		OnlineStore.addProduct();
		
		
	}
	
	public void removeProduct(String n)
	
	{
		
		Iterator<Product> iterator = products.iterator();
		
		while(iterator.hasNext())
			
		{
			Product product = iterator.next();
			
			if(product.name.equals(n))
				
			{
				
				iterator.remove();
				
				break;
				
			}
			
		}
	
	}
	
	
	public void removeProductByBrand(String b)
	
	{
		
		Iterator<Product> iterator = products.iterator();
		
		while(iterator.hasNext())
			
		{
			
			Product product = iterator.next();
			
			if(product.brand.equals(b))
			
			{
				
				iterator.remove();
				OnlineStore.removeProduct();
				break;
				
			}
			
		}
	
		
	}
	
	public ArrayList<Product> getProducts()
	{
		
		return products;
		
	}
	
	
	public void showProducts()
	
	{
		for(Product product : products)
			
		{
			
			System.out.println("name: " + product.name + "brand: " + product.brand + "price" + product.price);
			
		}
	}
}
