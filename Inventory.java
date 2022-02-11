import java.util.Scanner;

import java.util.ArrayList;

public class Inventory {
	private	ArrayList<Item> inventory;
	private int maxWeight;
	private Item equippedWeapon;
	private ArrayList<Item> weapons;
	private int equippedWeaponSlot;
	private Item equippedArmor;
	private ArrayList<Item> armor;
	private int equippedArmorSlot;
	private Scanner scan = new Scanner(System.in);
	public Inventory() {
		maxWeight = 200;
		equippedWeapon = null;
		equippedArmor = null;
		inventory = new ArrayList<Item>();
	}

	public boolean add(Item i) {
	
		if (i.getWeight() + totalWeight() <= maxWeight) {
			inventory.add(i);
			System.out.println(i.getName() + " was added to your inventory");
			return true;
		} else {
			return false;
		}

	}

	public int totalWeight() {
		int currentWeight = 0;

		for (Item c : this.inventory) {
			currentWeight = currentWeight + c.getWeight();
		}
		return currentWeight;
	}

	public void print(Inventory i) {
		int invenCount = 1;
			System.out.format("   %4s\t %20s\t %5s\t %5s\t %n", "Name", "Weight", "Value", "Strength");
		for (Item c : inventory) {
			System.out.format("%d. %2s\t %5d\t %5d\t %5d\t %n", invenCount, c.getName(), c.getWeight(), c.getValue(), c.getStrength());
			invenCount++;
		}	
	}


	public void drop(Inventory i) {
		System.out.println("Please enter the number of which item you would like to drop");
			System.out.format("   %4s\t %20s\t %5s\t %5s\t %n", "Name", "Weight", "Value", "Strength");
		int invenCount = 1;
		for (Item c : inventory) {
			System.out.format("%d. %2s\t %5d\t %5d\t %5d\t %n", invenCount, c.getName(), c.getWeight(), c.getValue(), c.getStrength());
			invenCount++;
		}
		System.out.println(invenCount + ". Cancel");
		System.out.print(": ");
		int itemToDrop = scan.nextInt() - 1;
		if (itemToDrop + 1 == invenCount) {
			System.out.println("Now exiting drop menu");
		} else {
			Item d = inventory.get(itemToDrop);
			System.out.println("You have dropped the " + d.getName());
			inventory.remove(itemToDrop);
		}
	}

	public void equipWeapon(Inventory i) {
		System.out.format("   %4s\t %20s\t %5s\t %5s\t %n", "Name", "Weight", "Value", "Strength");
		int invenCount = 1;
		weapons = new ArrayList<Item>();
		for (int x = 0;x < inventory.size(); x++) {
			Item c = inventory.get(x);
			if ( c.getType() == Item.ItemType.WEAPON) {
				weapons.add(c);
				System.out.format("%d. %2s\t %5d\t %5d\t %5d\t %n", invenCount, c.getName(), c.getWeight(), c.getValue(), c.getStrength());
				invenCount++;
			}
		}
		System.out.println(invenCount + ". Cancel");
		System.out.print(": ");
		int choice = scan.nextInt() - 1 ;
		if (choice + 1 == invenCount) {
			System.out.println("Now exiting the weapon equip menu");
		}else {
			equippedWeapon = weapons.get(choice);
			//equippedWeaponSlot =  
			System.out.println("You have equiped " + equippedWeapon.getName());
		}


	
	}
}
