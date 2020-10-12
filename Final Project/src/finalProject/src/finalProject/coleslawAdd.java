package finalProject;

public class coleslawAdd implements Command{
	
	Coleslaw coleslaw;
	int totalCost;

	
	public void ColeslawAdd(Coleslaw coleslaw) {
		this.coleslaw = coleslaw;
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
		this.totalCost=totalCost;
		totalCost+=1;	
		return totalCost;
	
		
	}

}
