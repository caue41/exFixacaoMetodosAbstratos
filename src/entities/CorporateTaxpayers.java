package entities;

public class CorporateTaxpayers extends Contributors {
	
	private Integer numberOfEmployees;
	
	public CorporateTaxpayers() {
	}

	public CorporateTaxpayers(String name, Double income, Integer numerOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numerOfEmployees;
	}

	public Integer getNumerOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumerOfEmployees(Integer numerOfEmployees) {
		this.numberOfEmployees = numerOfEmployees;
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
