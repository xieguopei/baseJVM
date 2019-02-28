package www.xieguopei.com.util;

import java.beans.Introspector;

public class BaseBeanUtil {
    /**
     * 设置BeanContext的搜索路径
     * @author xieguopei
     * @date 2019-02-28
     */
    public static void setBeanSearchPath(String[] searchPaths) {
        // 判断搜索路径是否出现为空或者长度为0的情况
        if (searchPaths == null || searchPaths.length == 0) {
            return;
        }

        // 清空缓存信息
        Introspector.flushCaches();

        // 设置缓存中的搜索路径
        Introspector.setBeanInfoSearchPath(searchPaths);
    }
}
