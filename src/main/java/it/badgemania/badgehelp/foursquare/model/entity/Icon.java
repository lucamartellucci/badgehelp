package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class Icon implements Serializable {
	
	private static final long serialVersionUID = 8517939390300867121L;
	
	private String prefix;
	private String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	

}
