package com.vast.base.core.service;

import java.io.Serializable;
import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.core.service
 * @ClassName: IBaseDBService
 * @Author: Administrator
 * @Description: 操作Mapper的基类
 * @Date: 2021/1/4 15:25
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public interface IBaseDBService<T> {

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description   获取当前实体的全部数据
     * @param
     * @Return
     * @Exception
     * @Date 2021/1/4 15:31
     */
    List<T> findAll();

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description     根据实体获取数据
     * @param t 实体
     * @Return
     * @Exception
     * @Date 2021/1/4 15:32
     */
    List<T> findByEntity(T t);

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description      根据ID获取单个实体对象
     * @param id
     * @Return
     * @Exception
     * @Date 2021/1/4 15:32
     */
    T getById(Serializable id);

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description     保存单个实体,并返回保存的对象在数据库中的ID
     * @param t 要保存的实体
     * @Return
     * @Exception
     * @Date 2021/1/4 15:34
     */
    int insert(T t);

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description     保存或者更新数据，传入的实体如有有ID就更新数据，如果没有ID就保存
     * @param t 要保存或者更新的实体
     * @Return
     * @Exception
     * @Date 2021/1/4 15:42
     */
    T saveOrUpdate(T t);

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description     根据属性更新属性值不为NULL的值
     * @param t 更新的属性
     * @Return
     * @Exception
     * @Date 2021/1/4 15:44
     */
    int updateByIdSelective(T t);

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description     根据ID删除数据
     * @param id
     * @Return
     * @Exception
     * @Date 2021/1/4 15:36
     */
    int deleteById(Serializable id);

    /**
     * @Method
     * @Author Mr.Z
     * @Version  1.0
     * @Description     根据实体删除
     * @param t 要删除的实体
     * @Return
     * @Exception
     * @Date 2021/1/4 15:41
     */
    int delete(T t);


}
