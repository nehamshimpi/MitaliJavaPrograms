package MitaliPrograms;

public class constructor_demo {
	 
	int a;
	int b;
	
	constructor_demo()		{
		System.out.println("The results are here:");
		
	}
	
	constructor_demo(int a, int b)
	{
		this.a=a;
		this.b=b;
		//System.out.println("The addition is: "+ (a+b));
			
	}
	
	public void add()
	{
		System.out.println("The addition is: "+ (a+b));
	}
	
	public void display()
	{
		System.out.println("The multiplication is: "+(a*b));
	}
	
	public void div()
	{
		System.out.println("The division is: "+a/b);
	}
	
	public void rem()
	{
		System.out.println("The remainder is: "+a%b);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor_demo c1=new constructor_demo();
		
		
		constructor_demo cd=new constructor_demo(4,2);
		
		cd.display();
		cd.add();
		cd.div();
		cd.rem();
		
		constructor_demo c2=new constructor_demo();
		
		constructor_demo cd1=new constructor_demo(5,2);
		
		cd1.display();
		cd1.add();
		cd1.div();
		cd1.rem();
		
	}

}