package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList

	public void settings() {
		size(1000, 1000);
		fullScreen(SPAN);
	}

	String line;
	

	public String loadFile(String s) {
		loadStrings("small.txt");
		split(line, ' ');
		w.replaceAll();
		s.toLowerCase();
		return null;
	}

	public String findWord() {
		return null;
	}

	public String findFollow() {
		return null;
	}



	public void printModel()
	{

	}
	
	String[] sonnet;

	public String[] writeSonnet() {
		loadFile();
		return null;
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {
		if (keyCode == ' ') {
			printModel();
		}
	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
		textAlign(CENTER, CENTER);
	}
}

