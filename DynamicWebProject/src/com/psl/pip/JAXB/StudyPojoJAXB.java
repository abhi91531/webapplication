package com.psl.pip.JAXB;

import javax.xml.bind.*;
import javax.xml.transform.Result;

import com.psl.pip.dataAccessLayer.StudyPojo;

import java.io.*;

public class StudyPojoJAXB {

	public void marshal() {
		try {

			StudyPojo pojo = new StudyPojo();
			JAXBContext jc = JAXBContext.newInstance(StudyPojo.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(pojo, (Result) System.in);
			ms.marshal(pojo, new File("src\\com.psl.pip.XML\\StudyPojo.xml"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void unmarshal() {
		try {
			JAXBContext jc = JAXBContext.newInstance(StudyPojo.class);
			Unmarshaller ums = jc.createUnmarshaller();
			StudyPojo studypojo = (StudyPojo) ums.unmarshal(new File(
					"src\\com.psl.pip.XML\\StudyPojo.xml"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
