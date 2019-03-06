package www.xieguopei.com.config;

import org.junit.jupiter.api.Test;
import www.xieguopei.com.dto.BaseBeanServicesDTO;
import www.xieguopei.com.dto.BaseBeanTreeDTO;
import www.xieguopei.com.entity.TestData;

import java.beans.MethodDescriptor;
import java.lang.reflect.Method;

public class TestDataDTO {
    @Test
    public void testData() {
        // 构建数据节点
        BaseBeanTreeDTO treeData = new BaseBeanTreeDTO();

        // 获取方法信息
        Method[] methods = TestData.class.getMethods();

        MethodDescriptor[] methodDescriptors = new MethodDescriptor[methods.length];

        for(int i = 0; i < methods.length; i++) {
            Method dumpMethod = methods[i];

            dumpMethod.getParameterTypes();
        }
    }
}
