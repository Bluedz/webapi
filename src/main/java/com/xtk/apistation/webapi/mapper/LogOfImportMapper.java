package com.xtk.apistation.webapi.mapper;

import com.xtk.apistation.webapi.bean.LogOfImport;

import java.util.List;
// import com.xtk.apistation.webapi.bean.LogOfImportExample;


public interface LogOfImportMapper {
    int insert(LogOfImport record);
    List<LogOfImport> getErrPage(int page);
/*    long countByExample(LogOfImportExample example);

    int deleteByExample(LogOfImportExample example);

    int insertSelective(LogOfImport record);

    List<LogOfImport> selectByExample(LogOfImportExample example);

    int updateByExampleSelective(@Param("record") LogOfImport record, @Param("example") LogOfImportExample example);

    int updateByExample(@Param("record") LogOfImport record, @Param("example") LogOfImportExample example);*/
}