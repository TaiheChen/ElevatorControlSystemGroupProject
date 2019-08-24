/**
 * 
 */
/**
 * I hope this can help me include the missing JavaFX into Java 11
 * @author Charles Chen 101035684
 *
 */
module sysc3303ProjectSetup {
	exports main;
	opens main;
	exports util;
	opens util;
	requires java.base; //without it seem to get wired compilation issue
	requires java.logging;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	//you can add more modules in here
}