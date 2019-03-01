package www.xieguopei.com;

import java.beans.*;
import java.util.List;

public class BeanApplication {
    public static void main(String[] args) throws IntrospectionException {
        PersistenceDelegate p = new Encoder().getPersistenceDelegate(List.class);

        System.out.println(1);
    }
}
