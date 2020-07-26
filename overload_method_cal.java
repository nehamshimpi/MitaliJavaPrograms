package MitaliPrograms;

public class overload_method_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overload_method om = new overload_method(3, 4.1,5.3);
		
		System.out.println("The answer is:"+om.test(3));
		
		System.out.println("The answer is:"+ om.test(4.1,5.3));
	}

}