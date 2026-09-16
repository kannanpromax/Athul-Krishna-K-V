import java.util.Scanner;

public class primenumber{
  public static void main(String[]args){
  
     Scanner sc=new Scanner(System.in);
	 System.out.print("enter the limit:");
	 int limit = sc.nextInt();
	 System.out.println("prime number up to"+limit+"are:");
	 for(int num=2;num<=limit;num++){
	     int count=0;
		 for(int i=1;i<=num;i++){
		   if(num%i==0){
		     count++;
		   }
		  }
		   if(count==2){
		     System.out.print(num+" ");
		   }
		  }
		   sc.close();
		   }
		  }