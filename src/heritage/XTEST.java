package heritage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class XTEST {
    private Collection collection;
    public void set (Collection collection){
        this.collection =collection;
    }

}

class YTEST extends XTEST{
    public void set(Map<String,String > map){
      super.set(map.values());
    }
}