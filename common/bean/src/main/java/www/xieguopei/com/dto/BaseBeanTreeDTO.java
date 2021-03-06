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
    protected BaseBeanConstant.BaseBeanDataType dataType = BaseBeanConstant.BaseBeanDataType.GROUP;
    // 当前节点数据值
    protected Map<String, Object> properties = new HashMap<String, Object>();
    // 判断多例还是单例（默认单例）
    protected BaseBeanConstant.BaseBeanAttribute attribute = BaseBeanConstant.BaseBeanAttribute.SINGLETON;
    // 判断是服务节点还是数据节点
    protected BaseBeanConstant.BaseBeanType beanType = BaseBeanConstant.BaseBeanType.TREEDATA;
    // 子节点信息
    protected Map<String, BaseBeanTreeDTO> childs = new HashMap<String, BaseBeanTreeDTO>();
    // 对应属性修改器方法
    protected PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    // 对应敏感属性修改器方法
    protected VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);
    // 对应属性描述信息
    protected Map<String, PropertyDescriptor> propertyDescriptors = new HashMap<String, PropertyDescriptor>();
    // 对应事件集描述信息
    protected Map<String, EventSetDescriptor> eventSetDescriptors = new HashMap<String, EventSetDescriptor>();
    // 对应方法描述信息
    protected Map<String, MethodDescriptor> methodDescriptors = new HashMap<String, MethodDescriptor>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseBeanTreeDTO that = (BaseBeanTreeDTO) o;
        return dataType == that.dataType &&
                beanType == that.beanType &&
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
        return Objects.hash(dataType, beanType, properties, attribute, childs, propertyChangeSupport, vetoableChangeSupport, propertyDescriptors, eventSetDescriptors, methodDescriptors);
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

    public BaseBeanConstant.BaseBeanDataType getDataType() {
        return dataType;
    }

    public void setDataType(BaseBeanConstant.BaseBeanDataType dataType) {
        this.dataType = dataType;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public BaseBeanConstant.BaseBeanAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(BaseBeanConstant.BaseBeanAttribute attribute) {
        this.attribute = attribute;
    }

    public BaseBeanConstant.BaseBeanType getBeanType() {
        return beanType;
    }

    public void setBeanType(BaseBeanConstant.BaseBeanType beanType) {
        this.beanType = beanType;
    }

    public Map<String, BaseBeanTreeDTO> getChilds() {
        return childs;
    }

    public void setChilds(Map<String, BaseBeanTreeDTO> childs) {
        this.childs = childs;
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }

    public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
        this.propertyChangeSupport = propertyChangeSupport;
    }

    public VetoableChangeSupport getVetoableChangeSupport() {
        return vetoableChangeSupport;
    }

    public void setVetoableChangeSupport(VetoableChangeSupport vetoableChangeSupport) {
        this.vetoableChangeSupport = vetoableChangeSupport;
    }

    public void setPropertyDescriptors(Map<String, PropertyDescriptor> propertyDescriptors) {
        this.propertyDescriptors = propertyDescriptors;
    }

    public void setEventSetDescriptors(Map<String, EventSetDescriptor> eventSetDescriptors) {
        this.eventSetDescriptors = eventSetDescriptors;
    }

    public void setMethodDescriptors(Map<String, MethodDescriptor> methodDescriptors) {
        this.methodDescriptors = methodDescriptors;
    }
}
