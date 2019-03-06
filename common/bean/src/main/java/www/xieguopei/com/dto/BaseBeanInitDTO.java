package www.xieguopei.com.dto;

import java.util.List;
import java.util.Map;

public class BaseBeanInitDTO {
    // 存放类基本信息MAP
    private Map<String, Map<String, Map<String, Object>>> classBaseMap;
    // 存放监听信息MAP
    private Map<String, Map<String, Map<String, Object>>> classListenerMap;
    // 存放类基本关系MAP
    private Map<String, List<String>> parentMap;

    public Map<String, Map<String, Map<String, Object>>> getClassBaseMap() {
        return classBaseMap;
    }

    public void setClassBaseMap(Map<String, Map<String, Map<String, Object>>> classBaseMap) {
        this.classBaseMap = classBaseMap;
    }

    public Map<String, Map<String, Map<String, Object>>> getClassListenerMap() {
        return classListenerMap;
    }

    public void setClassListenerMap(Map<String, Map<String, Map<String, Object>>> classListenerMap) {
        this.classListenerMap = classListenerMap;
    }

    public Map<String, List<String>> getParentMap() {
        return parentMap;
    }

    public void setParentMap(Map<String, List<String>> parentMap) {
        this.parentMap = parentMap;
    }
}
