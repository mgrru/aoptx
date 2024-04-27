package com.mgrru.aoptx.test;

import com.mgrru.aoptx.service.EmpService;
import com.mgrru.aoptx.vo.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService service = (EmpService) context.getBean("empService");
        Emp e1 = new Emp(1,"fufu");
        service.addEmp(e1);
    }
}
