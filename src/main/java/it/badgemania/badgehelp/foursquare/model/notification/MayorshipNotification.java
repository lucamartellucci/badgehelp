/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package it.badgemania.badgehelp.foursquare.model.notification;


import it.badgemania.badgehelp.foursquare.model.entity.CompactUser;

import java.io.Serializable;

/**
 * Entity representing "Mayorship" notification
 * 
 * @author Antti Leppä
 */
public class MayorshipNotification implements Serializable {

  private static final long serialVersionUID = 5504414040235439757L;

  /**
   * Returns type 
   * 
   * @return type
   */
  public String getType() {
    return type;
  }
  
  /**
   * Returns checkins count
   * 
   * @return checkins count
   */
  public Long getCheckins() {
    return checkins;
  }
  
  /**
   * Returns number of days user is behind current mayor
   * 
   * @return number of days user is behind current mayor
   */
  public Long getDaysBehind() {
    return daysBehind;
  }
  
  /**
   * Returns user
   * 
   * @return user
   */
  public CompactUser getUser() {
    return user;
  }
  
  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }
  
  /**
   * Returns image
   * 
   * @return image
   */
  public String getImage() {
    return image;
  }

  private String type;
  private Long checkins;
  private Long daysBehind;
  private CompactUser user;
  private String message;
  private String image;
}