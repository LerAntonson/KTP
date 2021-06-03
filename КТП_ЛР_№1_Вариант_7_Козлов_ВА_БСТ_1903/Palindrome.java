public class Palindrome {
	public static void main(String[] args) { 
		String s = "";
		for (int i = 0; i < args.length; i++) {
 			s = args[i];
 			boolean b = isPalindrome(s); //Вызов функции isPalindrome
		if (b == true)
			System.out.println("Is Palindrome -> " + s);//вывод результата если слово палиндром
		else
			System.out.println("Is not Palindrome -> " + s);//вывод результата если слово не палиндром
		}
	}
	public static String reverseString(String s){  
		int len = s.length(); 
		String str = ""; //Функция создает новую строку
		while (len > 0){ 
			str = str + s.charAt(len - 1);//начиная с конца
			len--;//записывает в нее поочередно все элементы входящей строки
		}
		return str;
	}
	public static boolean isPalindrome(String s){
		String str = reverseString(s);//Вызываем функцию, переворачивающую нашу строку
		if (s.equals(str))//Проверяем, является ли она равной нашей изначальной строке
			return true;
		else
			return false;
	}
}