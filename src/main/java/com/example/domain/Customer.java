package com.example.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 客户表 实体类
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 12:00:13
 */
@Data
@Entity
@Table(name = "home_customer")
public class Customer {

	/**
	 * 主键id
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    /**
     * 电话
     */
	private String mobile;

    /**
     * 邮箱
     */
	private String email;

    /**
     * 姓名
     */
	private String customerName;

    /**
     * 用户登陆密码
     */
	private String customerPassword;

    /**
     * 头像
     */
	private String headImage;

    /**
     * 性别性别(1-男、2-女)
     */
	private Boolean gender;

    /**
     * 出生日期
     */
	private Date birthday;

    /**
     * 创建时间
     */
	private Date createTime;

    /**
     * 更新时间
     */
	private Date updateTime;

    /**
     * 删除标志 1-未删，2-删除
     */
	private Boolean deleteFlag;
}