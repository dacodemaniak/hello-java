/**
 * 
 */
package com.ideafactory.hello.patterns;

import java.util.HashMap;

import com.ideafactory.hello.interfaces.Registrable;
import com.ideafactory.hello.interfaces.Repository;
import com.ideafactory.models.Hero;
import com.ideafactory.models.HeroesRepository;
import com.ideafactory.models.SpiteFul;
import com.ideafactory.models.SpiteFulRepository;

/**
 * @author Aélion
 *
 */
public class RepositoryRegistry {
	private HashMap<String, Registrable> repositories = new HashMap<String, Registrable>();
	
	public void add(String key, Registrable repository) {
		this.repositories.put(key, repository);
	}
	
	public HeroesRepository getHeroes() {
		return (HeroesRepository) this.repositories.get("heroes");
	}
	
	public SpiteFulRepository getSpiteFuls() {
		return (SpiteFulRepository) this.repositories.get("spitefuls");
	}
}
