public class Rook extends Piece {

    private final static String name = "Rook";

    public Rook(Spot currentLocation, String id, boolean white) {
        super(name, currentLocation, id, white);
    }

    @Override
    public void movePiece(Spot loc) {
        this.spot = loc;
        System.out.println("Location of rook piece is now " + loc);
    }
}
