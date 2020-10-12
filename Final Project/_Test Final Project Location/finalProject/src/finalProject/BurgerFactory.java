package finalProject;

public class BurgerFactory {
	
public Burger createBurger(String type) {
		
		Burger burger = null;
		
		if (type.equals("Regular")) {
			burger = new Regular();
		}else if (type.equals("Beast")) {
			burger = new Beast();
		}else if (type.equals("Monster")) {
			burger = new Monster();
		}
		return burger;
		
	}

}
