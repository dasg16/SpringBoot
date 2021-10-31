package com.das.learnings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DasFamily {

	@Autowired
	Cats cats;

	public void printWelcome() {
		System.out.println("Welcome to the family");

	}

	public void displayNames() {
		cats.printCatNames();
	}
}
