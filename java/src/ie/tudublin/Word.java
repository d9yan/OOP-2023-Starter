package ie.tudublin;

import java.util.ArrayList;
import java.util.HashMap;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    public String getWord() {
        return word;
    }

    public void addFollow(String words) {
        for (Follow follow : follows) {
            if (follow.getWord().equals(words)) {
                follow.incrementCount();
                return;
            }
        }
        follows.add(new Follow(words));
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(word).append(": ");
        for (Follow follow : follows) {
            sb.append(follow).append(" ");
        }
        return sb.toString();
    }

    public void addFollow(Follow follow) {
    }

    public Follow getRandomFollow() {
        return null;
    }

    public Follow findFollow(String follow) {
        return null;
    }

    public static Follow get(int index) {
        return null;
    }
}


