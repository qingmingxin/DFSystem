package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "文件节点")
@TableName(value = "file_node")
@Data
public class FileNode extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Schema(description = "文件名")
    @TableField(value = "name")
    private String fileName;

    @Schema(description = "文件大小")
    @TableField(value = "size")
    private Long fileSize;

    @Schema(description = "目录ID")
    @TableField(value = "directory_id")
    private Long directoryId;

    @Schema(description = "文件哈希值")
    @TableField(value = "hash_code")
    private String hashCode;
}
