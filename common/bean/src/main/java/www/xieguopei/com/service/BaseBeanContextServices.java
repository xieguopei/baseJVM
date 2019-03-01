package www.xieguopei.com.service;

import www.xieguopei.com.context.BaseBeanContext;
import www.xieguopei.com.context.BaseBeanDesignContext;

import java.beans.beancontext.*;
import java.util.Iterator;
import java.util.TooManyListenersException;

/**
 * 对于context服务的上下文支持
 * @author xieguopei
 * @date 2019-03-01
 */
public class BaseBeanContextServices extends BaseBeanContext implements BeanContextServices {
    public boolean addService(Class serviceClass, BeanContextServiceProvider serviceProvider) {
        return false;
    }

    public void revokeService(Class serviceClass, BeanContextServiceProvider serviceProvider, boolean revokeCurrentServicesNow) {

    }

    public boolean hasService(Class serviceClass) {
        return false;
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

    public void addBeanContextServicesListener(BeanContextServicesListener bcsl) {

    }

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
