package finalProject;

public class SweetPotato extends SideDecorator{
	
	public SweetPotato(Burger burger) {
		this.burger = burger;
	}
	
	public String getDesc() {
		return burger.getDesc() + ", with Turbo";
	}
	
	public int cost() {
		return burger.cost() + 60;
	}
	
	public int range() {
		return burger.range() + 1200;
	}

}
