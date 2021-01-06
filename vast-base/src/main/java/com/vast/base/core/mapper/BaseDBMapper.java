package com.vast.base.core.mapper;

import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.core.mapper
 * @ClassName: BaseDBMapper
 * @Author: Administrator
 * @Description: 集成tk.mapper
 * @Date: 2021/1/4 15:11
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Component
public interface BaseDBMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
