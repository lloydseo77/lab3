import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests implements StringChecker{
    public boolean checkString(String s) {
        return s.contains("a") || s.contains("b");
    }

    @Test 
	public void testFilter() {
        
        StringChecker testChecker = new ListTests();

        List<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        List<String> expected = new ArrayList();
        expected.add("a");
        expected.add("b");
        expected.add("b");

        assertEquals(expected, ListExamples.filter(list, testChecker));
	}
}