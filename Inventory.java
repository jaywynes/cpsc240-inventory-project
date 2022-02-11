import java.util.ArrayList;

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

	public void print(Inventory i) {
		int invenCount = 1;
		for (Item c : inventory) {
			System.out.format("%d. %2s\t %10s %10d %10d %10d", invenCount, c.getName(), c.getType(), c.getWeight(), c.getValue(), c.getStrength());
			invenCount++;
		}	
	}

}
