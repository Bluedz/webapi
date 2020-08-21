package com.xtk.apistation.webapi.impdata;


import com.xtk.apistation.webapi.mapper.*;
import com.xtk.apistation.webapi.bean.*;
import com.xtk.apistation.webapi.singleton.SingletonMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.math.BigDecimal;

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
            // TPMS+
            case "tst_tpms_Matinfo":{
                TpmsMatInfo tmi = new TpmsMatInfo();
                tmi.setDcMatnum(arrList[0]);
                tmi.setSvwMatnum(arrList[1]);
                tmi.setUnit(arrList[2]);
                tmi.setDescSpec(arrList[3]);
                tmi.setOgSpec(arrList[4]);
                tmi.setMfr(arrList[5]);
                tmi.setMfrNo(arrList[6]);
                tmi.setEquipMfr(arrList[7]);
                tmi.setEquipMfrNo(arrList[8]);
                tmi.setEquipNo(arrList[9]);
                tmi.setDiagramNo(arrList[10]);
                tmi.setProdCodeDesc(arrList[11]);
                tmi.setAbcCode(arrList[12]);
                tmi.setPlannerCode(arrList[13]);

                TpmsMatInfoMapper tpmsMatInfoMapper = sqlSession.getMapper(TpmsMatInfoMapper.class);
                tpmsMatInfoMapper.insertFrTxt(tmi);
                // System.out.println("tst_tpms_Matinfo");
                break;
            }
            case "tst_tpms_Matstri":{
                TpmsMatStri tms = new TpmsMatStri();
                tms.setFactoryCo(arrList[0]);
                tms.setFactoryName(arrList[1]);
                tms.setDcMaterialNo(arrList[2]);
                tms.setSvwMaterialNo(arrList[3]);
                tms.setMinSafetyStock(arrList[4]);
                tms.setMaxSafetyStock(arrList[5]);
                tms.setRefPrice(arrList[6]);
                tms.setTotalInventory(arrList[7]);
                tms.setSharing(arrList[8]);
                tms.setSafetyId(arrList[9]);
                tms.setPlaceOfProduction(arrList[10]);
                tms.setTotalCollection(arrList[11]);
                tms.setAnnualConsumption(arrList[12]);
                tms.setAnnualCollectionTimes(arrList[13]);
                tms.setHistoricalCollectionQuantity(arrList[14]);
                tms.setMaterialAttribute(arrList[15]);
                tms.setRemarks(arrList[16]);
                tms.setAttribute(arrList[17]);
                tms.setPhoto(arrList[18]);
                tms.setPurchaseCycle(arrList[19]);

                TpmsMatStriMapper tpmsMatStriMapper = sqlSession.getMapper(TpmsMatStriMapper.class);
                tpmsMatStriMapper.insertFrTxt(tms);
                // System.out.println("tst_tpms_Matinfo");
                break;
            }
            // TPMS-
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
                mps.setFeedbackInfo("");
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
                mrr.setFeedbackInfo(arrList[3]);
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
