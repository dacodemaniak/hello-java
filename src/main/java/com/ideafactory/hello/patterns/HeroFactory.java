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
	public static Hero createHero(String name, int lifePoints) {
		return (Hero) new Hero(name).setLifePoints(lifePoints);
	}
	
	public static Character createCharacter(String type, String name, int lifePoints, int strength) throws IgnoreCharacterTypeException {
		if (type.toLowerCase() == "hero") {
			return (Character) new Hero()
					.setName(name)
					.setLifePoints(lifePoints)
					.setStrength(strength);
		} else {
			if (type.toLowerCase() == "spiteful") {
				return (Character) new SpiteFul()
							.setName(name)
							.setLifePoints(lifePoints)
							.setStrength(strength);
			}
		}
		throw new IgnoreCharacterTypeException();
	}
}
