package main;

import main.Combat;
import main.TextManagement;
import main.Mechanics;
import main.Char;

public class TextTest {
	public static void main(String[] args) {
		Char player1 = new Char();
		player1.rollChar();
		player1.setName("Gerald");
		player1.printChar();
		
		Char player2 = new Char();
		player2.rollChar();
		player2.setName("Kregherian");
		player2.printChar();
		
		Combat fight = new Combat();
		fight.combat2p(player1, player2);
    }
}
