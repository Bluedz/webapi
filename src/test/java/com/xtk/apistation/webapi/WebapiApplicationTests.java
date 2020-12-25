package com.xtk.apistation.webapi;

import com.xtk.apistation.webapi.mapper.TpmsMatStriMapper;
import com.xtk.apistation.webapi.bean.TpmsMatStri;
import com.xtk.apistation.webapi.service.EmailActionService;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

// using RestTemplate
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
//

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

            /*
            String xx = tpmsMatStriMapper.existSequence();
            System.out.println(xx);
            tpmsMatStriMapper.dropSequence();
            tpmsMatStriMapper.initSequence();
            tpmsMatStriMapper.initTable();//getTMSBySNId(10); //
            */

            TpmsMatStriMapper tpmsMatStriMapper = sqlSession.getMapper(TpmsMatStriMapper.class);
            String sqName = "TST";
            Integer SID = 9;
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

    @Value("${spring.mail.username}")
    private String sendName;
    @Autowired
    private JavaMailSender mailSender;
    @Test
    public void tstSimpleMail(){
        EmailActionService emailActionService = new EmailActionService(mailSender, sendName);
        String[] mailAddr = {"zhaoyuheng@setechchina.com"};
//        emailActionService.sendSimpleMsg("sts201", mailAddr,  "zhuti");
    }

}
