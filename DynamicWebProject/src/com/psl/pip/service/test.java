package com.psl.pip.service;

import java.util.ArrayList;
import java.util.List;

import com.psl.pip.dataAccessLayer.StudyDAO;
import com.psl.pip.dataAccessLayer.StudyPojo;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<StudyPojo> rows = new ArrayList<StudyPojo>();
		StudyDAO  ob =new StudyDAO();
		rows= ob.getAllRows();	
		
		for (StudyPojo st : rows) {
			System.out.println(st.toString());
		}

		
	}

}
