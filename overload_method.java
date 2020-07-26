package MitaliPrograms;

public class overload_method {

	overload_method(int n,double a, double b ){
		//this.add=n+a+b;
	}
	
	void test()
	{
		System.out.println("Enter the number");
	
	}
	
	public int test (int n)
	{
		return n;
		
	}
	
	public double test(double a, double b)
	{
		return a*b;
	}
}