package com.delivery.api.burger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "burger")

public class Burger {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer burgerId ;
	
	@Column(name = "burgername")
	private String burgerName ;
	
	@Column(name = "burgertype")
	private String burgerType ;
	
	@Column(name = "ingredients")
	private String ingredients ;
	
	@Column(name = "price")
	private Integer price ;
	
	
	public Integer getBurgerId() {
		return burgerId;
	}
	public void setBurgerId(Integer burgerId) {
		this.burgerId = burgerId;
	}
	public String getBurgerName() {
		return burgerName;
	}
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}
	public String getBurgerType() {
		return burgerType;
	}
	public void setBurgerType(String burgerType) {
		this.burgerType = burgerType;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((burgerId == null) ? 0 : burgerId.hashCode());
		result = prime * result + ((burgerName == null) ? 0 : burgerName.hashCode());
		result = prime * result + ((burgerType == null) ? 0 : burgerType.hashCode());
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Burger other = (Burger) obj;
		if (burgerId == null) {
			if (other.burgerId != null)
				return false;
		} else if (!burgerId.equals(other.burgerId))
			return false;
		if (burgerName == null) {
			if (other.burgerName != null)
				return false;
		} else if (!burgerName.equals(other.burgerName))
			return false;
		if (burgerType == null) {
			if (other.burgerType != null)
				return false;
		} else if (!burgerType.equals(other.burgerType))
			return false;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Burger [burgerId=" + burgerId + ", burgerName=" + burgerName + ", burgerType=" + burgerType
				+ ", ingredients=" + ingredients + ", price=" + price + "]";
	}
	
	

}
