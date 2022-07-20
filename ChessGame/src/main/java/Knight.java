public class Knight extends Piece{
    private final static String name = "Knight";

    public Knight(Spot currentLocation, String id, boolean white) {
        super(name, currentLocation, id, white);
    }

    @Override
    public void movePiece(Spot loc) {
        this.spot = loc;
        System.out.println("Location of knight piece is now " + loc);
    }
}
