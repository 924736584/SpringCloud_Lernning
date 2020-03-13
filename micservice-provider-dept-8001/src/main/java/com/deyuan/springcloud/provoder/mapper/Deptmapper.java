package com.deyuan.springcloud.provoder.mapper;

import com.deyuan.springcloud.api.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Deptmapper {
    boolean addDept(Dept dept);
    Dept findById(int id);
    List<Dept> findAll();
}
