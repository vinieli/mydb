package com.example.mydb.controller;

import java.util.List;

import com.example.mydb.entity.Job;
import com.example.mydb.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MPController {
	
    @Autowired
	JobService jobService;	

    @RequestMapping("/jobs")
	public List<Job> showJobS() {

        List<Job> list = jobService.list();
		System.out.println("Get list has " + list.size() + " member(s)");
		list.forEach(System.out::println);

		return list;
	}
}