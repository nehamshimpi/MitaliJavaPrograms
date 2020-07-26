package MitaliPrograms;

public class MethodDemo {

	// void is called return type

	public static void demo() {

		Object ob[] = new Object[4];
		ob[0] = "one";
		ob[1] = 1;
		ob[2] = 'e';
		ob[3] = 1.2;

		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
	}

	public static void main(String[] args) {
		demo();
	}
}
