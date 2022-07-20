import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) {
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        HashMap<String, Piece> map = main.createPieces();
        main.play(players, map);
    }

    public ArrayList<Player> createPlayers(){
        Player wPlayer = new Player("First", true, 100);
        Player bPlayer = new Player("Second", false, 400);
        ArrayList<Player> arrayList = new ArrayList<>();
        arrayList.add(wPlayer);
        arrayList.add(bPlayer);
        return arrayList;
    }

    public HashMap<String, Piece> createPieces(){
        King wKing = new King(new Spot("H", 7), "WhiteKing", true);
        King bKing = new King(new Spot("D", 8), "BlackKing", false);
        Knight bKnight = new Knight(new Spot("D", 6), "BlackKnight", false);
        Rook wRook1 = new Rook(new Spot("A", 7), "WhiteRook1", true);
        Rook wRook2 = new Rook(new Spot("G", 7), "WhiteRook2", true);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(wKing.getId(), wKing);
        pieceHashMap.put(bKing.getId(), bKing);
        pieceHashMap.put(bKnight.getId(), bKnight);
        pieceHashMap.put(wRook1.getId(), wRook1);
        pieceHashMap.put(wRook2.getId(), wRook2);
        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> map){
        Player wplay = players.get(0);
        Player bplay = players.get(1);
        try {
            wplay.movePiece(map.get("WhiteRook1"), new Spot("A", 8));
            bplay.movePiece(map.get("BlackKnight"), new Spot("C", 8));
        } catch (IllegalArgumentException e){
            System.out.println("Move is incorrect, try again");
            //retry
        }
    }
}
