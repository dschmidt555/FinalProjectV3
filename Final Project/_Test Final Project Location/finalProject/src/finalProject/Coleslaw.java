package finalProject;

public class Coleslaw extends SideDecorator{
	
	public Coleslaw(Burger burger) {
		this.burger = burger;
	}
	
	public String getDesc() {
		return burger.getDesc() + ", with Warp Drive";
	}
	
	public int cost() {
		return burger.cost() + 1000000;
	}
	
	public int range() {
		return burger.range() + 50000000;
	}

}
