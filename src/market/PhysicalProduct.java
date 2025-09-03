package market;

public abstract class PhysicalProduct extends Product{

	public double weight;
	public double width;
	public double height;
	
	PhysicalProduct()

	{
		this.weight = 0;
		this.width = 0;
		this.height = 0;
	}
	
	PhysicalProduct(double weight, double width, double height)
	{
		this.weight = weight;
		this.width = width;
		this.height = height;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
}
