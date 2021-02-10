public class EmpWage{
	public static void main(String args[]) {
	int isPresent=1;
	double empCheck= Math.floor(Math.random()*10)%2;
	int rateperhr=20;
	int Hr=8;
	int Salary=rateperhr*Hr;
	System.out.println("Salary="+Salary);
	if(empCheck == isPresent)
		System.out.println("employee is present");
	else
		System.out.println("employee is absent");
	}
}
