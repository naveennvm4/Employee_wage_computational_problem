import java.util.Scanner;
public class EmpWage 
{
	final static int Is_Present=1;
	final static int Rate_Per_Hr=20;
	public void EmployeeWageUC1()
	{
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		int Hr=8;
		int Salary=Rate_Per_Hr*Hr;
		if(Is_Present==empCheck)
		{
		  System.out.println("Employee is Present");
		  System.out.println("Salary="+Salary);
		}
		else
		{
		  System.out.println("Employee is Abscent");
		  System.out.println("Salary=0");
		  
		}
	}
	public static void main(String[] args) 
	{
      System.out.println("Welcometo Employee Wage Computation Program");
      System.out.print("Enter the choice=");
      Scanner sc=new Scanner(System.in);
      int ch=sc.nextInt();  
      switch(ch) 
      {
      case 1: 	System.out.println("To calculate the Employee Wage");
    			EmpWage obj=new EmpWage();
    			obj.EmployeeWageUC1();
    	  		break;
    	  		  
      case 2:  	System.out.println("To calculate The part-full time Employee Wage"); 
      			EmployeePartTime obj2=new EmployeePartTime();
      			obj2.EmployeeUC3();
                break;
                   
      case 3: 	System.out.println("To calculate Monthly employee wage");
      			CalculateMonthWage obj3=new CalculateMonthWage();
      			obj3.EmployeeUC5();
      			break;
 
      case 4: 	System.out.println("To calulate employee wage hours ");
      			EmployeeWageHrs obj4=new EmployeeWageHrs();
      			obj4.employeeWageUC6();
      			break;

      default: 	System.out.println("Wrong Selection");
      			break;
      }  
	}
}
class EmployeePartTime
{
	final static int Part_Time=1;
	final static int Full_Time=2;
	final static int Rate_Per_Hr=20;
	public void EmployeeUC3()
	{
		int Hr=0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(Full_Time==empCheck)
		{
			 Hr=8;
		}
		else if(Part_Time==empCheck)
		{
			 Hr=4;
		}
		else
		{
			System.out.println("Salary=0");
		}
		 int Salary=Rate_Per_Hr*Hr;
		 System.out.println("Salary="+Salary);
	}   
}
class CalculateMonthWage
{
	final static int Part_Time=1;
	final static int Full_Time=2;
	final static int Rate_Per_Hr=20;
	final static int Days_In_Month=20;
	public void EmployeeUC5() 
	{
		int Hr=0;	
		int totalEmpWage=0;
		for(int days=0;days<Days_In_Month;days++)
		{
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(Full_Time==empCheck)
		{
			 Hr=8;
		}
		else if(Part_Time==empCheck)
		{
			 Hr=4;
		}
		else
		{
			System.out.println("Salary=0");
		}
		 int Salary=Rate_Per_Hr*Hr;
		 totalEmpWage += Salary;
		 System.out.println("Salary="+Salary);
	  }
		System.out.println("Total Employee Wage"+totalEmpWage);
	}
}
class EmployeeWageHrs
{
	final static int Part_Time=4;
	final static int Full_Time=8;
	final static int Is_Part_Time=1;
	final static int Is_Full_Time=2;
	final static int Rate_Per_Hr=20;
	final static int Max_Hr=100;
	final static int Working_days_in_month=20;
	public void employeeWageUC6()
	{
		int Hr=0;
		int totalEmpWage=0;
		int totalworkingday=0;
		while(Hr < Max_Hr && totalworkingday < Working_days_in_month)
		{
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int check=(int)empCheck;
			switch(check)
			{
			case Is_Part_Time:
				totalEmpWage+=Rate_Per_Hr*Part_Time;
				Hr+=Part_Time;
				totalworkingday+=1;
				break;
			case Is_Full_Time:
				totalEmpWage+=Rate_Per_Hr*Full_Time;
				Hr+=Full_Time;
				totalworkingday+=1;
			default:
			}
		}
		System.out.println("Hours="+Hr+"Workingdays="+totalworkingday);
		System.out.println("Salary="+totalEmpWage);
	}
} 
