package com.example.service;

import com.example.domain.Customer;

/**
 * 客户表 业务处理接口
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 12:00:13
 */
public interface CustomerService{

    Customer findByPrimaryKey(long primaryKey);
}