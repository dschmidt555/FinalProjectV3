package finalProject;

public abstract class Burger {
	
	public enum Model {Light, Medium, Heavy};
	Model model = Model.Light;
	String description = "Unknown";
	
	public String getDesc() {
		return description;
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Model getModel() {
		return this.model;
	}

	
	public abstract int cost();
	public abstract int range();
	
	

}
