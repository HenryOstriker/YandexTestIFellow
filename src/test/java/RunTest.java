import Hooks.webHooks;
import org.junit.*;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class RunTest {
    @Before
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }

    @After
    public void afterTest() {
        System.out.println("After Test");
    }

    @Test
    public void testEquals() {
        String expected = "Hello";
        String actual = "Hello";
        assertEquals(expected, actual);
    }
    @Test
    public void testTrue() {
        int number = 5;
        assertTrue(number > 6);
    }

    @Test
    public void someTest() {
        open("https://demoqa.com/automation-practice-form");
        System.out.println(123);
    }

}

