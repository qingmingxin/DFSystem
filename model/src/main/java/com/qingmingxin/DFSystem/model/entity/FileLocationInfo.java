package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "文件存储信息")
@TableName(value = "file_location_info")
@Data
public class FileLocationInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Schema(description = "文件ID")
    @TableField(value = "file_id")
    private Long fileId;

    @Schema(description = "节点ID")
    @TableField(value = "storage_node_id")
    private Long storageNodeId;

    @Schema(description = "存储路径")
    @TableField(value = "storage_path")
    private String storagePath;
}
