package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class Count implements Serializable {

	private static final long serialVersionUID = -471761138324979612L;

	public Long getCount() {
		return count;
	}

	private Long count;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Count [count=");
		builder.append(count);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((count == null) ? 0 : count.hashCode());
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
		Count other = (Count) obj;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		return true;
	}

}
