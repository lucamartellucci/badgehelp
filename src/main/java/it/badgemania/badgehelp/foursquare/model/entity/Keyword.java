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
 * Class representing Keyword entity
 * 
 * @author Antti Leppä
 */
public class Keyword implements Serializable {

  private static final long serialVersionUID = -3697725825647022962L;

  /**
   * Returns display name
   * 
   * @return display name
   */
  public String getDisplayName() {
    return displayName;
  }
  
  /**
   * Returns keyword
   * 
   * @return keyword
   */
  public String getKeyword() {
    return keyword;
  }
  
  private String displayName;
  private String keyword;
}