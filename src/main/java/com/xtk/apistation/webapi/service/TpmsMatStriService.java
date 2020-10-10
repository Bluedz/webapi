package com.xtk.apistation.webapi.service;

import com.xtk.apistation.webapi.mapper.TpmsMatStriMapper;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TpmsMatStriService {

    private static SqlSessionFactory sqlSessionFactory;
    static {
        sqlSessionFactory =  SingletonMybatis.getSqlSessionFactory();
    }

    public void InitTpmsMatStri(String sqName, Integer SID){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {

            /*
            String xx = tpmsMatStriMapper.existSequence();
            System.out.println(xx);
            tpmsMatStriMapper.dropSequence();
            tpmsMatStriMapper.initSequence();
            tpmsMatStriMapper.initTable();//getTMSBySNId(10); //
            String sqName = "TST";
            Integer SID = 9;
            */

            TpmsMatStriMapper tpmsMatStriMapper = sqlSession.getMapper(TpmsMatStriMapper.class);

            String sequenceName = tpmsMatStriMapper.existSequence("'"+sqName+"'");
            if( sequenceName!=null & !"".equals(sequenceName) ){
                tpmsMatStriMapper.dropSequence(sqName);
                tpmsMatStriMapper.initSequence(sqName);
            }else{
                tpmsMatStriMapper.initSequence(sqName);
            }
            tpmsMatStriMapper.initTable(SID);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

    }
}
