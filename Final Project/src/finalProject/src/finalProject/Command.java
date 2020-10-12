package finalProject;

public interface Command {
	
	public void setText();
	public void addToCost();
	public void minusFromCost();
	
	public int execute(int totalCost);
	



}
