package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Schema(description = "存储节点状态")
@TableName(value = "storage_status")
@Data
public class StorageStatus extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Schema(description="存储节点ID")
    @TableField(value = "storage_node_id")
    private Long storageNodeId;

    @Schema(description="时间戳")
    @TableField(value="time_stamp")
    private Date timestamp;

    @Schema(description = "CPU利用率")
    @TableField(value = "cpu_usage")
    private Double cpuUsage;

    @Schema(description = "内存利用率")
    @TableField(value = "memory_usage")
    private Double memoryUsage;

    @Schema(description = "总内存大小")
    @TableField(value = "memory_total")
    private long memoryTotal;

    @Schema(description = "已用内存")
    @TableField(value = "memory_used")
    private long memoryUsed;

}
