package com.helper;

import java.io.IOException;

public class DataReaderManager {
	
	/*
	 * 1.private constructor
	 * 
	 * 2.one static method
	 */
     private DataReaderManager() {
		// TODO Auto-generated constructor stub
	}
     static DataReaderManager drm;
     public static DataReaderManager getInstanceDRM() {
    	 if(drm==null) {
    		 drm=new DataReaderManager();
    	 }
    	 return drm;
     }
     Dataprovider dr;
     public Dataprovider getInstanceDR() throws IOException {

    	 if(dr==null) {
    		 dr=new Dataprovider();
    	 }
    	 return dr;
	}
     
}
