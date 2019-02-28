package www.xieguopei.com.context;

import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextChild;
import java.beans.beancontext.BeanContextMembershipListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

/**
 * bean上下文对应核心类
 * @author xieguopei
 * @date 2019-02-28
 */
public class BaseBeanContext extends BaseBeanDesignContext {
    // 打印日志信息
    private Logger logger = Logger.getLogger(getClass().getName());

    public Object instantiateChild(String beanName) throws IOException, ClassNotFoundException {
        return null;
    }

    public InputStream getResourceAsStream(String name, BeanContextChild bcc) throws IllegalArgumentException {
        return null;
    }

    public URL getResource(String name, BeanContextChild bcc) throws IllegalArgumentException {
        return null;
    }

    public void addBeanContextMembershipListener(BeanContextMembershipListener bcml) {

    }

    public void removeBeanContextMembershipListener(BeanContextMembershipListener bcml) {

    }

    // bean child 实现方法 begin
    public void setBeanContext(BeanContext bc) throws PropertyVetoException {

    }

    public BeanContext getBeanContext() {
        return null;
    }

    public void addPropertyChangeListener(String name, PropertyChangeListener pcl) {

    }

    public void removePropertyChangeListener(String name, PropertyChangeListener pcl) {

    }

    public void addVetoableChangeListener(String name, VetoableChangeListener vcl) {

    }

    public void removeVetoableChangeListener(String name, VetoableChangeListener vcl) {

    }
    // bean child实现方法 end

    // collection实现方法 begin
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    // collection 实现方法 end
}
