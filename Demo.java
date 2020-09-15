import java.util.Scanner;

public class Demo {
//4.with argument and with return type
	
	
	int cube(int a) 
	{
		int x=a*a*a;
		return x ;
		//return a*a*a;
	}
	
	public static void main(String[] args) {
		
			Demo d1=new Demo();
			int a=10;
			int b=d1.cube(a);
			System.out.println(a+"cube="+b);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			int n=sc.nextInt();
			System.out.println(n+"'s cube="+d1.cube(n));
	}

}
