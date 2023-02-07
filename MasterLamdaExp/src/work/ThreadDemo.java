package work;

public class ThreadDemo {

	public static void main(String[] args) {
		// First Thread : Thread -JOHN
		
		Runnable thread1=()->{
			
			for(int i=1 ;i<=10;i++)
			{
				System.out.println("value of i is :"+i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(thread1);
		t.setName("JOHN");
		t.start();

		Runnable thread2=()->{
			
			for(int i=1 ;i<=15;i++)
			{
				System.out.println("Table of 2: "+i*2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		Thread t2=new Thread(thread2);
		t2.start();
	}

}
