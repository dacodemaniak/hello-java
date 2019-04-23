package com.ideafactory.models;

public class SpiteFul extends Character {
	
	public String toString() {
		return this.getName() + " : " + this.lifePoints;
	}
	@Override
	public void lostFight() {
		// TODO Auto-generated method stub
		this.lifePoints -= 20;
		
	}
	@Override
	public void wonFight() {
		// TODO Auto-generated method stub
		this.lifePoints += 5;
		
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
