package entity;

public class BasicBait extends Bait{
 
	private static String description = "Just a bait.";
	private static String url = "BasicBait.png";
	
	public BasicBait(String name,int price,int amount) {
		super(name, description, price, url, amount);
	}
	
	public void bonusPrice(Fish fish) {
		fish.setPrice(fish.getPrice() * 1);
	}
	
	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}

}
