package com;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	//@Autowired
	 private SpellChecker spellChecker;

	/* // constructor based di
	   public TextEditor(SpellChecker spellChecker) {
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }*/
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	   
	   
	   // a setter method to inject the dependency.
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   // a getter method to return spellChecker
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }

}
