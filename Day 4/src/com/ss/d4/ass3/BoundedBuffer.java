package com.ss.d4.ass3;

import java.util.ArrayList;
import java.util.List;

public class BoundedBuffer {
	/**
	 * 
	 */
	private BoundedBuffer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static List<Integer> bb = new ArrayList<Integer>();

	synchronized public static Integer take() {
		synchronized (bb) {
			Integer g;
			try {
				g = bb.get(0);
			} catch (Exception e) {
				g = null;
			}
			if (g != null) {
				bb.remove(0);
				return g;
			} else {
				return -1;
			}
		}
	}

	public static boolean give(Integer i) {
		if (bb.size() < 7) {
				bb.add(i);
				return true;
		} else {
			return false;
		}
	}
}