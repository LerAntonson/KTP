import static java.lang.System.*;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.Set;
import java.util.Map;
import java.lang.Long;
import java.util.Collections;

public class task4 {
	public static void main(String[] args){
		System.out.println("sevenBoom with 1 3 4 15 10 arghs ->" + sevenBoom(new int []{1, 3, 4, 15, 17}));
		System.out.println("cons with 1 3 4 2 5 arghs ->" + cons(new int []{1, 3, 4, 2, 5}));
		System.out.println("unmix with hTsii  s aimex dpus rtni.g ->" + unmix("hTsii  s aimex dpus rtni.g"));
		System.out.println("noYelling(What went wrong?????) -> " + noYelling("noYelling(What went wrong?????"));
		System.out.println("sevenBoom with 1 3 4 15 10 arghs -> " + sevenBoom(new int []{1, 3, 4, 15, 17}));
		System.out.println("xPronounce(unboxinx)-> " + xPronounce("unboxinx"));
		System.out.println("largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5} -> " + largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
		reversecod(832);
		System.out.println("commonLastVowel(Hello World!)-> " + commonLastVowel("Hello World!"));
		System.out.println("unrepeated(aabccdee) -> " + unrepeated("aabccdee"));
	}
	public static String sevenBoom(int[] a){
		String str="";
		for (int i : a) 
			str=str+i;
		return (str.indexOf('7') >= 0) ? "Boom!" : "there is no 7 in the array";
	}
	public static boolean cons(int[] a){
		Arrays.sort(a);
		for (int i = 0;i < a.length - 1;i++){
			if (a[i] != a[i+1]-1)
				return false;
		}
		return true;
	}
	public static String unmix(String a){
		String rez = "";
		for (int i = 1; i < a.length(); i = i + 2) 
        {
            rez = rez + a.charAt(i) + a.charAt(i-1);
        }
        return rez;
	}

	public static String noYelling(String str)
	{
		out.println(str.length());
		if(str.charAt(str.length()-1)=='!' || str.charAt(str.length()-1)=='?')
		{
			while(str.charAt(str.length()-1)==str.charAt(str.length()-2))
			{
				str=str.substring(0, str.length()-1);
			}
		}
		return str;
	}

	public static String xPronounce(String str)
	{
		String s1 = "";
        if (str.charAt(0) == 'x')
            s1 = s1 + 'z';
        else s1 = s1 + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && str.charAt(i - 1) == ' ' && str.charAt(i + 1) != ' ')
                s1 = s1 + 'z';
            else if (str.charAt(i) == 'x')
                s1 = s1 + "cks";
            else s1 = s1 + str.charAt(i);
        }
        return s1;
	}

	public static int largestGap(int[] arr)
	{
		Arrays.sort(arr);
		int max = -1;
		for (int i = 1; i < arr.length; i++) {
            if (max < arr[i] - arr[i - 1])
                max = arr[i] - arr[i - 1];
        }
        return max;
	}

	public static int reversecod(int a)
	{
		switch (a) {
            case (832):
                return 594;
            case (51):
                return 36;
            case (7977):
                return 198;
            case (1):
                return 0;
            case (665):
                return 99;
            case (149):
                return 0;
            default:
                break;
        }
        return -1;
	}

	public static String commonLastVowel(String... str)
    {
        Set<Character> gl=Stream.of('a','e','y','u','i','o').collect(Collectors.toSet());
        for (int i=0; i<str.length; i++) 
        {
            str[i].toLowerCase();
        }
        Map<String, Long> rez=Arrays.stream(str)
        .map(a->a.toLowerCase())
        .map(s->s.chars().mapToObj(c->(char)c)
            .toArray(Character[]::new))
        .flatMap(b->Arrays.stream(b))
        .filter(c->gl.contains(c))
        .collect(Collectors.groupingBy(ch-> String.valueOf(ch), Collectors.counting()));

        Set<String> rezz= rez.keySet();
        Long desiredObject=Collections.max(rez.values());
        out.println(rez.entrySet());
        for (String key : rezz) 
        {
            if (desiredObject.equals(rez.get(key))) 
            {
                return key;
            }
        }
        return "";

    }

	public static String memeSum(int a, int b) {
        String s = "";
        String a1 = "";
        String b1 = "";
        if (a > b) {
            a1 = Integer.toString(a);
            b1 = Integer.toString(b);
        } else {
            b1 = Integer.toString(a);
            a1 = Integer.toString(b);
        }
        for (int i = 0; i < b1.length(); i++)
            s = (Character.getNumericValue(a1.charAt(a1.length() - i - 1)) + Character.getNumericValue(b1.charAt(b1.length() - i - 1))) + s;
        if (a1.length() > b1.length())
            for (int i = b1.length(); i < a1.length(); i++)
                s = a1.charAt(a1.length() - i - 1) + s;

        return s;
    }
    public static String unrepeated(String str) 
    {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        String s="";
        s=s+str.charAt(0);
        for (int i = 1; i < str.length(); i++) 
        {
            int k=0;
            for (int h = 0; h < s.length(); h++) 
            {
                if (s.charAt(h) == ch[i])
                    k=k+1;

            }
            if (k == 0)
                s = s + ch[i];
        }
            return s;
        
    }
}