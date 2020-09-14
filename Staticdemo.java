class A
{
   int a;//instance
   static int b;//class
   void increment()
   {
	   a++;b++;
   }
   void display()
   {
	   System.out.println("a="+a+"b="+b);
   }
}
public class Staticdemo {
	public static void main(String[] args) {
	 A ob1=new A();         // a=1   <---ob1
	 A ob2=new A();         // a=1   <---ob2
	                        //b=2  <---ob1,ob2
	
	 ob1.increment(); 
	 ob1.display(); //a=1 b=1
	 ob2.increment();    
	 ob2.display();	//a=1 b=2 	
	 
	 System.out.println("ob1.a="+ob1.a);
	 System.out.println("A.b="+A.b);
	 
	 
	 
	}

}
