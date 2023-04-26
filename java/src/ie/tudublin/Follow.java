package ie.tudublin;

public class Follow {

    private String word;
    private int count;
    private String follow;

    public Follow(String words) {
        this.word = words;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    public String toString() {
        return word + "(" + count + ")";
    }
}


