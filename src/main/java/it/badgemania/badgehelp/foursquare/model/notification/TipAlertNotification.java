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
 * Entity representing "TipAlert" notification
 * 
 * @author Antti Leppä
 */
public class TipAlertNotification implements Serializable {

  private static final long serialVersionUID = -2491430362788377600L;

  /**
   * Returns tip entity itself
   * 
   * @return tip entity itself
   */
  public CompleteTip getTip() {
    return tip;
  }

  private CompleteTip tip;
}
