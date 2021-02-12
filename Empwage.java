public class EmpWage{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numofWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpwage;

	public EmpWage(String company, int empRatePerHour, int numofWorkingDays,int maxHoursPerMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numofWorkingDays = numofWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpwage()
	{
	int empHrs = 0, totalEmpHrs = 0,totalWorkingDays = 0;
	while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numofWorkingDays){
		totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random() *10) % 3;
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
	totalEmpwage = totalEmpHrs * empRatePerHour;
}
public String toString() {
	return "Total Emp Wage for company: " +company+" is :"+totalEmpwage;
}
	public static void main(String args[]) {
		EmpWage dMart = new EmpWage("Dmart", 20, 20, 100);
		EmpWage relaince = new EmpWage("Relaince", 10, 25, 200);
		dMart.computeEmpwage();
		System.out.println(dMart);
		relaince.computeEmpwage();
		System.out.println(relaince);
		}
}
