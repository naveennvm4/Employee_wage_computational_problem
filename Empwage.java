public class EmpWage{
	public static void main(String args[]) {
		int Parttime=1;
		int Fulltime=2;
		int Rateperhr=20;
		int DaysInMonth=20;
		int totalEmpWage=0;
		for(int days=0;days<DaysInMonth;days++)
		{
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(Fulltime==empCheck)
		{
			 int Hr=8;
			 int Salary=Rateperhr*Hr;
			 totalEmpWage += Salary;
			 System.out.println("Salary="+Salary);
		}
		else if(Parttime==empCheck)
		{
			 int Hr=4;
			 int Salary=Rateperhr*Hr;
			 totalEmpWage += Salary;
			 System.out.println("Salary="+Salary);
		}
		else
		{
			System.out.println("Salary=0");
		}
	  }
		System.out.println("Total Employee Wage"+totalEmpWage);
	}
}
