package com.ideafactory.hello;

import com.ideafactory.hello.patterns.HeroFactory;
import com.ideafactory.models.Hero;
import com.ideafactory.models.HeroesRepository;
import com.ideafactory.models.IgnoreCharacterTypeException;
import com.ideafactory.models.SpiteFul;
import com.ideafactory.models.SpiteFulRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new App();
    }
    
    /**
     * Constructeur de la classe App
     */
    public App() {
    	// Create Hero repository
    	HeroesRepository heroes = new HeroesRepository();
    	SpiteFulRepository spiteFuls = new SpiteFulRepository();
    	
    	// Use HeroFactory to create Heroes and SpiteFul
    	try {
    		Hero superman = (Hero) HeroFactory.createCharacter("hero", "superman", 100, 200);
    		heroes.add(superman);
    	} catch (IgnoreCharacterTypeException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	Hero hellreiser = (Hero) HeroFactory.createCharacter("hero", "Hellreiser", 150, 80);
    	Hero spiderman = (Hero) HeroFactory.createCharacter("hero", "Spiderman", 100, 200);
    	SpiteFul joker = (SpiteFul) HeroFactory.createCharacter("spiteful", "Joker", 150, 250);
    	SpiteFul dracula = (SpiteFul) HeroFactory.createCharacter("spiteful", "Dracula", 100, 100);
    	
    	
    	heroes.add(hellreiser);
    	heroes.add(spiderman);
    	
    	spiteFuls.add(joker);
    	spiteFuls.add(dracula);
    	
    	
    	// Un combat simple...
    	Combat fight = new Combat();
    	System.out.println(fight.fight(spiderman, joker));
    	
    	// Un combat aléatoire
    	Combat aleatFight = new Combat();
    	System.out.println(aleatFight.fight(heroes, spiteFuls));
    	
    	// Dump of heroes
    	System.out.println(heroes.dump());    	
    }
    
    public App(String heroesName) {
    	// Create another Hero
    	Hero batman = new Hero(heroesName);
    	System.out.println("Hello " + batman.getName());
    }
}
