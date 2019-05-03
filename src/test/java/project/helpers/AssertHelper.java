package project.helpers;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class AssertHelper {
    public void shouldContain(String expected, String actual) {
        Assert.assertThat(expected,
                CoreMatchers.containsString(actual));
    }

}
