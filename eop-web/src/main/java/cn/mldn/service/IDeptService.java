package cn.mldn.service;

import java.util.List;

import cn.mldn.vo.Dept;

public interface IDeptService {
	public boolean add(Dept dept) throws Exception ;
	public List<Dept> list() throws Exception ;
}
