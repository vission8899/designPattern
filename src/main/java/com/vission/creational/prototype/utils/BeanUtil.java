package com.vission.creational.prototype.utils;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.ReflectUtil;
import com.alibaba.fastjson2.JSONObject;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

public class BeanUtil {

    /**
     * 深拷贝
     */
    public static <T> T deepCopy(T object)
            throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (Objects.isNull(object)) {
            return null;
        } else if (object instanceof Serializable) {
            return BeanUtil.deepCopyBySerializable(object);
        } else {
            ObjectUtil.clone(object);
            return (T) BeanUtil.deepCopy(object, object.getClass());
        }
    }

    /**
     * 深拷贝
     */
    public static <T> T deepCopy(Object object, Class<T> targetClass)
            throws InstantiationException, IllegalAccessException {
        if (Objects.isNull(object)) {
            return targetClass.newInstance();
        }
        String objectJson = JSONObject.toJSONString(object);
        return JSONObject.parseObject(objectJson, targetClass);
    }

    /**
     * java自带的深拷贝 通过序列化实现
     */
    private static <T> T deepCopyBySerializable(T object) throws IOException, ClassNotFoundException {
        if (Objects.isNull(object)) {
            return null;
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        bos.close();
        oos.close();
        bis.close();
        ois.close();
        return (T) ois.readObject();
    }

    /**
     * 浅拷贝
     */
    public static <T> T shallowCopy(T object) {
        if (Objects.isNull(object)) {
            return null;
        } else if (object instanceof Cloneable) {
            return ReflectUtil.invoke(object, "clone");
        } else {
            return (T) BeanUtil.shallowCopy(object, object.getClass());
        }
    }

    /**
     * 浅拷贝
     */
    public static <T> T shallowCopy(Object object, Class<T> targetClass) {
        //hutool底层是通过反射实现的 将每个方法取出 经过一系列的判断后 赋值给新的对象【如字段是否可写入】 通过setXXX.invoke()方法
        //Spring的BeanUtils亦是如此
        return cn.hutool.core.bean.BeanUtil.copyProperties(object, targetClass);
    }
}
