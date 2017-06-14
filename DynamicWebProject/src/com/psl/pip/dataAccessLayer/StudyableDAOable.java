package com.psl.pip.dataAccessLayer;
import java.io.IOException;
import java.util.List;
//Add comments for class (feature) and all the methods
//Give meaningful method names e.g. getAllStudies etc..
public interface StudyableDAOable {

	
	 public List<StudyPojo> getAllRows() throws IOException;
	   public StudyPojo getRowById(int STUDY_KEY) throws IOException;
	   public void updateRow(StudyPojo row) throws IOException;
	   public void deleteRow(int STUDY_KEY) throws IOException;
	   public void addRow(StudyPojo row) throws IOException;
	   public List<Therapeutic_AreaPojo> getTherapeuticAreaMetadata () throws IOException;
	   public List<CRO_pojo> getCROMetadata () throws IOException;
}
