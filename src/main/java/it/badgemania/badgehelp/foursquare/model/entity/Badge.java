package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class Badge implements Serializable {

	private static final long serialVersionUID = 9033183293071443519L;
	
	private String id;
	private String badgeId;
	private String name;
	private String hint;
	private String description;
	private BadgeImage image;
	private BadgeUnlock[] unlocks;

	public String getId() {
		return id;
	}

	public String getBadgeId() {
		return badgeId;
	}

	public String getName() {
		return name;
	}

	public String getHint() {
		return hint;
	}

	public String getDescription() {
		return description;
	}

	public BadgeImage getImage() {
		return image;
	}

	public BadgeUnlock[] getUnlocks() {
		return unlocks;
	}
	
	

}
