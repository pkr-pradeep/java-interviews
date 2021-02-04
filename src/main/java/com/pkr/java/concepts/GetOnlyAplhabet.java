package com.pkr.java.concepts;

import java.math.BigDecimal;

public class GetOnlyAplhabet {

	public static void main(String[] args) {
		String text = "M&T BANK";
		
		String getOnlyAlpha = text.replaceAll("[^a-zA-Z]", "").substring(0,4);
		System.out.println(getOnlyAlpha);
		System.out.println(BigDecimal.ZERO.toString()+1);
	}
}
