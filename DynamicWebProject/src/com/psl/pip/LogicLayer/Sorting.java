package com.psl.pip.LogicLayer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.psl.pip.dataAccessLayer.StudyPojo;

public class Sorting {

	public static Comparator<StudyPojo> THERAPEUTIC_AREA_KEYComparator = new Comparator<StudyPojo>() {

		@Override
		public int compare(StudyPojo o1, StudyPojo o2) {
			return (int) (o1.getTHERAPEUTIC_AREA_KEY() - o2
					.getTHERAPEUTIC_AREA_KEY());
		}
	};

	public static Comparator<StudyPojo> PROJECT_NAMEComparator = new Comparator<StudyPojo>() {

		@Override
		public int compare(StudyPojo o1, StudyPojo o2) {
			return o1.getPROJECT_NAME().compareTo(o2.getPROJECT_NAME());
		}

	};

	public void sortByStudyID(List<StudyPojo> study) {

		Collections.sort(study);
		for (StudyPojo st : study) {
			System.out.println(st.toString());
		}

	}

	public void sortByTHERAPEUTIC_AREA_KEY(List<StudyPojo> study) {

		Collections.sort(study, THERAPEUTIC_AREA_KEYComparator);
		for (StudyPojo st : study) {
			System.out.println(st.toString());
		}

	}

	public void sortByPROJECT_NAME(List<StudyPojo> study) {

		Collections.sort(study, PROJECT_NAMEComparator);
		for (StudyPojo st : study) {
			System.out.println(st.toString());
		}

	}

}
