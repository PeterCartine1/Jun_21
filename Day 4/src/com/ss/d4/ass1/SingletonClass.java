/**
 * 
 */
package com.ss.d4.ass1;

/**
 * @author peter The purpose of this class is to just be able to limit itself to
 *         just one instance
 */
public class SingletonClass {

	private static volatile SingletonClass instance = null;

	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static SingletonClass getInstance() {
		if (instance == null) {
			synchronized (SingletonClass .class) {
				instance = new SingletonClass();
			}
		}
		return instance;
	}
}
