import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Using Guava and Gson ARTIFICIALLY to make sure J2ObjC doesn't blink.
 *
 */
public class HelloWorldDeps {

    private class SayHello {
        String say;
    }

    public HelloWorldDeps() {
    }

    public String sayHello() {
        // overbake this to include Guava and Gson
        String jsonString = "{ " + "\"say\": \"Hello World\"" +  " }";
        List<String> strings = Lists.newArrayList(jsonString);
        Gson gson = new GsonBuilder().create();
        SayHello sayHello = gson.fromJson(strings.get(0), SayHello.class);
        return sayHello.say;
    }

}
