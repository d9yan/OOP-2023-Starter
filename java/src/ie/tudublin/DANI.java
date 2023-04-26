package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> words = new ArrayList<Word>();
	String[] lines;

	public void settings() {
		size(1000, 1000);
		fullScreen(SPAN);
	}

	public void loadFile(String filename) {
		String[] lines = loadStrings(filename);
		for (String line : lines) {
			line = line.replaceAll("[^\\w\\s]", "").toLowerCase();
			String[] words = split(line, ' ');
			for (int i = 0; i < words.length; i++) {
				Word word = findWord(words[i]);
				if (word == null) {
					word = new Word(words[i]);
					model.add(word);
				}
				if (i < words.length - 1) {
					word.addFollow(words[i + 1]);
				}
            }

	public void addFollow(String word, String follow) {
		Word w = findWord(word);
		if (w != null) {
			Follow f = w.findFollow(follow);
			if (f != null) {
				f.incrementCount();
			} else {
				w.addFollow(new Follow(follow));
			}
		}
	}

	public Word findWord(String word) {
		for (Word w : words) {
			if (w.getWord().equals(word)) {
				return w;
			}
		}
		return null;
	}

	public boolean containsWord(String word) {
		return findWord(word) != null;
	}

	public void printModel() {
		for (Word w : words) {
			System.out.print(w.getWord() + ": ");
			for (Follow f : w.getFollows()) {
				System.out.print(f.getWord() + "(" + f.getCount() + ") ");
			}
			System.out.println();
		}
	}

	public Follow getRandomFollow()
    if (follows.size() == 0)
    {
        return null;
    }
    // pick a random follow
    int index = (int) (Math.random() * follows.size());
    return follows.get(index);
}

	public String[] writeSonnet() {
		String[] sonnet = new String[14];
		for (int i = 0; i < sonnet.length; i++) {
			StringBuilder sb = new StringBuilder();
			Word currentWord = words.get((int) random(words.size()));
			sb.append(currentWord.getWord());
			for (int j = 1; j <= 7; j++) {
				Follow follow = currentWord.getRandomFollow();
				if (follow == null) {
					break;
				}
				sb.append(" " + follow.getWord());
				currentWord = findWord(follow.getWord());
			}
			sonnet[i] = sb.toString();
		}
		return sonnet;
	}

	public void drawSonnet(String[] sonnet) {
		background(0);
		fill(255);
		textAlign(CENTER, CENTER);
		textSize(30);
		for (int i = 0; i < sonnet.length; i++) {
			text(sonnet[i], width / 2, (height / 14) * (i + 1));
		}
	}

	public void setup() {
		colorMode(HSB);
		loadFile("small.txt");
		printModel();
		String[] sonnet = writeSonnet();
		drawSonnet(sonnet);
	}

	public void keyPressed() {
		if (keyCode == ' ') {
			String[] sonnet = writeSonnet();
			drawSonnet(sonnet);
		}
	}
}
