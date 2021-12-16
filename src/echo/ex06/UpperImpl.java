package echo.ex06;

public class UpperImpl implements Runnable{

	@Override
	public void run() {
		
		for(char upper='A'; upper<='Z'; upper++) {
			System.out.println(upper);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
