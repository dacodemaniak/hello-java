/**
 * 
 */
package com.ideafactory.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import com.ideafactory.utils.AppProperties;

/**
 * @author jean-luc
 * @category Singleton
 *
 */
public class MySqlConnect {
	private HashMap<String, String> properties = new HashMap<String, String>();
	
	/**
	 * Stocke de manière statique l'instance de connexion au serveur
	 */
	private static Connection instance = null;
	
	/**
	 * Constructeur privé, interdisant l'utilisation du new MySqlConnect()
	 */
	private MySqlConnect() {
		AppProperties.readProperties();
		this.properties = AppProperties.getProperties();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				MySqlConnect.instance = DriverManager.getConnection(  
						"jdbc:mysql://" + this.properties.get("host") + ":" + this.properties.get("port") + "/" + this.properties.get("database"), 
						this.properties.get("user"), 
						this.properties.get("password")
				);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Access denied for : " + this.properties.get("user") + " on " + this.properties.get("host") + " : " + e.getMessage());
			}  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnexion() {
		if (MySqlConnect.instance != null) {
			System.out.println("J'ai déjà une instance, je te la retourne");
			return MySqlConnect.instance;
		}
		
		System.out.println("J'instancie et je te retourne");
		new MySqlConnect();
		return MySqlConnect.instance;
		
	}
	
	public static void close() {
		try {
			MySqlConnect.instance.close();
			MySqlConnect.instance = null;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
