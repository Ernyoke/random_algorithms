package norandhistpond;

public class Fish {
    private int size;
    private int eatingFactor;

    public Fish(int size, int eatingFactor) {
        this.size = size;
        this.eatingFactor = eatingFactor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEatingFactor() {
        return eatingFactor;
    }

    public void setEatingFactor(int eatingFactor) {
        this.eatingFactor = eatingFactor;
    }
}
