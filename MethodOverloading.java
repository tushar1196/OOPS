/* MethodOverloading is OOP featute /methology where different methods has same name but 
  diifrent datatype arguments or different no. of arguments 
  2.It is not dependent on return type of method
  */
public class MethodOverloading {

	void add()
	{
		System.out.println("this is add()");
	}
	
	
	void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	
	void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	void add(float x,float y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
         m1.add(2,3,6);
         m1.add(1.2f,5.6f);
         m1.add();
         m1.add(2,4);
	}

}
