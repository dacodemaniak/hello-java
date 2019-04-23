package com.ideafactory.hello;

import com.ideafactory.hello.patterns.HeroFactory;
import com.ideafactory.models.Hero;
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
    	// Create some heroes
    	Hero superman = new Hero("Superman");
    	System.out.println("Hello " + superman.getName());
    	
    	Hero heilreiser = (new Hero("Hellreiser")).setLifePoints(100);
    	System.out.println("Hello : " + heilreiser.getName());
    	
    	// En utilisant classFactory
    	Hero spiderman = HeroFactory.createHero("Spiderman", 200);
    	System.out.println("Hello : " + spiderman.getName());
    	
    	// Création d'un méchant
    	SpiteFul joker = (new SpiteFul())
    				.setName("Joker")
    				.setLifePoints(200);
    	
    	Combat fight = new Combat();
    	System.out.println(fight.fight(spiderman, joker));
    	
    }
    
    public App(String heroesName) {
    	// Create another Hero
    	Hero batman = new Hero(heroesName);
    	System.out.println("Hello " + batman.getName());
    }
}
