/**
 * 
 */
package com.ideafactory.models;

/**
 * @author jean-luc
 *
 */
public abstract class Character {
	protected String name;
	protected int lifePoints;
	
	public Character setName(String name) {
		this.name = name;
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Character setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
		return this;
	}
	
	public int getLifePoints() {
		return this.lifePoints;
	}
	
	public abstract void lostFight();
	public abstract void wonFight();
}
