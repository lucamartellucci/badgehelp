package it.badgemania.badgehelp.foursquare.model.entity;

import java.util.Arrays;

public class HereNow extends Count {

	private static final long serialVersionUID = -39143307292834176L;

	private CheckinGroup[] groups;
	private String summary;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setGroups(CheckinGroup[] groups) {
		this.groups = groups;
	}

	public CheckinGroup[] getGroups() {
		return groups;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HereNow [groups=");
		builder.append(Arrays.toString(groups));
		builder.append(", summary=");
		builder.append(summary);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(groups);
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
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
		HereNow other = (HereNow) obj;
		if (!Arrays.equals(groups, other.groups))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		return true;
	}
	
}
