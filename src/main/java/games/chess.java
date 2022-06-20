package games;

import frontmenu.entry;
import tabletop.board;

public class chess {
	board chessgame = new board();
	entry console = new entry();
	pieces moviment = new pieces();
	private Integer whiteking = 1;
	private Integer blackking = 1;
	private String input_location;
	private String movingPiece;
	private Integer pieceLocationRFrom = 0; 
	private Integer pieceLocationCFrom = 0; 
	private Integer pieceLocationRTo = 0; 
	private Integer pieceLocationCTo = 0; 	
	
	public void game() {
		chessgame.clearboard();
		chessgame.printboard();
		
		//console.clearscreen();
		System.out.print("\n\n\n");
		
		//Placing stating position on black pieces
		chessgame.setPiece("♖", 1, 1);
		chessgame.setPiece("♖", 1, 8);
		chessgame.setPiece("♘", 1, 2);
		chessgame.setPiece("♘", 1, 7);
		chessgame.setPiece("♗", 1, 3);
		chessgame.setPiece("♗", 1, 6);
		chessgame.setPiece("♕", 1, 5);
		chessgame.setPiece("♔", 1, 4);
		for (int i = 1; i < chessgame.sizeColumns(); i++) {
			chessgame.setPiece("♙", 2, i);
		}
			
		//Placing stating position on white pieces
		chessgame.setPiece("♜", 8, 1);
		chessgame.setPiece("♜", 8, 8);
		chessgame.setPiece("♞", 8, 2);
		chessgame.setPiece("♞", 8, 7);
		chessgame.setPiece("♝", 8, 3);
		chessgame.setPiece("♝", 8, 6);
		chessgame.setPiece("♛", 8, 5);
		chessgame.setPiece("♚", 8, 4);
		for (int i = 1; i < chessgame.sizeColumns(); i++) {
			chessgame.setPiece("♟", 7, i);
		}
		
		//Begining of the match
		while (blackking != 1 || whiteking != 0) {
			chessgame.printboard();
		
			System.out.print("\n\n\nWitch piece will move now Player " + (chessgame.getTurn() % 2 + 1) + "\n\n--> ");
			input_location = console.readWord();
			
			switch(input_location.substring(0, 1)) {
				case "A": pieceLocationCFrom = 1; break;
				case "B": pieceLocationCFrom = 2; break;
				case "C": pieceLocationCFrom = 3; break;
				case "D": pieceLocationCFrom = 4; break;
				case "E": pieceLocationCFrom = 5; break;
				case "F": pieceLocationCFrom = 6; break;
				case "G": pieceLocationCFrom = 7; break;
				case "H": pieceLocationCFrom = 8; break;
			}
			pieceLocationRFrom = Integer.parseInt(input_location.substring(1, 2));
			
			System.out.print("\n\n\nWhere the " + chessgame.printPiece(pieceLocationRFrom, pieceLocationCFrom) + 
					" will move to?\n\n--> ");
			input_location = console.readWord();
			
			switch(input_location.substring(0, 1)) {
				case "A": pieceLocationCTo = 1; break;
				case "B": pieceLocationCTo = 2; break;
				case "C": pieceLocationCTo = 3; break;
				case "D": pieceLocationCTo = 4; break;
				case "E": pieceLocationCTo = 5; break;
				case "F": pieceLocationCTo = 6; break;
				case "G": pieceLocationCTo = 7; break;
				case "H": pieceLocationCTo = 8; break;
			}
			pieceLocationRTo = Integer.parseInt(input_location.substring(1, 2));
			movingPiece = chessgame.getPiece(pieceLocationRFrom, pieceLocationCFrom);
			
			if(moviment.canMove(movingPiece, pieceLocationRFrom, pieceLocationCFrom, pieceLocationRTo, pieceLocationCTo, "CHESS")) {
				chessgame.setPiece(" ", pieceLocationRFrom, pieceLocationCFrom);
				chessgame.setPiece(movingPiece, pieceLocationRTo, pieceLocationCTo);
			}
			
			
		}
	}
		
	
	// ♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟
}
