package finalProject;

public class FrenchFries extends SideDecorator{
	
	public FrenchFries(Burger burger) {
		this.burger = burger;
	}
	
	public String getDesc() {
		return burger.getDesc() + ", with Fries";
	}
	
	public int cost() {
		return burger.cost() + 45;
	}
	

}
