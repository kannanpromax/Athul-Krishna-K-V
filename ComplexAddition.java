import java.util.Scanner;

class Complex {
  int real,imag;
  void setData(int r,int i){
  real =r;
  imag = i;
  }
  Complex add(Complex c){
  Complex result = new Complex();
  
  result.real=this.real + c.real;
  result.imag=this.imag + c.imag;
  
  return result;
  }
  
  void display(){
  System.out.println(real +"+"+ imag + "i");
  }
  }
  public class ComplexAddition{
    public static void main(String[]args){
	
	Scanner sc = new
	Scanner(System.in);
	
	Complex c1= new Complex();
	Complex c2 = new Complex();
	
	System.out.print("Enter real and imaginary part of first complex number:");
	int r1 = sc.nextInt();
	int i1 = sc.nextInt();
	c1.setData(r1,i1);
	
	System.out.print("Enter real and imaginary part of second complex number:");
	int r2 = sc.nextInt();
	int i2 = sc.nextInt();
	c2.setData(r2,i2);
	
	Complex sum = c1.add(c2);
	
	System.out.print("First Complex Number:");
	c1.display();
	
	System.out.print("Second Complex Number:");
	c2.display();
	
	System.out.print("Sum of Complex Number:");
	sum.display();
	
	sc.close();
	}
	}
	