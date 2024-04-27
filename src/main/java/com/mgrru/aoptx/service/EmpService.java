package com.mgrru.aoptx.service;

import com.mgrru.aoptx.dao.IEmp;
import com.mgrru.aoptx.vo.Emp;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Resource(name = "IEmp")
    private IEmp iEmp;

    public void addEmp(Emp emp) {
        iEmp.add(emp);
        System.out.println("添加emp");
    }
}
