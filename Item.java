public class Item {
	String name;
	int weight;
	int value;
	int strength;
	static int maxWeight;

	public enum itemType {
		Weapon,
		Armor,
		Misc
	}

	//Constructor

	public Item (enum itemType, String name, int weight, int value, int strength) {
		this.itemType = itemType;
		this.name = name;
		this.weight = weight;	
		this.value = value;
		this.strength = strength;
	}

	public String getType() {
		if (itemType == Weapon) {
			return "Weapon";
		} else if (itemType == Armor) {
			return "Armor"
		} else {
			return "Misc"
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
