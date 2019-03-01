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

    // 存储当层节点的元素信息
    private List<BaseBeanTreeDTO> parameters = new LinkedList<BaseBeanTreeDTO>();

    // 存储属性与对应信息监听器
    private Map<String, PropertyChangeListener> propertyChangeListenerMap = new HashMap<String, PropertyChangeListener>();

    // 存储属性与对应敏感属性信息修改监听器
    private Map<String, VetoableChangeListener> vetoableChangeListenerMap = new HashMap<String, VetoableChangeListener>();

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
     * @param bcc
     * @return
     * @throws IllegalArgumentException
     */
    public InputStream getResourceAsStream(String name, BeanContextChild bcc) throws IllegalArgumentException {
        return null;
    }

    /**
     * 根据资源名称从子资源集获取资源，以URL形式返回
     * @author xieguopei
     * @date 2019-03-01
     * @param name
     * @param bcc
     * @return
     * @throws IllegalArgumentException
     */
    public URL getResource(String name, BeanContextChild bcc) throws IllegalArgumentException {
        return null;
    }

    /**
     * 添加context成员监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param bcml
     */
    public void addBeanContextMembershipListener(BeanContextMembershipListener bcml) {

    }

    /**
     * 移除context成员监听器
     * @author xieguopei
     * @date 2019-03-01
     * @param bcml
     */
    public void removeBeanContextMembershipListener(BeanContextMembershipListener bcml) {

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
        return parameters.size();
    }

    public boolean isEmpty() {
        return parameters.isEmpty();
    }

    public boolean contains(Object o) {
        return parameters.contains(o);
    }

    public Iterator iterator() {
        return parameters.iterator();
    }

    public Object[] toArray() {
        return parameters.toArray();
    }

    public boolean add(Object o) {
        return parameters.add((BaseBeanTreeDTO) o);
    }

    public boolean remove(Object o) {
        return parameters.remove(o);
    }

    public boolean addAll(Collection c) {
        return parameters.addAll(c);
    }

    public void clear() {
        parameters.clear();
    }

    public boolean retainAll(Collection c) {
        return parameters.retainAll(c);
    }

    public boolean removeAll(Collection c) {
        return parameters.removeAll(c);
    }

    public boolean containsAll(Collection c) {
        return parameters.containsAll(c);
    }

    public Object[] toArray(Object[] a) {
        return parameters.toArray(a);
    }

    // collection 实现方法 end
}
