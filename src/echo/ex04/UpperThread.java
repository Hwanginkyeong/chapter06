package echo.ex04;

public class UpperThread extends Thread{
	
	
	public void run() {
		
		for(char upper='A'; upper<='Z'; upper++) {
			System.out.println(upper);
			//Thread.sleep(1000); 
		}
		
	}
		
		
	
		

	

}
