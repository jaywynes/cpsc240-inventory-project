public class ItemGenerator {
	import java.util.Random;

	Random rng = new Random();


	public static Item generate() {
		int choose = rng.nextInt(3);
		itemType s;
		String n;
		int w; //Weight
		int v; //Value
		int st; //Strength

//Using 0 for weapons, 1 for armor, 2 for misc

		if (choose == 0) {
			s = Weapon;
			choose = rng.nextInt(4);
			if (choose  == 0) {
				n = "The Ancient Battle Axe";
				w = 20;
				v = 10;
				st = 15;
			} else if (choose == 1) {
				n = "The Steel Sword";
				w = 10;
				v = 15;
				st = 10;
			} else if (choose == 2) {
				n = "The Elven Dagger";
				w = 5;
				v = 30;
				st = 7;
			} else {
				n = "The Wooden Bow";
				w = 7;
				v = 12;
				st = 10;
			}
		}else if(choose == 1) {
			s = Armor;
			choose = rng.nextInt(4);
			if (choose == 0) {
				n = "Leather Armor";
				w = 15;
				v = 10;
				st = 7;
			} else if (choose == 1) {
				n = "Dwarven Armor";
				w = 30;
				v = 25;
				st = 28;
			} else if (choose == 2) {
				n = "Thieves' Armor";
				w = 10;
				v = 40;
				st = 14;
			} else {
				n = "Elven Armor";
				w = 15;
				v = 100;
				st = 21;
			}
		} else {
			s = Misc;
			choose = rng.nextInt(4);
			if (choose == 0) {
				n = "The Banana"
				w = 1;
				v = 69420;
				st = 0;
			} else if (choose == 1) {
				n = "The Mystical Spork";
				w = 2;
				v = 100;
				st = 0;
			} else if (choose == 2) {
				n = "The Strangely Regular Spork;
				w = 1;
				v = 1;
				st = 0;
			} else {
				n = "The Pineapple";
				w = 5;
				v = 10;
				st = 0;
			}
		}
		Item i = new Item(s, n, w, v, st );
	}


}
