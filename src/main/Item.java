package main;

import main.Mechanics;

public class Item {
	String name = "";
	int damage = 0;
	int value = 0;
	String rareType = "";

	public Item randomItem () {
		Item item = new Item();
		int itemType = Mechanics.rollD4();
		if (itemType == 1)
			item.name = "Axe";
		if (itemType == 2)
			item.name = "Sword";
		if (itemType == 3)
			item.name = "Club";
		if (itemType == 4)
			item.name = "Hammer";
		item.damage = item.damage + itemType + Mechanics.rollD4();
		item.setValueRandom();
		return item;
	}
	
	public void setValueRandom () {
		this.value = Mechanics.rollD100();
		int rare = Mechanics.rollD20();
		if (rare == 20) {
			this.value = this.value * 20;
			this.rareType = "Unique";
		}
		if (rare > 14 || rare < 19) {
			this.value = this.value * 10;
			this.rareType = "Epic";
		}
		if (rare > 9 || rare < 15) {
			this.value = this.value * 5;
			this.rareType = "Great";
		}
		else
			this.rareType = "Fair";
	}
	
}