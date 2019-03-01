package www.xieguopei.com.support;

import java.beans.beancontext.BeanContextServicesSupport;

public class BaseBeanContextServicesSupport {
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
}
