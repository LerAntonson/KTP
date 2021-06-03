import static java.lang.Math.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import static java.lang.System.*;

public class task3 {
	public static String[][] millionsRounding(String[]... a)
	{
		for(int i=0; i<a.length; i++)
		{
			BigDecimal r=new BigDecimal(a[i][1]);
			r=r.divide(new BigDecimal("1000000")).setScale(0, RoundingMode.HALF_UP);
			a[i][1]=r.toString()+"000000";
		}
		return a;
	}

	public static double[] otherSides(int a){
		double b = a * 2;
		double c = a * Math.sqrt(3);
		b = Math.round(b * 100.0) / 100.0;
		c = Math.round(c * 100.0) / 100.0;
		double[] nums = new double[] {b, c};
		return nums;

	}
	public static String rps(String a, String b){
		if (a.equals("rock") && b.equals("scissors") || a.equals("scissors") && b.equals("paper") || a.equals("paper") && b.equals("rock"))
			return "Player 1 wins";
		else 
			if (a.equals(b))
				return "TIE";
		else
			return "Player 2 wins";
	}

	public static int warOfNumbers(int[] a){
		int even = 0;
		int odd = 0;
		for (int i = 0;i < a.length;i++){
			if (a[i] % 2 == 0)
				even = even + a[i];
			else
				odd = odd + a[i];
		}
		int rez = even - odd;
		if (rez < 0)
			rez = rez * -1;
		return rez;
	}

	public static String reverseCase(String a){
		char[] chars = a.toCharArray();
    	for (int i = 0; i < chars.length; i++)
    	{
        	char c = chars[i];
        	if (Character.isUpperCase(c))
        	{
            	chars[i] = Character.toLowerCase(c);
        	}
        	else if (Character.isLowerCase(c))
        	{
            	chars[i] = Character.toUpperCase(c);
        	}
    	}
    	return new String(chars);
	}

	public static String inatorInator(String a){
		int length = a.length();
		String b=""+a.charAt(length-1);
		String inator = ((length - 1) * 1000) + "";
		if (b.matches("[aAeEiIoOuUyY]"))
			return a + "-inator" + inator;
		else 
			return a + "inator" + " " + inator;
	}

	public static boolean doesBrickFit(int a,int b, int c, int w, int h)
	{
		if(((a>h || a>w) && (b>h || b>w)) || ((c>h || c>w) && (b>h || b>w)) || ((c>h || c>w) && (a>h || a>w)))
			return false;
		return true;
	}
	public static double totalDistance(double oil, double lose, int pas, boolean cond){
		lose = lose *(1 + 0.05*pas);
		if (cond == true)
			lose = lose * 1.1;
		return ceil((oil/lose)*10000)/100;
	}

	public static double mean(int[] a){
		int sum = 0;
		for (int i = 0; i < (a.length - 1);i++)
			sum = sum + a[i];
		double mean = ceil((((double) sum/a.length))*100)/100;
		return mean;
	}

	public static boolean parityAnalysis(int a){
		int sum = 0;
		while (a > 0){
			sum = sum + a % 10;
			a = a/10;
		}
		if (a % 2 == 0 && sum % 2 == 0 || a % 2 != 0 && sum % 2 != 0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args){
		String a = "scissors";
		String b = "paper";
		int nums[] = new int[] {1, 8, 9};
		double nums1[] = otherSides(3);
		System.out.println(Arrays.deepToString(millionsRounding(new String[] {"Moscow", "9000000"},new String[] {"London", "1500000"})));
		System.out.println("otherSides 3 -> " + nums1[0] +" "+ nums1[1]);
		System.out.println(rps(a,b));
		System.out.println("warOfNumbers result is ->" + warOfNumbers(nums));
		System.out.println("reverseCase for Happy Birthday -> " + reverseCase("Happy Birthday"));
		System.out.println("inatorInator for Shrink -> " + inatorInator("Shrink"));
		System.out.println("brickfit 1 1 1 1 1 -> " + doesBrickFit(1,1,1,1,1));
		System.out.println("total distance for 70.0, 7.0, 0, false ->" + totalDistance(70.0, 7.0, 0, false));
		System.out.println("mean for  1 2 3 4 5 6 ->" + mean(new int[]{ 1, 2, 3 ,3, 4, 5, 6}));
		System.out.println("parityAnalysis for 150 -> " + parityAnalysis(150));

	}
}
