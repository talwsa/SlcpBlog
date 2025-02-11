package com.slcp.devops.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author: Slcp
 * @date: 2020/9/22 12:54
 * @code: 一生的挚爱
 * @description: 照片墙实体类
 */
@Data
@EqualsAndHashCode
@TableName(value = "blog_picture")
public class Picture implements Serializable {
    private static final long serialVersionUID = -1509782578272943999L;
    /**
     * 业务主表主键ID
     */
    @ApiModelProperty(value = "业务主表主键ID")
    @JsonSerialize(using = ToStringSerializer.class)
    @TableId(value = "id")
    private Long pictureId;
    /**
     * 图片名称
     */
    @ApiModelProperty(value = "图片名称")
    @TableField(value = "picture_name")
    private String pictureName;
    /**
     * 图片创建时间
     */
    @ApiModelProperty(value = "图片创建时间")
    @TableField(value = "picture_time")
    private String pictureTime;
    /**
     * 图片路径
     */
    @ApiModelProperty(value = "图片路径")
    @TableField(value = "picture_address")
    private String pictureAddress;
    /**
     * 图片内容
     */
    @ApiModelProperty(value = "图片内容")
    @TableField(value = "picture_description")
    private String pictureDescription;
}
