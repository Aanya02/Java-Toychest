//This program includes Instance variable 
class BuyerOfCar {
	public String name;
	private double price;
	BuyerOfCar (String buyName) {
		name = buyName;
	}
	public void setPrice(double buyPrice) {
		price = buyPrice;
	}
	public void printBuy() {
		System.out.println("name : " + name );
		System.out.println("price : " + price);
	}
}


public class Five
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BuyerOfCar buyOne = new BuyerOfCar("Bob");
		buyOne.setPrice(175000.00);
		buyOne.printBuy();
	}
}
