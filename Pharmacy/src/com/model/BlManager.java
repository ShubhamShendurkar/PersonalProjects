package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Cart;
import com.pojo.Customer;
import com.pojo.Stock;
import com.pojo.Supplier;

public class BlManager 
{
	SessionFactory con = new Configuration().configure().buildSessionFactory();
	
	//*************Stock*****************
	
	public void saveMedicines(Stock s)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(s);
		t1.commit();
		s1.close();
	}
	
	public List<Stock> viewStock()
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		List<Stock> list = cr.list();
		return list;
	}
	
	public void updatemedicine(Stock s)
	{
		Session s1=con.openSession();
		Transaction t1=s1.beginTransaction();
		s1.update(s);
		t1.commit();
		s1.close();
		
	}
	
	public Stock searchbyId(int id)
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("sid", id));
		Stock s = (Stock) cr.uniqueResult();
		return s;
	}
	public void updateStock(Stock s)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.update(s);
		t1.commit();
		s1.close();
	}
	public void deleteStock(Stock s)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.delete(s);
		t1.commit();
		s1.close();
	}
	
	public Stock searchbyStockName(String mname)
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("mname", mname));
		Stock s = (Stock) cr.uniqueResult();
		return s;
	}
	
	//**************CUSTOMER****************
	
	public void saveCustomer(Customer c)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(c);
		t1.commit();
		s1.close();
	}
	
	public List<Customer> viewAllCustomer()
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Customer.class);
		List<Customer> list = cr.list();
		return list;
	}
	
	public Customer searchByCustomerName(String cname)
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Customer.class);
		cr.add(Restrictions.eq("cname",cname));
		Customer cu = (Customer) cr.uniqueResult();
		return cu;
	}
	
	//****************SUPPLIER***********
	
	public void saveSupplier(Supplier su)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(su);
		t1.commit();
		s1.close();
		
	}
	
	public List<Supplier> viewSupplier()
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Supplier.class);
		List<Supplier> list = cr.list();
		return list;
	}
	
	public Supplier searchBySupplierId(int id)
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Supplier.class);
		cr.add(Restrictions.eq("supid", id));
		Supplier su = (Supplier) cr.uniqueResult();
		return su;
	}
	
	public void updateSupplier(Supplier su)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.update(su);
		t1.commit();
		s1.close();
	}
	
	public void deleteSupplier(Supplier su)
	{
		Session s1 = con.openSession();
		Transaction t1 =s1.beginTransaction();
		s1.delete(su);
		t1.commit();
		s1.close();
	}
	
	//*************************CART***************
	
	public void saveCart(Cart c)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(c);
		t1.commit();
		s1.close();
	}
	
	
	public List<Cart> searchbycname(String cname)
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Cart.class);
		cr.add(Restrictions.eq("cusname", cname));
		List<Cart> c = cr.list();
		return c;
	}
	
	
	
	
	
}
