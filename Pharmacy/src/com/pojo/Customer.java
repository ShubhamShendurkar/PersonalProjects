package com.pojo;

// Generated 15 Jun, 2021 6:45:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer cid;
	private String cname;
	private String cphone;
	private Set carts = new HashSet(0);

	public Customer() {
	}

	public Customer(String cname, String cphone, Set carts) {
		this.cname = cname;
		this.cphone = cphone;
		this.carts = carts;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return this.cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

}
