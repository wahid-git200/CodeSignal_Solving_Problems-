

 // link of tis broblem pist this on your browser
//https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM
import java.util.*;

class Sort_By_Height
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr ={-1, 150, 190, 170, -1, -1, 160, 180};
        Sort_By_Height obj = new Sort_By_Height();

        System.out.println(Arrays.toString(solution(arr)));

	}
//********************************************this is unswer******************************************
    int[] solution(int[] a) {

        for(int i = 0 ; i < a.length ; i++){
            
            for(int j = 0 ; j < a.length ; j++){           
                if(a[j] != -1 &&a[i]!=-1 &&a[j] > a[i]){
                    
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;  
                }
            }
        } 
        return a;
    }
}
