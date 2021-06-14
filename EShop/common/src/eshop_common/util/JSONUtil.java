package eshop_common.util;

import com.alibaba.fastjson.JSON;
import eshop_common.entity.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * JSON工具类，处理和JSON相关的所有内容
 *
 */
public class JSONUtil {

    /**
     * 把对象转化成JSON格式的字符串
     * @param entity 指定对象
     * @return 返回JSON格式的字符串
     */
    public static String entity2JSON(Object entity){
        return JSON.toJSONString(entity);
    }

    /**
     * 把实体对象列表转换成JSON字符串
     * @param entityList 指定对象列表
     * @return 返回JSON格式的字符串
     */
    public static String entityList2JSON(List<?> entityList){
        return entity2JSON(entityList);
    }

    /**
     * ? :泛型的通配符，代表是未知的任意类型，或者说是Object类
     * 把JSON字符串转换成指定类型的对象
     * @param json  要转换的数据
     * @param clazz 指定的类型
     * @return     返回Object对象
     */
/*    public static Object JSON2Entity(String json,Class<?> clazz){
        return JSON.parseObject(json,clazz);
    }*/
    public static <T> T JSON2Entity(String json,Class<T> clazz){
        return JSON.parseObject(json,clazz);
    }

    /**
     * 将json数组转换成指定类型的对象列表
     * @param json   数据
     * @param clazz  指定的类型对象
     * @param <T>    指定的类型
     * @return  返回对象列表
     */
    public static <T> List<T> JSONArray2List(String json,Class<T> clazz){
        return JSON.parseArray(json,clazz);
    }
}
