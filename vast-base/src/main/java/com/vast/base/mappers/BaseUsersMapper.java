package com.vast.base.mapper;

import com.vast.base.core.mapper.BaseDBMapper;
import com.vast.base.entity.BaseUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.mapper
 * @ClassName: BaseUsersMapper
 * @Author: Administrator
 * @Description:
 * @Date: 2021/1/4 16:23
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Mapper
@Component
public interface BaseUsersMapper extends BaseDBMapper<BaseUsers> {
}
