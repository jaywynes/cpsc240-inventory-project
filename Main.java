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
			System.out.println("5. Equip Armor");
			System.out.println("6. Quit");
			System.out.print(": ");
			choice = scan.nextInt();

			if (choice == 1) {
				Inventory.print(inventory);
			} else if (choice == 2) {
				inventory.add(ItemGenerator.generate());
			} else if (choice == 3) {
				System.out.println("Drop an item");

			} else if (choice == 4) {
				System.out.println("Equip a Weapon");

			} else if (choice == 5) {
				System.out.println("Equip Armor");
			} else if (choice == 6) {
				System.out.println("Now exiting your inventory system");
				break;
			} else {
				System.out.println("Error: Invalid input, please try again");
				choice = 0;
			}		
		
		}
	}	
}
