package com.smile.arcsoft_face.service.impl;

import com.smile.arcsoft_face.domain.UserFaceInfo;
import com.smile.arcsoft_face.mapper.MybatisUserFaceInfoMapper;
import com.smile.arcsoft_face.service.UserFaceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserFaceInfoServiceImpl implements UserFaceInfoService {


    @Autowired
    private MybatisUserFaceInfoMapper userFaceInfoMapper;

    @Override
    public void insertSelective(UserFaceInfo userFaceInfo) {
        userFaceInfoMapper.insertUserFaceInfo(userFaceInfo);
    }
}
