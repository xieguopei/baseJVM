package www.xieguopei.com.support;

import java.beans.beancontext.BeanContextSupport;

public class BaseBeanContextSupport extends BeanContextSupport {
    private static BaseBeanContextSupport instance = null;

    // 上下文支持控件
    private BeanContextSupport beanContextSupport;

    public BaseBeanContextSupport(BeanContextSupport beanContextSupport) {
        this.beanContextSupport = beanContextSupport;
    }

    /**
     * 获取单例方法
     * @author xieguopei
     * @date 2019-03-01
     * @return
     */
    public static BaseBeanContextSupport getInstance() {
        if(instance == null) {
            synchronized (BaseBeanContextSupport.class) {
                instance = new BaseBeanContextSupport(new BeanContextSupport());

                // 初始化实例信息
                instance.initialize();
            }
        }

        return instance;
    }





}
