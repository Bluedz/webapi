package com.xtk.apistation.webapi.Mapper;

import com.xtk.apistation.webapi.bean.MatFactoryAttr;
import generator.MatFactoryAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MatFactoryAttrMapper {
    public List<MatFactoryAttr> getMFAs(int p1, int p2);
    public MatFactoryAttr getMFABySNId(int sn);
    public boolean insert(MatFactoryAttr record);
/*    long countByExample(MatFactoryAttrExample example);

    int deleteByExample(MatFactoryAttrExample example);

    int insert(MatFactoryAttr record);

    int insertSelective(MatFactoryAttr record);

    List<MatFactoryAttr> selectByExample(MatFactoryAttrExample example);

    int updateByExampleSelective(@Param("record") MatFactoryAttr record, @Param("example") MatFactoryAttrExample example);

    int updateByExample(@Param("record") MatFactoryAttr record, @Param("example") MatFactoryAttrExample example);*/
}