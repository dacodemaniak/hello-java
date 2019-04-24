/**
 * 
 */
package com.ideafactory.hello.patterns;

import com.ideafactory.models.Hero;
import com.ideafactory.models.IgnoreCharacterTypeException;
import com.ideafactory.models.SpiteFul;
import com.ideafactory.models.Character;
/**
 * @author jean-luc
 *
 */
public class HeroFactory {
	public static RepositoryRegistry registryContainer;
	
	public static void setRegistryContainer(RepositoryRegistry registry) {
		HeroFactory.registryContainer = registry;
	}
	
	public static Hero createHero(String name, int lifePoints) {
		return (Hero) new Hero(name).setLifePoints(lifePoints);
	}
	
	public static void createCharacter(String type, String name, int lifePoints, int strength) throws IgnoreCharacterTypeException {
		if (type.toLowerCase().equals("hero")) {
			HeroFactory.registryContainer.getHeroes()
			.add( (Hero) new Hero()
					.setName(name)
					.setLifePoints(lifePoints)
					.setStrength(strength)
			);
			return;
		} else {
			if (type.toLowerCase().equals("spiteful")) {
				HeroFactory.registryContainer.getSpiteFuls()
				.add((SpiteFul) new SpiteFul()
							.setName(name)
							.setLifePoints(lifePoints)
							.setStrength(strength)
				);
				return;
			}
		}
		
		throw new IgnoreCharacterTypeException();
	}
}
