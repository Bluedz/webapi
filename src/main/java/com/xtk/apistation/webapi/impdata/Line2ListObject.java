package com.xtk.apistation.webapi.impdata;


import com.xtk.apistation.webapi.bean.*;
//import com.xtk.apistation.webapi.mapper.*;
//import com.xtk.apistation.webapi.singleton.SingletonMybatis;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//
//import java.math.BigDecimal;

public class Line2ListObject {
//    private static SqlSessionFactory sqlSessionFactory;
//    static {
//        sqlSessionFactory =  SingletonMybatis.getSqlSessionFactory();
//    }

    String errorMeg;
    public Object tf2Object(String lineCont, String folderName){ // insertRecord = setUser
        // 行内容处理和特殊处理
        String[] arrList = lineCont.split("@");
        int arrlength = arrList.length; // name.split("@").length;
        // 去除行尾空格
        if ((" ").equals(arrList[arrlength-1])){
            arrList[arrlength-1] = null;
        }

        // tf2object
        return makeObject(arrList, folderName);

    }

    public Object makeObject( String[] arrList, String folderName){
        Object obj = new Object();
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

                obj =  tmi;
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

                obj = tms;
                break;
            }

            default :
                obj = null;
                System.out.println("未知文件路径");
        }


        return obj;
    }

//    public static void main(String[] args) {
////        String insertStr = "61@newer61";
////        String insertStr = "1@DB713404@2100@0.000@0.000@ ";
//        String insertStr = "1@DB713404@2111@0.000";
//        boolean flag = true;
//        line2ListObject tryWrDB = new line2ListObject();
//        // flag =  tryWrDB.insertRecord(insertStr);
////        flag = tryWrDB.insertRecord(insertStr, "MatFactoryAttr");
//        System.out.println("Result: " + flag);
//        System.out.println("errorMeg: " + tryWrDB.errorMeg);
//    }


}
