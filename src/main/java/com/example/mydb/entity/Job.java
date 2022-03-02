package com.example.mydb.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("post_job")
public class Job {
    private Integer id;
    private String position;
    private Integer count;
    private String place;
}
