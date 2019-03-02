import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CollectionTest {
    private CollectionInterface cll;
    @Test
    public void testList()
    {
        List<String> actual = Arrays.asList("Sebe","Msomi","216028604");
        List<String> expected = Arrays.asList("Sebe","Msomi","216028604");

        //1 test equals
        assertThat(actual, is(expected));
        //if list has this value
        assertThat(actual,hasItems("216028604"));
    }
    @Test
    public void testMap()
    {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Sebe");
        map.put("2", "Msomi");
        map.put("3", "216028604");


        Map<String, String> expected = new HashMap<>();
        expected.put("1", "Sebe");
        expected.put("2", "Msomi");
        expected.put("3", "216028604");

        //1. Test equal, ignore order
        assertThat(map, is(expected));

    }
    @Test
    public void testSet()
    {
        Set<String>  set = new HashSet<>();
        set.add("Sebe");
        set.add("Msomi");
        set.add("216028604");

        Set<String> expected = new HashSet<>();
        expected.add("Sebe");
        expected.add("Msomi");
        expected.add("216028604");
        assertThat(set, is(expected));
    }
    @Test
    public void multiply()
    {
        CollectionInterface cll = new Collection();
        int ans = cll.multiply(12,  12);
        Assert.assertEquals("multiply 12*12", 144, ans);
    }

    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cll = (CollectionInterface)ctx.getBean("cll");
    }
    public void tearDown() throws Exception
    {
    }

    @Test
    public void testAdd() throws Exception
    {
        int ans = cll.multiply(6,6);
        Assert.assertEquals(" product of two numbers 6*6 is 36",ans,36);    }

}
