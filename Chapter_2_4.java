import java.util.Scanner;

public class Chapter_2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter stock price: ");
		double stockPrice = input.nextDouble();
		System.out.println("Enter number of shares: ");
		int shares=input.nextInt();
		double result_1=stockPrice*shares;
		result_1= Math.round(result_1*100);
		result_1=result_1/100;
		System.out.println("Number of shares: $"+result_1);
		System.out.println("Enter commission (as a percentage): ");
		double com = input.nextDouble();
		double result_2=result_1*com;
		result_2= Math.round(result_2);
		result_2= result_2/100;
		System.out.println("Commission : $"+result_2);
		System.out.println("Net proceeds: $"+(result_1-result_2));
		

	}

}
