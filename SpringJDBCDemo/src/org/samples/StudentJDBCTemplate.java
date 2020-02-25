package org.samples;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

// All the methods of StudentDAO interface must be defined here
public class StudentJDBCTemplate implements StudentDAO {
	
	// Attributes
	// Dependencies : HAS-A Relationship
	private DataSource dataSource;			// DataSource will create JDBCTemplate Object
	private JdbcTemplate jdbcTemplate;       // API from SpringFW to perform ALL DB Operations

	// setter injection for dataSource (information about db connection in beans.xml file)
	public void setDataSource(DataSource  dataSource) { 
		this.dataSource = dataSource;
		
		// creating JdbcTemplate Object from dataSource
		jdbcTemplate = new JdbcTemplate(dataSource); // Data Source is passed as an input
	}

	public void createStudent(Integer id, String name, Integer age) {
		String SQL = "insert into Student (id, name, age) values (?, ?, ?)"; // PreparedStatement of JDBC
		jdbcTemplate.update(SQL, id, name, age);
		System.out.println("Created Record Name=" + name + " Age=" + age);
	}
	
	public void createStudent(Student s) {
		String SQL = "insert into Student (id, name, age) values (?,?,?)"; // PreparedStatement of JDBC
		jdbcTemplate.update(SQL, s.getId(), s.getName(), s.getAge());
		System.out.println("Created Record Name=" + s.getId() + " Age=" + s.getAge());
	}

	// Retrieve Single Record
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplate.queryForObject(SQL,
				new Object[] { id }, new StudentMapper());
		return student;
	}

	// Retrieve Multiple Records
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplate.query(SQL,
				new StudentMapper());
		return students;
	}

	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
	}

	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplate.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
	}	
}
