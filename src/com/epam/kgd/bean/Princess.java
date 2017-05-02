package com.epam.kgd.bean;

import java.io.Serializable;

public class Princess extends Treasure implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private boolean damnation;
	private String birthPlace;

	public Princess() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDamnation() {
		return damnation;
	}

	public void setDamnation(boolean damnation) {
		this.damnation = damnation;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime * result + (damnation ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Princess other = (Princess) obj;
		if (birthPlace == null) {
			if (other.birthPlace != null)
				return false;
		} else if (!birthPlace.equals(other.birthPlace))
			return false;
		if (damnation != other.damnation)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Princess [name=" + name + ", damnation=" + damnation + ", birthPlace=" + birthPlace + ", id="
				+ super.getId() + ", title=" + super.getTitle() + ", age=" + super.getAge() + ", price="
				+ super.getPrice() + "]";
	}

}
