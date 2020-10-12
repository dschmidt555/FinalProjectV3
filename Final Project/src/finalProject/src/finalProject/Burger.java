package finalProject;

public abstract class Burger {
	
	public enum Model {Regular, Monster, Beast};
	Model size = Model.Regular;
	String description = "Unknown";
	
	public String getDesc() {
		return description;
	}
	
	public void setModel(Model size) {
		this.size = size;
	}
	
	public Model getModel() {
		return this.size;
	}

	
	public abstract int cost();
	
	

}
