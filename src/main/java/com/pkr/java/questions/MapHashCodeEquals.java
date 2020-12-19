package com.pkr.java.questions;

import java.util.HashMap;
import java.util.Map;

public class MapHashCodeEquals {

	public static void main(String[] args) { 
		MapKey mKey1 = new MapKey();
		MapKey mKey2 = new MapKey();
		MapKey mKey3 = new MapKey();
		MapKey mKey4 = new MapKey();
		Map<MapKey, Integer> map = new HashMap<>();
		map.put(mKey1, 1);
		map.put(mKey2, 2);
		map.put(mKey3, 3);
		map.put(mKey4, 4);
		System.out.println(map.size());
	}
}

class MapKey {
	int i = 1;
	
	@Override
	public boolean equals(Object obj) {
        return true;
    }
	
	@Override
	public int hashCode() {
		return i++;
	}

}

