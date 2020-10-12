package com.github.tridimensionaal.finalreality.model.weapon.normal;


import com.github.tridimensionaal.finalreality.model.weapon.AbstractWeapon;


/**
 * A class that holds all the information of a single knife.
 *
 * @author Matías Salim Seda Auil
 */

public class Knife extends AbstractWeapon{
  /**
   * Creates a new knife.
   *
   * {@inheritDoc}
   */



    public Knife( final int damage, final int weight) {
        super("Knife", damage, weight);
  }

}
