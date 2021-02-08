public class EmpWage{
	public static void main(String args[]) {
		int Parttime=1;
		int Fulltime=2;
		int Rateperhr=20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(Fulltime==empCheck)
		{
			int Hr=16;
			int Salary=Rateperhr*Hr;
			System.out.println("Salary for Full Time="+Salary);
		}
		else if(Parttime==empCheck)
		{
			int Hrs=8;
			int Salary=Rateperhr*Hrs;
			System.out.println("Salary for Part Time="+Salary);
		}
		else
		{
			System.out.println("Salary=0");
		}
	}
}
