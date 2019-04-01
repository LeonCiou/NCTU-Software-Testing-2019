import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class MinParameterizedTest<T extends Comparable<? super T>> {
    List<? extends T> list;
    T expected;

	public MinParameterizedTest (List<? extends T> list, T expected){
		this.list = list ;
		this.expected = expected ;
	}

	@Parameters
	public static Collection<Object[]> MinValues(){
		return Arrays.asList (new Object [][] { {Arrays.asList(1,2,3,4,5,6), 1}, {Arrays.asList("a", "b", "c", "d"), "a"}, {Arrays.asList("ac", "cc"), "ac"} }) ;
	}
	
    @Test
	public void minTest(){
		assertTrue ("Min Test", expected == Min.min(list)) ;
	}
}
