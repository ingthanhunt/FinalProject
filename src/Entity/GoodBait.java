package entity;

public class GoodBait extends Bait{

	private static String description = "Good Bait, It little increase your fish quality";
	private static String url = " ";
	
	public GoodBait(String name, int price, int amount) {
		super(name, description, price, url, amount);
	}

	@Override
	public void bonusPrice(Fish fish) {
		fish.setPrice(fish.getPrice() * 1.2);
	}

}
