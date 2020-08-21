package com.xtk.apistation.webapi.controller;


// import com.xtk.apistation.webapi.Mapper.TstUserMapper;
import com.xtk.apistation.webapi.mapper.*;
// import com.xtk.apistation.webapi.bean.TST_User;
import com.xtk.apistation.webapi.bean.*;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.xtk.apistation.webapi.service.createOrderFileToREP;

@RestController
@RequestMapping("/index") //在类上使用RequestMapping，里面设置的value就是方法的父路径
public class Controller {
    // def log
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static SqlSessionFactory sqlSessionFactory;
    static {
        sqlSessionFactory =  SingletonMybatis.getSqlSessionFactory();
    }
    @RequestMapping  //如果方法上的RequestMapping没有value，则此方法默认被父路径调用
    public String index(){
        return "hello spring boot";
    }
    //这里体现了restful风格的请求，按照请求的类型，来进行增删查改。
    //设计restful api（其实也就是URL），不要有冗余，例如不要写成getUsers，URL中
    //最好不要有动词。

    //RequestBody这个注解可以接收json数据
    // MatInfor -- 物料基本信息
    @RequestMapping(method = RequestMethod.POST,value = "/MatInfor")
    public ResponseResult getMatInfor(@RequestBody String name){
        ResponseResult responseResult;
        List<MatBasicInformation> listMatInfor = new ArrayList<>();
        MatBasicInformation matInfor;

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            MatBasicInformationMapper matInforMapper = sqlSession.getMapper(MatBasicInformationMapper.class);
            JSONObject jsonObject = JSON.parseObject(name);
            int SerialNumber = jsonObject.getInteger("SerialNumber");
            int MaxCount = jsonObject.getInteger("MaxCount");
            if (jsonObject.get("SpecifiedNumber") == null) {
                System.out.println("SpecifiedNumber is null");
                // 返回增量
                listMatInfor = matInforMapper.getMats(SerialNumber, MaxCount);
            }else{
                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
                // 返回特定
                matInfor = matInforMapper.getMatsBySNId(SpecifiedNumber);
                listMatInfor.add(matInfor);
            }
            responseResult=ResponseResult.success(listMatInfor);
//          sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        // return true;
        // responseResult=ResponseResult.success(listMatInfor);
        //
        // responseResult=ResponseResult.fail("no");
        this.logger.info("MatInfor.msg: " + responseResult.msg);
        this.logger.info("MatInfor.Result: " + responseResult.success);
        return responseResult;
    }

    // MatFactoryAttr -- 物料工厂属性
    @RequestMapping(method = RequestMethod.POST,value = "/MatFactoryAttr")
    public ResponseResult getMFA(@RequestBody String name){
        ResponseResult responseResult;
        List<MatFactoryAttr> listMatFactoryAttr = new ArrayList<>();
        MatFactoryAttr matFactoryAttr;

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            MatFactoryAttrMapper matFactoryAttrMapper = sqlSession.getMapper(MatFactoryAttrMapper.class);
            JSONObject jsonObject = JSON.parseObject(name);
            int SerialNumber = jsonObject.getInteger("SerialNumber");
            int MaxCount = jsonObject.getInteger("MaxCount");
            if (jsonObject.get("SpecifiedNumber") == null) {
                System.out.println("SpecifiedNumber is null");
                // 返回增量
                listMatFactoryAttr = matFactoryAttrMapper.getMFAs(SerialNumber, MaxCount);
            }else{
                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
                // 返回特定
                matFactoryAttr = matFactoryAttrMapper.getMFABySNId(SpecifiedNumber);
                listMatFactoryAttr.add(matFactoryAttr);
            }
            responseResult=ResponseResult.success(listMatFactoryAttr);
//          sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        // return true;
        // responseResult=ResponseResult.success(listMatInfor);
        //
        // responseResult=ResponseResult.fail("no");
        this.logger.info("MatFactoryAttr.msg: " + responseResult.msg);
        this.logger.info("MatFactoryAttr.Result: " + responseResult.success);
//        System.out.println(responseResult.msg);
//        System.out.println(responseResult.success);
        return responseResult;
    }

