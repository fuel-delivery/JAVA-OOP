
public class TestThread {

	public static void main(String[] args) {
		/*ExempleThread e1=new ExempleThread("Thread 1");
		ExempleThread e2=new ExempleThread("Thread 2");
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e2);
		t1.start();
		t2.start();*/
		ExempleThread2 e1=new ExempleThread2("AAA");
		ExempleThread2 e2=new ExempleThread2("BBB");
		e1.start();
		e2.start();
		for(int i=0;i<10;i++) {
			System.out.println("main "+i);
		}
		
		
		
	}

}
