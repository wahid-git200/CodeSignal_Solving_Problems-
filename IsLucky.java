

 // link of tis broblem pist this on your browser
//https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ

class IsLucky
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		System.out.println(solution(x));

	}
	//this is unswer
	boolean solution(int n) {
  
     String s = String.valueOf(n);
     int firstHalf = 0;
     int secondHalf = 0;
    
     if( s.length() % 2 != 0)
        return false;
               
     else{
          for(int i = 0; i < s.length() ; i++){
              
              if(i < s.length() / 2)
                  firstHalf += (int)s.charAt(i);
              else
                secondHalf += (int)s.charAt(i);
           }
          return (firstHalf == secondHalf);
      }
    }
}
