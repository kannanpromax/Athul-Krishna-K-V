class A
{
A()
{

System.out.println("Constructor of Class A");
}
}
class B extends A
{
B()
{

System.out.println("Constructor of Class B");
}
}

class C extends B
{
C()
{

System.out.println("Constructor of Class C");
}
}
public class ConstructorDemo
{
public static void main(String args[])
{
System.out.println("Creating object of Class C");
C obj = new C();
}
}