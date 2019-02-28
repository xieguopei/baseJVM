package www.xieguopei.com;

import java.beans.*;
import java.util.List;

public class BeanApplication {
    public static void main(String[] args) throws IntrospectionException {
        System.out.println(PropertyEditorManager.getEditorSearchPath()[0]);
    }
}
