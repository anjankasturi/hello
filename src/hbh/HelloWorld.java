package hbh;
class Hi{
	public void out() {
		System.out.println("This is Hi Class function");
	}
}
public class HelloWorld extends Hi {
	public static void main(String args[]) {
		
		System.out.println("Hello You are in main function");
		HelloWorld h=new HelloWorld();
		h.out();
		System.out.println("Added this");
	}

}
