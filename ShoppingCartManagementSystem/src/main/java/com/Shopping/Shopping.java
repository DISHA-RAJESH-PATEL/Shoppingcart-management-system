package com.Shopping;

public class Shopping {
	private int id;
	private String Itemname;
	private String Brand;
	private int Quantity;
	private int Price;

	public Shopping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shopping(int id, String itemname, String brand, int quantity, int price) {
		super();
		this.id = id;
		Itemname = itemname;
		Brand = brand;
		Quantity = quantity;
		Price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return Itemname;
	}

	public void setItemname(String itemname) {
		Itemname = itemname;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Shopping [id=" + id + ", Itemname=" + Itemname + ", Brand=" + Brand + ", Quantity=" + Quantity
				+ ", Price=" + Price + "]";
	}

}
