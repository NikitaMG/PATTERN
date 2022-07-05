import org.junit.Assert;
import org.junit.Test;

public class tasktest {
    @Test
public void testPattern(){
        Task task =new Task();
        Assert.assertEquals(true,task.Pattern("abba","dog cat cat dog"));
        Assert.assertEquals(false,task.Pattern("abba","dog cat cat fish"));
        Assert.assertEquals(false,task.Pattern("aaaa","dog cat cat dog"));
    }
}
