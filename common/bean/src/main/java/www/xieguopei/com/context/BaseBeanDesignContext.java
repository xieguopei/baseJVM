package www.xieguopei.com.context;

import java.util.Date;

/**
 * 这一层只实现DesignMode相关方法
 */
public abstract class BaseBeanDesignContext extends BaseBeanGuiContext {
    // 标识设置时间标志位
    private boolean isDesignTime;
    // 标识具体设置的时间信息
    private long time;

    public void setDesignTime(boolean designTime) {
        // 设置标志位
        isDesignTime = designTime;

        // 设置具体时间
        time = System.currentTimeMillis();
    }

    public boolean isDesignTime() {
        return isDesignTime;
    }
}
