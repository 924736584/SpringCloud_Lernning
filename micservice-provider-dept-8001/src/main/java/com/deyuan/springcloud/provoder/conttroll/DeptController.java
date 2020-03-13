package com.deyuan.springcloud.provoder.conttroll;

import com.deyuan.springcloud.api.bean.Dept;
import com.deyuan.springcloud.api.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public List<Dept> findAll()
    {
        return deptService.geteAll();
    }
}
