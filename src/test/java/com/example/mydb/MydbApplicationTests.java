package com.example.mydb;

import java.util.List;

import com.example.mydb.entity.Job;
import com.example.mydb.mapper.JobMapper;
import com.example.mydb.service.JobService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MydbApplicationTests {

	@Test
	void contextLoads() {	
	}
	// fisrt call from Mapper
	@Autowired 
	JobMapper jobMapper;

	@Test 
	public void testJobMapper() {
		System.out.println("fisrt call from Mapper");
		Job job = jobMapper.selectById(1);
		System.out.println(job);
	}

	//second call from IService
	@Autowired
	JobService jobService;

	@Test
	public void testIService()
	{
		System.out.println("second call from IService");
		List<Job> list = jobService.list();
		System.out.println("Get list has " + list.size() + " member(s)");
		list.forEach(System.out::println);
		Job  job = list.get(0);
		System.out.println("Job info: " + job.getId() + job.getPosition() 
							+ job.getCount() + job.getPlace());
	}

}
