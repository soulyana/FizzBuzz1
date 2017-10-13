package me.soulyana;

public class FizzBuzz {

	public static void main(String[] args) {
		String ans = "";
	
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0 && i % 5 == 0) ans = "FizzBuzz ";
			else if(i % 3 == 0) ans = "Fizz ";
			else if(i % 5 == 0) ans = "Buzz ";
			else ans = String.valueOf(i);
		System.out.println(ans);
		}
	}
}





