

 // link of this broblem pist this on your browser
//https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ

import java.util.*;
import java.lang.*;
import java.io.*;

class check_Palindrome

{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(solution(str));
	}
	//this is your function
	boolean solution(String a) {
           String reverseStr="";
        for(byte c:a.getBytes()){
            reverseStr=(char)c+reverseStr;
        }  
         return(a.equals(reverseStr));
    }
}