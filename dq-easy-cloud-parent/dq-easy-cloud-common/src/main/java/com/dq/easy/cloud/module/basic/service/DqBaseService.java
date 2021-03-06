package com.dq.easy.cloud.module.basic.service;

import com.dq.easy.cloud.module.common.log.annotation.DqLog;
import com.dq.easy.cloud.module.common.log.constant.DqLogConstant.DqLogLevel;
import com.dq.easy.cloud.module.common.log.constant.DqLogConstant.DqLogType;
import com.dq.easy.cloud.module.common.log.proxy.impl.DqLogServiceProxy;

/**
 * 
 * <p>
 * 服务基础类
 * </p>
 *
 * <pre>
 *  说明：所有服务类可以继承此类
 *  约定：
 *  命名规范：
 *  使用示例：
 * </pre>
 *
 * @author daiqi
 * 创建时间    2018年2月9日 下午5:24:24
 */
@DqLog(dqLogLevel = DqLogLevel.INFO, dqLogProxyClass = DqLogServiceProxy.class, dqLogType = DqLogType.SERVICE)
public class DqBaseService {

}
