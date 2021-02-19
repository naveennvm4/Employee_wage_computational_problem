import java.util.*;

public class EmpWage {
	final static int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private int numofCompany = 0;
	private LinkedList<Main> cmpEmpWageArray;
	private Map<String, Main> companyToEmpWage;

	public EmpWage() {

		cmpEmpWageArray = new LinkedList<>();
		companyToEmpWage = new HashMap<>();
	}

	public void addCompanyEmpWage(int emp_hrs, int work_hrs, int hrs_month, String company) {
		Main companyEmpWage = new Main(emp_hrs, work_hrs, hrs_month, company);
		cmpEmpWageArray.add(companyEmpWage);
		companyToEmpWage.put(company, companyEmpWage);
	}

	public void calcEmpWageFor() {
		for (int i = 0; i < cmpEmpWageArray.size(); i++) {
			Main companyEmpWage = cmpEmpWageArray.get(i);
			companyEmpWage.setTotalEmpWage(this.calcEmpWageFor(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	public interface IComputeEmpWage {
		public void addCompanyEmpWage(int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH,
				String company);

		public void calcEmpWageFor();
		public int getTotalWage(String company);
	}

	public int getTotalWage(String company) {
		return companyToEmpWage.get(company).totalEmpWage;
	}

	private int calcEmpWageFor(Main m) {
		int empHrs = 0, empWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs < m.MAX_HRS_IN_MONTH && totalWorkingDays < m.NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) (Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 4;
				break;
			default:
				empWage = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("DAY#: " + totalWorkingDays + "EmpHr:" + empHrs);
		}
		return totalEmpHrs = totalEmpHrs * m.EMP_RATE_PER_HR;

	}
	public class Main {

		public final int EMP_RATE_PER_HR;
		public final int NUM_OF_WORKING_DAYS;
		public final int MAX_HRS_IN_MONTH;
		public final String company;
		public int totalEmpWage;

		public Main(int emp_hrs, int work_hrs, int hrs_month, String company) {
			this.EMP_RATE_PER_HR = emp_hrs;
			this.NUM_OF_WORKING_DAYS = work_hrs;
			this.MAX_HRS_IN_MONTH = hrs_month;
			this.company = company;
		}

		public void setTotalEmpWage(int totalEmpWage) {
			this.totalEmpWage = totalEmpWage;
		}

		public String toString() {
			return " Total Employee Wage" + company + " : " + totalEmpWage;
		}
	}

	public static void main(String[] args) {
		EmpWage obj1 = new EmpWage();
		obj1.addCompanyEmpWage(10, 20, 30, "Dmart");
		obj1.addCompanyEmpWage(20, 30, 40, "BigBasket");
		obj1.calcEmpWageFor();
		System.out.println("Total wage for Dmart : " + obj1.getTotalWage("Dmart"));
	}
}
