//this is a keyword which reffers to current object
//it is used to differenciate between local and instance variable
public class ThisDemo {
int x,y;
ThisDemo(int x,int y)
{
  this.x=x;
  this.y=y;
  x=30;//local
  y=40;
}

	
void display()
{
	System.out.println("x="+x+"y="+y);
}
	public static void main(String[] args) {
		ThisDemo ob=new ThisDemo(10,20);
		//ThisDemo ob=new ThisDemo();
		ob.display();
	}

}
