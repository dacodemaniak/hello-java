package com.ideafactory.hello;

import com.ideafactory.models.Hero;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
    }
    
    public App() {
    	// Create some heroes
    	Hero superman = new Hero("Superman");
    	System.out.println("Hello " + superman.getName());
    }
    
    
}
