package market;

public class ProductNotFoundException extends Exception {
	
	String problem;
	
	public ProductNotFoundException()
	
	{
		super("An error occured...");
		

	
	}
	
	
	public ProductNotFoundException(String msg)
	{
		problem = msg;
		System.out.println(problem);
	}
	
	
	public String getProductNotFoundException()
	{
		return problem;
	}
	
	
	public void setProductNotFoundException(String str)
	{
		if(str != null)
		{
           this.problem = str;
		}
	}

}
