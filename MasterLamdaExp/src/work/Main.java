package work;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Application start....");
		
		/*
		 *  MyInterImpl my=new MyInterImpl();
		 *    my.sayHello();
		 */
		/*
		//2)...anonymous class for implementing interface
		MyInterface q=new MyInterface()
				{

					@Override
					public void sayHello() {
						
						System.out.println("This is an first anonymous class");
					}
			
				};
				q.sayHello();
				
				MyInterface i=new MyInterface() {
					
					@Override
					public void sayHello() {
						System.out.println("This is an second anonymous class");
						
					}
				};
				i.sayHello(); */
		
		
		//using functional with help of lambda exp
		
		/*
		 * MyInterface i=()->{ System.out.println("This is first lamda expression"); };
		 * i.sayHello(); MyInterface j=()->System.out.println("this is 2nd lambda exp");
		 * j.sayHello();
		 */
		/*
		 * SumInter k=(int a,int b)->{
		 * 
		 * return a+b; }; System.out.println(k.sum(22, 22));
		 * 
		 * SumInter s=new SumInter() {
		 * 
		 * @Override public int sum(int a, int b) { // TODO Auto-generated method stub
		 * return a+b; } }; System.out.println( s.sum(22, 5));;
		 */
		
		LengthInter l=str->str.length();
		System.out.println(l.getLength("vishal"));
	}
	
	


}
