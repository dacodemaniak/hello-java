/**
 * 
 */
package com.ideafactory.hello;

import com.ideafactory.models.Hero;
import com.ideafactory.models.SpiteFul;

/**
 * @author jean-luc
 *
 */
public class Combat {
	public String fight(Hero hero, SpiteFul spiteFul) {
		return hero.getName() + " combat " + spiteFul.getName();
	}
}
