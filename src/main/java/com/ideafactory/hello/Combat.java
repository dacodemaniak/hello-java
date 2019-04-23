/**
 * 
 */
package com.ideafactory.hello;

import java.util.Random;

import com.ideafactory.models.Hero;
import com.ideafactory.models.SpiteFul;
import com.ideafactory.models.Character;

/**
 * @author Aélion
 *
 */
public class Combat {
	public String fight(Hero hero, SpiteFul spiteFul) {
		
		Character winner = this.fightWinner(hero, spiteFul);
		
		Character looser = winner instanceof Hero ? spiteFul : hero;
		
		switch (winner.compareTo(looser)) {
			case 0:
				winner.wonFight(looser.lostFight(5));
			break;
			
			case 1:
				winner.wonFight(looser.lostFight(10));
			break;
			
			case -1:
				winner.wonFight(looser.lostFight(50));
			break;
		}
		
		return hero.getName() + " combat " + spiteFul.getName() + " => " + winner.getName() + "remporte. Points : " + winner.getLifePoints();
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
