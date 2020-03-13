package com.deyuan.springcloud.provoder.serviceImpl;

import com.deyuan.springcloud.api.bean.Dept;
import com.deyuan.springcloud.api.service.DeptService;
import com.deyuan.springcloud.provoder.mapper.Deptmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    Deptmapper deptmapper;


    @Override
    public List<Dept> geteAll() {
        return deptmapper.findAll();
    }
}
