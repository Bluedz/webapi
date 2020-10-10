package com.xtk.apistation.webapi.mapper;

import com.xtk.apistation.webapi.bean.MatFactoryAttr;
// import com.xtk.apistation.webapi.bean.MatFactoryAttrExample;

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