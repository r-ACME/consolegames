package frontmenu;

import games.chess;

public class frontmenu {
	
	
	public static void main(String[] args) {
		entry console = new entry();
		chess chessgame = new chess();
		Boolean keepPlaying = false;
		String menuchoise = "";
		
		
		System.out.print("\n\n");
		
		do{
			//console.clearscreen();
			System.out.print("\n\n\nWhich game do you wanna play?\n");
			System.out.print("1) Chess\n");
			System.out.print("2) Checkers\n");
			System.out.print("3) Hangman\n");
			System.out.print("4) TicTacToe\n");
			
			System.out.print("0) Exit\n");
			System.out.print("\n---> ");
			menuchoise = console.readWord();
			
			switch(menuchoise.toLowerCase()) {
			case "chess" : case "1":
				keepPlaying = chessgame.game();
				break;
			case "checkers" : case "2":
				keepPlaying = false;
				break;
			case "hangman" : case "3":
				keepPlaying = false;
				break;
			case "tictactoe" : case "4":
				keepPlaying = false;
				break;
			case "exit" : case "0":
				keepPlaying = false;
				break;	
			}
		} while (keepPlaying);
		
		console.closeScanner();
	}
	
}




