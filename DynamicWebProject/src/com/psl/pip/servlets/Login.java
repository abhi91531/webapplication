package com.psl.pip.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psl.pip.DataConnectingLayer.DataManager;
import com.psl.pip.LogicLayer.PrintToFile;
import com.psl.pip.LogicLayer.Sorting;
import com.psl.pip.dataAccessLayer.StudyDAO;
import com.psl.pip.dataAccessLayer.StudyPojo;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void service(HttpServletRequest request, HttpServletResponse response) {
     
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		
	    if(Username.equalsIgnoreCase("admin")&&Password.equalsIgnoreCase("password"))
	    {
	    	
	    }
		
		
		
		
//		try {
//			
//			System.out.println("inside service");
//			PrintWriter out = response.getWriter();
//			System.out.println("after printwriter");
//			List<StudyPojo> rows = new ArrayList<StudyPojo>();
//			StudyDAO  ob =new StudyDAO();
//			System.out.println("after object formation");
////			StudyPojo st = new StudyPojo();
////			st.setSTUDY_KEY(123);
////			st.setSTUDY_ID("efr1002"); st.setTHERAPEUTIC_AREA_KEY(23); st.setTHERAPEUTIC_AREA_NAME("cancer");st.setDESCRIPTION("oncolody");
////			st.setPROJECT_ID("qwe4556"); st.setPROJECT_NAME("hetfjurw");
//			
//			String str="<table><tr><th>  STUDY_KEY  </th>"
//					+ "<th>STUDY_ID</th><th>THERAPEUTIC_AREA_KEY</th>"
//					+ "<th>THERAPEUTIC_AREA_NAME</th><th>DESCRIPTION</th>"
//					+ "<th>PROJECT_ID</th<th>PROJECT_NAME</th>></tr>";
//			
//			System.out.println("after jsp page");
//			
////			str= str+"<tr><td>"+ st.getSTUDY_KEY()+"</td>"
////			+ "<td>"+st.getSTUDY_ID()+"</td>"+ "<td>"+st.getTHERAPEUTIC_AREA_KEY()+"</td>"
////			+ "<td>"+st.getTHERAPEUTIC_AREA_NAME()+"</td>"+ "<td>"+st.getDESCRIPTION()+"</td>"
////			+ "<td>"+st.getPROJECT_ID()+"</td>"+ "<td>"+st.getPROJECT_NAME()+"</td></tr>";	
//	         
//			rows= ob.getAllRows();	
//			System.out.println(" rows all after jsp page");
//	
//		for (StudyPojo st : rows) {
//			
//			str= str+"<tr><td>"+ st.getSTUDY_KEY()+"</td>"
//					+ "<td>"+st.getSTUDY_ID()+"</td>"+ "<td>"+st.getTHERAPEUTIC_AREA_KEY()+"</td>"
//					+ "<td>"+st.getTHERAPEUTIC_AREA_NAME()+"</td>"+ "<td>"+st.getDESCRIPTION()+"</td>"
//					+ "<td>"+st.getPROJECT_ID()+"</td>"+ "<td>"+st.getPROJECT_NAME()+"</td></tr>";
//         
//		}
//		
//		str = str +"</table>";
//
//		
//		out.println(str);
//		  
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

}
	
//            @Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//            	service(req,resp);
//
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		    service(req,resp);
	}


            
 
}
