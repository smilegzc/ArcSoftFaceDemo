package com.smile.arcsoft_face.mapper;

import com.smile.arcsoft_face.domain.UserFaceInfo;
import com.smile.arcsoft_face.dto.FaceUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MybatisUserFaceInfoMapper {

    List<UserFaceInfo> findUserFaceInfoList();

    void insertUserFaceInfo(UserFaceInfo userFaceInfo);

    List<FaceUserInfo> getUserFaceInfoByGroupId(Integer groupId);

}
