package www.xieguopei.com.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Bean Tree对应属性监听器
 * @author xieguopei
 * @date 2019-02-28
 */
public class BaseBeanTreeListener implements PropertyChangeListener {

    /**
     * 属性触发更改方法
     * @author xieguopei
     * @date 2019-02-28
     * @param evt
     */
    public void propertyChange(PropertyChangeEvent evt) {
        // 需要改的属性名称
        String propertyName = evt.getPropertyName();
        // 新的值
        Object newValue = evt.getNewValue();
        // 改之前的值
        Object oldValue = evt.getOldValue();


    }
}
