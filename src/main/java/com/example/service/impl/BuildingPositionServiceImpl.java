package com.example.service.impl;

import com.example.domain.BuildingPosition;
import com.example.mapper.BuildingPositionMapper;
import com.example.service.BuildingPositionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 楼盘职位 业务处理实现
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 12:00:13
 */
@Service
public class BuildingPositionServiceImpl implements BuildingPositionService{

    @Autowired
    private BuildingPositionMapper buildingPositionMapper;

}