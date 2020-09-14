import java.util.Scanner;

public class Student {
//Attributes,States, Instance Vaiables
	int rollno;
	double marks;
	String name;
	
	void setData()
	{
		int i=0;//local variable
		/*rollno=1;
		marks=30.7;
		name="XYZ";*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollnumber,name,marks");
		rollno=sc.nextInt();
		name=sc.next();
		marks=sc.nextDouble();
	}
	
	void display()
	{
		System.out.println("Name="+name+" Roll number"+rollno+" Marks="+marks);
	}
	
	
}
