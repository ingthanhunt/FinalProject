package Entity;

public class Item {
	private String name;
	private String description;
	private int price;
	
	public Item(String name,String description,int price) {
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.isBlank()) this.name = "Something";
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if(description.isBlank()) this.description = "Just a thing";
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price < 0) this.price = 0;
		this.price = price;
	}
}
 