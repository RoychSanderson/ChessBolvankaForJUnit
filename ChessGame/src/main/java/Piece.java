public abstract class Piece {

    String name;
    Spot spot;
    boolean white;
    private String id;
    private boolean killed;

    public abstract void movePiece(Spot loc);

    public Piece(String name, Spot currentLocation, String id, boolean white) {
        this.name = name;
        this.spot = currentLocation;
        this.white = white;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot currentLocation) {
        this.spot = currentLocation;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public String getId() {
        return id;
    }

    public boolean isWhite() {
        return white;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "name='" + name + '\'' +
                ", currentLocation=" + spot +
                ", white=" + white +
                ", id='" + id + '\'' +
                ", killed=" + killed +
                '}';
    }
}
