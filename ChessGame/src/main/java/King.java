public class King extends Piece{

    private final static String name = "King";

    public King(Spot currentLocation, String id, boolean white) {
        super(name, currentLocation, id, white);
    }
    
    @Override
    public void movePiece(Spot loc) {
        this.spot = loc;
        System.out.println("Location of king piece is now " + loc);
    }
}
