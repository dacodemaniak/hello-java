/**
 * 
 */
package com.ideafactory.hello.patterns;

import com.ideafactory.models.Hero;

/**
 * @author jean-luc
 *
 */
public class HeroFactory {
	public static Hero createHero(String name, int lifePoints) {
		return (Hero) new Hero(name).setLifePoints(lifePoints);
	}
}
