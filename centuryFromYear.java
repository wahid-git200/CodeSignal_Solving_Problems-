

 // link of this broblem pist this on your browser
//https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN

import java.util.*;
import java.lang.*;
import java.io.*;

class centuryFromYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		System.out.println(solution(year));	
	}
	//this is your function
		int solution(int year) {
		int s;
		s=year/100;
		if(s*100==year){
		return s;
		}
		else  
		s++;
		return s;
   }
}