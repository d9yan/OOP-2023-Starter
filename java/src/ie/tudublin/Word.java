package ie.tudublin;

import java.util.ArrayList;
import java.util.HashMap;

public class Word {

    private String word;
    private HashMap<String, Follow> follows;

    public Word(String word) {
        this.word = word;
        this.follows = new HashMap<String, Follow>();
    }

    public String getWord() {
        return word;
    }

    public void addFollow(String followWord) {
        if (follows.containsKey(followWord)) {
            Follow follow = follows.get(followWord);
            follow.increment();
        } else {
            follows.put(followWord, new Follow(followWord));
        }
    }

    public ArrayList<Follow> getFollows() {
        return new ArrayList<Follow>(follows.values());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(word).append(": ");
        for (Follow follow : follows) {
            sb.append(follow.word).append("(").append(follow.count).append(") ");
        }
        return sb.toString();
    }
    

    public Follow getFollow(String followWord) {
        return follows.get(followWord);
    }
}

