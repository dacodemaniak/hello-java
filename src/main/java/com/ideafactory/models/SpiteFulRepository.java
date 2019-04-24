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
public class SpiteFulRepository implements Repository<SpiteFul> {

	private ArrayList<SpiteFul> repository = new ArrayList<SpiteFul>();

	public void add(SpiteFul object) {
		this.repository.add(object);
		
	}

	public void remove(SpiteFul object) {
		int index = this.repository.indexOf(object);
		
		if (index > -1) {
			this.repository.remove(index);
		}
		
	}

	public SpiteFul get(int index) {
		if (index >= this.repository.size() - 1) {
			return this.repository.get(index);
		}
		return null;
	}
	
	public int size() {
		return this.repository.size();
	}
	
	/**
	 * 
	 * @return String
	 */
	public String dump() {
		String allHeroes = "";
		
		for(SpiteFul spiteFul : this.repository) {
			allHeroes += spiteFul.getName() + '\n';		
		}
		
		return allHeroes;
	}

}
