package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "节点配置")
@TableName(value = "storage_node_config")
@Data
public class NodeConfig extends BaseEntity {
    private static final long serialVersionUID = 1L;


    @Schema(description = "存储节点ID")
    @TableField(value = "storage_node_id")
    private Long storageNodeId;

    @Schema(description = "存储路径")
    @TableField(value = "storage_path")
    private String storagePath;

    @Schema(description = "节点最大能力")
    @TableField(value = "max_capacity")
    private String maxCapacity;

    @Schema(description = "ssh远程密码")
    @TableField(value = "ssh_password")
    private String sshPassword;
}
