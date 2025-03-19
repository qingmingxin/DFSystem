package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Schema(description = "下载历史信息")
@TableName(value = "download_history_info")
@Data
public class DownloadHistoryInfo extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Schema(description = "用户ID")
    @TableField(value = "user_id")
    private Long userId;

    @Schema(description = "文件ID")
    @TableField(value = "file_id")
    private Long fileId;

    @Schema(description = "下载时间")
    @TableField(value = "download_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date downloadTime;

    @Schema(description = "客户IP")
    @TableField(value = "client_ip")
    private String clientIp;
}
