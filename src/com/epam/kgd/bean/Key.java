package com.epam.kgd.bean;

import java.io.Serializable;

public class Key extends Treasure implements Serializable {
	private static final long serialVersionUID = 1L;

	private int size;
	private String type;
	private String whatOpen;

	public Key() {
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWhatOpen() {
		return whatOpen;
	}

	public void setWhatOpen(String whatOpen) {
		this.whatOpen = whatOpen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + size;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((whatOpen == null) ? 0 : whatOpen.hashCode());
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
		Key other = (Key) obj;
		if (size != other.size)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (whatOpen == null) {
			if (other.whatOpen != null)
				return false;
		} else if (!whatOpen.equals(other.whatOpen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Key [size=" + size + ", type=" + type + ", whatOpen=" + whatOpen + ", id=" + super.getId() + ", title="
				+ super.getTitle() + ", age=" + super.getAge() + ", price=" + super.getPrice() + "]";
	}

}
