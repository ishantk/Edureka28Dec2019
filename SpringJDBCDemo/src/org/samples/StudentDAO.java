package org.samples;

import java.util.List;

import javax.sql.DataSource;

// User Defined Interface | Data Access Objects | Design Pattern (DBHelper was a DAO)
// Rule Book : Shall have various methods declared and we need to define them in the class which implements it !!
public interface StudentDAO {

	/**
	 * * This is the method to be used to initialize * database resources ie.
	 * connection.
	 */
	public void setDataSource(DataSource ds); // abstract method

	/**
	 * * This is the method to be used to create * a record in the Student
	 * table.
	 */
	public void createStudent(Integer id, String name, Integer age);
	
	public void createStudent(Student student);

	/**
	 * * This is the method to be used to list down * a record from the Student
	 * table corresponding * to a passed student id.
	 */
	public Student getStudent(Integer id);

	/**
	 * * This is the method to be used to list down * all the records from the
	 * Student table.
	 */
	public List<Student> listStudents();

	/**
	 * * This is the method to be used to delete * a record from the Student
	 * table corresponding * to a passed student id.
	 */
	public void delete(Integer id);

	/**
	 * * This is the method to be used to update * a record into the Student
	 * table.
	 */
	public void update(Integer id, Integer age);
}
