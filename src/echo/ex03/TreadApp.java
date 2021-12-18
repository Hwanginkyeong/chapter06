package echo.ex03;

public class TreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new DigitThread();
		thread.start(); //run이 아니라 start 
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);  //static 
		}

	}

}
