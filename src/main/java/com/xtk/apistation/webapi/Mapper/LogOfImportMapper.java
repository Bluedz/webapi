package com.xtk.apistation.webapi.Mapper;

import com.xtk.apistation.webapi.bean.LogOfImport;
import generator.LogOfImportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogOfImportMapper {
    int insert(LogOfImport record);

/*    long countByExample(LogOfImportExample example);

    int deleteByExample(LogOfImportExample example);

    int insertSelective(LogOfImport record);

    List<LogOfImport> selectByExample(LogOfImportExample example);

    int updateByExampleSelective(@Param("record") LogOfImport record, @Param("example") LogOfImportExample example);

    int updateByExample(@Param("record") LogOfImport record, @Param("example") LogOfImportExample example);*/
}