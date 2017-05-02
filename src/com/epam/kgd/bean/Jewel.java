package com.epam.kgd.bean;

import java.io.Serializable;

public class Jewel extends Treasure implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String jType;
	private String material;
	private double diameter;
	private double weight;
	
	public Jewel(){
		
	}
	
	
	public String getjType() {
		return jType;
	}


	public void setjType(String jType) {
		this.jType = jType;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public double getDiameter() {
		return diameter;
	}


	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((jType == null) ? 0 : jType.hashCode());
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
		Jewel other = (Jewel) obj;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (jType == null) {
			if (other.jType != null)
				return false;
		} else if (!jType.equals(other.jType))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Jewel [type=" + jType + ", material=" + material + ", diameter=" + diameter + ", weight=" + weight +", id=" +  super.getId() + ", title="
				+ super.getTitle() + ", age=" + super.getAge() + ", price=" + super.getPrice()+"]";
	}

}
