package com.xtk.apistation.webapi.Mapper;

import com.xtk.apistation.webapi.bean.MatBasicInformation;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface MatBasicInformationMapper {

    List<MatBasicInformation> getMats(int p1, int p2);
    public MatBasicInformation getMatsBySNId(int sn);



}