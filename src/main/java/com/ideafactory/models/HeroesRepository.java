/**
 * 
 */
package com.ideafactory.models;

import java.util.ArrayList;

import com.ideafactory.hello.interfaces.Repository;

/**
 * @author jean-luc
 *
 */
public class HeroesRepository implements Repository<Hero> {
	
	private ArrayList<Hero> heroes = new ArrayList<Hero>();
	
	public final void add(Hero object) {
		this.heroes.add(object);
		
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
		String allHeroes = new String();
		
		for(Hero hero : this.heroes) {
			allHeroes += hero.getName() + '\n';		
		}
		
		return allHeroes;
	}
	
}
