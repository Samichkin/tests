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
public class TimeUtilsTest3 {
	
	private Integer time;
	private String expectedResult;
	private TimeUtils timeUtils;

	@Before
    public void initialize() {
		timeUtils = new TimeUtils();
	}
	
	public TimeUtilsTest3(Integer time, String expectedResult) {
		this.time = time;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection times() {
		return Arrays.asList(new Object[][] {
			{-2500, "-1"},
			{32100, "-1"}
		});
	}
	
	@Test
	public void testTimeUtils() {
		System.out.println("Parameterized time is: " + time);
		assertEquals(expectedResult, timeUtils.secToTime(time));
	}
	
}

