
public class Product {

	private String name;
	// camelCase
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitInStock;

	// private: Sadece o classın içinde kullanılabilen .
	// set yazmak get okumak içindir
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

}
