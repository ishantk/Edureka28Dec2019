package org.samples;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

// One Record of Table is mapped to One Student Object
public class StudentMapper implements RowMapper<Student> { 
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		
		return student;
	}
}
