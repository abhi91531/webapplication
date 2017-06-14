package com.psl.pip.dataAccessLayer;

public class Therapeutic_AreaPojo {

	private String THERAPEUTIC_AREA_NAME;
	
	

	public String getTHERAPEUTIC_AREA_NAME() {
		return THERAPEUTIC_AREA_NAME;
	}



	public void setTHERAPEUTIC_AREA_NAME(String tHERAPEUTIC_AREA_NAME) {
		THERAPEUTIC_AREA_NAME = tHERAPEUTIC_AREA_NAME;
	}



	@Override
	public String toString() {
		return "Therapeutic_AreaPojo [THERAPEUTIC_AREA_NAME="
				+ THERAPEUTIC_AREA_NAME + "]";
	}

}
