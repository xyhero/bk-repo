package com.tencent.bkrepo.opdata.config

import com.tencent.bkrepo.common.service.log.LogType
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.util.unit.DataSize
import java.time.Duration

@ConfigurationProperties("op.server.logs")
data class OpServerLogProperties(
    /**
     * 服务列表更新时间
     * */
    var servicesUpdatePeriod: Long = 3000L,
    /**
     * 日志刷新周期
     */
    var refreshRate: Duration = Duration.ofMillis(10000),
    /**
     * 日志文件列表
     */
    var fileNames: Set<String> = LogType.values().map { it.name }.toSet(),
    /**
     * 一次最多返回日志大小
     */
    var maxSize: DataSize = DataSize.ofKilobytes(300),
)
