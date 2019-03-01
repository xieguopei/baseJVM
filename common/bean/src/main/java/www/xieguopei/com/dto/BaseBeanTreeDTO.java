package www.xieguopei.com.dto;

import www.xieguopei.com.common.BaseBeanConstant;

import java.awt.*;
import java.beans.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 实现一个树型结构用于存放信息并符合BeanInfo规范
 * @author xieguopei
 * @date 2019-02-28
 */
public class BaseBeanTreeDTO implements BeanInfo {
    // 当前节点数据类型（默认分组）
    private BaseBeanConstant.BaseBeanDataType dataType = BaseBeanConstant.BaseBeanDataType.GROUP;
    // 当前节点数据值
    private Map<String, Object> properties = new HashMap<String, Object>();
    // 判断多例还是单例（默认单例）
    private BaseBeanConstant.BaseBeanAttribute attribute = BaseBeanConstant.BaseBeanAttribute.SINGLETON;
    // 子节点信息
    private Map<String, BaseBeanTreeDTO> childs = new HashMap<String, BaseBeanTreeDTO>();
    // 对应属性修改器方法
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    // 对应敏感属性修改器方法
    private VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);
    // 对应属性描述信息
    private Map<String, PropertyDescriptor> propertyDescriptors = new HashMap<String, PropertyDescriptor>();
    // 对应事件集描述信息
    private Map<String, EventSetDescriptor> eventSetDescriptors = new HashMap<String, EventSetDescriptor>();
    // 对应方法描述信息
    private Map<String, MethodDescriptor> methodDescriptors = new HashMap<String, MethodDescriptor>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseBeanTreeDTO that = (BaseBeanTreeDTO) o;
        return dataType == that.dataType &&
                properties.equals(that.properties) &&
                attribute == that.attribute &&
                childs.equals(that.childs) &&
                propertyChangeSupport.equals(that.propertyChangeSupport) &&
                vetoableChangeSupport.equals(that.vetoableChangeSupport) &&
                propertyDescriptors.equals(that.propertyDescriptors) &&
                eventSetDescriptors.equals(that.eventSetDescriptors) &&
                methodDescriptors.equals(that.methodDescriptors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, properties, attribute, childs, propertyChangeSupport, vetoableChangeSupport, propertyDescriptors, eventSetDescriptors, methodDescriptors);
    }

    /**
     * 获得当前bean的描述信息
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public BeanDescriptor getBeanDescriptor() {
        return new BeanDescriptor(getClass());
    }

    /**
     * 获得当前bean事件集描述信息
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
        EventSetDescriptor[] eventSets = new EventSetDescriptor[eventSetDescriptors.size()];

        return eventSetDescriptors.values().toArray(eventSets);
    }

    /**
     * 最有可能由用户触发的事件
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public int getDefaultEventIndex() {
        // 一般更改的是属性值
        return BaseBeanConstant.BaseBeanDataIndex.VAL.getIndex();
    }

    /**
     * 获得当前bean属性描述信息
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[properties.size()];

        return properties.values().toArray(propertyDescriptors);
    }

    /**
     * 获得最有可能由用户更改的属性
     * @author xieguopei
     * @return
     */
    public int getDefaultPropertyIndex() {
        return 0;
    }

    /**
     * 返回该BeanInfo对应的方法描述信息
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public MethodDescriptor[] getMethodDescriptors() {
        MethodDescriptor[] methods = new MethodDescriptor[methodDescriptors.size()];

        return methodDescriptors.values().toArray(methods);
    }

    /**
     * 获取额外的bean信息，此处返回子集
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public BeanInfo[] getAdditionalBeanInfo() {
        BeanInfo[] beans = new BeanInfo[childs.size()];

        return childs.values().toArray(beans);
    }

    /**
     * 无图标信息
     * @author xieguopei
     * @date 2019-02-28
     * @param iconKind
     * @return
     */
    public Image getIcon(int iconKind) {
        return null;
    }
}
