public class Item {
	String name;
	int weight;
	int value;
	int strength;
	static int maxWeight;


	public enum ItemType {
		WEAPON,
		ARMOR,
		MISC
	}

	ItemType t;
	//Constructor

	public Item (ItemType type, String name, int weight, int value, int strength) {
		t  = type;
		this.name = name;
		this.weight = weight;	
		this.value = value;
		this.strength = strength;
	}

	public ItemType getType() {
		if (t == ItemType.WEAPON) {
			return ItemType.WEAPON;
		} else if (t == ItemType.ARMOR) {
			return ItemType.ARMOR;
		} else {
			return ItemType.MISC;
		}
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public int getStrength() {
		return strength;
	}

}
