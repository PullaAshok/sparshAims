package com.volksoft.qa.testutil;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.volksoft.qa.base.*;
public class TestUtil extends Testbase {
	public static long PageloadTimeOut=20;
	public static int ImpliciteWait=10;
	
	static Excel_Reader reader;
	
	public static ArrayList<Object[]> getdatafromExcel () {
		
		ArrayList<Object[]> exceldata=new ArrayList<Object[]>();
		try{
			reader=new Excel_Reader("D:\\workspaceeTestData suite.xlsx");
		}catch(Exception e){
			e.printStackTrace();
		   }
		
		
		for(int rownum=2; rownum<=reader.getRowCount("logindata"); rownum++){
			
			String userName=reader.getCellData("logindata", "username", rownum);
			String password=reader.getCellData("logindata", "password", rownum);
			//Object[] is used to store different types of multiple objects
			//Object[] data=new Object[2];
			//data[0]="ashok";
			//data[1]="5";
			Object[] data={userName,password};  //Object array storing the elements and adding to Arraylist
			
			exceldata.add(data);
		}
		
		return exceldata;
		
	  }
	
	
	
	
  }
