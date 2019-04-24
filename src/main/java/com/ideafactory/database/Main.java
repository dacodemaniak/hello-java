/**
 * 
 */
package com.ideafactory.database;

import java.sql.Connection;

/**
 * @author jean-luc
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connexion = MySqlConnect.getConnexion();
		
		MySqlConnect.close();
	}

}
