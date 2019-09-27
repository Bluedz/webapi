package com.xtk.apistation.webapi.impdata;


import com.xtk.apistation.webapi.Mapper.*;
import com.xtk.apistation.webapi.bean.*;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

public class TryWrDB {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        sqlSessionFactory =  SingletonMybatis.getSqlSessionFactory();
    }

    String errorMeg;
    public boolean insertRecord(String lineCont, String folderName){ // insertRecord = setUser
        // 行内容处理和特殊处理
        String[] arrList = lineCont.split("@");
        int arrlength = arrList.length; // name.split("@").length;
        if ((" ").equals(arrList[arrlength-1])){
            arrList[arrlength-1] = null;
        }

        //
        boolean ifOk = true;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            makeObject(sqlSession, arrList, folderName);
            sqlSession.commit();
        }catch(Exception e){
            this.errorMeg = e.getMessage();
            ifOk = false;
            //throw e;
        }
        finally {
            sqlSession.close();
            // System.out.println("========= \n" + this.errorMeg);
        }
        return ifOk;
    }

    public void makeObject( SqlSession sqlSession, String[] arrList, String folderName){
        switch(folderName) {
            case "MatInfor":{
                MatBasicInformation mbi = new MatBasicInformation();
                mbi.setMid(arrList[0]);
                mbi.setAttachmentName(arrList[1]);
                mbi.setType(arrList[2]);
                mbi.setKeyMaterial(arrList[3]);
                mbi.setReplaceMaterialNum(arrList[4]);
                mbi.setEnterpriseName(arrList[5]);
                mbi.setPurchaseCycle(new BigDecimal(arrList[6]));
                mbi.setUnitPrice(new BigDecimal(arrList[7]));
                mbi.setPurchaseId(arrList[8]);
                mbi.setLocal(arrList[9]);
                mbi.setIsReparable(arrList[10]);
                mbi.setUnit(arrList[11]);
                mbi.setIsIncrease(arrList[12]);

                MatBasicInformationMapper matBasicInformationMapper = sqlSession.getMapper(MatBasicInformationMapper.class);
                matBasicInformationMapper.insert(mbi);
                // System.out.println("MatInfor");
                break;
                }
            case "MatFactoryAttr": {
                MatFactoryAttr mta = new MatFactoryAttr();
                //        mta.setTid(null);
                //        mta.setSerialNumber(null);
                mta.setMaterialNumber(arrList[0]);
                mta.setArea(arrList[1]);
                mta.setStockMax(BigDecimal.valueOf(Float.parseFloat(arrList[2]))); // BigDecimal.valueOf(0.001)
                mta.setStockMin(BigDecimal.valueOf(Float.parseFloat(arrList[3]))); //
                if (arrList[arrList.length - 1] == null) {
                    mta.setQualityAssurance(null);
                } else {
                    mta.setQualityAssurance(BigDecimal.valueOf(Float.parseFloat(arrList[4])));
                }

                MatFactoryAttrMapper matFactoryAttrMapper = sqlSession.getMapper(MatFactoryAttrMapper.class);
                matFactoryAttrMapper.insert(mta);
                break;
            }
            case "MatAccounts" : {
                MatAccounts ma = new MatAccounts();
                ma.setMaterialNumber(arrList[0]);
                ma.setBatchNumber(arrList[1]);
                ma.setLocation(arrList[2]);
                ma.setState(new BigDecimal(arrList[3]));
                ma.setUnumber(new BigDecimal(arrList[4]));
                ma.setUnitPrice(new BigDecimal(arrList[5]));
                ma.setTime(arrList[6]);
                ma.setFactory(arrList[7]);
                ma.setWorkShop(arrList[8]);
                ma.setRequestId(arrList[9]);

                MatAccountsMapper matAccountsMapper = sqlSession.getMapper(MatAccountsMapper.class);;
                matAccountsMapper.insert(ma);
//                System.out.println("MatAccounts");
                break;
            }
            case "MatPurchasingStatus" : {
                MatPurchasingStatus mps = new MatPurchasingStatus();
                mps.setRequestId(arrList[0]);
                mps.setRequestNum(arrList[1]);
                mps.setNodeStats(arrList[2]);
                mps.setNodeTime(arrList[3]);
                MatPurchasingStatusMapper matPurchasingStatusMapper = sqlSession.getMapper(MatPurchasingStatusMapper.class);
                matPurchasingStatusMapper.insert(mps);
                // System.out.println("MatPurchasingStatus");
                break;
            }
            case "MatRequestResult" : {
                MatRequestResult mrr = new MatRequestResult();
                mrr.setCustPo(arrList[0]);
                mrr.setCustResult(arrList[1]);
                mrr.setFeedbackTime(arrList[2]);
                MatRequestResultMapper matRequestResultMapper = sqlSession.getMapper(MatRequestResultMapper.class);
                matRequestResultMapper.insert(mrr);
                // System.out.println("MatRequestResult");
                break;
            }
            case "User" : {
                UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
                User re = new User();
                re.setName(arrList[arrList.length - 1]);
                re.setId(Integer.parseInt(arrList[0]));
                userMapper.insert(re);
                break;
            }
            default :
                System.out.println("未知");
        }

/*        // MatFactoryAttr
        MatFactoryAttr mta = new MatFactoryAttr();
        //        mta.setTid(null);
        //        mta.setSerialNumber(null);
        mta.setMaterialNumber("DF910002");
        mta.setArea("2100");
        mta.setStockMax(BigDecimal.valueOf(0.001));
        mta.setStockMin(BigDecimal.valueOf(0.0001));
        mta.setQualityAssurance(BigDecimal.valueOf(1));

        MatFactoryAttrMapper matFactoryAttrMapper = sqlSession.getMapper(MatFactoryAttrMapper.class);
        matFactoryAttrMapper.insert(mta);*/

/*        // user
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User re = new User();
        re.setName(arrList[arrList.length-1]);
        re.setId(Integer.parseInt(arrList[0]));
        userMapper.insert(re);*/

    }

    public static void main(String[] args) {
//        String insertStr = "61@newer61";
//        String insertStr = "1@DB713404@2100@0.000@0.000@ ";
        String insertStr = "1@DB713404@2111@0.000";
        boolean flag = true;
        TryWrDB tryWrDB = new TryWrDB();
        // flag =  tryWrDB.insertRecord(insertStr);
        flag = tryWrDB.insertRecord(insertStr, "MatFactoryAttr");
        System.out.println("Result: " + flag);
        System.out.println("errorMeg: " + tryWrDB.errorMeg);
    }


}
