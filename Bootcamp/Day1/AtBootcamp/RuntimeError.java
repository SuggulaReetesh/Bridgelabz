public class RuntimeError {
	public static void main(String args[]) {
		try {
		Methods m =new Methods();
		m.method1();
		m.method2();
		}
		catch(Exception e) {
			System.out.println("this is the error"+ e);
		}
	}
	
}