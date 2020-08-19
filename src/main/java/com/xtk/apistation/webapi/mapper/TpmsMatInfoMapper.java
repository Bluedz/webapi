package com.xtk.apistation.webapi.mapper;

import com.xtk.apistation.webapi.bean.TpmsMatInfo;
import generator.TpmsMatInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpmsMatInfoMapper {
    public List<TpmsMatInfo> getTMIs(int p1, int p2);
    public TpmsMatInfo getTMIBySNId(int sn);

    //
    long countByExample(TpmsMatInfoExample example);

    int deleteByExample(TpmsMatInfoExample example);

    int insert(TpmsMatInfo record);

    int insertSelective(TpmsMatInfo record);

    List<TpmsMatInfo> selectByExample(TpmsMatInfoExample example);

    int updateByExampleSelective(@Param("record") TpmsMatInfo record, @Param("example") TpmsMatInfoExample example);

    int updateByExample(@Param("record") TpmsMatInfo record, @Param("example") TpmsMatInfoExample example);
}