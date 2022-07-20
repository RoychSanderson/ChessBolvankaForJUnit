public class Queen extends Piece{

    private final static String name = "Queen";

    public Queen(Spot currentLocation, String id, boolean white) {
        super(name, currentLocation, id, white);
    }

    @Override
    public void movePiece(Spot loc) {
        this.spot = loc;
        System.out.println("Location of knight piece is now " + loc);
    }
}
