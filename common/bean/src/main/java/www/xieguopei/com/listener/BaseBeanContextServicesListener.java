package www.xieguopei.com.listener;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.beans.beancontext.BeanContextServicesListener;

/**
 * 针对context中服务的监听器
 * 实现的接口已继承取消服务的监听接口
 * @author xieguopei
 * @date 2019-03-01
 */
public class BaseBeanContextServicesListener implements BeanContextServicesListener {
    /**
     * 服务注册方法
     * @author xieguopei
     * @date 2019-03-01
     * @param bcsae
     */
    public void serviceAvailable(BeanContextServiceAvailableEvent bcsae) {

    }

    /**
     * 服务取消方法
     * @author xieguopei
     * @date 2019-03-01
     * @param bcsre
     */
    public void serviceRevoked(BeanContextServiceRevokedEvent bcsre) {

    }
}
