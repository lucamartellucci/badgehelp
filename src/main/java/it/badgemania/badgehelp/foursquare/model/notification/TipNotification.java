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


import it.badgemania.badgehelp.foursquare.model.entity.CompleteTip;

import java.io.Serializable;

/**
 * Entity representing "Tip" notification
 * 
 * @author Antti Leppä
 *
 */
public class TipNotification implements Serializable {

  private static final long serialVersionUID = -4625637368235280260L;

  /**
   * Returns name
   * 
   * @return name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns tip entity itself
   * 
   * @return tip entity itself
   */
  public CompleteTip getTip() {
    return tip;
  }

  private String name;
  private CompleteTip tip;
}
