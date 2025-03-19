package com.qingmingxin.DFSystem.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.qingmingxin.DFSystem.model.enums.BaseStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "用户信息表")
@TableName(value = "user_info")
@Data
public class UserInfo extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Schema(description = "手机号码（用做登录用户名）")
    @TableField(value = "phone")
    private String phone;

    @Schema(description = "密码")
    @TableField(value = "password", select = false)
    private String password;

    @Schema(description = "头像url")
    @TableField(value = "avatar_url")
    private String avatarUrl;

    @Schema(description = "昵称")
    @TableField(value = "nickname")
    private String nickname;

    @Schema(description = "账号状态")
    @TableField(value = "status")
    private BaseStatus status;

    @Schema(description = "工作单位")
    @TableField(value = "work_unit")
    private String workUnit;

    @Schema(description = "工作所处区域id")
    @TableField(value = "work_district_id")
    private Long workDistrictId;

    @Schema(description = "工作所处区域名称")
    @TableField(value = "work_district_name")
    private String workDistrictName;

    @Schema(description = "工作所处城市id")
    @TableField(value = "work_city_id")
    private Long workCityId;

    @Schema(description = "工作所处城市名称")
    @TableField(value = "work_city_name")
    private String workCityName;

    @Schema(description = "工作所处省份id")
    @TableField(value = "work_province_id")
    private Long workProvinceId;

    @Schema(description = "工作所处区域名称")
    @TableField(value = "work_province_name")
    private String workProvinceName;

    @Schema(description = "工作详细地址")
    @TableField(value = "work_address_detail")
    private String workAddressDetail;

}
