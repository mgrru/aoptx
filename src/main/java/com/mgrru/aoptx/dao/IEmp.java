package com.mgrru.aoptx.dao;

import com.mgrru.aoptx.vo.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IEmp {

    @Select("select * from emp")
    public List<Emp> findAll();

    @Select("insert into emp values (#{id},#{name})")
    public void add(Emp emp);
}
