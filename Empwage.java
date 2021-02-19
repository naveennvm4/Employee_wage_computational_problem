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

