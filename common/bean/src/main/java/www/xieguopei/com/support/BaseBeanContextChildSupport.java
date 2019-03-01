package www.xieguopei.com.support;

import java.beans.beancontext.BeanContextChildSupport;

public class BaseBeanContextChildSupport {
    private static BaseBeanContextChildSupport instance = null;

    // 上下文支持控件
    private BeanContextChildSupport beanContextChildSupportSuppor;

    public BaseBeanContextChildSupport(BeanContextChildSupport beanContextChildSupportSuppor) {
        this.beanContextChildSupportSuppor = beanContextChildSupportSuppor;
    }

    /**
     * 获取单例方法
     * @author xieguopei
     * @date 2019-03-01
     * @return
     */
    public static BaseBeanContextChildSupport getInstance() {
        if(instance == null) {
            synchronized (BeanContextChildSupport.class) {
                instance = new BaseBeanContextChildSupport(new BeanContextChildSupport());
            }
        }

        return instance;
    }
}
