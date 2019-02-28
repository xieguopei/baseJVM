package www.xieguopei.com.listener;

import java.beans.ExceptionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 错误监听器
 * @author xieguopei
 * @date 2019-02-28
 */
public class BaseBeanErrorListener implements ExceptionListener {
    // 打印日志
    private Logger logger = Logger.getLogger(getClass().getName());

    // 标识发生错误时对应的类
    private String className;

    public BaseBeanErrorListener(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    /**
     * 打印错误日志信息
     * @author xieguopei
     * @date 2019-02-28
     * @param e
     */
    public void exceptionThrown(Exception e) {
        logger.log(Level.SEVERE, "类【" + getClassName() + "】发生异常信息：" + e.getMessage());
    }
}
