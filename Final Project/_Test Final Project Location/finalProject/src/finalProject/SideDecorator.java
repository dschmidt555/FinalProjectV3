package finalProject;

public abstract class SideDecorator extends Burger{
	
	public Burger burger;
	public abstract String getDesc();
	
	public Model getModel() {
		return burger.getModel();
	}

}
