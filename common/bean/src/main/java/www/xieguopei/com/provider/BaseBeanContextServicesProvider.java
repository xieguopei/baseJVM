package www.xieguopei.com.provider;

import www.xieguopei.com.dto.BaseBeanTreeDTO;

import java.beans.BeanInfo;
import java.beans.beancontext.BeanContextServiceProvider;
import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import java.beans.beancontext.BeanContextServices;
import java.util.Iterator;

public class BaseBeanContextServicesProvider extends BaseBeanTreeDTO implements BeanContextServiceProvider, BeanContextServiceProviderBeanInfo {

    /**
     * 请求来自context Service服务的一个实例
     * @author xieguopei
     * @date 2019-03-01
     * @param bcs
     * @param requestor
     * @param serviceClass
     * @param serviceSelector
     * @return
     */
    public Object getService(BeanContextServices bcs, Object requestor, Class serviceClass, Object serviceSelector) {
        return null;
    }

    /**
     * 释放一个对特定服务的嵌套
     * @author xieguopei
     * @date 2019-03-01
     * @param bcs
     * @param requestor
     * @param service
     */
    public void releaseService(BeanContextServices bcs, Object requestor, Object service) {

    }

    /**
     * 获得指定服务的当前服务选择器
     * @author xieguopei
     * @date 2019-03-01
     * @param bcs
     * @param serviceClass
     * @return
     */
    public Iterator getCurrentServiceSelectors(BeanContextServices bcs, Class serviceClass) {
        return null;
    }

    /**
     * 获得一个beanInfo数组
     * @author xieguopei
     * @date 2019-03-01
     * @return
     */
    public BeanInfo[] getServicesBeanInfo() {
        return new BeanInfo[0];
    }
}
