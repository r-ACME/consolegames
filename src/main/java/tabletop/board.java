package tabletop;

public class board {

	static Integer ROWS = 8 + 1;
	static Integer COLUMNS = 8 + 1;
	static String black_slate = "▮";
	static String white_slate = "▯";
	private Integer turn = 0;
	
	
	
	public String[][] board = new String[ROWS][COLUMNS];
	
	public Integer sizeRows() {
		return ROWS;
	}
	
	public Integer sizeColumns() {
		return COLUMNS;
	}
	
	public void clearboard() {
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLUMNS; c++) {
				
				board[r][c] = " ";
				if(r == 0) {
					switch(c) {
					case 0: board[r][c] = "\\"; break;
					case 1: board[r][c] = "A"; break;
					case 2: board[r][c] = "B"; break;
					case 3: board[r][c] = "C"; break;
					case 4: board[r][c] = "D"; break;
					case 5: board[r][c] = "E"; break;
					case 6: board[r][c] = "F"; break;
					case 7: board[r][c] = "G"; break;
					case 8: board[r][c] = "H"; break;
					}
				}
				else if(c == 0) {
					switch(r) {
					case 1: board[r][c] = "1"; break;
					case 2: board[r][c] = "2"; break;
					case 3: board[r][c] = "3"; break;
					case 4: board[r][c] = "4"; break;
					case 5: board[r][c] = "5"; break;
					case 6: board[r][c] = "6"; break;
					case 7: board[r][c] = "7"; break;
					case 8: board[r][c] = "8"; break;
					}
				}
			}			
		}
	}	//END clear board
	
	public void printboard() {
		
		for (int r = 0; r < ROWS * 4; r++) {
			for (int c = 0; c < COLUMNS; c++) {
				if(c != 0 && r > 3) {
					if(r % 4 == 1) {
						System.out.print(" ");
						System.out.print(" ");
						System.out.print(board[(r - 1) / 4][c]);
						System.out.print(" ");
						System.out.print(" ");
						System.out.print("|");
					}
					else if(r % 4 == 3){
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("+");
					}
					else if(r % 4 == 0 || r % 4 == 2) {
						if((r / 4 + c) % 2 == 0) {
							System.out.print(black_slate);
							System.out.print(" ");
							System.out.print(" ");
							System.out.print(" ");
							System.out.print(black_slate);
						}
						else {
							System.out.print(white_slate);
							System.out.print(" ");
							System.out.print(" ");
							System.out.print(" ");
							System.out.print(white_slate);
						}
						System.out.print("|");
					}
				}
				else {
					if(r % 4 == 1) {
						System.out.print(" ");
						System.out.print(" ");
						System.out.print(board[(r - 1) / 4][c]);
						System.out.print(" ");
						System.out.print(" ");
						System.out.print("|");
					}
					else if(r % 4 == 3){
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("+");
					}
					else if(r % 4 == 0 || r % 4 == 2) {
						System.out.print(" ");
						System.out.print(" ");
						System.out.print(" ");
						System.out.print(" ");
						System.out.print(" ");
						System.out.print("|");
					}
				}
			}
			System.out.print("\n");
		}
		
	}
	
	public String getPiece(Integer rowIndex, Integer columnIndex) {
		return board[rowIndex][columnIndex];
	}
	
	public void setPiece(String piece, Integer rowIndex, Integer columnIndex) {
		board[rowIndex][columnIndex] = piece;
	}

	public Integer getTurn() {
		return turn;
	}

	public void setTurn(Integer turn) {
		this.turn = turn;
	}
	
	public String printPiece(Integer row, Integer column) {
		return this.board[row][column];
	}
	
	public Boolean searchBoardBool(String piece) {
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLUMNS; c++) {
				if(board[r][c] == piece)
					return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}




















