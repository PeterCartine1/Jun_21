package com.ss.w1.ass2;

public class FixedSingleton {
	volatile private static FixedSingleton instance = null;
	
	private FixedSingleton() {
		
	}

	public static FixedSingleton getInstance() {
		if (instance == null) {
			synchronized (FixedSingleton .class) {
				instance = new FixedSingleton();
			}
		}
		return instance;
	}
}