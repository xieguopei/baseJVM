package www.xieguopei.com.util;

import www.xieguopei.com.common.BaseBeanConstant;
import www.xieguopei.com.dto.BaseBeanServicesDTO;
import www.xieguopei.com.dto.BaseBeanTreeDTO;

import java.beans.Introspector;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static www.xieguopei.com.common.BaseBeanConstant.BaseBeanAttribute.SINGLETON;

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

    /**
     * 创建编码器，用于输出文档信息
     * @author xieguopei
     * @date 2019-03-06
     * @param filePath
     * @return
     * @throws FileNotFoundException
     */
    public static XMLEncoder createEncoder(String filePath) throws FileNotFoundException {
        return new XMLEncoder(
                new FileOutputStream(filePath)
        );
    }

    /**
     * 输出对应bean信息
     * @author xieguopei
     * @date 2019-03-06
     * @param xmlEncoder
     * @param result
     */
    public static void writeBeanContext(XMLEncoder xmlEncoder, Map result) {
        xmlEncoder.writeObject(result);

        xmlEncoder.flush();

        xmlEncoder.close();
    }

    /**
     * 获取bean信息
     * @author xieguopei
     * @date 2019-03-06
     * @param filePath
     * @return
     */
    public static Map<String, Map<String, Map<String, Object>>> getBeanContext(String filePath) throws FileNotFoundException {
        // 构建解码器
        XMLDecoder decoder = new XMLDecoder(
                new FileInputStream(filePath)
        );

        // 构建返回集
        Map<String, Map<String, Map<String, Object>>> resultMap = (Map<String, Map<String, Map<String, Object>>>) decoder.readObject();

        return resultMap;
    }
}
