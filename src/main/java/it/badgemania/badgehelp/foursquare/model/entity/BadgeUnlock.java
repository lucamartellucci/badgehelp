package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;
import java.util.Arrays;

public class BadgeUnlock implements Serializable {

	private static final long serialVersionUID = -1266578502619350500L;

	public Checkin[] getCheckins() {
		return checkins;
	}

	private Checkin[] checkins;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BadgeUnlock [checkins=");
		builder.append(Arrays.toString(checkins));
		builder.append("]");
		return builder.toString();
	}
	
	
}
