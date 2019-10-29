package com.xtk.apistation.webapi.mapper;

import com.xtk.apistation.webapi.bean.MatPurchasingStatus;
// import generator.MatPurchasingStatusExample;

import java.util.List;

public interface MatPurchasingStatusMapper {
    public List<MatPurchasingStatus> getMPSs(int p1, int p2);
    public MatPurchasingStatus getMPSBySNId(int sn);
    public boolean insert(MatPurchasingStatus record);

    /*long countByExample(MatPurchasingStatusExample example);

    int deleteByExample(MatPurchasingStatusExample example);

    int insert(MatPurchasingStatus record);

    int insertSelective(MatPurchasingStatus record);

    List<MatPurchasingStatus> selectByExample(MatPurchasingStatusExample example);

    int updateByExampleSelective(@Param("record") MatPurchasingStatus record, @Param("example") MatPurchasingStatusExample example);

    int updateByExample(@Param("record") MatPurchasingStatus record, @Param("example") MatPurchasingStatusExample example);*/
}