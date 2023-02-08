package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		
		//insert query
	       String query="insert into student(id,name,city) values (?,?,?)";
		int update = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return update;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int change(Student student) {
		//updating data
		String query="update student set name=? ,city=? where id=?";
		int update = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return update;
	}
	@Override
	public int delete(int studentId) {
		//Delete operation
		String query="delete from student where id=?";
		int d = this.jdbcTemplate.update(query,studentId);
		return d;
	}
	@Override
	public Student getStudent(int studentId) {
		//Select single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student queryForObject = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		
		// if we dont to create other rowmapper class so use annonymous class
		/*
		 * Student queryForObject = (Student) this.jdbcTemplate.queryForObject(query,new
		 * RowMapper() {
		 * 
		 * @Override public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		 * { Student st=new Student(); st.setId(rs.getInt(1));
		 * st.setName(rs.getString(2)); st.setCity(rs.getString(3)); return st; }
		 * 
		 * },studentId);
		 */
		return queryForObject;
	}
	@Override
	public List<Student> getAllStudent() {
		// Select multiple student
		
		String query="select * from student";
		List<Student> query2 = this.jdbcTemplate.query(query,new RowMapperImpl());
		return query2;
	}

	

}
