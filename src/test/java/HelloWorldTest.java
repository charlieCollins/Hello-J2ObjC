import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void getHelloWorld() throws Exception {
        Assert.assertEquals("Hello World", HelloWorld.getHelloWorld());
    }

}