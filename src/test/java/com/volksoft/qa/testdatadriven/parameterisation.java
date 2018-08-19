package com.volksoft.qa.testdatadriven;

import com.volksoft.qa.base.Testbase;
import com.volksoft.qa.testutil.*;

import org.testng.annotations.Test;
         public class parameterisation extends Testbase{

        	 parameterisation(){
        		 super();
        	 }
	  @Test
	    public void setup(){
	    initialization();
		  // TODO Auto-generated method stup
	      //get the data from excel
	  Excel_Reader reader=new Excel_Reader("E:/TESTDATA/TestDataSuite.xlsx");
	  
	  int Rowcount=reader.getRowCount("loginpagedata");
	   String UserName=reader.getCellData("loginpagedata", "username", 2);
	   System.out.println(UserName);
	  
  }
}