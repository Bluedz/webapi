package com.xtk.apistation.webapi.impdata;

import com.xtk.apistation.webapi.Mapper.LogOfImportMapper;
import com.xtk.apistation.webapi.bean.LogOfImport;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ImpRecord {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        sqlSessionFactory =  SingletonMybatis.getSqlSessionFactory();
    }
    String errorMeg;

    public boolean insertRecord(LogOfImport reOfLog){
        //
        boolean ifOk = true;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            LogOfImportMapper logOfImportMapper = sqlSession.getMapper(LogOfImportMapper.class);
            logOfImportMapper.insert(reOfLog);
            // makeObject(sqlSession, arrList, folderName);
            sqlSession.commit();
        }catch(Exception e){
            this.errorMeg = e.getMessage();
            ifOk = false;
            throw e;
        }
        finally {
            sqlSession.close();
            // System.out.println("========= \n" + this.errorMeg);
        }
        return ifOk;
    }
}
