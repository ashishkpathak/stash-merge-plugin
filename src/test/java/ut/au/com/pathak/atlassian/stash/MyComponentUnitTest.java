package ut.au.com.pathak.atlassian.stash;

import org.junit.Test;
import au.com.pathak.atlassian.stash.api.MyPluginComponent;
import au.com.pathak.atlassian.stash.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}