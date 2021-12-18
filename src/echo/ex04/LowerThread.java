package echo.ex04;

public class LowerThread extends Thread{

	
	public void run() {
		
		for(char lower='a'; lower<='z'; lower++) {
			System.out.println(lower);
			//Thread.sleep(1000); 
		}
	}
		
	

}
