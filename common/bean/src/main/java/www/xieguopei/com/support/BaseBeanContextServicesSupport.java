package www.xieguopei.com.support;

import www.xieguopei.com.exception.BaseBeanConfigException;

import java.beans.PropertyVetoException;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextServicesSupport;

public class BaseBeanContextServicesSupport extends BeanContextServicesSupport {
    private static BaseBeanContextServicesSupport instance = null;

    // 上下文支持控件
    private BeanContextServicesSupport beanContextChildSupportSuppor;

    public BaseBeanContextServicesSupport(BeanContextServicesSupport beanContextChildSupportSuppor) {
        this.beanContextChildSupportSuppor = beanContextChildSupportSuppor;
    }

    /**
     * 获取单例方法
     * @author xieguopei
     * @date 2019-03-01
     * @return
     */
    public static BaseBeanContextServicesSupport getInstance() {
        if(instance == null) {
            synchronized (BaseBeanContextServicesSupport.class) {
                instance = new BaseBeanContextServicesSupport(new BeanContextServicesSupport());
            }
        }

        return instance;
    }

    /**
     * 设置上下文信息
     * @author xieguopei
     * @date 2019-03-06
     * @param beanContext
     */
    public static void setContext(BeanContext beanContext) throws PropertyVetoException {
        if (instance == null) {
            throw new BaseBeanConfigException("beanContext为空，请先初始化context");
        }

        instance.setBeanContext(beanContext);


    }
}
