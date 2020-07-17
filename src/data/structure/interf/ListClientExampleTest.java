package data.structure.interf;


import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author downey
 *
 */
public class ListClientExampleTest {

	/**
	 * Test method for {@link ListClientExample}.
	 */
	@Test
	public void testListClientExample() {
		ListClientExample lce = new ListClientExample();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		//assertThat
		//첫번째 파라미터는 비교 대상의 실제값을 
		//두번째 파라미터로는 비교로직이 담긴 Matcher가 사용되게됩니다.
		assertThat(list, instanceOf(ArrayList.class) );
	}

}
