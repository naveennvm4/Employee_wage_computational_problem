public class EmpWage{
	public static void main(String args[]) {
		int Parttime=4;
		int Fulltime=8;
		final int isParttime=1;
		final int isFulltime=2;
		int Rateperhr=20;
		int Hr=0;
		int totalEmpWage=0;
		int totalworkingday=0;
		while(Hr < 100 && totalworkingday < 20)
		{
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int check=(int)empCheck;
			switch(check)
			{
			case isParttime:
				totalEmpWage+=Rateperhr*Parttime;
				Hr+=Parttime;
				totalworkingday+=1;
				break;
			case isFulltime:
				totalEmpWage+=Rateperhr*Fulltime;
				Hr+=Fulltime;
				totalworkingday+=1;
			default:
		}
	}
		System.out.println("Hours="+Hr+"Workingdays="+totalworkingday);
		System.out.println("Salary="+totalEmpWage);
	}
}
