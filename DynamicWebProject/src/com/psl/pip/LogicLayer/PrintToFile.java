package com.psl.pip.LogicLayer;

import java.io.File;
import java.util.List;

import com.psl.pip.FileUtility.FileUtility;
import com.psl.pip.dataAccessLayer.StudyPojo;

public class PrintToFile {
	
	
	public void printStudyPojoList(List<StudyPojo> dvdw_study, String File_name)
	{
		FileUtility ob = new FileUtility();
		File study = ob.createFile(File_name);
		
		ob.writeStudyPojo(dvdw_study, study);
		
	      
		
	}
	
	public void printStudyPojo(StudyPojo Study, String File_name)
	{
		FileUtility ob = new FileUtility();
		File study = ob.createFile(File_name);
		
		ob.writeStudyPojo(Study, study);
		
	
		
	}
	
	
	
	

}
