/**
  *Represents an Inventory, Item objects from Item.java stored in inventory array
  *@author Jayden Wynes
  *@author jwynes@mail.umw.edu
  *@version 1.0
  */
import java.util.Scanner;

import java.util.ArrayList;

public class Inventory {
	private	ArrayList<Item> inventory; //Used to store Item objects
	private int maxWeight; //Max weight of inventory
	private Item equippedWeapon; //Item object with Weapon ItemType, set by equipWeapon method
	private ArrayList<Item> weapons; // Used to store Items with Weapon ItemType that are in inventory, used in equipWeapon method
	private Item equippedArmor; //Item object with Armor ItemType, set by equipArmor method
	private ArrayList<Item> armor; //Used to store Items with Armor ItemType that are in inventory, used in equipArmor method
	private Scanner scan = new Scanner(System.in);

	/**
	  *Default constructor for Inventory object
	  *Includes ArrayList of Item objects
	  */
	public Inventory() {
		maxWeight = 200;
		equippedWeapon = null;
		equippedArmor = null;
		inventory = new ArrayList<Item>();
	}

	/**
	  *Used to check and see if the Item created from generate method will fit in inventory, comparing current weight of items vs max weight
	  *@return True if item was added, False if item wasn't added
	  */
	public boolean add(Item i) {
	
		if (i.getWeight() + totalWeight() <= maxWeight) {
			inventory.add(i);
			System.out.println(i.getName() + " was added to your inventory");
			return true;
		} else {
			return false;
		}

	}

	/**
	  *Method used to determine current weight of all Items in Inventory
	  *@return Total weight of Items in inventory array for add method
	  */
	public int totalWeight() {
		int currentWeight = 0;

		for (Item c : this.inventory) {
			currentWeight = currentWeight + c.getWeight();
		}
		return currentWeight;
	}

	/**
	  *Method used to print out contents of inventory ArrayList
	  *@param i Inventory object, using ArrayList of Items for printing
	  */
	public void print(Inventory i) {
		int invenCount = 1;
			System.out.format("   %4s\t %20s\t %5s\t %5s\t %n", "Name", "Weight", "Value", "Strength");
		for (Item c : inventory) {
			System.out.format("%d. %2s\t %5d\t %5d\t %5d\t", invenCount, c.getName(), c.getWeight(), c.getValue(), c.getStrength());
			if (c == equippedWeapon) {
				System.out.format("%s %n", "(Equipped Weapon)");
			} else if (c == equippedArmor) {
				System.out.format("%s %n", "(Equipped Armor)");
			} else {
				System.out.format("%n");
			}
			invenCount++;
		}	
	}

	/**
	  *Method used to select an Item inside the inventory and remove it from the ArrayList
	  *@param i Inventory object, using ArrayList of Items for printing and selection 
	  */
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

	/**
	  *Method prints Items in Inventory that have the WEAPON ItemType, prints them out, allows user to select one to equip
	  *@param i Inventory object
	  */
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

	/**
	  *Method prints Items in Inventory that have the ARMOR ItemType, prints them out, allows user to select one to equip
	  *@param i Inventory object
	  */
	public void equipArmor(Inventory i) {
		System.out.format("   %4s\t %20s\t %5s\t %5s\t %n", "Name", "Weight", "Value", "Strength");
		int invenCount = 1;
		armor = new ArrayList<Item>();
		for (int x = 0;x < inventory.size(); x++) {
			Item c = inventory.get(x);
			if ( c.getType() == Item.ItemType.ARMOR) {
				armor.add(c);
				System.out.format("%d. %2s\t %5d\t %5d\t %5d\t %n", invenCount, c.getName(), c.getWeight(), c.getValue(), c.getStrength());
				invenCount++;
			}
		}
		System.out.println(invenCount + ". Cancel");
		System.out.print(": ");
		int choice = scan.nextInt() - 1 ;
		if (choice + 1 == invenCount) {
			System.out.println("Now exiting the armor equip menu");
		}else {
			equippedArmor = armor.get(choice);
			System.out.println("You have equiped " + equippedArmor.getName());
		}


	
	}
}
