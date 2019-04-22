import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class TimeUtilsTest {
	
	private String time;
	private Integer expectedResult;
	private TimeUtils timeUtils;

	@Before
    public void initialize() {
		timeUtils = new TimeUtils();
	}
	
	public TimeUtilsTest(String time, Integer expectedResult) {
		this.time = time;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection times() {
		return Arrays.asList(new Object[][] {
			{"01:15:35", 4535},
			{"02:11:48", 7908},
			{"01:12:24", 4344}
		});
	}
	
	@Test
	public void testTimeUtils() {
		System.out.println("Parameterized time is: " + time);
		assertEquals(expectedResult, timeUtils.timeToSec(time));
	}
	
}
