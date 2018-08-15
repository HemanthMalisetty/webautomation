package Unicorn;

import Helpers.ExcelUtility;
import Helpers.Session;

import java.util.Map;

public class UnicornExcel {
    //String key;
    public Map<String,String> excelData;
    public String UserName, Password, BoardId;

    public UnicornExcel(String header) {
        excelData= ExcelUtility.getDataFromVerticalSheetMap(ExcelUtility.Unicorn, Session.getEnv().toUpperCase(),header);

        setExcelData();

    }

    private void setExcelData() {
        UserName = excelData.get("UserName");
        Password = excelData.get("Password");
        BoardId = excelData.get("Board Id");
    }
}