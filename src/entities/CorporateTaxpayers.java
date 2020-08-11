package entities;

public class CorporateTaxpayers extends Contributors {
	
	private Integer numberOfEmployees;
	
	public CorporateTaxpayers() {
	}

	public CorporateTaxpayers(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumerOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumerOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double taxCalc() {
		double tax = 0;
		if(numberOfEmployees <= 10) {
			tax = super.getIncome() * 0.14;
		}
		else {
			tax = super.getIncome() * 0.16;
		}
		return tax;
	}
}
