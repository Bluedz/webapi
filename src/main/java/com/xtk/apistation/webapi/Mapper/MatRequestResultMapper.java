package com.xtk.apistation.webapi.Mapper;

import com.xtk.apistation.webapi.bean.MatRequestResult;
import generator.MatRequestResultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MatRequestResultMapper {
    List<MatRequestResult> getMRRs(int p1, int p2);
    public MatRequestResult getMRRBySNId(int sn);
    /*long countByExample(MatRequestResultExample example);

    int deleteByExample(MatRequestResultExample example);

    int insert(MatRequestResult record);

    int insertSelective(MatRequestResult record);

    List<MatRequestResult> selectByExample(MatRequestResultExample example);

    int updateByExampleSelective(@Param("record") MatRequestResult record, @Param("example") MatRequestResultExample example);

    int updateByExample(@Param("record") MatRequestResult record, @Param("example") MatRequestResultExample example);*/
}