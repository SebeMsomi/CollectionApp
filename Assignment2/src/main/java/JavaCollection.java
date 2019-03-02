import java.util.ArrayList;
import java.util.*;

public class JavaCollection {
    public List<String> list()
    {
        List<String> list = new ArrayList<>();
        list.add("Sebe");
        list.add("Msomi");
        list.add("216028604");
        return list;
    }

    public Set<String> set()
    {
        Set set = new HashSet();
        set.add("Sebe");
        set.add("Msomi");
        set.add("216028604");
        return set;
    }

    public Map<String, String> map()
    {
        Map map = new HashMap();
        map.put("1","Sebe");
        map.put("2", "Msomi");
        map.put("3","216028604");
        return map;
    }
}
