class OddEvenThread extends Thread{
int limit;

OddEvenThread(int limit){
this.limit=limit;
}

public void run(){
System.out.println("Even Numbers:");
for(int i=2;i<=limit;i+=2){
System.out.println(i);
}

System.out.println("Odd Numbers:");
for(int i=1;i<=limit;i+=2){
System.out.println(i);
}
}

public static void main(String[]args){
int limit=10;

OddEvenThread obj=new OddEvenThread(limit);
obj.start();
}
}