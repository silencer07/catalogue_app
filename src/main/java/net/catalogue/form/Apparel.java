package net.catalogue.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPAREL")
public class Apparel {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String apparelname;
	
	private int price;
	
	private int stock;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getApparelname() {
		return apparelname;
	}


	public void setApparelname(String apparelname) {
		this.apparelname = apparelname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString(){
		return "id="+id+", apparelname="+apparelname+", price="+price+", stock="+stock;
	}
}