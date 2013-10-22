/**
 * 
 */
package es.juegojava.mapa;

import es.juegojava.common.ItemsType;

/**
 * @author pablo.fernandez
 *
 */
public class ItemArmadura extends Item {

	private int defense;
	
	ItemArmadura(String nombre, int id, int defensePoints) {
		super(nombre, id, ItemsType.ARMADURA);
		
		defense = defensePoints;
	}
	
}