package entities;

public class Taxpayers extends Contributors{

	private double healthSpending;
	
	public Taxpayers() {
		super();
	}

	public Taxpayers(String name, Double income, double healthSpending) {
		super(name, income);
		this.healthSpending = healthSpending;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public double taxCalc() {
		double tax = 0;
		if(super.getIncome() <= 20000.0) {
			tax = super.getIncome() * 0.15;
		}
		else {
			tax = super.getIncome() * 0.25;
		}
		if(healthSpending > 0) {
			tax += healthSpending * 0.5;
		}
		return tax;
	}
}
