package com.xtk.apistation.webapi;

import com.xtk.apistation.webapi.mapper.TpmsMatStriMapper;
import com.xtk.apistation.webapi.bean.TpmsMatStri;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@ImportResource(locations = "classpath*:/spring-mybatis.xml")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebapiApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebapiApplicationTests {

    @Test
    public void contextLoads() {
    }



    private static SqlSessionFactory sqlSessionFactory;
    static {
        sqlSessionFactory =  SingletonMybatis.getSqlSessionFactory();
    }

    @Test
    public void tstInitSequ(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            TpmsMatStriMapper tpmsMatStriMapper = sqlSession.getMapper(TpmsMatStriMapper.class);
            tpmsMatStriMapper.dropSequence();
            tpmsMatStriMapper.initSequence();
//            tpmsMatStriMapper.initTable();//getTMSBySNId(10); //
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }


    }

}
