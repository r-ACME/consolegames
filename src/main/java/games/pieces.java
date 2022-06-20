package games;

public class pieces {

	public Boolean canMove(String piece, Integer rowFrom, Integer columnFrom, Integer rowTo, Integer columnTo, String game) {
		switch(game) {
		case "CHESS": return canMoveChess(piece, rowFrom, columnFrom, rowTo, columnTo);
		default: return false;
		}
	}
	
	public Boolean canMoveChess(String piece, Integer rowFrom, Integer columnFrom, Integer rowTo, Integer columnTo) {
		return true;
	}
	
}
