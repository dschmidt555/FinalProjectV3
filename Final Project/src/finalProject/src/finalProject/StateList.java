package finalProject;

public class StateList {
	
	State emptyBurger;
	State fullBurger;
	State emptySlaw;
	State fullSlaw;
	State emptyFries;
	State fullFries;
	
	State state;
	
	
	public StateList() {
		emptyBurger = new StateEmptyBurger();
		fullBurger = new StateFullBurger();
		emptySlaw = new StateEmptySlaw();
		fullSlaw = new StateFullSlaw();
		emptyFries = new StateFullFires();
		fullFries = new StateFullFires();
		
		state = emptyBurger;
	}
	
	
	public void addBurger() {
	}
	public void minusBurger() {
	}
	public void addSlaw() {
	}
	public void minusSlaw() {
	}
	public void addFries() {
	}
	public void minusFries() {
	}

}
