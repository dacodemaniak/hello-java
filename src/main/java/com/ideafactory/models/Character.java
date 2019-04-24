/**
 * 
 */
package com.ideafactory.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ideafactory.database.MySqlConnect;

/**
 * @author jean-luc
 *
 */
public abstract class Character implements Comparable<Character> {
	
	protected String name;
	protected int lifePoints;
	protected int strength = 100;

	protected final String tableName = "characters";
	
	protected final String query = "INSERT INTO " + this.tableName + "(name,lifepoints,strength) VALUES (?,?,?);";
	
	
	public int compareTo(Character character) {
		if (character.getStrength() == this.getStrength() ) {
			return 0;
		}
		
		return character.getStrength() > this.getStrength() ? -1 : 1;
	}
	
	public boolean persist() {
		try {
			Connection connexion = MySqlConnect.getConnexion();
			PreparedStatement sqlStatement = connexion.prepareStatement(this.query);
			sqlStatement.setString(1, this.getName());
			sqlStatement.setInt(2, this.getLifePoints());
			sqlStatement.setInt(3, this.getStrength());
			sqlStatement.execute();
			MySqlConnect.close();
			return true;
 		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
				
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
