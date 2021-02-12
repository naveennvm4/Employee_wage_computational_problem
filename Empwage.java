public class EmpWage{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeEmpwage(String company, int empRatePerHour, int numofWorkingDays,int maxHoursPerMonth)
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
	int totalEmpwage = totalEmpHrs * empRatePerHour;
	System.out.println ("Total Emp Wage for company: " +company+" is :"+totalEmpwage);
	return totalEmpwage;
}
		public static void main(String args[]) {
			computeEmpwage("Dmart", 20, 20, 100);
			computeEmpwage("Relaince", 10, 25, 200);
		}
}
