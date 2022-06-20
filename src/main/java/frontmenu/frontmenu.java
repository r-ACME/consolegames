package frontmenu;

import games.chess;

public class frontmenu {
	
	
	public static void main(String[] args) {
		entry console = new entry();
		chess chessgame = new chess();
		
		
		System.out.print("\n\n");
		
		chessgame.game();
		
		console.closeScanner();
	}
	
}




