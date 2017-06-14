package com.psl.pip.dataAccessLayer;

import java.io.Serializable;

public class CRO_pojo implements Serializable {

	private int CRO_KEY;
	

	public int getCRO_KEY() {
		return CRO_KEY;
	}

	public void setCRO_KEY(int cRO_KEY) {
		CRO_KEY = cRO_KEY;
	}

	@Override
	public String toString() {
		return "CRO_pojo [CRO_KEY=" + CRO_KEY + "]";
	}

	

	

}
