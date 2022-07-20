public class Spot {
    String x;
    int y;

    public Spot(String x, int y) {
        if ((y < 1 || y > 8) || (x.compareTo("h") > 0)) {
            throw new IllegalArgumentException("Incorrect spot on chessboard");
        }
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "" + x + y;
    }
}
