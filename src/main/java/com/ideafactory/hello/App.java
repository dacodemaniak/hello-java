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
    		
    		Hero hellreiser = (Hero) HeroFactory.createCharacter("hero", "Hellreiser", 150, 80);
    		heroes.add(hellreiser);
    		
    		Hero spiderman = (Hero) HeroFactory.createCharacter("hero", "Spiderman", 100, 200);
    		heroes.add(spiderman);
    		SpiteFul joker = (SpiteFul) HeroFactory.createCharacter("spiteful", "Joker", 150, 250);
    		spiteFuls.add(joker);
    		
    		SpiteFul dracula = (SpiteFul) HeroFactory.createCharacter("spiteful", "Dracula", 100, 100);
    		spiteFuls.add(dracula);
    		
    		SpiteFul bad = (SpiteFul) HeroFactory.createCharacter("mechant", "Bad", 200, 150);
    		spiteFuls.add(bad);
        	
    	} catch (IgnoreCharacterTypeException e) {
    		System.out.println("Une erreur est survenue lors de la création d'un des personnages");
    		System.out.println(e.getMessage());
    	}
    	
    	// Dump of heroes
    	System.out.println(heroes.dump());
    	
    	// Un combat aléatoire
    	Combat aleatFight = new Combat();
    	System.out.println(aleatFight.fight(heroes, spiteFuls));
    	
   	
    }
    
    public App(String heroesName) {
    	// Create another Hero
    	Hero batman = new Hero(heroesName);
    	System.out.println("Hello " + batman.getName());
    }
}
