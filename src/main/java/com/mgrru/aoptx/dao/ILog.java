package com.mgrru.aoptx.dao;

import com.mgrru.aoptx.vo.Log;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ILog {

    @Select("select * from log")
    public List<Log> findAll();

    @Select("insert into log values (#{time},#{desc})")
    public void add(Log log);
}
