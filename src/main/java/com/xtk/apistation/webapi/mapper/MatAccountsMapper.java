package com.xtk.apistation.webapi.mapper;

import com.xtk.apistation.webapi.bean.MatAccounts;
// import com.xtk.apistation.webapi.bean.MatAccountsExample;

import java.util.List;

public interface MatAccountsMapper {
    public List<MatAccounts> getMAs(int p1, int p2);
    public MatAccounts getMABySNId(int sn);
    public boolean insert(MatAccounts record);
/*    long countByExample(MatAccountsExample example);

    int deleteByExample(MatAccountsExample example);

    int insert(MatAccounts record);

    int insertSelective(MatAccounts record);

    List<MatAccounts> selectByExample(MatAccountsExample example);

    int updateByExampleSelective(@Param("record") MatAccounts record, @Param("example") MatAccountsExample example);

    int updateByExample(@Param("record") MatAccounts record, @Param("example") MatAccountsExample example);*/
}