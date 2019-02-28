package www.xieguopei.com.support;

import java.beans.PropertyChangeSupport;

public class BasePropertyChangeSupport {
    private static BasePropertyChangeSupport instance = null;

    private PropertyChangeSupport propertyChangeSupport;

    /**
     * 获取PropertyChangeSupport实例
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public static BasePropertyChangeSupport getInstance() {
        if (instance == null) {
            synchronized (BasePropertyChangeSupport.class) {

            }
        }

        return instance;
    }
}
