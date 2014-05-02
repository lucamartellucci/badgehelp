package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;
import java.util.Arrays;

public class BadgeImage implements Serializable {

	private static final long serialVersionUID = 3839275051310645747L;

	public String getPrefix() {
		return prefix;
	}

	public Integer[] getSizes() {
		return sizes;
	}

	public String getName() {
		return name;
	}

	private String prefix;
	private Integer[] sizes;
	private String name;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BadgeImage [prefix=");
		builder.append(prefix);
		builder.append(", sizes=");
		builder.append(Arrays.toString(sizes));
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
		result = prime * result + Arrays.hashCode(sizes);
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
		BadgeImage other = (BadgeImage) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (prefix == null) {
			if (other.prefix != null)
				return false;
		} else if (!prefix.equals(other.prefix))
			return false;
		if (!Arrays.equals(sizes, other.sizes))
			return false;
		return true;
	}
	
}
