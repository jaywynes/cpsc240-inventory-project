import java.util.Scanner;

import java.util.ArrayList;

public class Inventory {
	static ArrayList<Item> inventory = new ArrayList<Item>();
	public int maxWeight;
	private Item equippedWeapon;
	private Item equippedArmor;
	Scanner scan = new Scanner (System.in);
	public Inventory() {
		maxWeight = 200;
		equippedWeapon = null;
		equippedArmor = null;
	}

	public boolean add(Item i) {
	
		if (i.getWeight() + totalWeight() <= maxWeight) {
			inventory.add(i);
			return true;
		} else {
			return false;
		}
	}

	public int totalWeight() {
		int currentWeight = 0;

		for (Item c : inventory) {
			currentWeight = currentWeight + c.getWeight();
		}
		return currentWeight;
	}

	public static void print(Inventory i) {
		int invenCount = 1;
		for (Item c : inventory) {
			System.out.format("   %4s\t %20s\t %5s\t %5s\t %5s\t %n", "Name", "Type", "Weight", "Value", "Strength");
			System.out.format("%d. %2s\t %5s\t %5d\t %5d\t %5d\t %n", invenCount, c.getName(), c.getType(), c.getWeight(), c.getValue(), c.getStrength());
			invenCount++;
		}	
	}

	public static void drop(Inventory i) {
		System.out.println("Please enter the number of which item you ould like to drop");
		Inventory.print(inventory);
		int itemToDrop = scan.nextInt() + 1;
		
	
	}
	
}
