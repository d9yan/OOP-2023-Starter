package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public Word(String word) {
        this.word = word;
        follows = new ArrayList<Follow>();
    }

    public String getWord() {
        return word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void addFollow(String word) {
        boolean found = false;
        for (Follow follow : follows) {
            if (follow.getWord().equals(word)) {
                follow.count++;
                found = true;
                break;
            }
        }
        if (!found) {
            follows.add(new Follow(word, 1));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(word).append(": ");
        for (Follow follow : follows) {
            sb.append(follow.toString()).append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }
}
