package com.vast.base.core.service.impl;

import com.vast.base.core.mapper.BaseDBMapper;
import com.vast.base.core.service.IBaseDBService;
import com.vast.base.enums.ExceptionEnum;
import com.vast.base.exception.WeServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.core.service.impl
 * @ClassName: BaseDBServiceImpl
 * @Author: Administrator
 * @Description: 操作Mapper的基类
 * @Date: 2021/1/4 15:26
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */

public class BaseDBServiceImpl<T> implements IBaseDBService<T> {

    @Autowired
    private BaseDBMapper<T> baseDBMapper;

    @Override
    public List<T> findAll() {
        return baseDBMapper.selectAll();
    }

    @Override
    public List<T> findByEntity(T t) {
        if(null == t) {
            throw new WeServiceException(ExceptionEnum.WE_SERVICE_NOT_ACCEPTABL);
        }
        return baseDBMapper.select(t);
    }

    @Override
    public T getById(Serializable id) {
        if(null == id) {
            throw new WeServiceException(ExceptionEnum.WE_SERVICE_NOT_ACCEPTABL);
        }
        return baseDBMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(T t) {
        if(null == t) {
            throw new WeServiceException(ExceptionEnum.WE_SERVICE_NOT_ACCEPTABL);
        }
        return baseDBMapper.insert(t);
    }

    @Override
    public T saveOrUpdate(T t) {
        if(null == t)
            throw new WeServiceException(ExceptionEnum.WE_SERVICE_NOT_ACCEPTABL);
        try {
            Field id = t.getClass().getDeclaredField("id");
            id.setAccessible(true);
            if (id != null && id.get(t) != null && !StringUtils.isEmpty(id.get(t).toString())) {
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    @Override
    public int updateByIdSelective(T t) {
        if(null == t)
            throw new WeServiceException(ExceptionEnum.WE_SERVICE_NOT_ACCEPTABL);
        return baseDBMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int deleteById(Serializable id) {
        if(null == id)
            throw new WeServiceException(ExceptionEnum.WE_SERVICE_NOT_ACCEPTABL);
        return baseDBMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int delete(T t) {
        if(null == t)
            throw new WeServiceException(ExceptionEnum.WE_SERVICE_NOT_ACCEPTABL);
        return baseDBMapper.delete(t);
    }
}
