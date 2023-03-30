package lab1;
import java.util.Scanner;
public class Strongnum {

	public static void main(String[] args) {
		Strongnum ss=new Strongnum(); 
        int num1,num2,rem,sum=0; 
        Scanner sl=new Scanner(System.in); 
        System.out.println("Enter A Number"); 
        num2=sl. nextInt() ; 
        num1=num2; 
        while(num2>0) 
              { 
                  rem=num2%10; 
                  sum=sum+ss.fact(rem); 
                  num2=num2/10; 
              } 
        if(num1==sum) 
            System.out.println(num1+" is a strong number"); 
         else 
            System.out.println(num1+" is not a strong number"); 
       } 
              int fact(int i) 
                    { 
                        int f,j; 
                        f=1; 
                       for(j=i ;j>0;j--) 
                            f=f*j; 
                            return f; 
	}

}
