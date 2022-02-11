import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Inventory inventory = new Inventory();
		int choice = 0;

		while (choice != 6) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. View your Inventory");
			System.out.println("2. Add a random Item");
			System.out.println("3. Drop an item");
			System.out.println("4. Equip a weapon");
			System.out.println("5. Equip some armor");
			System.out.println("6. Quit");

		
		inventory.add(ItemGenerator.generate());
		Inventory.print(inventory);
		
	}
}

