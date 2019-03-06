package www.xieguopei.com.handler;

import www.xieguopei.com.common.BaseBeanConstant;
import www.xieguopei.com.dto.BaseBeanInitDTO;
import www.xieguopei.com.dto.BaseBeanServicesDTO;
import www.xieguopei.com.dto.BaseBeanTreeDTO;

import java.util.*;

public class BaseInitHandler implements BaseInit {
    /**
     * 初始化方法
     * @author xieguopei
     * @date 2019-03-06
     */
    @Override
    public void init(BaseBeanInitDTO initDTO) {

    }

    /**
     * 根据数据信息初始化Bean数据
     * @param initDTO
     */
    private BaseBeanServicesDTO initContext(BaseBeanInitDTO initDTO) {
        // 获取类关系对应MAP
        Map<String, List<String>> parentMap = initDTO.getParentMap();
        // 获取类基本信息MAP
        Map<String, Map<String, Map<String, Object>>> dataMap = initDTO.getClassBaseMap();
        // 存放类监听信息Map
        Map<String, Map<String, Map<String, Object>>> listenerMap = initDTO.getClassListenerMap();

        return initContextMes(BaseBeanConstant.CONTEXT_ROOT, parentMap, dataMap, listenerMap);
    }

    /**
     * 初始化Bean子集对应数据信息
     * @author xieguopei
     * @date 2019-03-06
     * @param dataClass
     * @param parentMap
     * @param dataMap
     * @param listenerMap
     */
    private BaseBeanServicesDTO initContextMes(String dataClass,
                                               Map<String, List<String>> parentMap,
                                               Map<String, Map<String, Map<String, Object>>> dataMap,
                                               Map<String, Map<String, Map<String, Object>>> listenerMap)
    {
        // 定义要返回的信息
        BaseBeanServicesDTO resultDTO = new BaseBeanServicesDTO();

        // 判断是否有子集信息
        if(parentMap.containsKey(dataClass)) {
            // 取出子集信息
            List<String> childMes = parentMap.get(dataClass);

            // 存放子集信息
            Map<String, BaseBeanTreeDTO> childrens = new LinkedHashMap<>();

            if(childMes.size() != 0) {
                // 遍历添加子数据
                for (String dumpChild : childMes) {
                    BaseBeanTreeDTO childrenDTO = initContextMes(
                            dumpChild,
                            parentMap,
                            dataMap,
                            listenerMap
                    );

                    // 添加子集数据
                    childrens.put(
                            childrenDTO.hashCode() + "",
                            childrenDTO
                    );
                }

                // 设置子集信息
                resultDTO.setChilds(childrens);
            }
        }

        // 添加数据信息



        return resultDTO;
    }



}