    // MatAccounts -- 物料台账
    @RequestMapping(method = RequestMethod.POST,value = "/MatAccounts")
    public ResponseResult getMA(@RequestBody String name){
        ResponseResult responseResult;
        List<MatAccounts> listMatAccounts = new ArrayList<>();
        MatAccounts matAccounts;

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            MatAccountsMapper matFactoryAttrMapper = sqlSession.getMapper(MatAccountsMapper.class);
            JSONObject jsonObject = JSON.parseObject(name);
            int SerialNumber = jsonObject.getInteger("SerialNumber");
            int MaxCount = jsonObject.getInteger("MaxCount");
            if (jsonObject.get("SpecifiedNumber") == null) {
                System.out.println("SpecifiedNumber is null");
                // 返回增量
                listMatAccounts = matFactoryAttrMapper.getMAs(SerialNumber, MaxCount);
            }else{
                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
                // 返回特定
                matAccounts = matFactoryAttrMapper.getMABySNId(SpecifiedNumber);
                listMatAccounts.add(matAccounts);
            }
            responseResult=ResponseResult.success(listMatAccounts);
//          sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        // return true;
        // responseResult=ResponseResult.success(listMatInfor);
        //
        // responseResult=ResponseResult.fail("no");
        this.logger.info("MatAccounts.msg: " + responseResult.msg);
        this.logger.info("MatAccounts.Result: " + responseResult.success);
//        System.out.println(responseResult.msg);
//        System.out.println(responseResult.success);
        return responseResult;
    }

    // MatPurchasingStatus -- 物料采购状态反馈
    @RequestMapping(method = RequestMethod.POST,value = "/MatPurchasingStatus")
    public ResponseResult getMPS(@RequestBody String name){
        ResponseResult responseResult;
        List<MatPurchasingStatus> listMatPurchasingStatus = new ArrayList<>();
        MatPurchasingStatus matPurchasingStatus;

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            MatPurchasingStatusMapper matPurchasingStatusMapper = sqlSession.getMapper(MatPurchasingStatusMapper.class);
            JSONObject jsonObject = JSON.parseObject(name);
            int SerialNumber = jsonObject.getInteger("SerialNumber");
            int MaxCount = jsonObject.getInteger("MaxCount");
            if (jsonObject.get("SpecifiedNumber") == null) {
                System.out.println("SpecifiedNumber is null");
                // 返回增量
                listMatPurchasingStatus = matPurchasingStatusMapper.getMPSs(SerialNumber, MaxCount);
            }else{
                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
                // 返回特定
                matPurchasingStatus = matPurchasingStatusMapper.getMPSBySNId(SpecifiedNumber);
                listMatPurchasingStatus.add(matPurchasingStatus);
            }
            responseResult=ResponseResult.success(listMatPurchasingStatus);
//          sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        // return true;
        // responseResult=ResponseResult.success(listMatInfor);
        //
        // responseResult=ResponseResult.fail("no");
        this.logger.info("MatPurchasingStatus.msg: " + responseResult.msg);
        this.logger.info("MatPurchasingStatus.Result: " + responseResult.success);
//        System.out.println(responseResult.msg);
//        System.out.println(responseResult.success);
        return responseResult;
    }

