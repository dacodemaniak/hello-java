/**
 * 
 */
package com.ideafactory.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ideafactory.database.MySqlConnect;
import com.ideafactory.hello.interfaces.Repository;

/**
 * @author jean-luc
 *
 */
public class HeroesRepository implements Repository<Hero> {
	
	private ArrayList<Hero> heroes = new ArrayList<Hero>();
	
	public final void add(Hero object) {
		this.heroes.add(object);
		
		// Automate persistance
		object.persist();
	}

	public final void remove(Hero object) {
		int index = this.heroes.indexOf(object);
		
		if (index >= 0 ) {
			this.heroes.remove(index);
		}
		
	}

	public final Hero get(int index) {
		if (index >= 0 ) {
			return this.heroes.get(index);
		}
		return null;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String dump() {
		String allHeroes = "";
		
		for(Hero hero : this.heroes) {
			allHeroes += hero.getName() + '\n';		
		}
		
		return allHeroes;
	}
	

	public int size() {
		return this.heroes.size();
	}
}
