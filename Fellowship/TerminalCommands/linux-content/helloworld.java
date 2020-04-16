class HelloWorld{
	public static void main(String args[]){
		System.out.println("hello world");
		try{
			Thread.sleep(60000);
		}
		catch(Exception e){
			System.out.println("thread not executed");
		}
        }
	}
