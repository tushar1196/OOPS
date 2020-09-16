/*
 It is special method used to initialise object.
 It get called automatically when we create an object.
 It does not have  returntype even void is not allowed.
 It has same name as classname.
 It can have parameters 
 */
public class ConstructureDemo {

	int a,b;

	ConstructureDemo()//default constructor
	{
		a=10;
		b=20;
		//System.out.println("Constructor called");
	}
	
	ConstructureDemo(int a1,int b1)//default constructor
	{
		a=a1;
		b=b1;
		//System.out.println("Constructor called");
	}
	void display() {
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String[] args) {
		ConstructureDemo obj=new ConstructureDemo();
		//obj.ConstructureDemo();
		obj.display();
		
		ConstructureDemo obj2=new ConstructureDemo();
		//obj.ConstructureDemo();
		obj2.display();
		
      Student s1=new Student();//constructor gets called
      s1.display();
      
      ConstructureDemo obj3=new ConstructureDemo(100,200);
		//obj.ConstructureDemo();
		obj3.display();
      
		
		Student s2=new Student(10,79.6,"Sneha");
		s2.display();
      
	}

}
