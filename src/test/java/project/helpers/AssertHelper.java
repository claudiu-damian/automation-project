package project.helpers;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class AssertHelper {
    public void shouldContain(String actual, String expected) {
        Assert.assertThat(expected,
                CoreMatchers.containsString(actual));
    }

}
