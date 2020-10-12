package finalProject;

public class Coleslaw extends SideDecorator{
	
	public Coleslaw(Burger burger) {
		this.burger = burger;
	}
	
	public String getDesc() {
		return burger.getDesc() + ", with Coleslaw";
	}
	
	public int cost() {
		return burger.cost() + 1;
	}
	

}
