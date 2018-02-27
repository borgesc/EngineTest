package main;

import main.Char;
import main.Item;
import main.TextManagement;
import main.Mechanics;

public class Combat {
	public void combat2p(Char P1, Char P2) {
		while (P1.HP > 0 && P2.HP > 0) {
			attack (P2, P1);
			if (P2.HP>0) {
				attack (P1, P2);
				if (P1.HP<=0) {
					TextManagement.printPhrase(P1.name + " has fallen.");
					loot(P1, P2);
				}
			}
			else {
				TextManagement.printPhrase(P2.name + " has fallen.");
				loot (P2, P1);
			}
		}
	}
	
	public void attack (Char charAttacked, Char charAttacker) {
		if (Mechanics.rollD20() > charAttacked.armorClass) {
			charAttacked.HP = charAttacked.HP - charAttacker.getFirstWeapon().damage - charAttacker.setModifier(charAttacker.strenght);
			if (charAttacked.HP < 0)
				charAttacked.HP = 0;
			TextManagement.printPhrase(charAttacked.name + " was hit with " + charAttacker.getFirstWeapon().name + " (dmg: " + charAttacker.getFirstWeapon().damage + "). Current HP: " + charAttacked.HP);
		}
		else {
			TextManagement.printPhrase(charAttacker.name + " attack on "+ charAttacked.name +" missed...");
		}
	}
	
	public void loot (Char charDefeated, Char charVictorious) {
		if (charVictorious.armorClass < charDefeated.armorClass) {
			charVictorious.armorClass = charDefeated.armorClass;
			TextManagement.printPhrase(charDefeated.name + " armor is better than mine... It has " + charDefeated.armorClass + " armor. Nobody will notice if I take this...");
		}
		else
			TextManagement.printPhrase(charVictorious.name + " armor is better than " + charDefeated.name + " armor. No need to grab that...");
		
		if (charVictorious.getFirstWeapon().damage < charDefeated.getFirstWeapon().damage) {
			charVictorious.itemsList[1] = charVictorious.itemsList[0];
			charVictorious.itemsList[0] = charDefeated.getFirstWeapon();
			TextManagement.printPhrase(charDefeated.name + " weapon is pretty good... I mean, it's a " + charDefeated.getFirstWeapon().rareType + " " + charDefeated.getFirstWeapon().name + " that causes " + charDefeated.getFirstWeapon().damage + " damage. THAT'S MINE NOW!");
		}
		else if (charDefeated.getFirstWeapon().rareType != "Fair") {
			charVictorious.itemsList[1] = charDefeated.getFirstWeapon();
			TextManagement.printPhrase("At least " + charDefeated.name + " weapon was worth something. I mean, it's a " + charDefeated.getFirstWeapon().rareType + " " + charDefeated.getFirstWeapon().name + " worth about " + charDefeated.getFirstWeapon().value + " gold pieces.");
		}
		else
			TextManagement.printPhrase("This oponent weapon is worthless...");
	}
}
