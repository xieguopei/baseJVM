package www.xieguopei.com.context;

import www.xieguopei.com.dto.BaseBeanTreeDTO;

import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextChild;
import java.beans.beancontext.BeanContextMembershipListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.logging.Logger;

/**
 * bean上下文对应核心类
 * @author xieguopei
 * @date 2019-02-28
 */
public class BaseBeanContext extends BaseBeanDesignContext {
    // 打印日志信息
    private Logger logger = Logger.getLogger(getClass().getName());

    // 存储节点标识与对应元素信息
    protected Map<String, BaseBeanTreeDTO> beanTreeDTOMap = new LinkedHashMap<String, BaseBeanTreeDTO>();

    // 存储属性与对应信息监听器
    protected Map<String, PropertyChangeListener> propertyChangeListenerMap = new HashMap<String, PropertyChangeListener>();

    // 存储属性与对应敏感属性信息修改监听器
    protected Map<String, VetoableChangeListener> vetoableChangeListenerMap = new HashMap<String, VetoableChangeListener>();

    // 成员监听器
    private BeanContextMembershipListener membershipListener;

    /**
     * 实例化指定此context一个子级javaBean
     * @author xieguopei
     * @date 2019-03-01
     * @param beanName
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object instantiateChild(String beanName) throws IOException, ClassNotFoundException {
        return null;
    }

    /**
     * 根据资源名称从子资源集获取资源
     * @author xieguopei
     * @date 2019-03-01
     * @param name
     * @param beanContextChild
     * @return
     * @throws IllegalArgumentException
     */
    public InputStream getResourceAsStream(String name, BeanContextChild beanContextChild) throws IllegalArgumentException {
        return null;
    }

    /**
     * 根据资源名称从子资源集获取资源，以URL形式返回
     * @author xieguopei
     * @date 2019-03-01
     * @param name
     * @param beanContextChild
     * @return
     * @throws IllegalArgumentException
     */
    public URL getResource(String name, BeanContextChild beanContextChild) throws IllegalArgumentException {
        return null;
    }

    /**
     * 添加context成员监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param beanContextMembershipListener
     */
    public void addBeanContextMembershipListener(BeanContextMembershipListener beanContextMembershipListener) {
        membershipListener = beanContextMembershipListener;
    }

    /**
     * 移除context成员监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param beanContextMembershipListener
     */
    public void removeBeanContextMembershipListener(BeanContextMembershipListener beanContextMembershipListener) {
        membershipListener = null;
    }

    // bean child 实现方法 begin

    /**
     * 设置上下文信息，相当于重新刷新整个context资源
     * @author xieguopei
     * @date 2019-03-01
     * @param bc
     * @throws PropertyVetoException
     */
    public void setBeanContext(BeanContext bc) throws PropertyVetoException {
        throw new RuntimeException("未定义");
    }

    /**
     * 获取上下文信息
     * @author xieguopei
     * @date 2019-03-01
     * @return
     */
    public BeanContext getBeanContext() {
        return this;
    }

    /**
     * 根据属性名称添加相应的属性修改监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param name
     * @param propertyChangeListener
     */
    public void addPropertyChangeListener(String name, PropertyChangeListener propertyChangeListener) {
        propertyChangeListenerMap.put(name, propertyChangeListener);
    }

    /**
     * 根据属性名称移除相应的属性修改监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param name
     * @param propertyChangeListener
     */
    public void removePropertyChangeListener(String name, PropertyChangeListener propertyChangeListener) {
        propertyChangeListenerMap.remove(name);
    }

    /**
     * 根据属性名称添加相应的敏感属性修改监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param name
     * @param vetoableChangeListener
     */
    public void addVetoableChangeListener(String name, VetoableChangeListener vetoableChangeListener) {
        vetoableChangeListenerMap.put(name, vetoableChangeListener);
    }

    /**
     * 根据属性名称移除相应的敏感属性修改监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param name
     * @param vetoableChangeListener
     */
    public void removeVetoableChangeListener(String name, VetoableChangeListener vetoableChangeListener) {
        vetoableChangeListenerMap.remove(name);
    }
    // bean child实现方法 end

    // collection实现方法 begin
    public int size() {
        return beanTreeDTOMap.size();
    }

    public boolean isEmpty() {
        return beanTreeDTOMap.isEmpty();
    }

    /**
     * 此处包含的是map的键值
     * @author xieguopei
     * @date 2019-03-01
     * @param o
     * @return
     */
    public boolean contains(Object o) {
        return beanTreeDTOMap.containsKey(o);
    }

    public Iterator iterator() {
        return beanTreeDTOMap.keySet().iterator();
    }

    public Object[] toArray() {
        return beanTreeDTOMap.values().toArray();
    }

    /**
     * 支持map对应信息移除
     * @author xieguopei
     * @date 2019-03-01
     * @param o
     */
    public void removeBaseBean(Object o) {
        beanTreeDTOMap.remove(o);
    }

    @Deprecated
    public boolean add(Object o) {
        throw new RuntimeException("不支持该方法调用");
    }

    /**
     * 设置键值与对应bean关系
     * @author xieguopei
     * @date 2019-03-01
     * @param key
     * @param value
     */
    public void put(String key, BaseBeanTreeDTO value) {
        beanTreeDTOMap.put(key, value);
    }

    @Deprecated
    public boolean remove(Object o) {
        throw new RuntimeException("不支持该方法调用");
    }

    public boolean addAll(Collection c) {
        throw new RuntimeException("不支持该方法调用");
    }

    public void clear() {
        beanTreeDTOMap.clear();
    }

    @Deprecated
    public boolean retainAll(Collection c) {
        throw new RuntimeException("不支持该方法调用");
    }

    @Deprecated
    public boolean removeAll(Collection c) {
        throw new RuntimeException("不支持该方法调用");
    }

    @Deprecated
    public boolean containsAll(Collection c) {
        throw new RuntimeException("不支持该方法调用");
    }

    public Object[] toArray(Object[] a) {
        return beanTreeDTOMap.values().toArray(a);
    }

    // collection 实现方法 end
}
