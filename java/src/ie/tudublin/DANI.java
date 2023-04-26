package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	public void settings() {
		size(1000, 1000);
		fullScreen(SPAN);
	}

	String line;


	public String loadFile() {
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
		
		return null;
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {
		if (keyCode == ' ') {
			writeSonnet();
			loadFile()
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

