package main;

import java.util.Random;

public class Mechanics {
	
	public static int rollD100() {
		Random rand = new Random();
		int  roll = rand.nextInt(100) + 1;
		return roll;
	}
	
	public static int rollD20() {
		Random rand = new Random();
		int  roll = rand.nextInt(20) + 1;
		return roll;
	}
	
	public static int rollD12() {
		Random rand = new Random();
		int  roll = rand.nextInt(12) + 1;
		return roll;
	}
	
	public static int rollD10() {
		Random rand = new Random();
		int  roll = rand.nextInt(10) + 1;
		return roll;
	}
	
	public static int rollD8() {
		Random rand = new Random();
		int  roll = rand.nextInt(8) + 1;
		return roll;
	}
	
	public static int rollD6() {
		Random rand = new Random();
		int  roll = rand.nextInt(6) + 1;
		return roll;
	}
	
	public static int rollD4() {
		Random rand = new Random();
		int  roll = rand.nextInt(4) + 1;
		return roll;
	}
	
	public static int rollD2() {
		Random rand = new Random();
		int  roll = rand.nextInt(2) + 1;
		return roll;
	}
}
