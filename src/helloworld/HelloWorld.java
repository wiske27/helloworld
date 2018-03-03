package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		int i = 10;
		String s = "Hello";
		//String s = new String ("Hello");
		
		Goods g = new Goods();
		
		g.setName("콜라"); 
		g.setPrice(2000);
		
		System.out.println( g.getName() + " : " +  g.getPrice() );
		
		Goods g2 = new Goods("팹시", 1500);
		System.out.println( g2.getName() + " : " + g2.getPrice() );
		
	}
}
