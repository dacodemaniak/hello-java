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
	
	public Hero() {}
	
	public int combat() {
		if ( this.lifePoints > 50 ) {
			return this.lifePoints - 50;
		}
		return 0;
	}

	@Override
	public void lostFight() {
		// TODO Auto-generated method stub
		this.lifePoints -= 10;
		
	}

	@Override
	public void wonFight() {
		// TODO Auto-generated method stub
		this.lifePoints += 10;
		
	}


	@Override
	public int lostFight(int points) {
		// TODO Auto-generated method stub
		this.lifePoints -= points;
		return points;
	}


	@Override
	public void wonFight(int points) {
		// TODO Auto-generated method stub
		this.lifePoints += points;
	}
	
	
}
