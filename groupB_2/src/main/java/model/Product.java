package model;

public class Product {
	private String pid;
	private String pname;
	private String unitprice;
	private String stock;
	private String category;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product() {
		super();
	}
	public Product(String pid, String pname, String unitprice, String stock, String category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.unitprice = unitprice;
		this.stock = stock;
		this.category = category;
	}

	

}
