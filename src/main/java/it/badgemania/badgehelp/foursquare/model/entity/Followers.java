package it.badgemania.badgehelp.foursquare.model.entity;


public class Followers extends Count {

	private static final long serialVersionUID = 515243441227032017L;

	private UserGroup[] groups;

	public UserGroup[] getGroups() {
		return groups;
	}

	public void setGroups(UserGroup[] groups) {
		this.groups = groups;
	}

}
