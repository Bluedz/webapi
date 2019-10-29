package com.xtk.apistation.webapi.impdata;

import com.xtk.apistation.webapi.bean.MatFactoryAttr;
import com.xtk.apistation.webapi.mapper.MatFactoryAttrMapper;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.math.BigDecimal;

public class tst {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        sqlSessionFactory =  SingletonMybatis.getSqlSessionFactory();
    }

    public static void main(String[] args) {

        SqlSession sqlSession = sqlSessionFactory.openSession();

        MatFactoryAttr mta = new MatFactoryAttr();
//        mta.setTid(null);
//        mta.setSerialNumber(null);
        mta.setMaterialNumber("DF910002");
        mta.setArea("2100");
        mta.setStockMax(BigDecimal.valueOf(0.001));
        mta.setStockMin(BigDecimal.valueOf(0.0001));
        mta.setQualityAssurance(BigDecimal.valueOf(1));

        try {
            MatFactoryAttrMapper matFactoryAttrMapper = sqlSession.getMapper(MatFactoryAttrMapper.class);
            matFactoryAttrMapper.insert(mta);
            sqlSession.commit();
        }catch (Exception e){
            throw e;
        }finally {
            sqlSession.close();
        }

    }
}
