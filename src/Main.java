public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000.0;
        double interestRate = 0.17;
//Process
        double monthRate = interestRate / 12;
        double oneMonth = balance * monthRate;
        balance += oneMonth;
        double twoMonths = balance * monthRate;
// Output
        System.out.println("Your interest after one month is $" + oneMonth);
        String String = "Your interest after two months is $" + twoMonths;
        System.out.println ("Your interest after two months is $" + twoMonths);
    }
}