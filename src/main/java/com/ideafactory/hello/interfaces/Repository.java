/**
 * 
 */
package com.ideafactory.hello.interfaces;

/**
 * @author jean-luc
 *
 */
public interface Repository<T> extends Registrable {
	public void add(T object);
	public void remove(T object);
	public T get(int index);
	public int size();
}
