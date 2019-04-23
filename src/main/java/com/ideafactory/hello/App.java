package com.ideafactory.hello;

import com.ideafactory.hello.patterns.HeroFactory;
import com.ideafactory.models.Hero;
import com.ideafactory.models.HeroesRepository;
import com.ideafactory.models.SpiteFul;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new App();
        new App("Batman");
    }
    
    /**
     * Constructeur de la classe App
     */
    public App() {
    	// Create Hero repository
    	HeroesRepository heroes = new HeroesRepository();
    	
    	// Create some heroes
    	Hero superman = new Hero("Superman");
    	heroes.add(superman);
    	System.out.println("Hello " + superman.getName());
    	
    	
    	Hero heilreiser = (Hero) (new Hero("Hellreiser")).setLifePoints(100);
    	heroes.add(heilreiser);
    	
    	// En utilisant classFactory
    	Hero spiderman = HeroFactory.createHero("Spiderman", 200);
    	spiderman.setStrength(100);
    	heroes.add(spiderman);
    	
    	// Création d'un méchant
    	SpiteFul joker = (SpiteFul) (new SpiteFul())
    			.setName("Joker")
    			.setLifePoints(200)
    			.setStrength(150);
    	
    	Combat fight = new Combat();
    	System.out.println(fight.fight(spiderman, joker));
    	
    	// Dump of heroes
    	System.out.println(heroes.dump());    	
    }
    
    public App(String heroesName) {
    	// Create another Hero
    	Hero batman = new Hero(heroesName);
    	System.out.println("Hello " + batman.getName());
    }
}
