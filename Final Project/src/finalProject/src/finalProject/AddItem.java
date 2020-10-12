package finalProject;

public class AddItem implements Command{
	
	Burger burger;
	
	public AddItem(Burger burger) {
		this.burger=burger;
	}
	
	public void add() {
		burger.cost();
		burger.getDesc();
	}
	


	public void minus() {
		burger.cost();
	
		
	}

	@Override
	public void setText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minusFromCost() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int execute(int totalCost) {
		return totalCost;
		// TODO Auto-generated method stub
		
	}

}
