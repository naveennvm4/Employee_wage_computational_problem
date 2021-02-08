public class EmpWage{
	public static void main(String args[]) {
		int Parttime=1;
		int Rateperhr=20;
		switch(Parttime) 
		      {
		      case 1:int Hrs=8;
  	  				int Salary1=Rateperhr*Hrs;
  	  				System.out.println("Salary for Part Time="+Salary1);
  	  				break;
  	  				default: System.out.println("Salary=0");
		    	    break;
		      }  
	}
}

