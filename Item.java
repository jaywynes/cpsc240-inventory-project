/**
  *Item object
  *Used to create custon items to put inside inventory ArrayList
  *@author Jayden Wynes
  *@author jwynes@mail.umw.edu
  *@version 1.0
  */
public class Item {
	private String name;
	private int weight;
	private int value;
	private int strength;
	private static int maxWeight;

	/**
	  *Provides more info on type of item
	  *Used to determine which objects can be equipped in armor or weapon slot
	  */
	public enum ItemType {
		WEAPON,
		ARMOR,
		MISC
	}
	ItemType t;

	/**
	  *Default constructor for Item Object
	  *Creates Item object, sets name, type, weight, value, and strength
	  *@param type ItemType enum, used to determine if Item is weapon, armor, or misc
	  *@param name Name of the Item, used anytime inventory is displayed in some way
	  *@param weight How heavy Item is, used to determine current weight in inventory vs max weight for adding items
	  *@param value Monetary value of item, not used in this program other than for display
	  *@param strength How strong the item is, used for weapons and armor, set to 0 if item is misc
	  */
	public Item (ItemType type, String name, int weight, int value, int strength) {
		t  = type;
		this.name = name;
		this.weight = weight;	
		this.value = value;
		this.strength = strength;
	}

	/**
	  *Getter method to return the type of the Item
	  *@return ItemType enum of Item object, either WEAPON, ARMOR, or MISC
	  */
	public ItemType getType() {
		if (t == ItemType.WEAPON) {
			return ItemType.WEAPON;
		} else if (t == ItemType.ARMOR) {
			return ItemType.ARMOR;
		} else {
			return ItemType.MISC;
		}
	}
	
	/**
	  *Getter method for the name of the Item
	  *@return Item's name
	  */
	public String getName() {
		return name;
	}

	/**
	  *Getter method for the weight of the Item, used for determining if item can be added
	  *@return Weight of Item
	  */
	public int getWeight() {
		return weight;
	}

	/**
	  *Getter method for the value of item, used for printing inventory
	  *@return Monetary value of Item
	  */
	public int getValue() {
		return value;
	}

	/**
	  *Getter method for strength of item, used for armor and weapon Items
	  *@return Strength of Item
	  */
	public int getStrength() {
		return strength;
	}

}
