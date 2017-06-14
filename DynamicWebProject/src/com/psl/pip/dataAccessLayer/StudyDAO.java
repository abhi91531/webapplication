package com.psl.pip.dataAccessLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.IOException;
import java.sql.*;

import com.psl.pip.DataConnectingLayer.DataManager;

//Create a separate package as "dataaccess" for all "dataaccess.dao" and "dataaccess.pojo"

//Add comments for class (feature) and all the methods
//2. Print meaningful log statements in try/catch
//3. Always close the DB resources and in finally block
//Always follow try, catch and finally.
//don't share the connection obj for all the methods
//Define SQLs as constants for now. However, they should be read from some files e.g. SQL
//Always prefer prepared statement over statement
//Always print execution status for DML
//Follow good indentation - coding standards

//Instead create a class as MetadataDAO and all the metdata methods  for all attributes
//extractTA/getDistinctTA e.g
//StudyDAOHelper => Processing of the RS
public class StudyDAO implements StudyableDAOable

{
	private Connection conn = null;

	public List<StudyPojo> getAllRows() {

		List<StudyPojo> rows = new ArrayList<StudyPojo>();

		DataManager ob = new DataManager();
		try {
			conn = ob.getConnection();

			PreparedStatement preparedStatement = null;

			ResultSet rs = null;

			try {

				String query = "select STUDY_KEY,STUDY_ID ,THERAPEUTIC_AREA_KEY,THERAPEUTIC_AREA_NAME	,DESCRIPTION ,	PROJECT_ID	,"
						+ "PROJECT_NAME , STUDY_PHASE_CODE , STUDY_STATUS_CODE, CRO_KEY, ACTIVE_IND, COHORT_ENABLE_IND, STUDY_TYPE_NAME"
						+ " from DVDW_STUDY";

				preparedStatement = conn.prepareStatement(query);

				rs = preparedStatement.executeQuery();

				int size = 0;

				while (rs.next()) {
					StudyPojo row = new StudyPojo();

					int STUDY_KEY = rs.getInt("STUDY_KEY");
					String STUDY_ID = rs.getString("STUDY_ID");
					int THERAPEUTIC_AREA_KEY = rs
							.getInt("THERAPEUTIC_AREA_KEY");
					String THERAPEUTIC_AREA_NAME = rs
							.getString("THERAPEUTIC_AREA_NAME");
					String DESCRIPTION = rs.getString("DESCRIPTION");
					String PROJECT_ID = rs.getString("PROJECT_ID");
					String PROJECT_NAME = rs.getString("PROJECT_NAME");
					String STUDY_PHASE_CODE = rs.getString("STUDY_PHASE_CODE");
					String STUDY_STATUS_CODE = rs
							.getString("STUDY_STATUS_CODE");
					int CRO_KEY = rs.getInt("CRO_KEY");
					String ACTIVE_IND = rs.getString("ACTIVE_IND");
					String COHORT_ENABLE_IND = rs
							.getString("COHORT_ENABLE_IND");
					String STUDY_TYPE_NAME = rs.getString("STUDY_TYPE_NAME");

					row.setSTUDY_KEY(STUDY_KEY);
					row.setSTUDY_ID(STUDY_ID);
					row.setTHERAPEUTIC_AREA_KEY(THERAPEUTIC_AREA_KEY);
					row.setTHERAPEUTIC_AREA_NAME(THERAPEUTIC_AREA_NAME);
					row.setDESCRIPTION(DESCRIPTION);
					row.setPROJECT_ID(PROJECT_ID);
					row.setPROJECT_NAME(PROJECT_NAME);
					row.setSTUDY_PHASE_CODE(STUDY_PHASE_CODE);
					row.setSTUDY_STATUS_CODE(STUDY_STATUS_CODE);
					row.setCRO_KEY(CRO_KEY);
					row.setACTIVE_IND(ACTIVE_IND);
					row.setCOHORT_ENABLE_IND(COHORT_ENABLE_IND);
					row.setSTUDY_TYPE_NAME(STUDY_TYPE_NAME);

					rows.add(row);
					size++;
					// System.out.println(row.toString());

				}

				// System.out.println(size +
				// " Rows copied to array Linked List");
				rs.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rs != null)
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (preparedStatement != null)
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				conn=null;
				System.out.println("Connection close");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rows;

	}

	// TODO
	// getTherapeuticAreaMetadata ()
	// Indication
	// Project
	// phase
	// status etc....
	// Use distinct clause in SQL

	@Override
	public void deleteRow(int STUDY_KEY) {

		DataManager ob = new DataManager();
		try {
			conn = ob.getConnection();
			PreparedStatement preparedStatement = null;

			try {
				String query = "delete from DVDW_STUDY where STUDY_KEY=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setInt(1, STUDY_KEY);
				int rows = preparedStatement.executeUpdate();
				System.out.println("Number of rows deleted" + rows);
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();

			} finally {

				if (preparedStatement != null)
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				System.out.println("Connection close");
				System.out
						.println("Cannot delete due to foreign key dependencies");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public StudyPojo getRowById(int STUDY_KEY) {

		StudyPojo row = new StudyPojo();
		DataManager ob = new DataManager();
		try {
			conn = ob.getConnection();
			PreparedStatement preparedStatement = null;
			ResultSet rs = null;
			try {
				String query = "select STUDY_KEY,STUDY_ID ,THERAPEUTIC_AREA_KEY,THERAPEUTIC_AREA_NAME	,DESCRIPTION ,	PROJECT_ID	,"
						+ "PROJECT_NAME , STUDY_PHASE_CODE , STUDY_STATUS_CODE, CRO_KEY, ACTIVE_IND, COHORT_ENABLE_IND, STUDY_TYPE_NAME"
						+ " from DVDW_STUDY where STUDY_KEY = ? ";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setInt(1, STUDY_KEY);
				rs = preparedStatement.executeQuery();
				while (rs.next()) {
					int STUDY_KEYm = rs.getInt("STUDY_KEY");
					String STUDY_ID = rs.getString("STUDY_ID");
					int THERAPEUTIC_AREA_KEY = rs
							.getInt("THERAPEUTIC_AREA_KEY");
					String THERAPEUTIC_AREA_NAME = rs
							.getString("THERAPEUTIC_AREA_NAME");
					String DESCRIPTION = rs.getString("DESCRIPTION");
					String PROJECT_ID = rs.getString("PROJECT_ID");
					String PROJECT_NAME = rs.getString("PROJECT_NAME");
					String STUDY_PHASE_CODE = rs.getString("STUDY_PHASE_CODE");
					String STUDY_STATUS_CODE = rs
							.getString("STUDY_STATUS_CODE");
					int CRO_KEY = rs.getInt("CRO_KEY");
					String ACTIVE_IND = rs.getString("ACTIVE_IND");
					String COHORT_ENABLE_IND = rs
							.getString("COHORT_ENABLE_IND");
					String STUDY_TYPE_NAME = rs.getString("STUDY_TYPE_NAME");

					row.setSTUDY_KEY(STUDY_KEYm);
					row.setSTUDY_ID(STUDY_ID);
					row.setTHERAPEUTIC_AREA_KEY(THERAPEUTIC_AREA_KEY);
					row.setTHERAPEUTIC_AREA_NAME(THERAPEUTIC_AREA_NAME);
					row.setDESCRIPTION(DESCRIPTION);
					row.setPROJECT_ID(PROJECT_ID);
					row.setPROJECT_NAME(PROJECT_NAME);
					row.setSTUDY_PHASE_CODE(STUDY_PHASE_CODE);
					row.setSTUDY_STATUS_CODE(STUDY_STATUS_CODE);
					row.setCRO_KEY(CRO_KEY);
					row.setACTIVE_IND(ACTIVE_IND);
					row.setCOHORT_ENABLE_IND(COHORT_ENABLE_IND);
					row.setSTUDY_TYPE_NAME(STUDY_TYPE_NAME);
				}
				rs.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rs != null)
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (preparedStatement != null)
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				System.out.println("Connection close");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}

	@Override
	public void updateRow(StudyPojo row) {

		DataManager ob = new DataManager();
		try {
			conn = ob.getConnection();
			PreparedStatement preparedStatement = null;
			try {
				String query = "update DVDW_STUDY set STUDY_KEY =?,STUDY_ID =? ,THERAPEUTIC_AREA_KEY=?,THERAPEUTIC_AREA_NAME =?, DESCRIPTION =? ,	PROJECT_ID =?	,"
						+ "PROJECT_NAME =? , STUDY_PHASE_CODE =? , STUDY_STATUS_CODE =?, CRO_KEY =?, ACTIVE_IND =?, COHORT_ENABLE_IND =?, STUDY_TYPE_NAME =?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setInt(1, row.getSTUDY_KEY());
				preparedStatement.setString(2, row.getSTUDY_ID());
				preparedStatement.setInt(3, row.getTHERAPEUTIC_AREA_KEY());
				preparedStatement.setString(4, row.getTHERAPEUTIC_AREA_NAME());
				preparedStatement.setString(5, row.getDESCRIPTION());
				preparedStatement.setString(6, row.getPROJECT_ID());
				preparedStatement.setString(7, row.getPROJECT_NAME());
				preparedStatement.setString(8, row.getSTUDY_PHASE_CODE());
				preparedStatement.setString(9, row.getSTUDY_STATUS_CODE());
				preparedStatement.setInt(10, row.getCRO_KEY());
				preparedStatement.setString(11, row.getACTIVE_IND());
				preparedStatement.setString(12, row.getCOHORT_ENABLE_IND());
				preparedStatement.setString(13, row.getSTUDY_TYPE_NAME());

				preparedStatement.executeUpdate();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

				if (preparedStatement != null)
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				System.out.println("Connection close");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void addRow(StudyPojo row) {

		DataManager ob = new DataManager();
		try {
			conn = ob.getConnection();
			PreparedStatement preparedStatement = null;
			try {
				String query = "insert into DVDW_STUDY (STUDY_KEY,STUDY_ID ,THERAPEUTIC_AREA_KEY,THERAPEUTIC_AREA_NAME,DESCRIPTION,PROJECT_ID,PROJECT_NAME, STUDY_PHASE_CODE, STUDY_STATUS_CODE, CRO_KEY, ACTIVE_IND, COHORT_ENABLE_IND, STUDY_TYPE_NAME) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setInt(1, row.getSTUDY_KEY());
				preparedStatement.setString(2, row.getSTUDY_ID());
				preparedStatement.setInt(3, row.getTHERAPEUTIC_AREA_KEY());
				preparedStatement.setString(4, row.getTHERAPEUTIC_AREA_NAME());
				preparedStatement.setString(5, row.getDESCRIPTION());
				preparedStatement.setString(6, row.getPROJECT_ID());
				preparedStatement.setString(7, row.getPROJECT_NAME());
				preparedStatement.setString(8, row.getSTUDY_PHASE_CODE());
				preparedStatement.setString(9, row.getSTUDY_STATUS_CODE());
				preparedStatement.setInt(10, row.getCRO_KEY());
				preparedStatement.setString(11, row.getACTIVE_IND());
				preparedStatement.setString(12, row.getCOHORT_ENABLE_IND());
				preparedStatement.setString(13, row.getSTUDY_TYPE_NAME());

				preparedStatement.executeUpdate();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();

			} finally {

				if (preparedStatement != null)
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				System.out.println("Connection close");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public List<Therapeutic_AreaPojo> getTherapeuticAreaMetadata() {
		List<Therapeutic_AreaPojo> TAs = new ArrayList<Therapeutic_AreaPojo>();
		DataManager ob = new DataManager();
		try {
			conn = ob.getConnection();
			PreparedStatement preparedStatement = null;
			ResultSet rs = null;
			try {

				String query = "select distinct THERAPEUTIC_AREA_NAME from DVDW_STUDY";
				preparedStatement = conn.prepareStatement(query);
				rs = preparedStatement.executeQuery();
				while (rs.next()) {
					Therapeutic_AreaPojo TA = new Therapeutic_AreaPojo();

					String THERAPEUTIC_AREA_NAME = rs
							.getString("THERAPEUTIC_AREA_NAME");

					TA.setTHERAPEUTIC_AREA_NAME(THERAPEUTIC_AREA_NAME);

					TAs.add(TA);
					System.out.println(TA.toString());

				}
				rs.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rs != null)
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (preparedStatement != null)
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				System.out.println("Connection close");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return TAs;

	}

	public List<CRO_pojo> getCROMetadata() {

		List<CRO_pojo> cros = new ArrayList<CRO_pojo>();
		DataManager ob = new DataManager();
		try {
			conn = ob.getConnection();
			PreparedStatement preparedStatement = null;
			ResultSet rs = null;
			try {

				String query = "select distinct CRO_KEY from DVDW_STUDY";
				preparedStatement = conn.prepareStatement(query);
				rs = preparedStatement.executeQuery();
				while (rs.next()) {
					CRO_pojo cro = new CRO_pojo();

					int CRO_KEY = rs.getInt("CRO_KEY");

					cro.setCRO_KEY(CRO_KEY);

					cros.add(cro);
					System.out.println(cro.toString());

				}
				rs.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rs != null)
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (preparedStatement != null)
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				System.out.println("Connection close");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cros;

	}

	public void sortByStudyID(List<StudyPojo> study) {

		Collections.sort(study);
		for (StudyPojo st : study) {
			System.out.println(st.toString());
		}

	}

}
