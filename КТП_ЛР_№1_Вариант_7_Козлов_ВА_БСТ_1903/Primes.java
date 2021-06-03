public class Primes {
	public static void main(String[] args) {  //основная функция
		System.out.println("Prime counts from 2 to 100:");
		for (int i = 2; i < 100; i++){   //Начало цикла (от 2 до 100 (100 не включительно тк оно не простое))
			if (isPrime(i) == true)    //Если число простое - выводим его
				System.out.println(i);
		}
	}
	public static boolean isPrime(int n){
		int count = 0;  //Это количество чисел, на которые делится проверяемое нами число
		for(int j = 2; j <=n && count < 2;++j){  //Начало цикла 
    		if(n % j == 0){   //проверка условия 
      			++count;		//увеличение нашего счетчика если число делится на какое-либо
    		}
  		}
 		if(count<2)		//Наш счетчик может быть равен только 1, тк число должно делиться только на себя
 			return true;	//выводим true если число простое
 		else
 			return false;	//выводим false если число не простое
	} 
} 