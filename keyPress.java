import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Noah Jaussi
 *
 */
public class keyPress {

	public static void main(String[] args) {
		// create new scanner object
		Scanner key = new Scanner(System.in);
		//prompt user with input
		System.out.println("press 9 to run loop");
		System.out.println("press red square above console to stop program");
		
		//receive user input
		int in = key.nextInt();
		//create variable that controls the main loop
		int out = 7;
		
		//create random object
		Random random = new Random();
		
		//main program
		while(out == 7) {
			//check if key to start program was correct
			if(in == 9) {
				//assign int val to new random int from object that ranges from 0-11000 milliseconds
				//this is the delay value assignment
				int randomVal = random.nextInt(11000);
				//run simulated key presses
				keyPressA(randomVal);
				keyPressS(randomVal);
				keyPressD(randomVal);
				keyPressW(randomVal);
				
				
				/*TODO make key press into an array so they can be called at random
				 * instead of specific order, will make program harder to detect
				*/
					 
			}
		}
	}
	
	/**
	 * simulated key press 'a' and delays program by given delay
	 * @param delay value
	 */
	public static void keyPressA( int x) {
		Robot robot;
		try {
		//create new robot object from google API
		robot = new Robot();
		//simulate key 'a'
		 robot.keyPress(KeyEvent.VK_A);
		 //hold key down for period of time
		 Thread.sleep(1000);
		 robot.keyRelease(KeyEvent.VK_A);
		//delay for a random time from 0-11 seconds
		 Thread.sleep(x);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
	}
	/**
	 * simulated key press 's' and delays program by given delay
	 * @param delay value
	 */
	public static void keyPressS( int x) {
		Robot robot;
		try {
		//create new robot object from google API
		robot = new Robot();
		//simulate key 's'
		 robot.keyPress(KeyEvent.VK_S);
		//hold key down for period of time
		 Thread.sleep(1000);
		 robot.keyRelease(KeyEvent.VK_S);
		//delay for a random time from 0-11 seconds
		 Thread.sleep(x);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
	}
	/**
	 * simulated key press 'd' and delays program by given delay
	 * @param delay value
	 */
	public static void keyPressD( int x) {
		Robot robot;
		try {
		//create new robot object from google API
		robot = new Robot();
		//simulate key 'd'
		 robot.keyPress(KeyEvent.VK_D);
		//hold key down for period of time
		 Thread.sleep(1000);
		 robot.keyRelease(KeyEvent.VK_D);
		//delay for a random time from 0-11 seconds
		 Thread.sleep(x);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
	}
	/**
	 * simulated key press 'w' and delays program by given delay
	 * @param delay value
	 */
	public static void keyPressW( int x) {
		Robot robot;
		try {
		//create new robot object from google API
		robot = new Robot();
		//simulate key 'a'
		 robot.keyPress(KeyEvent.VK_W);
		//hold key down for period of time
		 Thread.sleep(1000);
		 robot.keyRelease(KeyEvent.VK_W);
		//delay for a random time from 0-11 seconds
		 Thread.sleep(x);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
	}

	
}
