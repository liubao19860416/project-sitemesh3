package com.renzq.app.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 基础的查询dao类
 * 
 * @author Liubao
 * @2015年8月5日
 * 
 */
public interface IGenericDAO<T> {

    void create(T t);

    void delete(T t);

    void update(T t);

    void saveOrUpdate(T t);

    T get(Serializable id);

    T queryById(String id);

    List<T> queryAll();

    List<T> find(String query, Map params);

    public List<T> findByPage(String sql, Map params, int start, int fetchsize);

}
