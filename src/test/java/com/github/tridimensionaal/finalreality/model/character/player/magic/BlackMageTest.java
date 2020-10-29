package com.github.tridimensionaal.finalreality.model.character.player.magic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.github.tridimensionaal.finalreality.model.character.ICharacter;
import com.github.tridimensionaal.finalreality.model.character.enemy.Enemy;
import com.github.tridimensionaal.finalreality.model.character.player.*;
import com.github.tridimensionaal.finalreality.model.weapon.IWeapon;
import com.github.tridimensionaal.finalreality.model.weapon.normal.*;
import com.github.tridimensionaal.finalreality.model.weapon.magic.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * A class that tests the class Black Mage.
 *
 * @author Ignacio Slater Muñoz.
 * @author Matías Salim Seda Auil
 * @see BlackMage 
 */
class BlackMageTest extends AbstractMagicPlayerCharacterTest{

  IPlayerCharacter blackMage = new BlackMage(turns, NAME, HEALTH, DEFENSE, MANA);

  /**
   * Setup method.
   */
  @BeforeEach
  void setUp() {
    super.basicSetUp();
    testWeapon = new Staff(15,10,10);
    testCharacters.add(new BlackMage(turns, NAME, HEALTH, DEFENSE, MANA));

  }

  /**
   * Checks that the black mage's constructor and equals method works properly.
   */
  @Test
  void constructorTest() {
    //Same blackMage
    IMagicPlayerCharacter blackMage1 = new BlackMage(turns, NAME , HEALTH, DEFENSE,MANA);
    //Different name
    IMagicPlayerCharacter blackMage2= new BlackMage(turns, NAME2, HEALTH, DEFENSE, MANA);
    //Different health
    IMagicPlayerCharacter blackMage3 = new BlackMage(turns, NAME , HEALTH2, DEFENSE, MANA);
    //Different defense
    IMagicPlayerCharacter blackMage4 = new BlackMage(turns, NAME , HEALTH, DEFENSE2,MANA);
    //Different name and health
    IMagicPlayerCharacter blackMage5 = new BlackMage(turns, NAME2, HEALTH2, DEFENSE,MANA);
    //Different name and defense
    IMagicPlayerCharacter blackMage6 = new BlackMage(turns, NAME2, HEALTH, DEFENSE2,MANA);
    //Different health and defense
    IMagicPlayerCharacter blackMage7 = new BlackMage(turns, NAME , HEALTH2, DEFENSE2,MANA);
    //All different 
    IMagicPlayerCharacter blackMage8 = new BlackMage(turns, NAME2, HEALTH2, DEFENSE2,MANA);

    checkConstruction(blackMage,blackMage1,blackMage2,blackMage3,blackMage4,blackMage5,blackMage6, blackMage7, blackMage8);

    //Different name
    blackMage2= new BlackMage(turns, NAME2 , HEALTH, DEFENSE, MANA2);
    //Different health
    blackMage3 = new BlackMage(turns, NAME , HEALTH2, DEFENSE, MANA2);
    //Different defense
    blackMage4 = new BlackMage(turns, NAME , HEALTH, DEFENSE2,MANA2);
    //Different name and health
    blackMage5 = new BlackMage(turns, NAME2, HEALTH2, DEFENSE,MANA2);
    //Different name and defense
    blackMage6 = new BlackMage(turns, NAME2, HEALTH, DEFENSE2,MANA2);
    //Different health and defense
    blackMage7 = new BlackMage(turns, NAME , HEALTH2, DEFENSE2,MANA2);
    //All different 
    blackMage8 = new BlackMage(turns, NAME2, HEALTH2, DEFENSE2,MANA2);

    checkConstruction(blackMage,blackMage1,blackMage2,blackMage3,blackMage4,blackMage5,blackMage6, blackMage7, blackMage8);

  }

  /**
   * Checks that the equipWeapon method works properly.
   */
  @Test
    void equipWeaponTest() {
        IPlayerCharacter blackMage1 = new BlackMage(turns, "hola",10,10,10);

        IWeapon axeTest = new Axe(10,10);
        IWeapon bowTest = new Bow(10,10);
        IWeapon knifeTest = new Knife(10,10);
        IWeapon swordTest = new Sword(10,10);
        IWeapon staffTest = new Staff(10,10,10);


        assertNull(blackMage1.getEquippedWeapon());

        blackMage1.equipWeapon(axeTest);
        assertNull(blackMage1.getEquippedWeapon());

        blackMage1.equipWeapon(swordTest);
        assertNull(blackMage1.getEquippedWeapon());

        blackMage1.equipWeapon(bowTest);
      assertNull(blackMage1.getEquippedWeapon());

      blackMage1.equipWeapon(knifeTest);
        assertEquals(blackMage1.getEquippedWeapon(), knifeTest);

        blackMage1.equipWeapon(staffTest);
        assertEquals(blackMage1.getEquippedWeapon(), staffTest);

        IPlayerCharacter blackMage2 = new BlackMage(turns, "hola",0,0,0);
        blackMage2.equipWeapon(staffTest);
        assertNull(blackMage2.getEquippedWeapon());

    }

 
 
    @Test
    void attackTest(){
        IMagicPlayerCharacter blackMage1 = new BlackMage(turns, "hola", 20,10,10);
        //weapon Damage = 15
        blackMage1.equipWeapon(testWeapon);
        ICharacter enemy = new Enemy(turns,"hola",15,5,10,10);
        blackMage1.attack(enemy);
        assertEquals(enemy.getHealth(),5);
        blackMage1.attack(enemy);
        assertEquals(enemy.getHealth(),0);
        enemy.attack(blackMage1);

    }
}


