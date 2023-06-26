package com.academy.cic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.academy.cic.model.Course;
import com.academy.cic.model.Registration;
import com.academy.cic.model.Student;
import com.academy.cic.model.StudentNumCourses;
import com.academy.cic.util.JdbcUtil;

public class Dao {

	public void insertStudent(Student student) throws SQLException {
		String query =  "INSERT INTO STUDENT(id,first_name,last_name,age) values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);

			pst.setInt(1, student.getId());
			pst.setString(2, student.getFirstName());
			pst.setString(3, student.getLastName());
			pst.setInt(4, student.getAge());

			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
		}	
	}

	public void insertCourse(Course course) throws SQLException {
		String query =  "INSERT INTO COURSE(id,name) values(?,?)";
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);

			pst.setInt(1, course.getId());
			pst.setString(2, course.getName());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
		}	
	}
	 
	public void registryStudentCourse(Registration registration) throws SQLException {
		String query = "INSERT INTO REGISTRATION(id,student_id,course_id,grade) values(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);

			pst.setInt(1, registration.getId());
			pst.setInt(2, registration.getStudent().getId());
			pst.setInt(3, registration.getCourse().getId());
			pst.setInt(4, registration.getGrade());

			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
		}	
	}
	
	public Student selectByNameSurname(String name, String surname) throws SQLException {
		String query = "SELECT * FROM STUDENT WHERE first_name=? AND last_name=?";
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;	
		Student student = null;
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);
			
			pst.setString(1, name);
			pst.setString(2, surname);
			
			rs = pst.executeQuery();
			if(rs.next()) {
				student = new Student(
						rs.getInt("id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("age")
						);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
			JdbcUtil.closeResultSet(rs);

		}
		return student;
	}

	public void updateCourseGradeById(int registrationId, int grade) throws SQLException {
		String query = "UPDATE REGISTRATION SET grade = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);
			
			pst.setInt(1, grade);
			pst.setInt(2, registrationId);
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
		}
	}
	
	public List<Course> findStudentCourses(int studentId) throws SQLException{
		String query = "SELECT c.* FROM COURSE c, REGISTRATION r "
				+ "WHERE c.id = r.course_id and r.student_id = ?";
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Course> list = null;
		
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);
			
			pst.setInt(1, studentId);
			
			rs = pst.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				list.add(new Course(rs.getInt("id"),rs.getString("name")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
			JdbcUtil.closeResultSet(rs);

		}
		
		return list;
	}
	
	public List<StudentNumCourses> findStudentIdNumCourses() throws SQLException{
		String query = "SELECT r.student_id, count(r.student_id) as NumCourses from REGISTRATION r group by r.student_id";		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<StudentNumCourses> list = null;
		
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);
			
			
			rs = pst.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				list.add(new StudentNumCourses(new Student(rs.getInt("student_id")), rs.getInt("NumCourses")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
			JdbcUtil.closeResultSet(rs);

		}
		
		return list;
	}
	
	
	public List<StudentNumCourses> findStudentDataNumCourses() throws SQLException{
		String query = "SELECT s.*, count(r.student_id)as NumCourses from STUDENT s, REGISTRATION r WHERE s.id = r.student_id group by s.id";		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<StudentNumCourses> list = null;
		
		try {
			conn = JdbcUtil.getConnection();
			pst = conn.prepareStatement(query);
			
			
			rs = pst.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				list.add(new StudentNumCourses(new Student(rs.getInt("id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("age")),
						rs.getInt("NumCourses")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.closePreparedStatement(pst);
			JdbcUtil.closeConnection(conn);
			JdbcUtil.closeResultSet(rs);
		}
		
		return list;
	}

}
