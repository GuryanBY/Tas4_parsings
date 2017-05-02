package com.epam.kgd.bean;

import java.io.Serializable;

public class Ring extends Treasure implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String material;
	private double weight;
	private String style;
	private boolean hasPreciousStone;
	
public Ring(){}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public String getStyle() {
	return style;
}

public void setStyle(String style) {
	this.style = style;
}

public boolean isHasPreciousStone() {
	return hasPreciousStone;
}

public void setHasPreciousStone(boolean hasPreciousStone) {
	this.hasPreciousStone = hasPreciousStone;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + (hasPreciousStone ? 1231 : 1237);
	result = prime * result + ((material == null) ? 0 : material.hashCode());
	result = prime * result + ((style == null) ? 0 : style.hashCode());
	long temp;
	temp = Double.doubleToLongBits(weight);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ring other = (Ring) obj;
	if (hasPreciousStone != other.hasPreciousStone)
		return false;
	if (material == null) {
		if (other.material != null)
			return false;
	} else if (!material.equals(other.material))
		return false;
	if (style == null) {
		if (other.style != null)
			return false;
	} else if (!style.equals(other.style))
		return false;
	if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
		return false;
	return true;
}

@Override
public String toString() {
	return "Ring [material=" + material + ", weight=" + weight + ", style=" + style + ", hasPreciousStone="
			+ hasPreciousStone +", id=" +  super.getId() + ", title="
					+ super.getTitle() + ", age=" + super.getAge() + ", price=" + super.getPrice()+ "]";
}



}
