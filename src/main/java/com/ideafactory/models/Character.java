/**
 * 
 */
package com.ideafactory.models;

/**
 * @author jean-luc
 *
 */
public abstract class Character implements Comparable<Character> {
	
	protected String name;
	protected int lifePoints;
	protected int strength = 100;

	
	public int compareTo(Character character) {
		if (character.getStrength() == this.getStrength() ) {
			return 0;
		}
		
		return character.getStrength() > this.getStrength() ? 1 : -1;
	}
	
	/**
	 * Set character name
	 * @param name
	 * @return Character
	 */
	public Character setName(String name) {
		this.name = name;
		return this;
	}
	
	/**
	 * Get character name
	 * @return String
	 */
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
	
	public Character setStrength(int strength) {
		this.strength = strength;
		return this;
	}
	
	public int getStrength() {
		return this.strength;
	}
	
	public abstract void lostFight();
	public abstract void wonFight();
	public abstract int lostFight(int points);
	public abstract void wonFight(int points);
}
