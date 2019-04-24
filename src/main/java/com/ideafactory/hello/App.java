package com.ideafactory.hello;

import com.ideafactory.hello.interfaces.Repository;
import com.ideafactory.hello.patterns.HeroFactory;
import com.ideafactory.hello.patterns.RepositoryRegistry;
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
    	
    	// Refactorage en passant par un Registry
    	RepositoryRegistry repositories = new RepositoryRegistry();
    	repositories.add("heroes", heroes);
    	repositories.add("spitefuls", spiteFuls);
    	
    	// Use HeroFactory to create Heroes and SpiteFul
    	try {
    		// Injecter le "registry" des listes de personnages
    		HeroFactory.setRegistryContainer(repositories);
    		
    		HeroFactory.createCharacter("hero", "superman", 100, 200);
    		
    		HeroFactory.createCharacter("hero", "Hellreiser", 150, 80);
    		
    		HeroFactory.createCharacter("hero", "Spiderman", 100, 200);
    		
    		HeroFactory.createCharacter("spiteful", "Joker", 150, 250);
    		
    		HeroFactory.createCharacter("spiteful", "Dracula", 100, 100);
    		
    		HeroFactory.createCharacter("mechant", "Bad", 200, 150);
    	
        	
    	} catch (IgnoreCharacterTypeException e) {
    		System.out.println("Erreur : "  + e.getMessage());
    	} catch (Exception e) {
    		
    	}
    	
    	// Dump of heroes
    	System.out.println(repositories.getSpiteFuls().dump());
    	
    	// Un combat aléatoire
    	Combat aleatFight = new Combat();
    	System.out.println(aleatFight.fight(repositories.getHeroes(), repositories.getSpiteFuls()));
    }
   	
}