    // MatRequestResult -- 物料领用结果反馈数据
    @RequestMapping(method = RequestMethod.POST,value = "/MatRequestResult")
    public ResponseResult getMRR(@RequestBody String name){
        ResponseResult responseResult;
        List<MatRequestResult> listMatRequestResult = new ArrayList<>();
        MatRequestResult matRequestResult;

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            MatRequestResultMapper matRequestResultMapper = sqlSession.getMapper(MatRequestResultMapper.class);
            JSONObject jsonObject = JSON.parseObject(name);
            int SerialNumber = jsonObject.getInteger("SerialNumber");
            int MaxCount = jsonObject.getInteger("MaxCount");
            if (jsonObject.get("SpecifiedNumber") == null) {
                System.out.println("SpecifiedNumber is null");
                // 返回增量
                listMatRequestResult = matRequestResultMapper.getMRRs(SerialNumber, MaxCount);
            }else{
                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
                // 返回特定
                matRequestResult = matRequestResultMapper.getMRRBySNId(SpecifiedNumber);
                listMatRequestResult.add(matRequestResult);
            }
            responseResult=ResponseResult.success(listMatRequestResult);
//          sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        // return true;
        // responseResult=ResponseResult.success(listMatInfor);
        //
        // responseResult=ResponseResult.fail("no");
        this.logger.info("MatRequestResult.msg: " + responseResult.msg);
        this.logger.info("MatRequestResult.Result: " + responseResult.success);
//        System.out.println(responseResult.msg);
//        System.out.println(responseResult.success);
        return responseResult;
    }

