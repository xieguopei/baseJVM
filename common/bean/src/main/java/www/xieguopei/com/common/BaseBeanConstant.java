package www.xieguopei.com.common;

public class BaseBeanConstant {
    // 指定BeanInfo路径
    String[] searchPaths = new String[] {
            // dto路径信息
            "www.xieguopei.com.dto"
    };

    // 用于bean基本类型划分
    public enum BaseBeanDataType {
        GROUP("分组"), DATA("数据项");

        private String typeName;

        BaseBeanDataType(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return typeName;
        }
    }

    // 标识bean多例还是多例



    // 用于BeanTreeDTO与下标对应关系的绑定
    public enum BaseBeanDataIndex {
        TYPE(1), VAL(2), CHILD(3);
        private int index;

        BaseBeanDataIndex(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }
}