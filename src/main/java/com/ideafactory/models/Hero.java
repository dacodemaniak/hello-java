/**
 * 
 */
package com.ideafactory.models;

/**
 * @author jean-luc
 *
 */

public class Hero {

	private String name;
	private int lifePoints;
	
	public Hero(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public Hero setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
		return this;
	}
	
	public int combat() {
		if ( this.lifePoints > 50 ) {
			return this.lifePoints - 50;
		}
		return 0;
	}
	
	
}
