package com.das.learnings;

import org.springframework.stereotype.Component;

@Component
public class Cats {

	String cat1 = "Cleo";
	String cat2 = "Monsoon";
	String cat3 = "Toby";

	public void printCatNames() {
		System.out.println("Cat names are " + cat1 + ", " + cat2 + ", " + cat3);
	}

}
