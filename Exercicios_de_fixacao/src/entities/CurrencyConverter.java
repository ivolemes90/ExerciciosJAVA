package entities;

public class CurrencyConverter {
	public static double AmountToBePaid(double price, double amount) {
		return price * amount * 1.06; 
	}	
}
