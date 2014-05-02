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

package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;



/**
 * Class representing Warning entity
 *
 * @author Antti Leppä
 */
public class Warning implements Serializable {
  
  private static final long serialVersionUID = 7167332454422034014L;

  /**
   * Returns warning text
   * 
   * @return warning text
   */
  public String getText() {
    return text;
  }
  
  private String text;
}
