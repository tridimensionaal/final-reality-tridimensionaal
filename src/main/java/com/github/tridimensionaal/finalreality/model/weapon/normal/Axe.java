package com.github.tridimensionaal.finalreality.model.weapon.normal;


import com.github.tridimensionaal.finalreality.model.weapon.AbstractWeapon;

/**
 * A class that holds all the information of a single axe.
 *
 * @author Matías Salim Seda Auil
 */
 
public class Axe extends AbstractWeapon{

  /**
   * Creates a new staff.
   *
   * {@inheritDoc}
   */

    public Axe( final int damage, final int weight) {
        super("Axe", damage, weight);
  }

}
