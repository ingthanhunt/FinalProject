package entity;

public class SuperBait extends Bait {

	private static String description = "Super Bait, It increase your fish quality more than Good Bait";
	private static String url = "";
	
	public SuperBait(String name,int price, int amount) {
		super(name, description, price, url, amount);
	}

	@Override
	public void bonusPrice(Fish fish) {
		fish.setPrice(fish.getPrice() * 1.5);
	}
	
}
