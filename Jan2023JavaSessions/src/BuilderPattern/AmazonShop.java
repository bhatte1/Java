package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {
		
		Shopping shop = new Shopping();
		
		
		shop.addToCart("Biscuit").login().doPayment("123456");

	}

}
