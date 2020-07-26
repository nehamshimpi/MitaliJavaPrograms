package MitaliPrograms;


public class stringbuffer_append {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		java.lang.String s1= "Lets";
		java.lang.String s2=" go!";
		System.out.println(s1.concat(s2));
		
		StringBuffer sb=new StringBuffer("Lets");
	    sb.insert(3, "'");
		//System.out.println(sb.append(" go!"));
		sb.append(" meet").append(" there.");
		System.out.println(sb);
		
		sb.substring(0,9);
		System.out.println(sb.substring(0,10));
		
		sb.append(" meet").append(" there.");
		System.out.println(sb);
		
		sb.delete(10, 16);
		System.out.println(sb);
		
		sb.replace(5, 10, " play");
		System.out.println(sb);
		
		
		
		

	}

}