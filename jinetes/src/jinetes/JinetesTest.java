package jinetes;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JinetesTest {

	@Test
	public void jineteTest() {
		
		Assert.assertEquals(1, jinetes(new int[] {18, 15}));
		Assert.assertEquals(2, jinetes(new int[] {43, 23, 40, 13}));
		Assert.assertEquals(3, jinetes(new int[] {33, 8, 16, 47, 30, 30, 46}));
		Assert.assertEquals(4, jinetes(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));

	}

	public int jinetes(int[] is) {
		int s=0,c=1;
		for (int x:is) {
			s+=x;
			if(s>100) {
				s=0;
				c++;
			}
			
			
		}
		return c;
	}

}
