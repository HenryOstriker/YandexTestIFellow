import org.junit.*;
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
}

