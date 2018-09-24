package skyline;

public class Building {
    private int start;
    private int end;
    private int height;

    public Building(int start, int end, int height) {
        this.start = start;
        this.end = end;
        this.height = height;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
