package com.qingmingxin.DFSystem.model.entity;

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

    

}
