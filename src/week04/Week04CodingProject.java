package week04;

import java.util.Scanner;

public class Week04CodingProject {

	public static void main(String[] args) {
/*
 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
 * 	a. Programmatically subtract the value of the first element in the array from the value in the last element of the 
 * 		array (i.e. do not use ages[7] in your code). Print the result to the console.  
 * 	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
 * 		i. Make sure that there are 9 elements of type int in this new array.  
 * 		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array 
 * 		ages2 from the last element of ages2). 
 * 		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
 * 	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
 */
		System.out.println("-----Question 1-----");
		System.out.println("-----Part a-----");
		// creates an array of integers -- default integers are:3, 9, 23, 64, 2, 8, 28, 93
		int[] ages = {3,9,23,64,2,8,28,93};
		/* 
		 * subtracts the first element in the array (ages[0]) from the last element in the array (ages[ages.length-1]) of an length 
		 * (ages.length). It then prints the results to the console.  93 - 3 = 90
		*/
		System.out.println("The difference between the first and the last element in ages is: " + (ages[ages.length-1] - ages[0]));
		System.out.println("-----Part b-----");
		// creates a new array of type integer that is 9 element in size called ages2
		int[] ages2 = new int[9];
		// assigns the array values: 10,20,30,40,50,60,70,80,90
		for (int i = 0; i < ages2.length; i++) {
			ages2[i] = (i + 1) * 10;
		};
		/* 
		 * subtracts the first element in the array (ages2[0]) from the last element in the array (ages2[ages2.length-1]) of an length 
		 * (ages2.length). It then prints the results to the console. 90 - 10 = 80
		*/
		System.out.println("The difference between the first and the last element in ages2 is: " + (ages2[ages2.length-1] - ages2[0]));
		System.out.println("-----Part c-----");
		// initializes variable sum1 and sum2
		int sum1 = 0;
		int sum2 = 0;
		// sums up the elements in ages
		for (int age : ages) {
			sum1 += age;
		}
		// prints out the average of the elements in ages -- sum1 divided by ages length
		System.out.println("The average age for those in ages is: " + (sum1 / ages.length));
		// sums up the elements in ages2
		for (int age : ages2) {
			sum2 += age;
		}
		// prints out the average of the elements in ages2 -- sum2 divided by ages2 length
		System.out.println("The average age for those in ages2 is: " + (sum2 / ages2.length));
/*
 * 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
 * 	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
 * 	b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the 
 * 		result to the console.
 */
		System.out.println("\n-----Question 2-----");
		// initializes an array of String type
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		System.out.println("-----Part a-----");
		// initializes sumOfLetters type double, because if we use integer that it will round down to the nearest integer
		double sumOfLetters = 0;
		// goes through each element in names array and get the length and than adds it to the sumOfLetters variable
		for (String item : names){
			sumOfLetters += item.length();
		};
		// Prints to console the average of the name lengths.  sumOfLetters divided by total number of names rounded to 2 decimal places
		System.out.println("The average letter length of the names in names array is: " + Math.round((sumOfLetters / names.length)*100)/100.0);
		System.out.println("-----Part b-----");
		// initialize the string builder that I will print console.
		StringBuilder myNewString = new StringBuilder();
		// loops through string array and adds it to myNewString with a space between each of the elements
		for(int i = 0; i < names.length; i++) {
			myNewString.append(names[i]);
			if (i < names.length -1) {
				myNewString.append(" ");
			};
		};
		// Prints the result of the new string build to the console.
		System.out.println(myNewString.toString());
//3. How do you access the last element of any array?
		System.out.println("\n-----Question 3-----");
		System.out.println("To access the last element of array, you first need to know how long that array is.");
		System.out.println("To find out how long an array is you use the length attribute of an array (arrayName.length).");
		System.out.println("An array does not start at 1, but it starts at 0.  The last element of an array will be at the array");
		System.out.println("length minus the difference in the starting point (arrayName.length -1).  You then plug that into");
		System.out.println("the array to get the value (arrayName[arrayName.length -1]).");
//4. How do you access the first element of any array?
		System.out.println("\n-----Question 4-----");
		System.out.println("To access the first element of array, you first need to know that an array always starts at 0.");
		System.out.println("You then plug that into the array to get the value (arrayName[0]).");
// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the 
// 		length of each name to the nameLengths array.
		//System.out.println("\n-----Question 5-----");
		// initializes nameLengths to be the size of names
		int[] nameLengths = new int[names.length];
		// goes through names one by one and adds the length of the string to namesLengths
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		};
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result
// 		 to the console.
		System.out.println("\n-----Question 5/6-----");
		// reset sumOfLetters
		sumOfLetters = 0;
		//Adds up the numbers in the array nameLengths
		for (int num : nameLengths) {
			sumOfLetters += num;
		};
		// Prints the sum of the letters to the console. Math.round gets rid of the decimals from double sumOfLetters
		System.out.println("The total number of letters in the array names is: " + Math.round(sumOfLetters));
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number 
// 		of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("\n-----Question 7-----");
		System.out.println(repeatWord("Hello", 3));
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first 
// 		and the last name as a String separated by a space).
		System.out.println("\n-----Question 8-----");
		System.out.println(fullName("Brady", "Burgener"));
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("\n-----Question 9-----");
		// initializes array numbers
		int[] numbers = new int[10];
		// populates numbers array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		};
		// prints out to console the results of the method isGreaterThanHundred
		System.out.println("Your array of number is greater than 100: " + isGreaterThanHundred(numbers));
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		System.out.println("\n-----Question 10-----");
		// initializes variable numbersDouble
		double[] numbersDouble = {10.0,11.5,12.6,1328.5,125.5,54.3,57.2};
		// Prints to console the average of the numbersDouble
		System.out.println("The average of your double array is: " + averageOfArray(numbersDouble));
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
// 		greater than the average of the elements in the second array.
		System.out.println("\n-----Question 11-----");
		// initializes variable numbersDouble2
		double[] numbersDouble2 = {10.9,12.5,192.6,1328.5,125.5,54.3,57.3,1};
		// Prints to console if the average of the first array is larger than second array
		System.out.println("The average of your first double array is larger than your second array: " + 
				isFirstArrayAverageLarger(numbersDouble,numbersDouble2));		
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if 
// 		it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("\n-----Question 12-----");
		// initializes isHotOutside
		boolean isHotOutside = true;
		// initializes moneyInPocket
		double moneyInPocket = 11.50;
		// prints to console if you will buy a drink
		System.out.println("Will you buy a drink today: " + willBuyDrink(isHotOutside, moneyInPocket));
		
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		System.out.println("\n-----Question 13-----");
		whyOhWhy();
	}
	
	//Question #13 this method acts like a magic 8 ball - I wanted to do something fun
	public static void whyOhWhy() {
		// initiates a scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("What (yes or no type) question do you have for the magical 8 ball:");
		// takes a input string from the user 
		String yourQuestion = sc.nextLine();
		// initiates an array of answers
		String[] answers = {
				"Yes!","Let me think about it.","It is certain","Reply hazy","try again",
				"Don’t count on it","It is decidedly so","Ask again later","My reply is no",
				"Without a doubt","Better not tell you now","My sources say no",
				"Yes definitely","Cannot predict now","Outlook not so good",
				"You may rely on it","Concentrate and ask again","Very doubtful",
				"As I see it, yes","Most likely","Outlook good"		
		};
		// Prints question in console
		System.out.println("Your question was: " + yourQuestion);
		// Prints a random answer to the console
		System.out.println("The Answer is: " + answers[(int) (Math.random()*answers.length)]);
		// closes the scanner;
		sc.close();
	};
	
	//Question #12 Determines if you will buy a drink based on money in pocket and if it is hot outside
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//if it is hot outside and you have more money than 10.50 you will buy a drink
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	};
	
	//Question #11 compares the average of two arrays and determines if the first is bigger 
	public static boolean isFirstArrayAverageLarger(double[] numbersDouble,double[] numbersDouble2) {
		// initializes variable sum1 and sum 2
		double sum1 = 0;
		double sum2 = 0;
		// sums up the first array
		for (double num : numbersDouble) {
			sum1 += num;
		};
		// sums up the second array
		for (double num : numbersDouble2) {
			sum2 += num;
		};
		//determines which array average is larger
		if(sum1/numbersDouble.length > sum2/numbersDouble2.length) {
			return true;
		}else {
			return false;
		}
	};
	
	//Question #10 returns the average of the numbers in array numbers that contains double
	public static double averageOfArray(double[] numbers) {
		//initializes results
		double result = 0;
		// adds up the numbers in numbers
		for (double num : numbers) {
			result +=  num;
		};
		// returns the average
		return result / numbers.length;
	};
	
	//Question #9 adds up the numbers in numbers and than compares it to 100
	public static boolean isGreaterThanHundred (int[] numbers) {
		// initializes variable sum
		int sum = 0;
		// adds up the numbers in numbers
		for (int num : numbers) {
			sum += num;
		};
		// sees if the sum is greater than 100
		if(sum>100) {
			return true;
		} else {
			return false;
		}
	}
	
	//Question #8 method adds returns first name, followed by a space, and followed by the last name.
	public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	};
	
	//Question #7  method takes a word and repeats it n times
	public static String repeatWord(String word, int n) {
		//initializes the string builder
		StringBuilder result = new StringBuilder();
		//add word to string builder n times
		for (int i = 1; i <= n; i++) {
			result.append(word);
		};
		//returns string builder as a string
		return result.toString();
	};
}
