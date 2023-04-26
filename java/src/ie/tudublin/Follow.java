package ie.tudublin;

public class Follow {

    private String word;
    private int count;

    public Follow(String word) {
        this.word = word;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public String toString() {
        return word + "(" + count + ")";
    }
}


