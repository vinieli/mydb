package com.example.mydb.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mydb.entity.Job;
import com.example.mydb.mapper.JobMapper;

import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements JobService{
    
}
