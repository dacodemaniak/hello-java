/**
 * 
 */
package com.ideafactory.models;

/**
 * @author jean-luc
 *
 */

public class Hero extends Character {

	
	public Hero(String name) {
		this.name = name;
	}
	
	
	public int combat() {
		if ( this.lifePoints > 50 ) {
			return this.lifePoints - 50;
		}
		return 0;
	}

	@Override
	public void lostFight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wonFight() {
		// TODO Auto-generated method stub
		
	}
	
	
}
