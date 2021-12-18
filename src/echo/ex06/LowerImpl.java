package echo.ex06;

public class LowerImpl implements Runnable{

	@Override
	public void run() {
		
		for(char lower='a'; lower<='z'; lower++) {
			System.out.println(lower);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
