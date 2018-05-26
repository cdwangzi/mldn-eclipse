package cn.mldn.service.impl;

import java.util.List;

import cn.mldn.dao.IDeptDAO;
import cn.mldn.service.IDeptService;
import cn.mldn.util.service.abs.AbstractService;
import cn.mldn.util.web.annotation.Autowired;
import cn.mldn.util.web.annotation.Service;
import cn.mldn.vo.Dept;

@Service
public class DeptServiceImpl extends AbstractService implements IDeptService {
	@Autowired
	private IDeptDAO deptDAO ; 	// 把所有可能使用到的DAO接口都要定义在属性里面 
	@Override
	public boolean add(Dept dept) throws Exception {
		System.out.println("【DeptService】实现部门数据增加。。。。。");
		return this.deptDAO.doCreate(dept);
	}

	@Override
	public List<Dept> list() throws Exception {
		System.out.println("************ 查询全部数据 ***********" + deptDAO);
		return this.deptDAO.findAll(); 
	}
}
