public class Player {
    public String name;
    public boolean side;
    private int rank;

    public Player(String name, boolean side, int rank) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("The name shouldn`t be empty");
        }
        this.name = name;
        this.side = side;
        if ((rank < 100) || (rank > 3000)) {
            throw new IllegalArgumentException("The rank should be in range of 100 to 3000");
        }
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSide() {
        return side;
    }

    public void setSide(boolean side) {
        this.side = side;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if ((rank < 100) || (rank > 3000)){
            throw new IllegalArgumentException("The rank should be in range of 100 to 3000");
        }
        this.rank = rank;
        System.out.println("Rank of" + name + "has changed");
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", side=" + side +
                ", rank=" + rank +
                '}';
    }

    public void movePiece(Piece piece, Spot spot){
        if (isSide() != piece.isWhite()){
            throw new IllegalArgumentException("Incorrect piece color");
        }
        piece.setSpot(spot);
        System.out.println("Piece " + piece.getName() + " is moved to " + spot);
    }
}
