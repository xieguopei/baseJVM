package www.xieguopei.com.context;

import www.xieguopei.com.common.BaseBeanConstant;
import www.xieguopei.com.context.BaseBeanContext;
import www.xieguopei.com.context.BaseBeanDesignContext;
import www.xieguopei.com.dto.BaseBeanServicesDTO;

import java.beans.beancontext.*;
import java.util.Iterator;
import java.util.TooManyListenersException;

/**
 * 对于context服务的上下文支持
 * @author xieguopei
 * @date 2019-03-01
 */
public class BaseBeanServicesContext extends BaseBeanContext implements BeanContextServices {
    /**
     * 向context添加服务
     * @author xieguopei
     * @date 2019-03-01
     * @param serviceClass
     * @param serviceProvider
     * @return
     */
    public boolean addService(Class serviceClass, BeanContextServiceProvider serviceProvider) {
        BaseBeanServicesDTO addService = (BaseBeanServicesDTO) serviceProvider;

        // 往bean map中添加服务信息
        beanTreeDTOMap.put(serviceClass.getName(), addService);

        return false;
    }

    /**
     * 移除当前已注册的服务
     * @param serviceClass
     * @param serviceProvider
     * @param revokeCurrentServicesNow
     */
    public void revokeService(Class serviceClass, BeanContextServiceProvider serviceProvider, boolean revokeCurrentServicesNow) {
        
    }

    /**
     * 判断服务方法是否在bean集中
     * @param serviceClass
     * @return
     */
    public boolean hasService(Class serviceClass) {
        String serviceName = serviceClass.getName();

        return beanTreeDTOMap.containsKey(serviceName);
    }

    public Object getService(BeanContextChild child, Object requestor, Class serviceClass, Object serviceSelector, BeanContextServiceRevokedListener bcsrl) throws TooManyListenersException {
        return null;
    }

    public void releaseService(BeanContextChild child, Object requestor, Object service) {

    }

    public Iterator getCurrentServiceClasses() {
        return null;
    }

    public Iterator getCurrentServiceSelectors(Class serviceClass) {

        return null;
    }

    /**
     * 将一个listener添加到beancontext
     * @author xieguopei
     * @date 2019-03-01
     * @param bcsl
     */
    public void addBeanContextServicesListener(BeanContextServicesListener bcsl) {

    }

    /**
     * 移除对应的监听器信息
     * @author xieguopei
     * @date 2019-03-01
     * @param bcsl
     */
    public void removeBeanContextServicesListener(BeanContextServicesListener bcsl) {

    }

    /**
     * 服务注册方法
     * @author xieguopei
     * @date 2019-03-01
     * @param bcsae
     */
    public void serviceAvailable(BeanContextServiceAvailableEvent bcsae) {

    }

    /**
     * 服务注销方法
     * @author xieguopei
     * @date 2019-03-01
     * @param bcsre
     */
    public void serviceRevoked(BeanContextServiceRevokedEvent bcsre) {

    }
}
