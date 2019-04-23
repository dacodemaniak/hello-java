/**
 * 
 */
package com.ideafactory.hello;

import java.util.Random;

import com.ideafactory.models.Hero;
import com.ideafactory.models.SpiteFul;
import com.ideafactory.models.Character;

/**
 * @author jean-luc
 *
 */
public class Combat {
	public String fight(Hero hero, SpiteFul spiteFul) {
		
		Character winner = this.fightWinner(hero, spiteFul);
		winner.wonFight();
		
		if (winner instanceof Hero) {
			spiteFul.lostFight();
		} else {
			hero.lostFight();
		}
		
		return hero.getName() + " combat " + spiteFul.getName() + " => " + winner.getName();
	}
	
	private Character fightWinner(Hero hero, SpiteFul spiteFul) {
		Random random = new Random();
		int value = random.nextInt(2);
		if (value == 0) {
			return (Character) hero;
		}
		return (Character) spiteFul;
	}
}
