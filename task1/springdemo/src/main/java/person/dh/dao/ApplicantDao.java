package person.dh.dao;

import javax.sql.DataSource;

import person.dh.domain.Applicant;

/**
 * 数据访问层，直接访问数据库
 */
public interface ApplicantDao {
	/**
	 * set a datasource
	 * @param ds
	 */
	public void setDataSource(DataSource ds);
	/**
	 * insert a new record into the applicant table
	 */
	public void add(Applicant applicant);
	/**
	 * select and get a record by id
	 * @param id
	 * @return
	 */
	public Applicant getApplicant(Integer id);
	/**
	 * update a record
	 * @return
	 */
	public void update(Applicant applicant);
	/**
	 * delete a record
	 */
	public void delete(int id);
	
}
