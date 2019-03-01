package www.xieguopei.com.listener;

import www.xieguopei.com.context.BaseBeanContext;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.beans.beancontext.BeanContextMembershipListener;

public class BaseBeanContextMembershipListener implements BeanContextMembershipListener {
    /**
     * 添加子节点触发事件
     * @author xieguopei
     * @date 2019-03-01
     * @param beanContextMembershipEvent
     */
    public void childrenAdded(BeanContextMembershipEvent beanContextMembershipEvent) {
        // 获取上下文信息
        BaseBeanContext context = (BaseBeanContext) beanContextMembershipEvent.getBeanContext();

        // 往BaseBeanContext添加信息

    }

    /**
     * 移除子节点触发事件
     * @author xieguopei
     * @date 2019-03-01
     * @param beanContextMembershipEvent
     */
    public void childrenRemoved(BeanContextMembershipEvent beanContextMembershipEvent) {
        // 获取上下文信息
        BaseBeanContext context = (BaseBeanContext) beanContextMembershipEvent.getBeanContext();

        // 从BaseBeanContext移除相关信息
    }
}
