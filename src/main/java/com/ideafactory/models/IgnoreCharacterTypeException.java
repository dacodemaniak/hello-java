/**
 * 
 */
package com.ideafactory.models;

/**
 * @author Aélion
 *
 */
public class IgnoreCharacterTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Une erreur est survenue lors de la création d'un des personnages";
	}
}
