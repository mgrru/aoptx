package com.mgrru.aoptx.advice;

import com.mgrru.aoptx.dao.ILog;
import com.mgrru.aoptx.vo.Emp;
import com.mgrru.aoptx.vo.Log;
import jakarta.annotation.Resource;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@Aspect
public class EmpServiceAdvice {
    @Resource(name = "ILog")
    private ILog iLog;

    @Before("execution(* com.mgrru.aoptx.service.EmpService.addEmp(..)) && args(emp)")
    public void beforeAddEmpAdvice(Emp emp){
        Log log = new Log(new Timestamp(System.currentTimeMillis()),
                "add emp : " + emp.getId() + " " + emp.getName());
        iLog.add(log);
        System.out.println("添加log");
    }
}
