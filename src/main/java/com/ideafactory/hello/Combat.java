/**
 * 
 */
package com.ideafactory.hello;

import java.util.Random;

import com.ideafactory.models.Hero;
import com.ideafactory.models.HeroesRepository;
import com.ideafactory.models.SpiteFul;
import com.ideafactory.models.SpiteFulRepository;
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
		
		return hero.getName() + " combat " + spiteFul.getName() + " => " + winner.getName() + " remporte. Points : " + winner.getLifePoints();
	}
	
	public String fight(HeroesRepository heroes, SpiteFulRepository spiteFuls) {
		int heroIndex = new Random().nextInt(heroes.size());
		int spiteFulIndex = new Random().nextInt(spiteFuls.size());
		
		return this.fight(heroes.get(heroIndex), spiteFuls.get(spiteFulIndex));
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
