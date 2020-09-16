
public class Employee {
 double salary;
 private String name;
 
 
 void setData(String name1,double salary1)
 {name=name1;
 salary=salary1;
	 
 }
 //3.with returntype and no arguments
 double getSalary()
 {
	 return salary;
 }
 String getName()
 {
	 return name;
 }
 
 double addition() {
	 int x=100,y=200;
	return x+y; 
 }
 
	public static void main(String[] args) {
		
			Employee e1=new Employee();
			e1.setData("xyz",10000);
			//System.out.println(e1.name);
			String name1=e1.getName();
			System.out.println("Name="+name1);
			
			double salary1=e1.getSalary();
			System.out.println("salary="+salary1);
			
			System.out.println("Result="+e1.addition());
			
	}

}
