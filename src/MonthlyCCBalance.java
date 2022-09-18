public class MonthlyCCBalance {
    public static void main(String[] args) {

        double INTEREST_RATE=.17;
        double intialBalance=5000;
        double firstMonthBalance=0;
        double secondMonthBalance=0;


        firstMonthBalance= (intialBalance* INTEREST_RATE) +intialBalance;
        secondMonthBalance= (firstMonthBalance*INTEREST_RATE) +firstMonthBalance;

        System.out.println("Your new balance after one month without payments is: "+ firstMonthBalance);
        System.out.println("Your new balance after two months without payments is: "+secondMonthBalance);

    }
}

