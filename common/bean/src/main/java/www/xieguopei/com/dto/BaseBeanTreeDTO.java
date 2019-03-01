package www.xieguopei.com.dto;

import www.xieguopei.com.common.BaseBeanConstant;

import java.awt.*;
import java.beans.*;
import java.util.Map;

/**
 * 实现一个树型结构用于存放信息并符合BeanInfo规范
 * @author xieguopei
 * @date 2019-02-28
 */
public class BaseBeanTreeDTO implements BeanInfo {
    // 当前节点数据类型
    private BaseBeanConstant.BaseBeanDataType dataType;
    // 当前节点数据值
    private Map<String, Object> properties;
    // 判断多例还是单例
    private BaseBeanConstant.BaseBeanAttribute attribute;
    // 子节点信息
    private BaseBeanTreeDTO[] childs;
    // 对应属性修改器方法
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    // 对应敏感属性修改器方法
    private VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);
    // 对应属性描述信息
    private PropertyDescriptor[] propertyDescriptors;
    // 对应事件集描述信息
    private EventSetDescriptor[] eventSetDescriptors;
    // 对应方法描述信息
    private MethodDescriptor[] methodDescriptors;

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
        return eventSetDescriptors;
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
        return propertyDescriptors;
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
        return methodDescriptors;
    }

    /**
     * 获取额外的bean信息，此处返回子集
     * @author xieguopei
     * @date 2019-02-28
     * @return
     */
    public BeanInfo[] getAdditionalBeanInfo() {
        return childs;
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
