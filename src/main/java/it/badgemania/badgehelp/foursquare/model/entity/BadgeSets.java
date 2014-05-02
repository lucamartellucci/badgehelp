package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class BadgeSets implements Serializable {

	private static final long serialVersionUID = -538891009716828719L;

	private BadgeSet[] groups;

	public BadgeSet[] getGroups() {
		return groups;
	}

	public void setGroups(BadgeSet[] groups) {
		this.groups = groups;
	}
}
