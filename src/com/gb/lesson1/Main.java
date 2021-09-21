package com.gb.lesson1;

public class Main {
	// Задание 1
    public static void main(String[] args) {
    	// Задание 2
	    byte b = (byte) 10;
	    short s = (short) 100;
	    int i = 1000;
	    long l = 10000L;
	    float f = 3.14F;
	    double d = 9.26;
	    char c = 'c';
	    boolean bool = true;
	    String str = "Это строка";

		// Задание 3
	    float num1 = 2;
		float num2 = 4;
		float num3 = 7;
		float num4 = 9;
		System.out.println(mathExpression(num1, num2, num3, num4));

		// Задание 4
		System.out.println(between10And20(0,2));

		// Задание 5
		positiveOrNegativeProcedure(10);

		// Задание 6
		System.out.println(positiveOrNegativeFunction(-10));

		// Задание 7
		sayHelloName("Alex");

		// Задание 8
		LeapYearOrNot(2132);
    }

    /*Метод возврашает результат мат. выражения*/
    static float mathExpression(float a, float b, float c, float d){
		return a * (b + (c / d));
	}

	/*Метод возврашает результат лог. выражения
	* В этом методе я использовал логическое И чтобы задати диапазон*/
	static boolean between10And20(int a, int b){
    	int sum = a + b;

    	if(sum >= 10 && sum <= 20)
    		return true;
    	else
    		return false;
	}

	static void positiveOrNegativeProcedure(int number){
		if (number >= 0)
			System.out.println("Число положительное");
		else
			System.out.println("Число отрицательное");
	}

	static boolean positiveOrNegativeFunction(int number){
		if (number >= 0)
			return false;
		else
			return true;
	}

	static void sayHelloName(String name){
		System.out.println("Привет, " + name + "!");
	}

	static void LeapYearOrNot(int year){
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println(year + " - это високосный год");
		else
			System.out.println(year + " - это не високосный год");
	}
}
