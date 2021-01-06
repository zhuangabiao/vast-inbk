package com.vast.base.service.impl;

import com.vast.base.core.service.impl.BaseDBServiceImpl;
import com.vast.base.entity.BaseUsers;
import com.vast.base.service.IBaseUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.service.impl
 * @ClassName: BaseUserServiceImpl
 * @Author: Administrator
 * @Description: User逻辑处理类
 * @Date: 2021/1/4 16:16
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Service
public class BaseUserServiceImpl extends BaseDBServiceImpl<BaseUsers> implements IBaseUserService {
}
