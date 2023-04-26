package ie.tudublin;

public class Follow {

    private Follow word;
    private int count;

    public Follow(Follow follow) {
        this.word = follow;
        this.count = 1;
    }

    public Follow(String follow) {
    }

    public Follow getWord() {
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


