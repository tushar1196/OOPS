public class ClassObjectDemo {

	public static void main(String[] args) {
		
    //classname objectname=new classname();
		Student s1=new Student();
		//objectname.methodname();
		/*
		 rollno=0  |
		 name=null |
		 marks=0.0 |     <--------s1
		 
		 */
			
		s1.setData();
		/*
		 rollno=1
		 name=xyz
		 marks=30.7      <--------s1
		 
		 */
		s1.display();
		
		Student s2=new Student();
		s2.setData();
		s2.display();
		
		
		
		
	}

}
