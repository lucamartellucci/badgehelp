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

import java.io.Serializable;



/**
 * Entity representing "Message" notification
 * 
 * @author Antti Leppä
 */
public class MessageNotification implements Serializable {

  private static final long serialVersionUID = 1341444447020549517L;

  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }

  private String message;
}
