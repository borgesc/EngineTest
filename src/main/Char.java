package main;

import main.Mechanics;
import main.TextManagement;
import main.Item;

public class Char {
	
	String name;
	
	int armorClass = 0;
	int HP = 0;
	
	int strenght = 1;
	int dexterity = 1;
	int constitution = 1;
	int intelligence = 1;
	int wisdom = 1;
	int charisma = 1;
	
	int acrobatics = -5;
	int animalHandling = -5;
	int arcana = -5;
	int athletics = -5;
	int deception = -5;
	int history = -5;
	int insight = -5;
	int intimidation = -5;
	int investigation = -5;
	int medicice = -5;
	int nature = -5;
	int perception = -5;
	int performance = -5;
	int persuasion = -5;
	int religion = -5;
	int sleightOfHand = -5;
	int stealth = -5;
	int survival = -5;
	
	Item[] itemsList = new Item[10];
	
	public void setChar (String name, int armorClass, int hp, int str, int dex, int cons, int intel, int wis, int chari) {
		setName(name);
		setArmorClass(armorClass);
		setHP(hp);
		setStrenght(str);
		setDexterity(dex);
		setConstitution(cons);
		setIntelligence(intel);
		setWisdom(wis);
		setCharisma(chari);
		
		setAcrobatics();
		setAnimalHandling();
		setArcana();
		setAthletics();
		setDeception();
		setHistory();
		setInsight();
		setIntimidation();
		setInvestigation();
		setMedicice();
		setNature();
		setPerception();
		setPersuasion();
		setReligion();
		setSleightOfHand();
		setStealth();
		setSurvival();		
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public void rollChar () {
		int roll = 0;
		
		roll = Mechanics.rollD20();
		setArmorClass(roll);
		roll = Mechanics.rollD20();
		setStrenght(roll);
		roll = Mechanics.rollD20();
		setDexterity(roll);
		roll = Mechanics.rollD20();
		setConstitution(roll);
		roll = Mechanics.rollD20();
		setIntelligence(roll);
		roll = Mechanics.rollD20();
		setWisdom(roll);
		roll = Mechanics.rollD20();
		setCharisma(roll);
		
		setHP(Mechanics.rollD20()+setModifier(constitution));
		if (this.HP < 10)
			this.HP = 10;
		
		setAcrobatics();
		setAnimalHandling();
		setArcana();
		setAthletics();
		setDeception();
		setHistory();
		setInsight();
		setIntimidation();
		setInvestigation();
		setMedicice();
		setNature();
		setPerception();
		setPersuasion();
		setReligion();
		setSleightOfHand();
		setStealth();
		setSurvival();
		
		setItem();
	}
	
	public void printChar() {
		String result = "Name: " + this.name + ". Armor Class: "  + this.armorClass + ". HP: " + this.HP + ". Strenght: " + this.strenght + ". Dextery: " + this.dexterity + ". Constitution: " + this.constitution + ". Intelligence: " + this.intelligence + ". Wisdom: " + this.wisdom + ". Charisma: " + this.charisma;
		TextManagement.printPhrase(result);
	}
	
	public void printAbilities() {
		String result = "Acrobatics: " + this.acrobatics + ". Animal Handling: " + this.animalHandling + ". Arcana: " + this.arcana + ". Athletics: " + this.athletics + ". Deception: " + this.deception + ". History: " + this.history + ". Insight: " + this.insight + ". Intimidation: " + this.intimidation + ". Medicine: " + this.medicice + ". Nature: " + this.nature + ". Perception: " + this.perception + ". Persuasion: " + this.persuasion + ". Religion: " + this.religion + ". Sleight of Hand: " + this.sleightOfHand + ". Stealth: " + this.stealth + ". Survival: " + this.survival;
		TextManagement.printPhrase(result);
	}
	
	public int setModifier(int ability) {
		int modifier = 0;
		if (ability > 0 && ability < 31)  
			modifier = ability/2-5;
		return modifier;
	}
	
	
	public void setItem() {
		Item newItem = new Item();
		this.itemsList[0] = newItem.randomItem();
	}

	public Item getFirstWeapon() {
		if (itemsList[0] == null)
			setItem();
		return itemsList[0];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	
	public int getAcrobatics() {
		return acrobatics;
	}
	
	public void setAcrobatics() {
		this.acrobatics = setModifier(dexterity);
	}

	public int getAnimalHandling() {
		return animalHandling;
	}

	public void setAnimalHandling() {
		this.animalHandling = setModifier(wisdom);
	}

	public int getArcana() {
		return arcana;
	}

	public void setArcana() {
		this.arcana = setModifier(intelligence);
	}

	public int getAthletics() {
		return athletics;
	}

	public void setAthletics() {
		this.athletics = setModifier(strenght);
	}

	public int getDeception() {
		return deception;
	}

	public void setDeception() {
		this.deception = setModifier(charisma);
	}

	public int getHistory() {
		return history;
	}

	public void setHistory() {
		this.history = setModifier(intelligence);
	}

	public int getInsight() {
		return insight;
	}

	public void setInsight() {
		this.insight = setModifier(wisdom);
	}

	public int getIntimidation() {
		return intimidation;
	}

	public void setIntimidation() {
		this.intimidation = setModifier(charisma);
	}

	public int getInvestigation() {
		return investigation;
	}
	public void setInvestigation() {
		this.investigation = setModifier(intelligence);
	}

	public int getMedicice() {
		return medicice;
	}

	public void setMedicice() {
		this.medicice = setModifier(wisdom);
	}

	public int getNature() {
		return nature;
	}

	public void setNature() {
		this.nature = setModifier(intelligence);
	}

	public int getPerception() {
		return perception;
	}

	public void setPerception() {
		this.perception = setModifier(wisdom);
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance() {
		this.performance = setModifier(wisdom);
	}

	public int getPersuasion() {
		return persuasion;
	}

	public void setPersuasion() {
		this.persuasion = setModifier(charisma);
	}

	public int getReligion() {
		return religion;
	}

	public void setReligion() {
		this.religion = setModifier(intelligence);
	}

	public int getSleightOfHand() {
		return sleightOfHand;
	}

	public void setSleightOfHand() {
		this.sleightOfHand = setModifier(dexterity);
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth() {
		this.stealth = setModifier(dexterity);
	}

	public int getSurvival() {
		return survival;
	}

	public void setSurvival() {
		this.survival = setModifier(wisdom);
	}



	public int getStrenght() {
		return strenght;
	}
	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
}
