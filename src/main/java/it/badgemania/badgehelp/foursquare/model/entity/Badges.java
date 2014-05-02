package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;
import java.util.Arrays;

public class Badges implements Serializable {

	private static final long serialVersionUID = 4610940737520258516L;

	public Badges(BadgeSets sets, Badge[] badges, String defaultSetType) {
		this.sets = sets;
		this.badges = badges;
		this.defaultSetType = defaultSetType;
	}

	public BadgeSets getSets() {
		return sets;
	}

	public Badge[] getBadges() {
		return badges;
	}

	public String getDefaultSetType() {
		return defaultSetType;
	}

	private BadgeSets sets;
	private Badge[] badges;
	private String defaultSetType;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Badges [sets=");
		builder.append(sets);
		builder.append(", badges=");
		builder.append(Arrays.toString(badges));
		builder.append(", defaultSetType=");
		builder.append(defaultSetType);
		builder.append("]");
		return builder.toString();
	}

}
