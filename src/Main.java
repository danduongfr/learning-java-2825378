import java.util.Scanner;

public class Main {

    public static double calculateGrossYearlySalary(int nbHoursPerWeek, double hourlySalary) {
        return nbHoursPerWeek * hourlySalary * 52;
    }

    public static double adjustForVacationDays( double yearlySalary, double hourlySalary, int vacationDays) {
        return yearlySalary - (hourlySalary*8) * vacationDays;
    }

    public static void main(String[] args) {
        int nbHoursPerWeek;
        double hourlySalary;
        double grossYearlySalary;
        int vacationDays;
        boolean bContinue = true;
        Scanner input = new Scanner(System.in);


        while (bContinue) {
            System.out.println("Enter the hourly salary ? ");
            hourlySalary = input.nextDouble();

            System.out.println("Enter nb of hours per week ? ");
            nbHoursPerWeek = input.nextInt();

            grossYearlySalary = calculateGrossYearlySalary(nbHoursPerWeek, hourlySalary);

            System.out.println("Enter the number of vacation days per year ? ");
            vacationDays = input.nextInt();

            grossYearlySalary = adjustForVacationDays(  grossYearlySalary,  hourlySalary,  vacationDays);
            System.out.println("The Gross Yealy Salary is " + grossYearlySalary);

            System.out.println("Do you want to continue ? yes/no");
            bContinue = (input.next().equals("yes"));
        }

    }

}
