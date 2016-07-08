import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldDepsTest {

    private HelloWorldDeps helloWorld;

    @Before
    public void setup() {
        helloWorld = new HelloWorldDeps();
    }

    @Test
    public void sayHello() throws Exception {
        Assert.assertEquals("Hello World", helloWorld.sayHello());
    }

}