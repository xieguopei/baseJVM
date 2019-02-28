package www.xieguopei.com.context;

import java.beans.beancontext.BeanContext;

/**
 * 纯粹GUI方法，全部不实现
 * @author xieguopei
 * @date 2019-02-28
 */
public abstract class BaseBeanGuiContext implements BeanContext {
    public boolean needsGui() {
        return false;
    }

    public void dontUseGui() {

    }

    public void okToUseGui() {

    }

    public boolean avoidingGui() {
        return false;
    }
}
