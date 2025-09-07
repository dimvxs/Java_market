package market;

import java.time.LocalDate;
import java.util.Random;

public class Payment {

	private String cardNumber;
	private int cvv;
	private String holderName;
	private double money;
	private LocalDate validPeriod;
	private LocalDate today = LocalDate.now();
	
	
	public Payment()
	{
		cardNumber = "0000000000000000";
		cvv = 000;
		holderName = "null";
		money = 0;
		validPeriod = today.plusYears(2);
	}
	

	

	
	public boolean isValidCard(String cardNumber, LocalDate validPeriod)
	
	{
		
		return cardNumber != null && cardNumber.length() == 16 && validPeriod.isAfter(today);
		
		
	}
	
	private boolean isValidCvv(int cvv)
	
	{
		
		int length = String.valueOf(cvv).length();
		
		
		if(length == 3)
			
		{
			return true;
		}
		
	     return false;
	}
	
	
	
	public Payment(String cardNumber, int cvv, String holderName, double money, LocalDate validPeriod)
	
	{
		if(isValidCard(cardNumber, validPeriod))
		{
			this.cardNumber = cardNumber;
			this.validPeriod = validPeriod;
		}
  
		
		if(isValidCvv(cvv))
		{
			this.cvv = cvv;
		}

		
		if(holderName != null) {
			
		this.holderName = holderName;
		
		}
		
		if(money > 0 && money < 50000) {
			
			this.money = money;
		}
		
	}
	
	public Payment(String cardNumber, int cvv, String holderName, double money)
	{
		this(cardNumber, cvv, holderName, money, LocalDate.now().plusYears(2));
	}
	
	
	public static Payment createPayment(String name, double money)
	
	{
		StringBuilder cardNumberBuilder = new StringBuilder();
		
		for (int i = 0; i < 16; i++) {
		    int digit = (int) (Math.random() * 10); 
		    cardNumberBuilder.append(digit);
		}
		
		String cardNumber = cardNumberBuilder.toString();
		
		
		
		Random random = new Random();
		
		int cvv = random.nextInt(900) + 100;
		
		
		
	
		
	    LocalDate validDate = LocalDate.now().plusYears(2);
		
		return new Payment(cardNumber, cvv, name, money, validDate);
		
		
		
	}
	
	
	
	public double getMoney()
	{
		return this.money;
	}
	
	
	public String getHolderName()
	{
		return this.holderName;
	}
	
	
	public LocalDate getValidPeriod()
	{
		return this.validPeriod;
	}
	
	public String getCardNumber()
	{
		return this.cardNumber;
	}
	
	public int getCvv()
	{
		return this.cvv;
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
	
}