    // MatOrder --	物料申购单数据
    @RequestMapping(method = RequestMethod.POST,value = "/MatOrder")
    public ResponseResult setMatOrder(@RequestBody String name) throws IOException {
//        this.logger.info(name);
//        System.out.println(name);

        String fName = "MatOrder";
        ResponseResult responseResult;
        SqlSession sqlSession = sqlSessionFactory.openSession();

        JSONObject jsonObject = JSON.parseObject(name);
        // BigDecimal x = jsonObject.getBigDecimal("qty");
        String reqId = jsonObject.getString("reqId");
        String jsonAllValue =
                jsonObject.getString("reqId") + " " +
                jsonObject.getString("itemId") + " " +
                jsonObject.getString("deviceId") + " " +
                jsonObject.getBigDecimal("qty") + " " +
                jsonObject.getString("cosCenter") + " " +
                jsonObject.getString("zChart") + " " +
                jsonObject.getString("subUser") + " " +
                jsonObject.getString("subDate") ;
        this.logger.info("MatOrder:" + jsonAllValue);
//        System.out.println(    jsonAllValue    );
        try {
            createOrderFileToREP.createFile(fName, jsonAllValue);
            responseResult=ResponseResult.success(null);
        } finally {

        }
        try{
            MatOrderMapper matOrderMapper = sqlSession.getMapper(MatOrderMapper.class);
            MatOrder matOrder = new MatOrder();
            matOrder.setJsonStr(name);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            matOrder.setReceivedTime(sdf.format(new Date()));
            matOrderMapper.insert(matOrder);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return responseResult;
    }

    // MatRequest -- 物料领用请求
    @RequestMapping(method = RequestMethod.POST,value = "/MatRequest")
    public ResponseResult setMatRequest(@RequestBody String name) throws IOException {
//        this.logger.info(name);
//        System.out.println(name);

        String fName = "MatRequest";
        ResponseResult responseResult;
        SqlSession sqlSession = sqlSessionFactory.openSession();

        JSONObject jsonObject = JSON.parseObject(name);
        // BigDecimal x = jsonObject.getBigDecimal("qty");
        String reqId = jsonObject.getString("reqId");
        String jsonAllValue =
                jsonObject.getString("reqId") + " " +
                jsonObject.getString("area") + " " +
                jsonObject.getString("cosCenter") + " " +
                jsonObject.getString("itemId") + " " +
                jsonObject.getBigDecimal("qty") + " " +
                jsonObject.getString("subUser") + " " +
                jsonObject.getString("subDate") ;
        this.logger.info("MatRequest.OPT: " + jsonAllValue);
//        System.out.println(    jsonAllValue    );
        try {
            createOrderFileToREP.createFile(fName, jsonAllValue);
            responseResult=ResponseResult.success(null);
        } finally {

        }
        try{
            MatRequestMapper matRequestMapper = sqlSession.getMapper(MatRequestMapper.class);
            MatRequest matRequest = new MatRequest();
            matRequest.setJsonStr(name);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            matRequest.setReceivedTime(sdf.format(new Date()));
            matRequestMapper.insert(matRequest);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return responseResult;
    }

    //-- TPMS --
    // TPMS_MatInfo -- 备件基础数据接口
    @RequestMapping(method = RequestMethod.POST, value = "/TpmsMatInfo")
    public ResponseResult getTMIs(@RequestBody String name){
        ResponseResult responseResult;
        List<TpmsMatInfo> listTpmsMatInfo = new ArrayList<>();
        TpmsMatInfo tpmsMatInfo;

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            TpmsMatInfoMapper tpmsMatInfoMapper = sqlSession.getMapper(TpmsMatInfoMapper.class);
            JSONObject jsonObject = JSON.parseObject(name);
            int SerialNumber = jsonObject.getInteger("SerialNumber");
            int MaxCount = jsonObject.getInteger("MaxCount");
            if (jsonObject.get("SpecifiedNumber") == null) {
                System.out.println("SpcifiedNumber is null");
                // 返回增量
                listTpmsMatInfo = tpmsMatInfoMapper.getTMIs(SerialNumber, MaxCount);
            }else{
                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
                // 返回特定
                tpmsMatInfo = tpmsMatInfoMapper.getTMIBySNId(SpecifiedNumber);
                listTpmsMatInfo.add(tpmsMatInfo);
            }
            responseResult = ResponseResult.success(listTpmsMatInfo);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        // ...
        this.logger.info("TpmsMatInfo.msg: " + responseResult.msg);
        this.logger.info("TpmsMatInfo.Result: " + responseResult.success);
        // ...
        return responseResult;
    }

    // TPMS_MatStri -- 备件属性数据接口
    @RequestMapping(method = RequestMethod.POST, value = "/TpmsMatStri")
    public ResponseResult getTMSs(@RequestBody String name){
        ResponseResult responseResult;
        List<TpmsMatStri> listTpmsMatStri = new ArrayList<>();
        TpmsMatStri tpmsMatStri;

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            TpmsMatStriMapper tpmsMatStriMapper = sqlSession.getMapper(TpmsMatStriMapper.class);
            JSONObject jsonObject = JSON.parseObject(name);
            int SerialNumber = jsonObject.getInteger("SerialNumber");
            int MaxCount = jsonObject.getInteger("MaxCount");
            if (jsonObject.get("SpecifiedNumber") == null) {
                System.out.println("SpcifiedNumber is null");
                // 返回增量
                listTpmsMatStri = tpmsMatStriMapper.getTMSs(SerialNumber, MaxCount);
            }else{
                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
                // 返回特定
                tpmsMatStri = tpmsMatStriMapper.getTMSBySNId(SpecifiedNumber);
                listTpmsMatStri.add(tpmsMatStri);
            }
            responseResult = ResponseResult.success(listTpmsMatStri);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        // ...
        this.logger.info("TpmsMatInfo.msg: " + responseResult.msg);
        this.logger.info("TpmsMatInfo.Result: " + responseResult.success);
        // ...
        return responseResult;
    }

    //RequestBody这个注解可以接收json数据
//    @RequestMapping(method = RequestMethod.POST,value = "/postest")
//    public List<User> postTest(@RequestBody String name){
//        List<User> listUsers = new ArrayList<>();
//        User user;
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        try {
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            JSONObject jsonObject = JSON.parseObject(name);
//            int SerialNumber = jsonObject.getInteger("SerialNumber");
//            int MaxCount = jsonObject.getInteger("MaxCount");
//            if (jsonObject.get("SpecifiedNumber") == null) {
//                System.out.println("SpecifiedNumber is null");
//                // 返回增量
//                listUsers = userMapper.getUsers(SerialNumber, MaxCount);
//            }else{
//                int SpecifiedNumber = jsonObject.getInteger("SpecifiedNumber");
//                // 返回特定
//                user = userMapper.getById(SpecifiedNumber);
//                listUsers.add(user);
//            }
////          sqlSession.commit();
//        }finally {
//            sqlSession.close();
//        }
//       // return true;
//
//        return listUsers;
//    }

    // ---
//    @RequestMapping(method = RequestMethod.GET,value = "/TST_users/{userId}")
//    public ResponseResult getTST_User(@PathVariable int userId){
//
//        ResponseResult rr;
//
//        TST_User user = null;
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        try {
//            TstUserMapper TstUserMapper = sqlSession.getMapper(TstUserMapper.class);
//            user = TstUserMapper.getById2(userId);
//            sqlSession.commit();
//        }catch ( Exception e){
//            System.out.print(e.getMessage());
//            System.out.print("xxxxxxxxxxxxxxxxxxx");
//        }
//        finally {
//            sqlSession.close();
//        }
//

//        rr=ResponseResult.success(user);
//        // rr=ResponseResult.fail("no");
//        System.out.println(rr.msg);
//        System.out.println(rr.success);
//
//        return rr;
//    }
    // ---

    // ErrInfo -- 错误信息
   @RequestMapping(method = RequestMethod.POST,value = "/ErrInfo")
   public ResponseResult setErrInfo(@RequestBody String name) throws IOException {
       ResponseResult responseResult;
       List<LogOfImport> listLogResult = new ArrayList<>();
       MatRequestResult matRequestResult;

       SqlSession sqlSession = sqlSessionFactory.openSession();

       try {
           LogOfImportMapper logOfImportMapper = sqlSession.getMapper(LogOfImportMapper.class);
           JSONObject jsonObject = JSON.parseObject(name);
           int page = jsonObject.getInteger("page");
           listLogResult = logOfImportMapper.getErrPage(page);
           responseResult=ResponseResult.success(listLogResult);
//          sqlSession.commit();
       }finally {
           sqlSession.close();
       }
       // return true;
       // responseResult=ResponseResult.success(listMatInfor);
       //
       // responseResult=ResponseResult.fail("no");
       this.logger.info("MatRequestResult.msg: " + responseResult.msg);
       this.logger.info("MatRequestResult.Result: " + responseResult.success);
//        System.out.println(responseResult.msg);
//        System.out.println(responseResult.success);
       return responseResult;
   }
    @RequestMapping(method = RequestMethod.GET,value = "/users")
    public List<User> getUsers(){
        List<User> listUsers = null;
        //获取一个连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            //得到映射器
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //调用接口中的方法去执行xml文件中的SQL语句
            // listUsers = userMapper.getUsers();
            //要提交后才会生效
            sqlSession.commit();
        }finally {
            //最后记得关闭连接
            sqlSession.close();
        }

        return listUsers;
    }
    //这里用的是路径变量，就是{}括起来的，会当做变量读进来
    @RequestMapping(method = RequestMethod.GET,value = "/users/{userId}")
    public User getUser(@PathVariable int userId){
        User user;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            user = userMapper.getById(userId);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return user;
    }

    //RequestBody这个注解可以接收json数据
    @RequestMapping(method = RequestMethod.POST,value = "/user")
    public boolean setUser(@RequestBody String name){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            // userMapper.insert(name);
            sqlSession.commit();
        }finally {
            sqlSession.close();
            // System.out.println(name);
        }
        return true;
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/user/{userid}/{name}")
    public boolean updateUser(@PathVariable int userid,@PathVariable String name){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User(userid,name);
            userMapper.updateUser(user);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return true;
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/users")
    public boolean deleteUsers(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteAllUsers();
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return true;
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/users/{userId}")
    public boolean deleteUser(@PathVariable int userId){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteUser(userId);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return true;
    }


}
