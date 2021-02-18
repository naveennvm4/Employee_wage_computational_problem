public class EmpWage{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public class CompanyEmpWage{
		public final String company;
		public final int empRatePerHour;
		public final int numofWorkingDays;
		public final int maxHoursPerMonth;
		public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numofWorkingDays,int maxHoursPerMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numofWorkingDays = numofWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage= 	totalEmpWage;
	}
	public String toString() {
		return "Total Emp Wage for Company: " +company+" is: "+totalEmpWage;
	}
	}

	public EmpWage() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	public void addCompanyEmpWage(String company, int empRatePerHour, int numofWorkingDays,int maxHoursPerMonth){
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numofWorkingDays,
				maxHoursPerMonth);
		numOfCompany++;
	}
	private void computeEmpWage() {
		for (int i=0; i< numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpwage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpwage(CompanyEmpWage companyEmpWage)
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < 
				companyEmpWage.numofWorkingDays){
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Daye#: "+ totalWorkingDays + "Emp Hr: " +empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	public static void main(String args[]) {
		EmpWage empWage = new EmpWage();
		empWage.addCompanyEmpWage("Dmart", 20, 20, 100);
		empWage.addCompanyEmpWage("Relaince", 10, 25, 200);
		empWage.computeEmpWage();
	}
}
