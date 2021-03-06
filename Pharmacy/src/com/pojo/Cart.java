package com.pojo;

// Generated 15 Jun, 2021 6:45:23 PM by Hibernate Tools 3.4.0.CR1

/**
 * Cart generated by hbm2java
 */
public class Cart implements java.io.Serializable {

	private Integer cartid;
	private Customer customer;
	private String cusname;
	private String seletedmedicine;
	private Integer selectedquantity;
	private Double price;
	private Integer total;

	public Cart() {
	}

	public Cart(Customer customer, String cusname, String seletedmedicine, Integer selectedquantity, Double price,
			Integer total) {
		this.customer = customer;
		this.cusname = cusname;
		this.seletedmedicine = seletedmedicine;
		this.selectedquantity = selectedquantity;
		this.price = price;
		this.total = total;
	}

	public Integer getCartid() {
		return this.cartid;
	}

	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCusname() {
		return this.cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getSeletedmedicine() {
		return this.seletedmedicine;
	}

	public void setSeletedmedicine(String seletedmedicine) {
		this.seletedmedicine = seletedmedicine;
	}

	public Integer getSelectedquantity() {
		return this.selectedquantity;
	}

	public void setSelectedquantity(Integer selectedquantity) {
		this.selectedquantity = selectedquantity;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
