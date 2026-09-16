import java.util.scanner;

public class prime number{
  public static avoid main(string[]args){
  
     scanner sc=new scanner(system.in);
	 system.out.println("enter the limit:");
	 int limit=sc.nextlnt();
	 system.out.println("prime number up to"+limit+"are:");
	 for(int num=2;num<=limit;num++){
	     int count=0;
		 for(int i=1;i<=num;i++){
		   if(num%i==0){
		     count++;
		   }
		  }
		   if(count==2){
		     system.out.println(num+" ");
		   }
		  }
		   sc.close();
		   }
		  }