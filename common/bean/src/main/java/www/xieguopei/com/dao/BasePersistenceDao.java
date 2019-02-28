package www.xieguopei.com.dao;

import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;

public class BasePersistenceDao extends PersistenceDelegate {
    /**
     * 初始化旧实例信息并输出
     * @author xieguopei
     * @date 2019-02-28
     * @param oldInstance
     * @param out
     * @return
     */
    protected Expression instantiate(Object oldInstance, Encoder out) {
        return null;
    }
}
