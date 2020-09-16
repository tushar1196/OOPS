

/*1.No Arguments No return type
  2.With Arguments No return type
  3.No Arguments  With return type
  4.With Arguments With return type
 */
public class MehodsDemo {
	//2.With Arguments No return type
	int a;
	void add(int x,int y)//dummy,informal parameter
	{x++;//2
	y--;//2
		a=x+y;//a=4
	}
	void setA(int a1)
	{
		a=a1;
	}
	void displayA()
	{
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		MehodsDemo ob1=new MehodsDemo();
		ob1.setA(10);
		ob1.displayA();
		int p=1,q=3;//local
		ob1.add(p,q);//actual,formal parameters
         ob1.displayA();
         
         Employee e1=new Employee();
			e1.setData("xyz",10000);
	//		System.out.println(e1.name);
			
			
			
			
			
			
			
			
			
			
	}

}
