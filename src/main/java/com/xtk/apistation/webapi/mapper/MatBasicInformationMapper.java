package com.xtk.apistation.webapi.mapper;

import com.xtk.apistation.webapi.bean.MatBasicInformation;

import java.util.List;

public interface MatBasicInformationMapper {

    public List<MatBasicInformation> getMats(int p1, int p2);
    public MatBasicInformation getMatsBySNId(int sn);
    public boolean insert(MatBasicInformation record);



}