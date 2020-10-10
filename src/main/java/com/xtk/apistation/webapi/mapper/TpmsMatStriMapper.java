package com.xtk.apistation.webapi.mapper;

import com.xtk.apistation.webapi.bean.TpmsMatStri;
import com.xtk.apistation.webapi.bean.TpmsMatStriExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpmsMatStriMapper {
    public List<TpmsMatStri> getTMSs(int p1, int p2);
    public TpmsMatStri getTMSBySNId(int sn);
    public boolean insertFrTxt(TpmsMatStri record);

    //
    public String existSequence(@Param("sqName") String name);
    public  void dropSequence(@Param("sqName") String name);
    public void initSequence(@Param("sqName") String name);
    public void initTable(@Param("startID") Integer SID);
    //


    int deleteByExample(TpmsMatStriExample example);

    int deleteByPrimaryKey(BigDecimal tid);

    int insert(TpmsMatStri record);

    int insertSelective(TpmsMatStri record);

    List<TpmsMatStri> selectByExample(TpmsMatStriExample example);

    TpmsMatStri selectByPrimaryKey(BigDecimal tid);

    int updateByExampleSelective(@Param("record") TpmsMatStri record, @Param("example") TpmsMatStriExample example);

    int updateByExample(@Param("record") TpmsMatStri record, @Param("example") TpmsMatStriExample example);

    int updateByPrimaryKeySelective(TpmsMatStri record);

    int updateByPrimaryKey(TpmsMatStri record);
}