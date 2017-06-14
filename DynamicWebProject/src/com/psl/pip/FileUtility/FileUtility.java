package com.psl.pip.FileUtility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.psl.pip.dataAccessLayer.StudyPojo;

public class FileUtility {
	
	BufferedWriter bw = null;
	FileWriter fw = null;
	

	public File createFile(String name) {
		File f = null;
		boolean bool = false;

		try {

			// create new file
			f = new File(name);

			// tries to create new file in the system
			bool = f.createNewFile();

			// prints
			System.out.println("File created: " + bool);
			// deletes file from the system
			f.delete();

			// delete() is invoked
			System.out.println("delete() method is invoked");

			// tries to create new file in the system
			bool = f.createNewFile();

			// print
			System.out.println("File created: " + bool);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}
	
	public void writeStudyPojo(List<StudyPojo> dvdw , File file)  {

		 bw = null;
		 fw = null;
			try {
				fw = new FileWriter(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bw = new BufferedWriter(fw);

			String str = dvdw.toString();
			try {
				bw.write(str);

			bw.newLine();
			bw.newLine();
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		}

	public void writeStudyPojo(StudyPojo study, File file)  {

	 bw = null;
	 fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bw = new BufferedWriter(fw);

		String str = study.toString();
		try {
			bw.write(str);

		bw.newLine();
		bw.newLine();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}
	


	// public void writeStudyPojo(StudyPojo ob, File file) {
	//
	// FileOutputStream fout = null;
	// ObjectOutputStream oos = null;
	//
	// try {
	//
	// fout = new FileOutputStream(file);
	// oos = new ObjectOutputStream(fout);
	// oos.writeObject(object);
	//
	// System.out.println("Done");
	//
	// } catch (Exception ex) {
	//
	// ex.printStackTrace();
	//
	// } finally {
	//
	// if (fout != null) {
	// try {
	// fout.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// if (oos != null) {
	// try {
	// oos.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// }
	// }

}
