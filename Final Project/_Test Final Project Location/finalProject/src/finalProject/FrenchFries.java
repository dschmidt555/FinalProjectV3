package finalProject;

public class FrenchFries extends SideDecorator{
	
	public FrenchFries(Burger burger) {
		this.burger = burger;
	}
	
	public String getDesc() {
		return burger.getDesc() + ", with Booster";
	}
	
	public int cost() {
		return burger.cost() + 45;
	}
	
	public int range() {
		return burger.range() + 1000;
	}

}
