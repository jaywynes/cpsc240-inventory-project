import java.util.ArrayLisy;

public class Inventory {
	ArrayList<Item> inventory = new ArrayList<>();
	public int maxWeight;
	private Item equippedWeapon;
	private Item equippedArmor;

	public Inventory() {
		maxWeight = 200;
		equippedWeapon = null;
		equippedArmor = null;
	}

	public boolean add(Item i) {
	
		if (i.getWeight + Inventory.totalWeight() <= maxWeight) {
			inventory.add(i);
			return true;
		} else {
			return false
		}
	}

	public int totalWeight() {
		int currentWeight = 0;

		for (Item c : inventory) {
			currentWeight = currentWeight + c.getWeight();
		}
		return currentWeight;
	}

	public void print(Inventory i) {
		System.out.format();
	}

}
