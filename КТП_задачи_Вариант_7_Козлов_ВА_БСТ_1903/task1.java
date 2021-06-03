public class task1 {
 
	public static int remainder(int a, int b){
		int c = a % b;
		return c;
	}

	public static int triArea(int a, int b){
		int area = a * b / 2;
		return area;
	}

	public static int animals(int a,int b, int c) {
		int d = a * 2 + b * 4 + c * 4;
		return d;
	}

	public static boolean profitableGamble(double a, int b, int c){
		if (a * b > c)
			return true;
		else
			return false;
	}

	public static String operation(int n, int a, int b){
		if (n == a + b)
			return "added";
		else if (n == a - b)
			return "subtraction";
		else if (n == a * b)
			return "multiply";
		else if (n == a / b)
			return "division";
		else 
			return "none";
	}

	public static int ctoa(char c){
		int ascii = c;
		return ascii;
	}

	public static int addUpTo(int a){
		int b = 0;
		while (a > 0){
			b = b + a;
			a = a - 1;
		}
		return b;
	}

	public static int nextEdge(int a, int b){
		int c = a + b - 1;
		return c;
	}

	public static int sumOfCubes(int[] nums){
		int b = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++)
			b = b + nums[i] * nums[i] * nums[i];
		return b;
	}

	public static Boolean abcmath(int a, int b, int c){
		while (b > 0){
			a = a + a;
			b = b - 1;
		}
		if (a % c == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		int f = remainder(1,5);
		int nums[] = new int[] {1, 5, 9};
		int area = triArea(10,10);
		int an = animals(2,3,5);
		boolean g = profitableGamble(0.2, 50, 9);
		String s = operation(10, 5, 2);
		int ascii = ctoa('D');
		int add = addUpTo(15);
		int edge = nextEdge(8,10);
		int sum = sumOfCubes(nums);
		boolean abccheck = abcmath(42, 5, 10);
		System.out.println("remainder(3,4) -> " + f);
		System.out.println("triArea(10,10) -> " + area);
		System.out.println("animals(2,3,5) -> " + an);
		System.out.println("profitableGamble(0.2, 50, 9) -> " + g);
		System.out.println("operation(10, 5, 2) -> " + s);
		System.out.println("ctoa('D') -> " + ascii);
		System.out.println("addUpTo(15) -> " + add);
		System.out.println("nextEdge(8,10) -> " + edge);
		System.out.println("sumOfCubes([1,10,2]) -> " + sum);
		System.out.println("abcmath(42, 5, 10) -> " + abccheck);
	}
}

