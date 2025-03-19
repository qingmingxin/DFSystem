package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "存储节点")
@TableName(value = "storage_node")
@Data
public class StorageNode extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Schema(description = "存储节点IP")
    @TableField(value = "ip")
    private String ip;

    @Schema(description = "存储节点主机名")
    @TableField(value = "host")
    private String host;

    @Schema(description = "节点端口")
    @TableField(value = "port")
    private Integer port;
}
