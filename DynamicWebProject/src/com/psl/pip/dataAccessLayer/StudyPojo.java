package com.psl.pip.dataAccessLayer;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="StudyPojo")
public class StudyPojo implements Comparable<StudyPojo>{

	private int STUDY_KEY;
	private String STUDY_ID;
	private int THERAPEUTIC_AREA_KEY;
	private String THERAPEUTIC_AREA_NAME;
	private String DESCRIPTION;
	private String PROJECT_ID;
	private String PROJECT_NAME;
	private String STUDY_PHASE_CODE;
	private String STUDY_STATUS_CODE;
	private int CRO_KEY;
	private String ACTIVE_IND;
	private String COHORT_ENABLE_IND;
	private String STUDY_TYPE_NAME;

	
	@XmlElement 
	public int getSTUDY_KEY() {
		return STUDY_KEY;
	}

	public void setSTUDY_KEY(int sTUDY_KEY) {
		STUDY_KEY = sTUDY_KEY;
	}
	
	
	@XmlElement 
	public String getSTUDY_ID() {
		return STUDY_ID;
	}

	public void setSTUDY_ID(String sTUDY_ID) {
		STUDY_ID = sTUDY_ID;
	}
 
	@XmlElement 
	public int getTHERAPEUTIC_AREA_KEY() {
		return THERAPEUTIC_AREA_KEY;
	}

	public void setTHERAPEUTIC_AREA_KEY(int tHERAPEUTIC_AREA_KEY) {
		THERAPEUTIC_AREA_KEY = tHERAPEUTIC_AREA_KEY;
	}
	
	
	@XmlElement 
	public String getTHERAPEUTIC_AREA_NAME() {
		return THERAPEUTIC_AREA_NAME;
	}

	public void setTHERAPEUTIC_AREA_NAME(String tHERAPEUTIC_AREA_NAME) {
		THERAPEUTIC_AREA_NAME = tHERAPEUTIC_AREA_NAME;
	}
    
	@XmlElement 
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
 
	@XmlElement 
	public String getPROJECT_ID() {
		return PROJECT_ID;
	}

	public void setPROJECT_ID(String pROJECT_ID) {
		PROJECT_ID = pROJECT_ID;
	}

	@XmlElement 
	public String getPROJECT_NAME() {
		return PROJECT_NAME;
	}

	public void setPROJECT_NAME(String pROJECT_NAME) {
		PROJECT_NAME = pROJECT_NAME;
	}

	@XmlElement 
	public String getSTUDY_PHASE_CODE() {
		return STUDY_PHASE_CODE;
	}

	public void setSTUDY_PHASE_CODE(String sTUDY_PHASE_CODE) {
		STUDY_PHASE_CODE = sTUDY_PHASE_CODE;
	}
	
	@XmlElement 
	public String getSTUDY_STATUS_CODE() {
		return STUDY_STATUS_CODE;
	}

	public void setSTUDY_STATUS_CODE(String sTUDY_STATUS_CODE) {
		STUDY_STATUS_CODE = sTUDY_STATUS_CODE;
	}

	@XmlElement 
	public int getCRO_KEY() {
		return CRO_KEY;
	}

	public void setCRO_KEY(int cRO_KEY) {
		CRO_KEY = cRO_KEY;
	}
	
	@XmlElement 
	public String getACTIVE_IND() {
		return ACTIVE_IND;
	}


	public void setACTIVE_IND(String aCTIVE_IND) {
		ACTIVE_IND = aCTIVE_IND;
	}

	@XmlElement 
	public String getCOHORT_ENABLE_IND() {
		return COHORT_ENABLE_IND;
	}

	public void setCOHORT_ENABLE_IND(String cOHORT_ENABLE_IND) {
		COHORT_ENABLE_IND = cOHORT_ENABLE_IND;
	}

	@XmlElement 
	public String getSTUDY_TYPE_NAME() {
		return STUDY_TYPE_NAME;
	}

	public void setSTUDY_TYPE_NAME(String sTUDY_TYPE_NAME) {
		STUDY_TYPE_NAME = sTUDY_TYPE_NAME;
	}
	
	
	


	@Override
	public String toString() {
		return "StudyPojo [STUDY_KEY=" + STUDY_KEY + ", STUDY_ID=" + STUDY_ID
				+ ", THERAPEUTIC_AREA_KEY=" + THERAPEUTIC_AREA_KEY
				+ ", THERAPEUTIC_AREA_NAME=" + THERAPEUTIC_AREA_NAME
				+ ", DESCRIPTION=" + DESCRIPTION + ", PROJECT_ID=" + PROJECT_ID
				+ ", PROJECT_NAME=" + PROJECT_NAME + ", STUDY_PHASE_CODE="
				+ STUDY_PHASE_CODE + ", STUDY_STATUS_CODE=" + STUDY_STATUS_CODE
				+ ", CRO_KEY=" + CRO_KEY + ", ACTIVE_IND=" + ACTIVE_IND
				+ ", COHORT_ENABLE_IND=" + COHORT_ENABLE_IND
				+ ", STUDY_TYPE_NAME=" + STUDY_TYPE_NAME + "]";
	}

	public StringBuilder ToString() {
		
		StringBuilder str = new StringBuilder();
		str = str.append("STUDY_KEY-");
		str = str.append(STUDY_KEY);
		str = str.append("  ");
		str = str.append("STUDY_ID-");
		str = str.append(STUDY_ID);
		str = str.append("  ");
		str = str.append("THERAPEUTIC_AREA_KEY -");
		str = str.append(THERAPEUTIC_AREA_KEY);
		str = str.append("  ");
		str = str.append("THERAPEUTIC_AREA_NAME-");
		str = str.append(THERAPEUTIC_AREA_NAME);
		str = str.append("  ");
		str = str.append("DESCRIPTION-");
		str = str.append(DESCRIPTION);
		str = str.append("  ");
		str = str.append("PROJECT_ID-");
		str = str.append(PROJECT_ID);
		str = str.append("  ");
		str = str.append("PROJECT_NAME-");
		str = str.append(PROJECT_NAME);
		str = str.append("  ");
		str = str.append("STUDY_PHASE_CODE-");
		str = str.append(STUDY_PHASE_CODE);
		str = str.append("  ");
		str = str.append("STUDY_STATUS_CODE-");
		str = str.append(STUDY_STATUS_CODE);
		str = str.append("  ");
		str = str.append("THERAPEUTIC_AREA_KEY -");
		str = str.append(THERAPEUTIC_AREA_KEY);
		str = str.append("  ");
		str = str.append("THERAPEUTIC_AREA_NAME-");
		str = str.append(THERAPEUTIC_AREA_NAME);
		str = str.append("  ");
		str = str.append("CRO_KEY-");
		str = str.append(CRO_KEY);
		str = str.append("  ");
		str = str.append("ACTIVE_IND-");
		str = str.append(ACTIVE_IND);
		str = str.append("  ");
		str = str.append("COHORT_ENABLE_IND-");
		str = str.append(COHORT_ENABLE_IND);
		str = str.append("  ");
		str = str.append("STUDY_TYPE_NAME-");
		str = str.append(STUDY_TYPE_NAME);
		
		return str;
		
		
	}

	@Override
	public int compareTo(StudyPojo o) {
		// TODO Auto-generated method stub
		if(STUDY_ID==o.STUDY_ID)  
			return 0;  
			else if(STUDY_ID.compareTo( o.STUDY_ID)>0 ) 
			return 1;  
			else  
			return -1;  
	
	}

	
	
	
	
	
}
