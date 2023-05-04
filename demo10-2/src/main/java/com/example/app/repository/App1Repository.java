package com.example.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.app.model.App1Model;

@Repository
public interface App1Repository extends JpaRepository<App1Model,Integer>
{
	//positional parameter
		@Query("Select a from App1Model a where a.department=?1 and a.name=?2")
		public List<App1Model> getStudentsByDepartment(String dept,String name);
		
		//named parameter
		@Query("Select a from App1Model a where a.department=:dept")
		public List<App1Model> getStudentsByDepartment(String dept);
		
		//DML
		@Modifying
		@Query("delete from App1Model a where a.name=?1")
		public int deleteStudentByName(String name);
		
		@Modifying
		@Query("update App1Model a set a.department=?1 where a.name=?2")
		public int updateStudentByName(String department,String name);
		
		@Query(value="select * from Student  s where  s.email= ?1",nativeQuery=true)
		public List<App1Model> fetchStudentByMail(String  mail);
		
		List<App1Model>findByNameStartingWith(String prefix);
		List<App1Model>findByNameEndingWith(String sufix);
		List<App1Model>findByDepartment(String dept);
}
