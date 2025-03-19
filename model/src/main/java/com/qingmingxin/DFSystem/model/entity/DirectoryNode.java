package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Schema(description = "目录节点")
@TableName(value = "directory_node")
@Data
public class DirectoryNode extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Schema(description = "目录名")
    @TableField(value = "name")
    private String name;

    @Schema(description = "父目录ID")
    @TableField(value = "parent_id")
    private Long parentId;

    @Schema(description = "目录创建时间")
    @TableField(value = "directory_created_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date directoryCreatedTime;
}
