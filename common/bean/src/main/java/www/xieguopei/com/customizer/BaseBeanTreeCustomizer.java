package www.xieguopei.com.customizer;

import java.beans.BeanInfo;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.beans.beancontext.BeanContext;

/**
 * 自定义bean tree
 */
public class BaseBeanTreeCustomizer implements Customizer {
    // 对应bean信息
    private BeanInfo beanTree;

    // 对应context信息
    private BeanContext beanContext;

    public BaseBeanTreeCustomizer(BeanInfo beanTree, BeanContext beanContext) {
        this.beanTree = beanTree;
        this.beanContext = beanContext;
    }

    /**
     * 设置对象信息
     * @author xieguopei
     * @date 2019-02-28
     * @param bean
     */
    public void setObject(Object bean) {
        if(!(bean instanceof BeanInfo)) {
            throw new RuntimeException("bean需为实现BeanInfo接口实体类");
        }

        // 设置beantree 信息
        beanTree = (BeanInfo) bean;
    }

    /**
     * 添加属性更改监听器
     * @author xieguopei
     * @date 2019-02-28
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // 往context中添加listener信息
        beanContext.addPropertyChangeListener(getClass().getName(), listener);
    }

    /**
     * 移除属性更改监听器
     * @author xieguopei
     * @date 2019-02-28
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // 从context中移除listener信息
        beanContext.removePropertyChangeListener(getClass().getName(), listener);
    }
}
