import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TimeUtilsTest.class);
		
		for(Failure fail : result.getFailures()) {
			System.out.println("timeToSec: " + fail.toString());
		}
		
		System.out.println("timeToSec: " + result.wasSuccessful());
		
		Result result2 = JUnitCore.runClasses(TimeUtilsTest2.class);
		
		for(Failure fail2 : result.getFailures()) {
			System.out.println("secToTime: " + fail2.toString());
		}
		
		System.out.println("secToTime: " + result2.wasSuccessful());
		
		Result result3 = JUnitCore.runClasses(TimeUtilsTest3.class);
		
		for(Failure fail3 : result.getFailures()) {
			System.out.println("secToTimeValue: " + fail3.toString());
		}
		
		System.out.println("secToTimeValue: " + result3.wasSuccessful());
	}

}
