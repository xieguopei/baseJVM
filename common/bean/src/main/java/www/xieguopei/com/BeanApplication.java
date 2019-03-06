package www.xieguopei.com;

import www.xieguopei.com.dto.BaseBeanTreeDTO;
import www.xieguopei.com.listener.BaseBeanTreeListener;

import java.beans.*;
import java.util.LinkedList;
import java.util.List;

public class BeanApplication {
    public interface test1{
        void asd(String str);
    }

    public static class testImpl implements test1{

        public void gid(ui u) {
            System.out.println("123456" + u.getOp());
        }

        public void asd(String str) {
            System.out.println("1222222222" + str);
        }

        public void mes() {
            System.out.println("123");
        }

        public void test(String str) {
            System.out.println("1233333");
        }
    }

    public static class ui {
        private String op;

        public String getOp() {
            return op;
        }

        public void setOp(String op) {
            this.op = op;
        }
    }
    public static void main(String[] args) throws IntrospectionException {
//
//        test1 t = EventHandler.create(test1.class, new testImpl(), "mes", null, "asd");
//
//        ui u = new ui();
//
//        u.setOp("123456");
//
//        t.asd("1232222");
//

    }
}
