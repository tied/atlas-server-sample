package ut.com.nhan.atlas;

import org.junit.Test;
import com.nhan.atlas.api.MyPluginComponent;
import com.nhan.atlas.impl.MyPluginComponentImpl;

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